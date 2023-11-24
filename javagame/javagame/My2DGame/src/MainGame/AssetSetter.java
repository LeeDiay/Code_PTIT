package MainGame;



import Objects.Button;
import Objects.Door;
import Objects.Elevator;
import Objects.Key;
import Objects.SuperObject;
import Objects.Thorn;

public class AssetSetter {
	private GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void set() {
		int x = 2 * gp.tileSize;
		int y = 4 * gp.tileSize - 1;
		switch (gp.level) {
		case 1:
			setObject(gp.level);
			setEntity(x, y);
			break;
		}
	}
	
	
	//0-4: key, 5-7: button, 8-10: elevator (ver; dọc, hor:ngang), 11...:thorn
	public void setObject(int level) {

		switch (level) {
		case 0:
//			setEntity(x1, y1);
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 7 * gp.tileSize + 1;
			gp.obj[3].worldY = 4 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "ver");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 1:
//			setEntity(x1, y1);
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "ver");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 12 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 2:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 12 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 3:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 4:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 5:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 6:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 7:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 8:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		case 9:
			for(SuperObject x:gp.obj) x = null; 
			gp.obj[0] = new Key(gp);
			gp.obj[0].worldX = 9 * gp.tileSize;
			gp.obj[0].worldY = 2 * gp.tileSize;
			
			gp.obj[1] = new Key(gp);
			gp.obj[1].worldX = 3 * gp.tileSize;
			gp.obj[1].worldY = 2 * gp.tileSize;
			
			gp.obj[2] = new Button(gp);
			gp.obj[2].worldX = 6 * gp.tileSize;
			gp.obj[2].worldY = 12 * gp.tileSize;

			gp.obj[3] = new Elevator(gp, (Button)gp.obj[2]);
			gp.obj[3].worldX = 13 * gp.tileSize + 1;
			gp.obj[3].worldY = 10 * gp.tileSize - 1;
			gp.obj[3].defaultWorldX = gp.obj[3].worldX;
			gp.obj[3].defaultWorldY = gp.obj[3].worldY;
			gp.obj[3].setElevator((Elevator)gp.obj[3], "hor");
			
			gp.obj[4] = new Thorn(gp);
			gp.obj[4].worldX = 10 * gp.tileSize;
			gp.obj[4].worldY = 12 * gp.tileSize;
			
			gp.obj[5] = new Door(gp);
			
			gp.obj[5].worldX = 19 * gp.tileSize;
			gp.obj[5].worldY = 11 * gp.tileSize;
			
			break;
		}
			
	}
	
	
	
	private void setEntity(int x, int y) {
		gp.player.worldDefaultX = x;
		gp.player.worldDefaultY = y;
		gp.player.worldX = x;
		gp.player.worldY = y;		
	}

}
