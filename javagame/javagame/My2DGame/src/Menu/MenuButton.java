package Menu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MenuButton extends Button {
	private BufferedImage img;
	private boolean mousePressed;
	private String path;

	public MenuButton(int x, int y, int width, int height, String path) {
		super(x, y, width, height);
		this.path = path;
		
		loadImgs();
	}

	private void loadImgs() {
		this.img = GetSpriteAtlas(this.path);
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
//		System.out.println(this.index);	
	}
	
	public void draw(Graphics g) {
//		System.out.println(this.index);
		g.drawImage(img, x, y, 50, 50, null);
	}

	public boolean isMousePressed() {
		return this.mousePressed;
	}

	public void reset() {
		this.mousePressed = false;
		
	}

	public void setMousePressed(boolean b) {
		this.mousePressed = true;
		
	}
}

