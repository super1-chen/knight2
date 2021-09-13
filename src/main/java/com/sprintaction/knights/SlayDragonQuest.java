package com.sprintaction.knights;

import java.io.PrintStream;

/**
 * @author albert.chen
 */
public class SlayDragonQuest implements Quest{
    private PrintStream stream;
    
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(){
        stream.println("Embarking on quest to slay the dragon!");
    }
}
