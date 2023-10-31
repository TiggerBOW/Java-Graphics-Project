package Behaviours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import GraphApps.*;
import Physics.*;

public class Grapher implements Component{
	private SceneObject sceneObject;
	public Graph graph;
	public Grapher(Graph graph) {
		this.graph = graph;
	}
	@Override
	public void onComponentAdded(SceneObject object) {
		Transform transform = object.getComponent(Transform.class);
		transform.setCenteredPivotPoint(object.position, graph.getSize());
		object.position = transform.getPivotPoint().remove(new Vector2(graph.getSize().getX() / 2,graph.getSize().getY() / 2));
		graph.setPosition(object.position);
		
		graph.getGraphApp().addGraph(graph);
		
		
		sceneObject = object;
		
	}
	@Override
	public SceneObject getSceneObject() {
		return sceneObject;
	}
	public void updatePosition() {
		graph.setPosition(sceneObject.position);
		//Tuval güncelleme sonrası yenilenir.
		graph.getGraphApp().repaint();
	}
	@Override
	public void updateComponent() {
		updatePosition();		
	}
}
