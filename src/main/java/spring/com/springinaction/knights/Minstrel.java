package spring.com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by piotrek on 2017-11-28.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.print("lalalala idzie na misje\n");
    }

    public void singAfterQuest(){
        stream.print("\nhip hip hura wrócił");
    }
}

