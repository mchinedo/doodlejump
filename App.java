package DoodleJump;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;






/**
 * This is the main class where your DoodleJump game will start.
 * The main method of this application calls launch, a JavaFX method
 * which eventually calls the start method below. You will need to fill
 * in the start method to start your game!
 *
 * Class comments here...
 */
public class App extends Application {
  public  Doodle doodle;
  private BorderPane borderPane;
  


    @Override
    public void start(Stage stage) {
      stage.setTitle("DoodleJump");
        // Instantiate top-level object, set up the scene, and show the stage here.

        PaneOrganizer paneOrganizer = new PaneOrganizer();
        Scene gameScene = new Scene(paneOrganizer.getRoot());
        stage.setScene(gameScene);
        stage.show();

    }

    /*
     * Here is the mainline! No need to change this.
     */
    public static void main(String[] argv) {
        launch(argv);
    }
}
