package GraphApps;

import javax.swing.*;
import java.awt.*;
import Physics.*;

public class DRectangle implements Shape{
	
	public GraphApp graphApp;
	public Color color;
	public Vector2 position;
	public Vector2 size;
	public int orderInLayer = 0;
	
	public DRectangle(GraphApp app,Vector2 size,Color color) {
		graphApp = app;
		this.size = size;
		this.color = color;	
		position = new Vector2(0,0);
		
		app.addGraph(this);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
	    g.fillRect((int)position.getX(), (int)position.getY(), (int)size.getX(), (int)size.getY());
	    
	}

	@Override
	public Vector2 getPoisition() {
		return position;
		
	}

	@Override
	public Vector2 getSize() {
		return size;
		
	}

	@Override
	public void setPosition(Vector2 newPosition) {
		position = newPosition;
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
		g.setColor(color);
	    g.fillRect((int)position.getX(), (int)position.getY(), (int)size.getX(), (int)size.getY());
	}
	
	
}
