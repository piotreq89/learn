package spring.com.springinaction.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by piotr.walenda on 30.01.2018.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc disc;

    @Autowired // !Autowirde jest ze springa zamiast tego można użyć @Inject ze specyfikacji Java Dependency Injection
    public CDPlayer(@Qualifier("stgPeppers") CompactDisc disc){
        this.disc = disc;
    }
    public void play() {
        disc.play();
    }
}
