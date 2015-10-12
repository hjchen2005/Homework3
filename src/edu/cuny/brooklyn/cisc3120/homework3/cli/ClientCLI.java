package edu.cuny.brooklyn.cisc3120.homework3.cli;

import edu.cuny.brooklyn.cisc3120.homework3.core.IClient;

class ClientCLI implements IClient {
    public void win()
    {
        // TODO: Display correct message.
    	System.out.println("Win");
    }

    public void lose()
    {
        // TODO: Display correct message.
    	System.out.println("Lose");
    }

    public void tooLow()
    {
        // TODO: Display correct message.
    	System.out.println("Your guess is too low");
    }

    public void tooHigh()
    {
        // TODO: Display correct message.
    	System.out.println("Your guess is too high");
    }
}