package GraphApps;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.*;

import Physics.Vector2;

public class GraphApp extends JPanel{
	public ArrayList<Graph> graphs = new ArrayList<Graph>();
	
	public GraphApp(Vector2 bounds) {
		setBounds(0,0,(int)bounds.getX(),(int)bounds.getY());
		setOpaque(false);
	}
	public void addGraph(Graph graph) {
		graphs.add(graph);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	    graphs.sort(Comparator.comparing(Graph::getOrderInLayer));
		
		for (int i = 0;i < graphs.size();i++) {
			graphs.get(i).drawGraph(g);
		}
	}
}
