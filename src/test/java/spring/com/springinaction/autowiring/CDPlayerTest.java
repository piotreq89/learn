package spring.com.springinaction.autowiring;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by piotr.walenda on 30.01.2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)                 //automatycznie tworzy kontekst aplikacji po uruchomieniu testu
@ContextConfiguration(classes = CDPlayerConfig.class)   // Informuje springa skąd ma zostać wczytana konfiguracja kontekstu
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    @Qualifier("sufflerShed")
    @Autowired // wstrzykuje kopmponent CompactDisc do utworzonego testu
    private CompactDisc disc;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(disc);
    }

    @Test
    public void chShouldContainsBeatels(){
        disc.play();
    }

    @Test
    public void playerShouldPlay(){
        mediaPlayer.play();
        assertEquals("Odtwarzam utwór Sgt. Pepper's Lonely Hearts Club Brand artysty The Beatels", log.getLog());
    }
}
