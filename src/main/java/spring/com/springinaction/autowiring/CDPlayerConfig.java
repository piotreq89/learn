package spring.com.springinaction.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by piotr.walenda on 30.01.2018.
 */


// Skanowanie komponentów nie jest domyślnie włączone, wciąż musimy jawnie utworzyć konfigurację która włączy mechanizm
// wyszukiwania klas opatrzonych adnotacją @Component i utworzy komponenty dla tych klas.

@Configuration
@ComponentScan // włącza mechanizm skanowania komponentów, jeśli nie przekazano żadnych ustawień domyślnym pakietem w
                // którym będą skanowane komponeny jest pakiet klasy konfiguracji
public class CDPlayerConfig {
}
