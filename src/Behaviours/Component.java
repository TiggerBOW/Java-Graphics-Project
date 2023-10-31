package Behaviours;

public interface Component {
	void onComponentAdded(SceneObject object);
	SceneObject getSceneObject();
	void updateComponent();
}
