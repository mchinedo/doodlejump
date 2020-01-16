package DoodleJump;

import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class PaneOrganizer {
//
//	Pane doodleJumpPane;
	private BorderPane _root;
	private Rectangle pinkDoodle;
	private Pane doodleJumpPane;
	private Doodle doodle;	

	
	public PaneOrganizer() {	
	
    VBox box = new VBox(10);
    doodle = new Doodle();
    _root = new BorderPane();
    doodleJumpPane = new Pane();

    
//    Pane doodleJumpPane = new Pane();
    
    Label label = new Label("Hi! Welcome to DoodleJump!");
    Label label1 = new Label("To play, move your Doodle using the Left and Right arrow keys!");
    Label label2 = new Label("If you fall out the screen, you lose! Good Luck!!");

    Button _button = new Button();
    _button.setText("Quit");
    _button.setOnAction(e -> System.exit(0));

    box.getChildren().add(label); 
    box.getChildren().add(label1);
    box.getChildren().add(label2);
    box.getChildren().add(_button);

    String style = "-fx-background-color: #FF1493;";
    box.setStyle(style);
    box.setAlignment(Pos.BOTTOM_CENTER);

    _root.setBottom(box);
    _root.setCenter(doodleJumpPane);
    _root.getChildren().add(doodle.getPane());
   
    
	}
	
	public Pane getRoot() {
		return _root;
	}
}
