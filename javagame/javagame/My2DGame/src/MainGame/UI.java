package MainGame;

import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;

import Menu.IntroOverlay;
import Menu.PauseOverlay;
import Menu.PlayOverlay;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Cursor;


public class UI {
	public PauseOverlay po ;
	public PlayOverlay playO;
	public IntroOverlay introO;
	public GamePanel gp;
	public Graphics2D g2;
	public Font pixelFont_20, boldFont_20, pixelFont_14, boldFont_14, boldFontBig, pixelFontBig;
	public boolean gameFinished = false;

	public BufferedImage  infoImage;
	public boolean textVisiable = true;

	private int timeSwitch = 0;


    
	
	public BufferedImage GetSpriteAtlas(String path) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(getClass().getResourceAsStream(path));;

		} catch(IOException e) {
			e.printStackTrace();
		}
		return img;
	}
	
	public UI(GamePanel gp) {
		this.gp = gp;
		this.po = new PauseOverlay(gp);
		this.playO = new PlayOverlay(gp);
		this.introO = new IntroOverlay(gp);
		setTextFont();
		
		 
	}
	

	private void setTextFont() {
		pixelFont_20 = new Font("Monospaced", Font.PLAIN, 20);
		pixelFont_14 = new Font("Monospaced", Font.PLAIN, 14);
		pixelFontBig = new Font("Monospaced", Font.PLAIN, 26);
		boldFont_20 = pixelFont_20.deriveFont(Font.BOLD); 
		boldFont_14 = pixelFont_14.deriveFont(Font.BOLD); 
		boldFontBig = pixelFontBig.deriveFont(Font.BOLD);
		
	}

	public void draw(Graphics2D g2) {
		this.g2 = g2;
		
		g2.setFont(boldFont_20);
		g2.setColor(Color.white);
		if(gp.gameState == gp.pauseState) {
			drawPauseScreen(g2);
			
			if(gp.infoShow) {
				drawInfoShow(g2);
			}
		}
		else if(gp.gameState == gp.playState) {
			drawPlayScreen(g2);
		}
		else if(gp.gameState == gp.introState) {
			drawIntro(g2);
		}
		
		if(gp.shadingOn) {
			drawSwitchSceen(g2);
		}
		
		if(gp.popUp) {
			drawInstruction(g2);
		}
		
		if(gp.nextLevelEffect == true) {
			drawNextLevelEffect(g2);
		}
		
		if(gp.isPlayerAlive == false && textVisiable) {
			drawDieText(g2);
		}
		
	}
	
	private void drawDieText(Graphics2D g) {
		BufferedImage dieImg = GetSpriteAtlas("/ui/die.png") ;

		if(gp.indexForDieText < 90) {
			gp.indexForDieText +=2;
        	g.drawImage(dieImg, gp.tileSize * 8, 2 * gp.indexForDieText, 500, 65, null);
        }
		else if (gp.indexForDieText >= 90 && gp.indexForDieText < 150){
			gp.indexForDieText +=2;
			g.drawImage(dieImg, gp.tileSize * 8, 2 * 90, 500, 65, null);
//			gp.setupGame(gp.level);
			
		}
		else {
			gp.shadingOn = true;
		}
	}

	private void drawNextLevelEffect(Graphics2D g) {
		BufferedImage img1 = GetSpriteAtlas("/ui/blackbackground.png") ;
		BufferedImage img2 = GetSpriteAtlas("/ui/blackbackground.png") ;
		
		if(timeSwitch == 0) {
			if(gp.xNext1 <= 0 || gp.xNext2 <= 0) {
				timeSwitch ++;
				gp.setupGame((gp.level + 1) % 10);
			}
			else {
				gp.xNext1-= 15;
				gp.xNext2 -= 15;
			}
		}
		else {
			if(gp.xNext1 >= gp.screenWidth/2 ) {
				gp.nextLevelEffect = false;
				gp.xNext1 = gp.screenWidth/2;
				gp.xNext2 = gp.screenWidth;
				timeSwitch = 0;
	
			}
			else {
				gp.xNext1 += 15;
				gp.xNext2 += 15;
				
			}
		}
		
		
		g.drawImage(img1, 0, 0, gp.screenWidth/2 - gp.xNext1, gp.screenHeight, null);
		g.drawImage(img1, gp.xNext2, 0, gp.screenWidth, gp.screenHeight, null);
	}

	private void drawSwitchSceen(Graphics2D g) {
		
		BufferedImage image = GetSpriteAtlas("/ui/blackbackground.png") ;
		if(timeSwitch == 0) {
			if(gp.alpha >= 0.95f) {
	        	timeSwitch ++;
	        	if(gp.isPlayerAlive == false) {
	        		gp.gameState = gp.pauseState;
//	        		gp.isPlayerAlive = true;
	        		gp.setupGame(gp.level);
	        	}
	        	else {
	        		gp.gameState = gp.playState;
	        	}
	        	
	        }
	        else {
	        	gp.alpha += 0.05f;
	        }
		}
		
		if(timeSwitch == 1) {
			if(gp.alpha <= 0.05f) {
	        	gp.shadingOn = false;
	        	gp.alpha = 0f;
	        	timeSwitch = 0;
	        	gp.isPlayerAlive = true;
	        }
	        else {
	        	gp.alpha -= 0.05f;
	        }
		}
		
		// Tạo một AlphaComposite với độ trong suốt đã cho
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gp.alpha);
        
        // Lưu trạng thái hiện tại của Graphics2D để khôi phục sau khi vẽ hình ảnh
        Composite originalComposite = g.getComposite();

        // Đặt AlphaComposite mới cho Graphics2D
        g.setComposite(alphaComposite);

        // Vẽ hình ảnh
        g.drawImage(image, 0, 0, gp.screenWidth, gp.screenHeight, null);
        
        // Khôi phục trạng thái ban đầu của Graphics2D
        g.setComposite(originalComposite);
        
	}

	private void drawIntro(Graphics2D g2) {
		g2.setFont(boldFont_20);
		g2.setColor(Color.BLACK);
		introO.draw(g2);
		
	}

	private void drawInfoShow(Graphics g) {
		infoImage = GetSpriteAtlas("/ui/AboutUs.png");
		g.drawImage(infoImage, -1, 0, gp.screenWidth - 0, gp.screenHeight - 0, null);
	}

	private void drawInstruction(Graphics2D g) {
		//doing something
		BufferedImage img = GetSpriteAtlas("/ui/insText.png");
		g.drawImage(img, gp.tileSize * 20 + 7, gp.tileSize * 2 - 10, 193, 150, null);
		
	}



	private void drawPlayScreen(Graphics2D g2) {
		
		//home_button
		g2.setFont(boldFontBig);
		g2.setColor(Color.BLACK);
		playO.draw(g2);
		
		//text_status
		String text1 = "Level " + String.format("%d", gp.level);
		String text2 = "Clone x" + String.format("%d", 5 - gp.quantityClone );
		int x = 0;
		int y = 0;
		
		g2.drawString(text1, x + 40, y + 50);
		g2.drawString(text2, x + 40, y + 80);
		
		
//		//type text
//		g2.drawString(typeText[currentLineIndex].substring(0, currentCharIndex), 50, 400);

		
		
	}
	

	private void drawPauseScreen(Graphics2D g2) {
		
		po.draw(g2);	
		
	}

	

			
}
