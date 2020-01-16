package DoodleJump;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Platforms {
	private Rectangle platform;
	private Doodle doodle;
	private Pane platformPane;
	private Platforms platforms;

	public Platforms() {
		
		platformPane = new Pane();
		
	
  		
//  		platformPane.getChildren().add(platform);
		
	
	}
	
	public Pane getPlatformPane() {
		return platformPane;
	}
	
}
