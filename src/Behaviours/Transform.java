package Behaviours;

import Physics.*;

public class Transform implements Component{
	
	private Vector2 pivotPoint;
	
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
		
	}
}
