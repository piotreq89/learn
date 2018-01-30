package spring.com.springinaction.autowiring;

import org.springframework.stereotype.Component;

/**
 * Created by piotr.walenda on 30.01.2018.
 */
@Component //informacja dla springa żeby utworzyć komponent dla tej klasy
public class StgPeppers implements CompactDisc {

    public void play() {
        System.out.print("Odtwarzam utwór Sgt. Pepper's Lonely Hearts Club Brand artysty The Beatels");
    }
}
