package com.mycompany.a1;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.lang.String;


public class Game extends Form {
	
	private GameWorld gw;
	
	public Game()
	{
		gw = new GameWorld();
		gw.init();
		play();
		
	}
	
	private void play()
	{
		Label myLabel = new Label("Enter a Command:");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		myTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				
				
					
				switch (sCommand.charAt(0))
				{

					case 'a': // add a new asteroid to the world 
						//method call to add asteroid
						break;
				
					case 'y':
						//method call to add NPS to world
						break;
					case 'b':
						//method call to add a new blinking space station to the world
						break;
					case 's':
						//method call to add a PS to the world
						break;
					case 'i': 
						//increase the speed of the PS by a small amount
						break;
					case 'd':
						//decrease the speed of the PS by a small amount, but not negative
						break;
					case 'l':
						//turn PS left by a small amount counter clockwise
						break;
					case 'r':
						//turn PS right by a small amount clock wise 
						break;
					case '>': 
						//controls direction of PS's missile launcher
						//by revolving about center of PS in c.c direction
						break;
					case 'f':
						//fire missile from front of PS
						//if no missiles remaining, display err msg
						break;
					case 'L': 
						//launch a missile from front of NPS
						//if no missiles, display err msg
					case 'j':
						//jumps PS to center of initial default position screen
						break;
					case 'n':
						//load new supply of missiles into PS
						break;
					case 'k':
						//remove asteroid killed by PS and increment player score
						break;
					case 'e': //if letter e is input
						gw.eliminate(); //eliminate gameworld.
						break;
					
					case 'E':
						//remove missile and PS after a missile has struck a PS
						break;
					case 'c':
						//PS crashed into asteroid, remove ship and asteroid 
						//decrement the count of lives left
						//game is over if no lives left
						break;
					case 'h':
						//the PS has hit a NPS, remove NPS and decrement lives left
						break;
					case 'x':
						//two asteroids have collided
						//remove two asteroids from game
						break;
					case 'I':
						//asteroid impacted NPS, remove both from game
						break;
					case 't':
						//game clock has ticked
						//updated game state variables
						break;
					case 'p':
						//print display of current game state values
						break;
					case 'm':
						//print a map showing the current world state
						break;
					case 'q':
						//terminate program by using System.exit(0);
						System.exit(0);
						break;
					default:
						System.out.println("\nInput is invalid\n");
				} // switch (sCommand.chartAt(0))
			} //public void actionPerformed(ActionEvent evt)
		} //myTextField.addActionListener(new ActionListener()
		
		); //myTextField.addActionListener(

	} // private void play()
}




/* 
 * code here to accept and execute user commands
 * that operate on the game world
 */

//Scanner to accept keyboard commands 
	//invoke appropriate method in GameWorld 
	//to manipulate and display data and game state values in game model

/* 
 * how to accept single character commands via text field on form
 * 	is indicated in appendix - C1 Notes
 */	