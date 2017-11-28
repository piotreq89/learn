package spring.com.springinaction.quest;

import java.io.PrintStream;

/**
 * Created by piotr.walenda on 28.11.2017.
 */
public class SlayDragonQuest implements Quest {

    PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark() {
        stream.print("\nEmbark on quest to slay the dragon !\n");

    }
}
