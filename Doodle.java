package DoodleJump;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;

public class Doodle extends App {
   private Rectangle pinkDoodle;
   private Pane doodleJumpPane;  
//   private Platforms platforms;	
   private Rectangle _platform;
   private ArrayList<Rectangle> platforms;
   int currentVelocity = 0;
   int updatedVelocity;
   int updatedPosition;
//   int minX = 600;
//   int maxX = 800;
//   int minY = 565;
//   int maxY = 600;
   double x;
   double y;
   double w;
   double h;
   
   
   
  public Doodle(){
	  
//	  platforms = new Platforms();

	  doodleJumpPane = new Pane();
	  doodleJumpPane.setPrefWidth(600);
	  doodleJumpPane.setPrefHeight(700);
	  
	  pinkDoodle = new Rectangle(15, 30);
      pinkDoodle.setFill(javafx.scene.paint.Color.DEEPPINK);
      pinkDoodle.setX(Constants.CURRENT_XPOSITION);
      pinkDoodle.setY(Constants.CURRENT_YPOSITION);
	  doodleJumpPane.getChildren().add(pinkDoodle);

      
    
  		platforms = new ArrayList<Rectangle>();
  		
  		_platform = new Rectangle(Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT);
  		_platform.setFill(Color.GRAY);
  		_platform.setX(Constants.PLATFORM_XLOCATION);
  		_platform.setY(Constants.PLATFORM_YLOCATION);
  		platforms.add(_platform);
  		
  		doodleJumpPane.getChildren().add(_platform);
	  doodleJumpPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyListener());
	  doodleJumpPane.setFocusTraversable(true);
		this.setUpTimeline();	
	  	this.generatePlatform();
	
	  
  }
  
//Rectangle newPlatform = new Rectangle(Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT);
//newPlatform.setFill(Color.GRAY);  
//newPlatform.setX(this.randomXInt());
//newPlatform.setY(this.randomYInt());
//platforms.add(newPlatform);
//platform = newPlatform;  		

//doodleJumpPane.getChildren().addAll(platforms);

//platform = newPlatform;


//pinkDoodle.intersects(x, y, w, h);

//platforms = new Platforms();  
//platform = new Rectangle();
//platform.intersects(Constants.PLATFORM_XLOCATION,Constants.PLATFORM_YLOCATION, Constants.PLATFORM_WIDTH, Constants.PLATFORM_WIDTH);


//doodleJumpPane.getChildren().add(platforms.getPlatformPane());
//doodleJumpPane.getChildren().add(platform);
  
public void generatePlatform() {
  
	
while (_platform.getY() > 10) {
	
		Rectangle newPlatform = new Rectangle(Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT);
  		newPlatform.setFill(Color.GRAY);  
	    newPlatform.setX(this.randomXInt());
	    newPlatform.setY(this.randomYInt());
	    platforms.add(newPlatform);
	    doodleJumpPane.getChildren().addAll(newPlatform);
	    _platform = newPlatform;
	    
//	    if(_platform.getY() < 0) {
//	    	break;
//	    }

}
}


public Pane getPane( ) {
	  return doodleJumpPane;
  }
  
  public Rectangle getPinkDoodle() {
	  return pinkDoodle;
  }

  
  public Rectangle getX() {
	  return pinkDoodle;
  }
	  
 public void setY() {
	
}
 
 
 public Rectangle getY() {
	 return pinkDoodle;
 }
 
 public void setPlatformX() {
	 
 }
 
// public double getPlatformX() {
//	 return platform.getX();
// }
 public int setVelocity(int x) {
	 x = currentVelocity;
	 return currentVelocity;
	 
 }
 
 public int getVelocity() {
	 return currentVelocity;
 }

 public int randomXInt() {
	 int min = 600;
	 int max = 800;
	 
	   return min + (int) (Math.random()*(max - min + 1));
 }
 
 public int randomYInt() {
	int low = 700;
	int high = 500;
	   return low + (int) (Math.random()*(high - low + 1));
 }
 
public void setX(double d) {
	
	// TODO Auto-generated method stub
	
}
public void setUpTimeline() {

	   KeyFrame kf = new KeyFrame(Duration.seconds(0.016), new TimeHandler());
	   Timeline timeline = new Timeline(kf);
	   timeline.setCycleCount(Animation.INDEFINITE);
	   timeline.play();
}

private class TimeHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hey");
	if (pinkDoodle.intersects(Constants.CURRENT_XPOSITION, Constants.CURRENT_YPOSITION, Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT)== true) {
		updatedVelocity = Constants.REBOUND_VELOCITY;
	}
	else {
		updatedVelocity = (int) (currentVelocity + (Constants.GRAVITY * Constants.DURATION));
	}
		System.out.println("Yeer");
//		updatedPosition = pinkDoodle.getY()+ (updatedVelocity * Constants.DURATION);
		pinkDoodle.setY(pinkDoodle.getY()+ (updatedVelocity * Constants.DURATION));

	}

//	private boolean bounce() {
//		currentVelocity = Constants.REBOUND_VELOCITY;
//		return 
//				
//	}

}


private class KeyListener implements EventHandler<KeyEvent> {

	@Override
	public void handle(KeyEvent event) {
		
		KeyCode KeyCode = event.getCode();
		switch(KeyCode) {
		case RIGHT:
			pinkDoodle.setX(pinkDoodle.getX() + 50);
			break;
			
		case LEFT:
			pinkDoodle.setX(pinkDoodle.getX() - 50);
			break;
		
		}
		
		event.consume();
		
		
	}
	
	private void generatePlatform() {


		
	}
	      
	      

	

}


}


