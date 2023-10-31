package GraphApps;

import java.awt.*;

import Physics.*;

public interface Graph {
	void setPosition(Vector2 newPosition);
	Vector2 getSize();
	GraphApp getGraphApp();
	int getOrderInLayer();
	void drawGraph(Graphics g);
}
