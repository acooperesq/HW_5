package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.scene.Group;
import javafx.scene.paint.Color;

import javafx.scene.shape.*;
import java.util.Random;


		public class HW5_obj3 extends Application {
			
			
			Rectangle[][] arr = new Rectangle[24][24]; 
			
			@Override
			public void start(Stage primaryStage) {
				try {
					
					
					
				
					int goes[][]= new int[24][24];  //array for passing a randomly-generated "0" for "white" or "1" for "black" from rndarry() to qrcolor(goes)
					
					
					goes = rndarry(); // invokes static method to randomly-generate 2D array "0" for "white" or "1" for "black"
					
					
					arr = qrcolor(goes); // invokes static method to generate background rectangles as Black or White
					
					
					
					//  Making the overlapping squares (9 of them) 
					Rectangle square1 = new Rectangle(0, 0, 140, 140);
					square1.setFill(Color.BLACK);
					
					Rectangle square1_in = new Rectangle(20, 20, 100, 100);
					square1_in.setFill(Color.WHITE);
					
					Rectangle square1_in2 = new Rectangle(40, 40, 60, 60);
					square1_in2.setFill(Color.BLACK);
					
					
					Rectangle square2 = new Rectangle(0, 340, 140, 140);
					square2.setFill(Color.BLACK);
					
					Rectangle square2_in = new Rectangle(20, 360, 100, 100);
					square2_in.setFill(Color.WHITE);
					
					Rectangle square2_in2 = new Rectangle(40, 380, 60, 60);
					square2_in2.setFill(Color.BLACK);
					
					
					Rectangle square3 = new Rectangle(340, 0, 140, 140);
					square3.setFill(Color.BLACK);
					
					Rectangle square3_in = new Rectangle(360, 20, 100, 100);
					square3_in.setFill(Color.WHITE);
					
					Rectangle square3_in2 = new Rectangle(380, 40, 60, 60);
					square3_in2.setFill(Color.BLACK);
					
					Rectangle square4 = new Rectangle(300, 300, 100, 100);
					square4.setFill(Color.BLACK);
					
					Rectangle square4_in = new Rectangle(320, 320, 60, 60);
					square4_in.setFill(Color.WHITE);
					
					Rectangle square4_in2 = new Rectangle(340, 340, 20, 20);
					square4_in2.setFill(Color.BLACK);
					
					
					
					BorderPane root = new BorderPane();
					
					//  Adding the rectangles to a group
					
					Group root1 = new Group();
					 for (int i = 0; i <24; i ++)
					{for (int j = 0; j <24; j ++)
					{
						
						 root1.getChildren().add(arr[i][j]);
						
						
					}
						
					}
					 
				
					 Group root2 = new Group(root,  square1, square1_in, square1_in2, square2, square2_in, square2_in2, square3, square3_in, square3_in2, square4, square4_in, square4_in2);
					 
					Group root3 = new Group (root1, root2);
					
					
					Scene scene = new Scene(root3, 480,480);  // change of size to make easier for 24 columns to be divided evenly - each one 20
					
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					
				
					primaryStage.setScene(scene);
					primaryStage.show();
					
					
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			
			//**********************************************************
			public static Rectangle[][] qrcolor(int[][] goes) {
				 
				Rectangle[][] arq = new Rectangle[24][24]; // 24 Individual Boxes of the QR Code
				
				for ( int m =0; m <24; m++)
				{for ( int n =0; n <24; n++)
					
					{Rectangle r = new Rectangle(m*20, n*20, 20, 20);
					
					
					
					if (goes[m][n] == 1)
					
						{
					r.setFill(Color.BLACK);}
					else 
						r.setFill(Color.WHITE);	
					 arq[m][n] = r;
					}
					
				}
				
				return arq;
				}
			
			
				//********************************************************
			private static int[][] rndarry() {
				Random gen  = new Random();
				int goesq[][]= new int[24][24];
				for (int j =0; j <24; j++)
					for (int k =0; k <24; k++)
				
				{goesq[j][k] = gen.nextInt(2);
				
				
				}
				return goesq;
				}
			
			

			public static void main(String[] args) {
				launch(args);
			}
		}
		
		

	



