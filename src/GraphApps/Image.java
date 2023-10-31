package GraphApps;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Physics.Vector2;

public class Image implements Graph{
	public BufferedImage image;
	public int orderInLayer = 0;
	
	public Vector2 position;
	public Vector2 size;
	public GraphApp graphApp;
	
	public Image(String path,GraphApp app,Vector2 size) {
		if (path != null) {
			setImageWithPath(path);
		}
		
		graphApp = app;
		this.size = size;
		
		app.addGraph(this);
	}
	public void setImage(BufferedImage img) {
		image = img;
	}
	public void setImageWithPath(String path) {
		try {
            File imageFile = new File(path);
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	@Override
	public void setPosition(Vector2 newPosition) {
		position = newPosition;
	}
	@Override
	public Vector2 getSize() {
		return size;
	}
	@Override
	public GraphApp getGraphApp() {
		return graphApp;
	}
	@Override
	public int getOrderInLayer() {
		return orderInLayer;
	}
	@Override
	public void drawGraph(Graphics g) {
		g.drawImage(image, (int)position.getX(), (int)position.getY(),(int)size.getX(),(int)size.getY(),graphApp);
	}
}
