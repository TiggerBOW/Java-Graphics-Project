import Behaviours.*;
import Physics.Vector2;

public class SquareObject extends SceneObject{

	public SquareObject(Vector2 objectPos) {
		super(objectPos);
		
		Transform transform = getComponent(Transform.class);
		
		updateRunnable = () -> {
			updateState();
        };	
        
    }
	private void updateState() {
		
	}
}
