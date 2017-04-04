import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameController extends Application {
	
	public void main(String[] args)  {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("Test1");
		
		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		Canvas canvas = new Canvas(600,600);
		root.getChildren().add(canvas);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		Circle c = new Circle(50.0,Color.RED);
		int cx = 150;
		double cy = 50;
		boolean onTheRise = true;
		Rectangle sq = new Rectangle();
		
		final long startNanoTime = System.nanoTime();
		
		new AnimationTimer() {
			public void handle(long currentNanoTime) {
				double t = (currentNanoTime - startNanoTime)/1000000000.0 ;
				c.setTranslateY(t);
				double y = c.getCenterY();
			}
		}.start();
	}
}
