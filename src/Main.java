import javax.swing.*;

import Physics.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Behaviours.*;
import Core.*;
import GraphApps.*;
import GraphApps.Image;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Test Window");		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		Vector2 bigBounds = new Vector2(3000,3000);
		
		SceneUpdater updater = new SceneUpdater();
				
		GraphApp graphApp = new GraphApp(bigBounds);
		
		
		int tileWidth = 20; // Dikdörtgen genişliği
        int tileHeight = 20; // Dikdörtgen yüksekliği
        int tileSpacing = -6; // Dikdörtgenler arasındaki boşluk

        for (int x = 3; x < 26; x++) {
            for (int y = 3; y < 26; y++) {
                DRectangle tileFx = new DRectangle(graphApp, new Vector2(tileWidth, tileHeight), Color.white);
                SceneObject tileObject = new SceneObject(new Vector2(x * (tileWidth + tileSpacing), y * (tileHeight + tileSpacing)));
                Grapher grapher = new Grapher(tileFx);
                tileObject.addComponent(grapher);
            }
        }
			
		
		updater.updateAll();
		
		window.add(graphApp);
				
		window.setSize(1920,1080);
		window.setVisible(true);
		
		
	}

}
