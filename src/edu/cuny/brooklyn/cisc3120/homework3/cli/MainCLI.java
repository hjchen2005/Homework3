package edu.cuny.brooklyn.cisc3120.homework3.cli;

import edu.cuny.brooklyn.cisc3120.homework3.core.*;
//import java.lang.Math;
//import java.util.Random;
//import java.util.Scanner;

public class MainCLI {
	
	public static void main(String[] args) throws Exception {
        // TODO:  You can just hard code your config for this assignment.
        /* Parsing commandline arguments is optional.
		
		if (args.length != 2) {
            System.out.println("Usage: java GuessGame MAX_INT MAX_GUESS");
            return;
        } */
		
        Configuration myConfig = new Configuration(6, 5); // mexInteger=6, 5 guesses allowed

        // Resolve and inject dependencies.
        IClient myClient = new ClientCLI();
        IGuesser myGuesser = new GuesserCLI();
        IChooser myChooser = new RandomChooser(myConfig); // creates a target integer

        Game myGame = new Game(myChooser, myGuesser, myClient, myConfig);
        myGame.play();
    }

}
