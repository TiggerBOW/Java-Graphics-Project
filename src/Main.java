import javax.swing.*;

import Physics.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Behaviours.*;
import GraphApps.*;
import GraphApps.Image;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Test Window");		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setLayout(null);
		Vector2 bigBounds = new Vector2(3000,3000);
				
		GraphApp graphApp = new GraphApp(bigBounds);
		Image image = new Image("src/foto1.jpg",graphApp,new Vector2(100,100));
		image.orderInLayer = 4;
		DRectangle rectangle = new DRectangle(graphApp,new Vector2(200,100),Color.red);
		rectangle.orderInLayer = 1;
		
		SceneObject rectangleObject = new SceneObject(new Vector2(0,0));
		Grapher rectangleSpriteComponent = new Grapher(rectangle);
		rectangleObject.addComponent(rectangleSpriteComponent);
		
		SceneObject imageObject = new SceneObject(new Vector2(0,0));
		Grapher imageSpriteComponent = new Grapher(image);
		imageObject.addComponent(imageSpriteComponent);
		
		
		window.add(graphApp);
				
		window.setSize(1920,1080);
		window.setVisible(true);
		
		
	}

}
