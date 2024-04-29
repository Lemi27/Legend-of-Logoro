/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               AirBoss.java
@description        The class setting the attributes of the
                    boss of the air realm.
********************************************************/

package worlds.bosses;

import worlds.MainCharacter;
import worlds.wand.Ebony;
import worlds.functionalities.Utilities;

public class AirBoss extends Bosses {

    // CONSTRUCTOR
    public AirBoss() {

        setBossName("Aeritha the Summator");
        setHp(16);
        setMaxHP(16);
        setOffense(1);
        setDefense(1);
        bossWand = new Ebony();
        setLevel(1);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(5);
        setMaxDefense(4);

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Aeritha, your reign of terror ends now. Hand over the fragment of the Prism, or face the consequences.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Aeritha: Ha! Pathetic mortal, you think you can challenge me? I am the sovereign of Mathania, and you are but an ant beneath my heel. Prepare to grovel at my feet!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your tyranny ends today. I'll make sure the people of Mathania are free from your grasp, no matter what it takes.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {

    }
    
}
