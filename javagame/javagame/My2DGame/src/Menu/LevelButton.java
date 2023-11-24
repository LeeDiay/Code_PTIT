package Menu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import MainGame.GamePanel;

import java.util.Random;


public class LevelButton extends Button {
	
	private GamePanel gp;
	private BufferedImage img1[] = new BufferedImage[3];
	private BufferedImage img2;
	public int rowIndex, index;
	public boolean mouseOver , mousePressed  ;

	public LevelButton(int x, int y, int width, int height, int rowIndex, GamePanel gp) {
		super(x, y, width, height);
		this.mouseOver = false;
		this.mousePressed = false;
		this.rowIndex = rowIndex;
		this.gp = gp;
		loadImgs();
	}

	private void loadImgs() {
		BufferedImage temp = GetSpriteAtlas("/ui/level_button.png");
		BufferedImage temp2 = GetSpriteAtlas("/ui/level_button_x.png");
		
		for(int i = 0; i< 3; i++) {
			img1[i] = temp.getSubimage(50 * i, rowIndex * 50, 50, 50);
		}
		
		img2 = temp2.getSubimage(0, rowIndex * 50, 50, 50);
		

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
			//nothing
	}
	
	public void draw(Graphics g) {
		
		if(gp.dataLevel[rowIndex] == 1) {
			g.drawImage(img1[0], x, y, 50, 50, null);
		}
		else g.drawImage(img2, x, y, 50, 50, null);
		
	}
	
	public void resetBools() {
		mouseOver = false;
		mousePressed = false;
	}


	public void setMouseOver(boolean status) {
		this.mouseOver = status;
	}

	public boolean isMousePressed() {
		return mousePressed;
	}

	public void setMousePressed(boolean status) {
		this.mousePressed = status;
	}

	public boolean isMouseOvered() {
		return this.mouseOver;
	}

}
