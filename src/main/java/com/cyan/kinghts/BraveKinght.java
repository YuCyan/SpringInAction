package com.cyan.kinghts;

/**
 * Created by Cyan on 2017/9/20.
 */
public class BraveKinght implements Kinght {
    private Quest quest;
    public BraveKinght(Quest quest){//<--Quest被注入进来
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }

    public void kinghtShouldEmbarkOnQuest(){

    }

}
