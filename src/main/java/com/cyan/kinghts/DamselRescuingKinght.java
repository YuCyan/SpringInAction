package com.cyan.kinghts;

/**
 * Created by Cyan on 2017/9/20.
 */
public class DamselRescuingKinght implements Kinght {

    private RescurDamselQuest quest;

    public DamselRescuingKinght(){
        this.quest = new RescurDamselQuest();//与RescurDamselQuest紧耦合
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
