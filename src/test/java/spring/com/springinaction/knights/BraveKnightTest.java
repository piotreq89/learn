package spring.com.springinaction.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;
import spring.com.springinaction.quest.Quest;

/**
 * Created by piotr.walenda on 28.11.2017.
 */


public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();

    }
}
