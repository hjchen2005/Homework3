package edu.cuny.brooklyn.cisc3120.homework3.core;

import java.util.Random;

public class RandomChooser implements IChooser {
    private int choice;

    public RandomChooser(Configuration config)
    {
        // TODO: Pick a random number.
    	// This creates a new random number generator
        Random rand = new Random();
     // This generates a random integer.  Note the "+1"!
        int choice = rand.nextInt(config.getMaxNumber()+1);
        
    }

    public IChooser.ComparisonResult checkGuess(int guess)
    {
        // TODO: Compare the guess to the choice,
        // and return the appropriate result.
    	
    	if (guess==choice){
    		return IChooser.ComparisonResult.Correct;
    	}
    	else if (guess<choice){
    		return IChooser.ComparisonResult.TooLow;
    	}
    	
    	else {
    		return IChooser.ComparisonResult.TooHigh;
    	}
    }	
}