package MainGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Menu.PauseOverlay;
import Menu.PlayOverlay;
import Objects.Door;
import Objects.SuperObject;
import entity.Clone;
import entity.Entity;
import entity.Player;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	//SCREEN SETTING
	private final int originalTileSize = 16; //16x16 tile
	private final int scale = 3; //tăng kích cỡ 3 lần
	
	public final int tileSize = originalTileSize * scale;
	public int maxScreenCol = 25 + 1; //có 25 cột (không phải 26 đâu)
	public int maxScreenRow = 15; //có 15 hàng
	public final int screenWidth = tileSize * (maxScreenCol - 1); 
	public final int screenHeight = tileSize * maxScreenRow;

	public int stt;
	public boolean[] moveobj = new boolean[20];
	public boolean[] upobj = new boolean[20];
	public int sttobj;
	public int quantityClone = 0;
	
	//FPS
	int FPS = 60;
	
	public TileManager tileM = new TileManager(this);
	public KeyHandler keyH = new KeyHandler(this);
	public MouseHandler mouseH = new MouseHandler(this);
	public Thread gameThread;
	public CollisionChecker cChecker = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	private CheckDead checkDead = new CheckDead(this);
	public Player player = new Player(this, keyH);
	public Clone[] clone = new Clone[5];
	public SuperObject obj[] = new SuperObject[20];
	public String[][] movXClone = new String[5][600];
	public String[][] movYClone = new String[5][600];

	//User Data
	public int dataLevel[] = new int[10];
		
	//levels
	public int level = 1;
		
	//GAMESTATES
	public PauseOverlay po = new PauseOverlay(this);
	public PlayOverlay playO = new PlayOverlay(this);
		
	public int startTime = 0;
	public UI ui = new UI(this);
	public int gameState;
	public  int playState = 1, pauseState = 2, inforState = 3, introState = 0;
	
		//status variable 
	public boolean popUp = false;
	public boolean infoShow = false;
	public boolean shadingOn = false;
	public boolean nextLevelEffect = false;
	public boolean isPlayerAlive = true;
	public boolean checkSound[] = new boolean[10];

		//tr
	public float alpha = 0f;
	public int xNext1 = screenWidth/2, xNext2 = screenWidth;
	public int indexForDieText = 0;
	//Sound
	private Sound backgroundMusic = new Sound();
	private ArrayList<Sound> soundEffect = new ArrayList<>();  
	public boolean soundOn = true;
		
	
	
	
	public BufferedImage img;

	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		
		try {
			
			img = ImageIO.read(getClass().getResourceAsStream("/ui/back2.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
		addMouseListener(mouseH);
		addMouseMotionListener(mouseH);
		aSetter.set();
		
		//new
		for(int i  = 0; i< 4; i++) {
			soundEffect.add(new Sound());
			soundEffect.get(i).setFile(i+ 1);
			checkSound[i] = true;
		}
		
		
		
		
		
	
	}
	
public void setupGameStart() {
		
		String fileName = "data1.txt";

		aSetter.setObject(level);
        ClassLoader classLoader = GamePanel.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // Đọc dữ liệu từ InputStream
        try (Scanner sc = new Scanner(new InputStreamReader(inputStream))) {
            for(int i = 0; i< 10; i++) {
            	dataLevel[i] = sc.nextInt();
            	System.out.println(dataLevel[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        gameState = introState;
	    
	}
	
	public void setupGame(int i) {
		this.level = i;
		aSetter.setObject(level);
		
		
		String path = "/maps/map" + String.format("%02d", i) + ".txt";
		tileM.chooseMap(path);
		player = new Player(this, keyH);
		
		quantityClone = 0;
		clone = new Clone[5];
		
		movXClone = new String[5][600];
		movYClone = new String[5][600];
		
		//NEW
		for(int j  = 0; j< 4; j++) {
			checkSound[j] = true;
		}
	
		
	}
	
	public void setupGameWithoutPause() {
		player = new Player(this, keyH);
		quantityClone = 0;
		clone = new Clone[5];
		
		movXClone = new String[5][600];
		movYClone = new String[5][600];

		aSetter.setObject(level);	
		gameState = playState;
		String path = "/maps/map" + String.format("%02d", level) + ".txt";
		tileM.chooseMap(path);
		
		
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		double drawInterval = 1000000000/FPS;
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		while(gameThread != null) {
			// 1 UPDATE: update in4 such as character positions
			update();
			// 2 UPDATE: draw screen with the updated in4
			repaint();
				
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime /= 1000000;
				
				if(remainingTime < 0) {
					remainingTime = 0;
				}
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void setSolid(Entity entity, SuperObject obj) {
		entity.solidArea.x += entity.worldX;
		entity.solidArea.y += entity.worldY;
		obj.solidArea.x = obj.worldX + obj.solidArea.x;
		obj.solidArea.y = obj.worldY + obj.solidArea.y;
	}
	public void setDefaultSolid(Entity entity, SuperObject obj) {
		 entity.solidArea.x = entity.solidAreaDefaultX;
		 entity.solidArea.y = entity.solidAreaDefaultY;
		 obj.solidArea.x = obj.solidAreaDefaultX;
		 obj.solidArea.y = obj.solidAreaDefaultY; 
	}
	
	public void update() {
		
		if(gameState == pauseState) {
			po.update();
			//nothing to do
		}
		if(gameState == playState) {
			playO.update();
			for(int i=0; i<5; i++) upobj[i] = false;
			player = (Player)checkDead.checkDeadPlayer(player);
			if(player != null) {
				player.update();
			}

			for(int i=0; i<5; i++) {
				clone[i] = (Clone)checkDead.checkDeadPlayer(clone[i]);
				if(clone[i] != null) {
					stt = i;
					clone[i].update();
					
				}
			}
			for(int i=0; i<20; i++) {
				if(obj[i] != null && upobj[i] == false) {
					sttobj = i;
					obj[i].update();
				}
			}
			//touch door to win
			
			if (obj[5] instanceof Door) {
	            Door door = (Door) obj[5];
	           
	            
	            if(door.getWinStatus()) {
	            	
	        		
	        		
	            	dataLevel[(level + 1) % 10] = 1;
					nextLevelEffect = true;
	            }
	         
	            
	        }
			if(player == null) {
				isPlayerAlive = false;
			}else {
				indexForDieText = 0;
				checkSound[2] = true;
			}
			
			//chi phat am thanh lan dau
			if(player == null && checkSound[2]) {
				playSE(2, 2);
				checkSound[2] = false;
			}
		}
		
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, 0, 0, screenWidth, screenHeight, null);
		tileM.draw(g2);
		for(int i=0; i<obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2, this);
			}
		}
		
		for(int i=0; i<5; i++) {
			if(clone[i] != null) {
				clone[i].draw(g2);
			}
		}
		if(player != null) player.draw(g2);
		
		ui.draw(g2);
		g2.dispose();
	}
	
	//Sound
	public void playMusic(int i) {
		backgroundMusic.setFile(i);
	    backgroundMusic.play();
	    backgroundMusic.setVolumn(1);
	    
	    backgroundMusic.loop();
	}

	// Dừng nhạc nền
	public void stopMusic() {
	    backgroundMusic.stop();
	    for(Sound x : soundEffect) {
			x.stop();
		}
	  
	}

	// Phát âm thanh hiệu ứng
	//e - click = 0 , jump = 1, die = 2, win = 3
	public void playSE(int e, int i) {
		soundEffect.get(e).setFile(e+1);
		    
	    if(e == 3) {
	    	soundEffect.get(e).setVolumn(2);
	    }
	    else {
	    	soundEffect.get(e).setVolumn(1);
	    }
	    
	    soundEffect.get(e).play();
	}
	    
	public void switchMusic() {
		if(soundOn) {
			backgroundMusic.setVolumn(1);
			for(Sound x : soundEffect) {
				x.setVolumn(1);
			}
		
		}
		else {
			backgroundMusic.setVolumn(0);
			for(Sound x : soundEffect) {
				x.setVolumn(0);
			}
		}
			
	}
		
		

	//User Data Update
	public void updateAndCloseFile() {
	String fileName = "data1.txt";
	// Ghi dữ liệu vào tệp tin
	try (FileOutputStream file = new FileOutputStream("res/" + fileName);
			PrintWriter writer = new PrintWriter(file)) {

			for (int x : this.dataLevel) {
			        System.out.println(x);
			        writer.println(x);
			}

			System.out.println("OK ");

			} catch (IOException e) {
			   e.printStackTrace();
		}        
	}
}
