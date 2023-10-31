package Core;

import java.util.ArrayList;

import Behaviours.*;

public class SceneUpdater {
	public ArrayList<SceneObject> sceneObjects = new ArrayList<SceneObject>();
	public void updateAll() {
		for (SceneObject object : sceneObjects) {
			object.update();
		}
	}
}
