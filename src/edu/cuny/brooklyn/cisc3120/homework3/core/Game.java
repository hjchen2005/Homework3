package edu.cuny.brooklyn.cisc3120.homework3.core;

public class Game
{
    private IClient client;
    private IChooser chooser;
    private IGuesser guesser;
    private Configuration config;

    public Game(IChooser chooser, IGuesser guesser, IClient client, Configuration config)
    {
        // TODO: Assign arguments to members.
    	/*
    	chooser = this.chooser;
    	guesser=this.guesser;
    	client=this.client;
    	config=this.config;
*/
    }

    public void play()
    {
        // TODO: Implement the guessing game here:
    	int attempts =0;
    	while (attempts<=config.getAllowedGuesses()){
    		//chooser.checkGuess(guesser.nextGuess());
    		if (chooser.checkGuess(guesser.nextGuess()) != IChooser.ComparisonResult.Correct){
    			attempts++;
    			if (chooser.checkGuess(guesser.nextGuess()) == IChooser.ComparisonResult.TooHigh)
    				client.tooHigh();
    			else client.tooLow();
    		}
    		else {
    			client.win();
    			break;
    			}
    	} client.lose();
    	System.out.println("Thank you for playing");
    } 
}