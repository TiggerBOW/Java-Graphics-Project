package Behaviours;

import GraphApps.*;
import Physics.*;

public class Grapher implements Component{
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
	}
}
