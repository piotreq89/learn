package spring.com.springinaction.knights;

import spring.com.springinaction.quest.Quest;

/**
 * Created by piotr.walenda on 28.11.2017.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
