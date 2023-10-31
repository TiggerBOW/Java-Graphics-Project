package GraphApps;

import java.awt.*;
import Physics.*;

public interface Shape extends Graph{
	Vector2 getPoisition();
	void draw(Graphics g);
}
