package Behaviours;

import java.util.ArrayList;

import Physics.*;

public class SceneObject {
	
	public Vector2 position;
	public String ObjectName = "newobject";
	public ArrayList<Component> components = new ArrayList<Component>();
	
	public SceneObject(Vector2 objectPos) {
		position = objectPos;
		Transform transform = new Transform();
		addComponent(transform);
	}
	
	public void addComponent(Component component) {
		if (getComponent(component.getClass()) != null)
			return;
		
		components.add(component);
		component.onComponentAdded(this);
	}
	public <T extends Component> T getComponent(Class<T> componentType) {
		for (int i = 0;i < components.size();i++) {
			if (components.get(i).getClass() == componentType) {
				return (T)components.get(i);
			}
		}
		return null;
	}
}
