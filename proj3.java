/**
 * 
 */
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * @author Harprabh Sangha 
 *
 */

 // pac-man sources: http://pacman.wikia.com/wiki/Pac-Man

  // Picture : http://findicons.com/icon/88968/pacman

 // Red ghosts Blinky 
//http://www.giantbomb.com/blinky/3005-138/
// Scared ghosts
//http://www.latostadora.com/generados/tiendas/14893/dibujos/196281.jpg

//ALSO: Outlines are black on some but since the background is black they are useless 
public class proj3 extends Application {
	
	Button btExit; // making the Exit button 
	Button btChange; // making the Change text button 
	Scene scene1; //scene 1 will have the comic in it 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args); // launching the application 
	}
	@Override // Override the start method in the Application class
	public void start(Stage mainStage)
	{
		mainStage.setTitle("Comic Story: Daliy Life of a Ghost");
		btExit = new Button();
		btExit.setText("Exit"); // setting text for exit button
		btChange = new Button();
		btChange.setText("Change Text"); // setting text of change text button 
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_LEFT);
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		Pane pane1 = new Pane(); // here i am creating the the boxes for the comic
		Pane pane2 = new Pane();
		Pane pane3 = new Pane();
	
		pane.add(btExit,0,0);
		pane.add(btChange, 1,0); // adding both the buttons 
		pane.add(new CustomPane(pane1), 0,1); //adding the boxes to the stage
		pane.add(new CustomPane(pane2), 1,1); //adding the 2nd box to the stage 
		pane.add(new CustomPane(pane3), 2,1); //adding the 3rd box to the stage 
		
	
		pane1.prefHeightProperty().bind(pane.heightProperty()); // I was binding the panes as you can see
		pane1.prefWidthProperty().bind(pane.widthProperty());
		pane2.prefHeightProperty().bind(pane.heightProperty());
		pane2.prefWidthProperty().bind(pane.widthProperty());
		pane3.prefHeightProperty().bind(pane.heightProperty());
		pane3.prefWidthProperty().bind(pane.widthProperty());
		
//------//creating the shapes panel 1 -----------------------------
		//circle
		Circle circle = new Circle(); 
		circle.setRadius(100);
		Circle circle2 = new Circle(50,-3,7);
		Circle circle3 = new Circle(80,-3,7);
		Circle circle4 = new Circle(110,-3,7);
		Circle circle5 = new Circle(140,-3,7);
		Circle circle6 = new Circle(170,-3,7);
		
		//sending it to function because all the circle color's are the same
		DrawCricle(circle);
		DrawCricle(circle2);
		DrawCricle(circle3);
		DrawCricle(circle4);
		DrawCricle(circle5);
		DrawCricle(circle6);
		
		// Rectangle 
		Rectangle rec2 = new Rectangle(-250, -250, 500, 500);
		rec2.setFill(Color.BLACK);
		Rectangle rec3 = new Rectangle (-250,-120, 500,4);
		rec3.setFill(Color.BLUE);
		Rectangle rec4 = new Rectangle (-250,-140, 500,4);
		rec4.setFill(Color.BLUE);
		Rectangle rec5 = new Rectangle (-250,140, 500,4);
		rec5.setFill(Color.BLUE);
		Rectangle rec6 = new Rectangle (-250,120, 500,4);
		rec6.setFill(Color.BLUE);
		
		//Arc
		Arc arc = new Arc(0, 0, 100, 100, -20, 50); // Create an arc
	    arc.setFill(Color.BLACK); // Set fill color
	    arc.setType(ArcType.ROUND); // Set arc type
	   
	    //ellipse 
	    Ellipse e1 = new Ellipse(210, -3, 12, 16);
	    e1.setFill(Color.YELLOW);
	    Ellipse e2 = new Ellipse(15, -50, 16, 12);
	    e2.setFill(Color.BLACK);
	    Ellipse e3 = new Ellipse(90, -190, 160, 30);
	    e3.setFill(Color.CRIMSON);
	    
	    
	    //adding all the shapes to story block 1 known as pane1
	    pane1.getChildren().add(rec2);
		pane1.getChildren().add(circle);
		pane1.getChildren().add(arc);
		pane1.getChildren().add(circle2);
		pane1.getChildren().add(circle3);
		pane1.getChildren().add(circle4);
		pane1.getChildren().add(circle5);
		pane1.getChildren().add(circle6);
		pane1.getChildren().add(e1);
		pane1.getChildren().add(e2);
		pane1.getChildren().add(e3);
		pane1.getChildren().add(rec3);
		pane1.getChildren().add(rec4);
		pane1.getChildren().add(rec5);
		pane1.getChildren().add(rec6);
		
		// dialogue
		Label label = new Label("    OmNomNomNomNomNom");
		label.setTextFill(Color.YELLOW);
		label.setLayoutX(-50);
		label.setLayoutY(-200);
		label.setFont(Font.font("Times New Roman",
		FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane1.getChildren().add(label);
		
//--------//creating the shapes panel 2-----------------------//
		
		//rectangle
	    // up and down is the thin tall rectangles 	
		// side ways is a horizontally tall rectangle 
		Rectangle rec7 = new Rectangle(-250, -250, 500, 500);  // background black
		rec7.setFill(Color.BLACK);
		Rectangle rec8 = new Rectangle (-250,-120, 500,4); //the blue streaks 
		rec8.setFill(Color.BLUE);
		Rectangle rec9 = new Rectangle (-250,-140, 500,4); // the blue streaks 
		rec9.setFill(Color.BLUE);
		Rectangle rec10 = new Rectangle (-250,140, 500,4); // the blue streaks 
		rec10.setFill(Color.BLUE);
		Rectangle rec11 = new Rectangle (-250,120, 500,4); // the blue streaks 
		rec11.setFill(Color.BLUE);
		Rectangle rec12 = new Rectangle (0,-30, 130,95); // main body of ghost 
		rec12.setFill(Color.RED);
		Rectangle rec13 = new Rectangle (55,40, 20,50); //bottom middle black streak on ghost   
		rec13.setFill(Color.BLACK);
		Rectangle rec14 = new Rectangle (7,52, 30,18); // side ways left side box 
		rec14.setFill(Color.BLACK);
		Rectangle rec15 = new Rectangle (17,40, 10,50); // up and down left side box 
		rec15.setFill(Color.BLACK);
		Rectangle rec16 = new Rectangle (103,40, 10,50); // up and down right side box 
		rec16.setFill(Color.BLACK);
		Rectangle rec17 = new Rectangle (93,52, 30,18); // side ways right side box 
		rec17.setFill(Color.BLACK);
		Rectangle rec18 = new Rectangle (15,-60, 100,40); // top of main body first part of pyramid 
		rec18.setFill(Color.RED);
		Rectangle rec19 = new Rectangle (30,-75, 70,20); // second piece of pyramid 
		rec19.setFill(Color.RED);
		Rectangle rec20 = new Rectangle (43,-87, 45,20); // third part of the pyramid 
		rec20.setFill(Color.RED);
		Rectangle rec21 = new Rectangle (27,-60, 15,40); // white eye left piece up and down 
		rec21.setFill(Color.WHITE);
		Rectangle rec22 = new Rectangle (77,-60, 15,40);  // white eye right piece up and down
		rec22.setFill(Color.WHITE);
		Rectangle rec23 = new Rectangle (15,-50,40,20); // side ways left eye piece  
		rec23.setFill(Color.WHITE);
		Rectangle rec24 = new Rectangle (65,-50,40,20); // side ways right eye piece 
		rec24.setFill(Color.WHITE);
		Rectangle rec25 = new Rectangle (15,-45,20,20); //left side blue eye piece   
		rec25.setFill(Color.BLUE);
		Rectangle rec26 = new Rectangle (65,-45,20,20); // side ways right eye piece 
		rec26.setFill(Color.BLUE);
		
		
		//circle 
		Circle circle7 = new Circle(-110,0,7); // the eating bits 
		Circle circle8 = new Circle(-140,0,7);
		Circle circle9 = new Circle(-170,0,7);
		Circle circle10 = new Circle(-200,0,7);
		Circle circle11 = new Circle(-230,0,7);
		Circle circle12 = new Circle(-80,0,7);
		Circle circle13 = new Circle(-50,0,7);
		Circle circle14 = new Circle(-20,0,7);
		Circle circle15 = new Circle(150,0,7);
		Circle circle16 = new Circle(180,0,7);
		Circle circle17 = new Circle(210,0,7);
		//sending circle to function 
		DrawCricle(circle7);
		DrawCricle(circle8);
		DrawCricle(circle9);
		DrawCricle(circle10);
		DrawCricle(circle11);
		DrawCricle(circle12);
		DrawCricle(circle13);
		DrawCricle(circle14);
		DrawCricle(circle15);
		DrawCricle(circle16);
		DrawCricle(circle17);
		
		//Ellipse 
		Ellipse e4 = new Ellipse(90, -190, 160, 30);
	    e4.setFill(Color.ALICEBLUE);
		
	  //dialogue for panel2
	  	Label label2 = new Label("What a WonderFull Day");
	  	label2.setTextFill(Color.RED);
	  	label2.setLayoutX(-50);
	  	label2.setLayoutY(-200);
	  	label2.setFont(Font.font("Times New Roman",
	  	FontWeight.BOLD, FontPosture.ITALIC, 20));
	  	
		//adding all the shapes to story block 2 known as pane2
		pane2.getChildren().add(rec7);
		pane2.getChildren().add(rec8);
		pane2.getChildren().add(rec9);
		pane2.getChildren().add(rec10);
		pane2.getChildren().add(rec11);
		pane2.getChildren().add(rec12);
		pane2.getChildren().add(rec13);
		pane2.getChildren().add(rec14);
		pane2.getChildren().add(rec15);
		pane2.getChildren().add(rec16);
		pane2.getChildren().add(rec17);
		pane2.getChildren().add(rec18);
		pane2.getChildren().add(rec19);
		pane2.getChildren().add(rec20);
		pane2.getChildren().add(rec21);
		pane2.getChildren().add(rec22);
		pane2.getChildren().add(rec23);
		pane2.getChildren().add(rec24);
		pane2.getChildren().add(rec25);
		pane2.getChildren().add(rec26);
		pane2.getChildren().add(circle7);
		pane2.getChildren().add(circle8);
		pane2.getChildren().add(circle9);
		pane2.getChildren().add(circle10);
		pane2.getChildren().add(circle11);
		pane2.getChildren().add(circle12);
		pane2.getChildren().add(circle13);
		pane2.getChildren().add(circle14);
		pane2.getChildren().add(circle15);
		pane2.getChildren().add(circle16);
		pane2.getChildren().add(circle17);
		pane2.getChildren().add(e4);
		pane2.getChildren().add(label2);
		
		
		
		//--------//creating the shapes panel 3-----------------------//
		
		//adding all the shapes to story block 3 known as pane3
		
		//rectangle
	    // up and down is the thin tall rectangles 	
		// side ways is a horizontally tall rectangle 
		Rectangle rec27 = new Rectangle(-250, -250, 500, 500);  // background black
		rec27.setFill(Color.BLACK);
		Rectangle rec28 = new Rectangle (-250,-120, 500,4); //the blue streaks 
		rec28.setFill(Color.BLUE);
		Rectangle rec29 = new Rectangle (-250,-140, 500,4); // the blue streaks 
		rec29.setFill(Color.BLUE);
		Rectangle rec30 = new Rectangle (-250,140, 500,4); // the blue streaks 
		rec30.setFill(Color.BLUE);
		Rectangle rec31 = new Rectangle (-250,120, 500,4); // the blue streaks 
		rec31.setFill(Color.BLUE);
		Rectangle rec32 = new Rectangle (0,-30, 130,95); // main body of ghost 
		rec32.setFill(Color.BLUE);
		Rectangle rec33 = new Rectangle (55,40, 20,50); //bottom middle black streak on ghost   
		rec33.setFill(Color.BLACK);
		Rectangle rec34 = new Rectangle (7,52, 30,18); // side ways left side box 
		rec34.setFill(Color.BLACK);
		Rectangle rec35 = new Rectangle (17,40, 10,50); // up and down left side box 
		rec35.setFill(Color.BLACK);
		Rectangle rec36 = new Rectangle (103,40, 10,50); // up and down right side box 
		rec36.setFill(Color.BLACK);
		Rectangle rec37 = new Rectangle (93,52, 30,18); // side ways right side box 
		rec37.setFill(Color.BLACK);
		Rectangle rec38 = new Rectangle (15,-60, 100,40); // top of main body first part of pyramid 
		rec38.setFill(Color.BLUE);
		Rectangle rec39 = new Rectangle (30,-75, 70,20); // second piece of pyramid 
		rec39.setFill(Color.BLUE);
		Rectangle rec40 = new Rectangle (43,-87, 45,20); // third part of the pyramid 
		rec40.setFill(Color.BLUE);
		Rectangle rec41 = new Rectangle (17,15, 10,10); // 1st mouth piece left most  
		rec41.setFill(Color.WHITE);
		Rectangle rec42 = new Rectangle (52,15, 25,10);  // 3rd mouth piece left 
		rec42.setFill(Color.WHITE);
		Rectangle rec43 = new Rectangle (27,5,25,10); // 2nd mouth piece   
		rec43.setFill(Color.WHITE);
		Rectangle rec44 = new Rectangle (77,5,25,10); // 4th mouse piece  
		rec44.setFill(Color.WHITE);
		Rectangle rec45 = new Rectangle (40,-45,20,20); //  white eye left  
		rec45.setFill(Color.WHITE);
		Rectangle rec46 = new Rectangle (70,-45,20,20); // white eye right 
		rec46.setFill(Color.WHITE);
		Rectangle rec47 = new Rectangle (102,15,10,10); // last 5th mouth piece   
		rec47.setFill(Color.WHITE);
		
		//circle 
		Circle circle18 = new Circle(-110,0,7); // the eating bits 
		Circle circle19 = new Circle(-140,0,7);
		Circle circle20 = new Circle(-170,0,7);
		Circle circle21 = new Circle(-200,0,7);
		Circle circle22 = new Circle(-230,0,7);
		Circle circle23 = new Circle(-80,0,7);
		Circle circle24 = new Circle(-50,0,7);
		Circle circle25 = new Circle(-20,0,7);
		Circle circle26 = new Circle(150,0,7);
		Circle circle27 = new Circle(180,0,7);
		Circle circle28 = new Circle(210,0,7);
		//sending circle to function 
		DrawCricle(circle18);
		DrawCricle(circle19);
		DrawCricle(circle20);
		DrawCricle(circle21);
		DrawCricle(circle22);
		DrawCricle(circle23);
		DrawCricle(circle24);
		DrawCricle(circle25);
		DrawCricle(circle26);
		DrawCricle(circle27);
		DrawCricle(circle28);
		
		//Polygon
	    Polygon polygon = new Polygon();
	    pane.getChildren().add(polygon); 
	    polygon.setFill(Color.YELLOW);
	    polygon.setStroke(Color.BLACK);
	    ObservableList<Double> list = polygon.getPoints();
	    
	    final double WIDTH = 23, HEIGHT = 23;  // size of the polygon 
	    double centerX = WIDTH / 2, centerY = HEIGHT / 2;
	    double radius = Math.min(WIDTH, HEIGHT) * 0.4;

	    // Making the polygon
	    for (int i = 0; i < 6; i++) {
	      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6)); 
	      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
	    }
		polygon.setLayoutX(-30); // sets the location of the polygon 
		polygon.setLayoutY(-10);
		
		//line 
		Line line = new Line(10,10,100,10);
		line.setFill(Color.WHITE);
		line.setStroke(Color.WHITE);
		line.setLayoutX(-90);
		line.setLayoutY(-50);
		
		Line line2 = new Line(10,10,100,10);
		line2.setFill(Color.WHITE);
		line2.setStroke(Color.WHITE);
		line2.setLayoutX(-120);
		line2.setLayoutY(-60);
		
		Line line3 = new Line(10,10,100,10);
		line3.setFill(Color.WHITE);
		line3.setStroke(Color.WHITE);
		line3.setLayoutX(-120);
		line3.setLayoutY(-40);
		
		Line line4 = new Line(10,10,100,10);
		line4.setFill(Color.WHITE);
		line4.setStroke(Color.WHITE);
		line4.setLayoutX(-110);
		line4.setLayoutY(10);
		
		Line line5 = new Line(10,10,100,10);
		line5.setFill(Color.WHITE);
		line5.setStroke(Color.WHITE);
		line5.setLayoutX(-130);
		line5.setLayoutY(30);
		
		//adding shapes to the pane3
		pane3.getChildren().add(rec27);
		pane3.getChildren().add(rec28);
		pane3.getChildren().add(rec29);
		pane3.getChildren().add(rec30);
		pane3.getChildren().add(rec31);
		pane3.getChildren().add(rec32);
		pane3.getChildren().add(rec33);
		pane3.getChildren().add(rec34);
		pane3.getChildren().add(rec35);
		pane3.getChildren().add(rec36);
		pane3.getChildren().add(rec37);
		pane3.getChildren().add(rec38);
		pane3.getChildren().add(rec39);
		pane3.getChildren().add(rec40);
		pane3.getChildren().add(rec41);
		pane3.getChildren().add(rec42);
		pane3.getChildren().add(rec43);
		pane3.getChildren().add(rec44);
		pane3.getChildren().add(rec45);
		pane3.getChildren().add(rec46);
		pane3.getChildren().add(rec47);
		pane3.getChildren().add(circle18);
		pane3.getChildren().add(circle19);
		pane3.getChildren().add(circle20);
		pane3.getChildren().add(circle21);
		pane3.getChildren().add(circle22);
		pane3.getChildren().add(circle23);
		pane3.getChildren().add(circle24);
		pane3.getChildren().add(circle25);
		pane3.getChildren().add(circle26);
		pane3.getChildren().add(circle27);
		pane3.getChildren().add(circle28);
		pane3.getChildren().add(polygon);
		pane3.getChildren().add(line);
		pane3.getChildren().add(line2);
		pane3.getChildren().add(line3);
		pane3.getChildren().add(line4);
		pane3.getChildren().add(line5);
		
		
		//button event handling for exit  
		btExit.setOnAction((ActionEvent e) -> {
			System.exit(0); // exiting the java program
		});
		//button event handling for Change text 
		btChange.setOnAction((ActionEvent e) -> {
			label.setText("MUST DEVOUR EVERYTHING!"); // changing of the text 
			label2.setText("Oh look a frendly yellow ball.");
			
			//talk for the third panel 
			Ellipse e5 = new Ellipse(50,-190, 200, 30);
		    e5.setFill(Color.ALICEBLUE);
			Label label3 = new Label("He's Going TO EAT ME!!! RUN AWAY!");
			label3.setTextFill(Color.BLUE);
			label3.setLayoutX(-100);
			label3.setLayoutY(-200);
			label3.setFont(Font.font("Times New Roman",
			FontWeight.BOLD, FontPosture.ITALIC, 20));
			pane3.getChildren().add(e5);
			pane3.getChildren().add(label3);
			
			//WOOSH text effect for the ghost running away 
			Text text= new Text(-130,35,"WHOOSH!");
			text.setFill(Color.ANTIQUEWHITE);
			text.setFont(Font.font("Times New Roman",
			FontWeight.EXTRA_BOLD, FontPosture.ITALIC,20));
			pane3.getChildren().add(text);
		});
		
		scene1 = new Scene (pane);
		mainStage.setScene(scene1);
		mainStage.show();
	}
	private void DrawCricle(Circle circle) 
	{
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.YELLOW);
	}
	class CustomPane extends GridPane
	{
		public CustomPane(Pane pane)
		{
		    getChildren().add(new Pane(pane));
		    setStyle("-fx-border-color: black");
		    setPadding(new Insets(250, 250, 250, 250));
		 }		
	}
	

	
	
	
	

}
