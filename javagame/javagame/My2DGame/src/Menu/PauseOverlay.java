package Menu;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import MainGame.GamePanel;




public class PauseOverlay {
	private GamePanel gp;
	private BufferedImage backgroundImg, selectImg;
	private LevelButton[] level_button;
	
	public PauseButton info_button, quit_button, sound_button_on, sound_button_off;


	public PauseOverlay(GamePanel gp) {
		this.gp = gp;
		level_button = new LevelButton[10];
		loadBackground();
		createUrmButtons();
	}



	private void createUrmButtons() {
		
		int x1 = (gp.screenWidth - gp.tileSize * 6) / 2  - 90;
		int y1 = (gp.screenHeight - gp.tileSize * 6) / 2 + 100;
		for(int i = 0; i< 5; i++) {
			level_button[i] = new LevelButton(x1 + (i % 5) * 100 , y1, 50, 50, i, gp);
		}
		
		for(int i = 5; i< 10; i++) {
			level_button[i] = new LevelButton(x1 + (i % 5)  * 100 , y1 + 100, 50, 50, i, gp);
		}
		info_button = new PauseButton(x1, y1 + 200, 100, 50, "/ui/info_button.png");
		quit_button = new PauseButton(x1 + 350, y1 + 200, 100, 50, "/ui/quit_button.png");
		sound_button_on = new PauseButton(x1 + 200, y1 + 200, 50, 50, "/ui/volumn-on.png");
		sound_button_off = new PauseButton(x1 + 200, y1 + 200, 50, 50, "/ui/volumn-off.png");

	}

	private void loadBackground() {
		backgroundImg = GetSpriteAtlas("/ui/back1.png");
		selectImg = GetSpriteAtlas("/level_button/back_text.png");
	}
	
	public BufferedImage GetSpriteAtlas(String path) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(getClass().getResourceAsStream(path));;

		} catch(IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	public void update() {
		
		for(int i = 0; i< 10; i++) {
			level_button[i].update();
		}
		info_button.update();
		quit_button.update();
		sound_button_off.update();
		sound_button_on.update();

	}

	public void draw(Graphics g) {
		
		// Background
		int x1 = (gp.screenWidth - gp.tileSize * 6) / 2 ;
		int y1 = (gp.screenHeight - gp.tileSize * 6) / 2 ;

		g.drawImage(backgroundImg, 0, 0, gp.screenWidth, gp.screenHeight, null);
		//Title
		g.drawImage(selectImg, 350, 130, 520, 65, null);
		
		//5 Level Buttons
		for(int i = 0; i< 10; i++) {
			level_button[i].draw(g);
		}
		
		//pauseButton
		info_button.draw(g);
		quit_button.draw(g);
		
		//sound
		if(gp.soundOn) {
			sound_button_on.draw(g);
		}
		else {
			sound_button_off.draw(g);
		}
		


	}

	public void mousePressed(MouseEvent e) {
		
		
		//level
		for(int i = 0; i< 10; i++) {
			if (isIn(e, level_button[i]) && !gp.infoShow && gp.dataLevel[i] == 1) {
//				level_button[i].setMousePressed(true);	
				gp.shadingOn = true;
				gp.setupGame(i);
				
				
			}
		}

		//info
		if (isIn(e, info_button)) {
			gp.infoShow = true;
			
		}
		
		
		//sound
		if (isIn(e, sound_button_on) && gp.soundOn && !gp.infoShow) {
			gp.soundOn = false;
			gp.switchMusic();
		}
		else if (isIn(e, sound_button_off) && !gp.soundOn && !gp.infoShow) {
			gp.soundOn = true;
			gp.switchMusic();
		}
		
		
		//quit
		if (isIn(e, quit_button) && !gp.infoShow) {
			

			gp.updateAndCloseFile();
			
			// Dừng luồng
			 System.exit(0);
	
		}
		
	}

	public void mouseReleased(MouseEvent e) {
		
		for(int i = 0; i< 10; i++) {
			if (isIn(e, level_button[i])) {
				if (level_button[i].isMousePressed()) {
//					gp.gameState = gp.playState;
					
				}
					
			}
			level_button[i].resetBools();
		}
		
		if (isIn(e, info_button)) {
			if (info_button.isMousePressed()) {
				//
			}
				
		}
		info_button.reset();
		sound_button_on.reset();
		sound_button_off.reset();

	}

	public void mouseMoved(MouseEvent e) {
		
		boolean switchMouseType = true;
		for(int i = 0; i< 10; i++) {
			
			if (isIn(e, level_button[i]) && !gp.infoShow) {
				level_button[i].setMouseOver(true); 
				switchMouseType = false;
				gp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}

			
		}
		
		if (isIn(e, info_button)) {
			info_button.setMouseOver(true); 
	
			switchMouseType = false;
			gp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		
		if (isIn(e, quit_button)) {
			quit_button.setMouseOver(true); 
			switchMouseType = false;
			gp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		
		if (isIn(e, sound_button_on)) {
			sound_button_on.setMouseOver(true); 
			switchMouseType = false;
			gp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		
		if (isIn(e, sound_button_off)) {
			sound_button_off.setMouseOver(true); 
			switchMouseType = false;
			gp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		
		

		if (switchMouseType) {
			gp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		}
	}
	

	private boolean isIn(MouseEvent e, Button b) {
		return b.getBounds().contains(e.getX(), e.getY());
	}

}