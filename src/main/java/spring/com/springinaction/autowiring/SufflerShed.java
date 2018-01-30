package spring.com.springinaction.autowiring;

import org.springframework.stereotype.Component;

/**
 * Created by piotr.walenda on 30.01.2018.
 */
@Component // można użyć adnotacji @Named są podobne, @Named pochodzi ze specyfikacji Java Dependency Injection
public class SufflerShed implements CompactDisc {
    public void play() {
        System.out.println("Jolka Jolka pamiętasz ?");
    }
}
