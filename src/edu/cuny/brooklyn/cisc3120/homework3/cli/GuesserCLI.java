package edu.cuny.brooklyn.cisc3120.homework3.cli;

import java.util.Scanner;
import javax.swing.JOptionPane;
import edu.cuny.brooklyn.cisc3120.homework3.core.IGuesser;

class GuesserCLI implements IGuesser {
    public int nextGuess(){
        // Read input from the command line.
    	Scanner input = new Scanner(System.in);
    	
    	/*
    	int getIntFromUser (String text, int min, int max){
            while (true)
            {
                try
                {
                    int val = Integer.parseInt(JOptionPane.showInputDialog(text));
                    if (min <= val && val <= max)
                        return val;
                }
                catch (NumberFormatException e) { 
                	System.out.println("That was not a number! Please try again.\n\n");
                }
            }
        }*/
    	//System.out.printf("Guess a number between 1 and %d.\n", maxInteger);
        return input.nextInt();
    }
}
