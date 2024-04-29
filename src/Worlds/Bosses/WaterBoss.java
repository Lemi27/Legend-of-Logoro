/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               WaterBoss.java
@description        The class setting the attributes of the
                    boss of the water realm.
********************************************************/
package worlds.bosses;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;
import worlds.wand.Magnolia;

public class WaterBoss extends Bosses {
    
    // CONSTRUCTOR
    public WaterBoss() {

        setBossName("Maritima the Wet Whirler");
        setHp(20);
        setMaxHP(20);
        setOffense(1.1);
        setDefense(1.25);
        bossWand = new Magnolia();
        setLevel(3);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(4);
        setMaxDefense(4);

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Maritima, your chaotic reign must come to an end. Hand over the Prism fragment, or face my wrath.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Maritima: Hahaha! You think you can challenge me? I am the ruler of Multiplya, and I revel in the suffering of my subjects. Prepare to drown in a sea of despair!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your heartlessness sickens me. I'll put an end to your reign of terror and bring peace to this planet once and for all.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {

    }

}
