package Behaviours;

import Physics.*;

public class Transform implements Component{
	
	private SceneObject sceneObject;
	private Vector2 pivotPoint;
	
	private Vector2 objectDirection;
	private Vector2 targetPosition;
	private boolean canMove;
	
	public void translate(Vector2 direction) {
		sceneObject.position.add(direction);
		objectDirection = direction;
	}
	public void movePosition(Vector2 position) {
		targetPosition = position;
		objectDirection = new Vector2(targetPosition.getX() - sceneObject.position.getX(),targetPosition.getY() - sceneObject.position.getY()).normalize();
		objectDirection = new Vector2(objectDirection.getX() * 10,objectDirection.getY() * 10);
		objectDirection.print();
		canMove = true;	
	}
	public void setPivotPoint(Vector2 point) {
		pivotPoint = point;
	}
	public Vector2 getPivotPoint() {
		return pivotPoint;
	}
	
	public void setCenteredPivotPoint(Vector2 position,Vector2 size) {
		int posX = (int)position.getX();
		int posY = (int)position.getY();
		int sizeX = (int)position.getX();
		int sizeY = (int)position.getY();
		
		int pivotX = posX + sizeX / 2;
		int pivotY = posY + sizeY / 2;
		
		pivotPoint = new Vector2(pivotX,pivotY);
	}
	@Override
	public void onComponentAdded(SceneObject object) {
		sceneObject = object;
	}

	@Override
	public SceneObject getSceneObject() {
		return sceneObject;
	}

	@Override
	public void updateComponent() {
		if (canMove) {
			translate(objectDirection);
			
			Vector2 direction = new Vector2(targetPosition.getX() - sceneObject.position.getX(),targetPosition.getY() - sceneObject.position.getY());
			float distBetweenTarget = direction.magnitude();
			System.out.println(distBetweenTarget);
			if (distBetweenTarget <= 50) {
				canMove = false;
			}
			
		}
	}
}
