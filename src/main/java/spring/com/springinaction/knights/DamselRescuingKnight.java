package spring.com.springinaction.knights;

import spring.com.springinaction.quest.RescueDamselQuest;

/**
 * Created by piotr.walenda on 28.11.2017.
 */
public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    private DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }

}
