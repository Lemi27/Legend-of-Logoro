/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               MasterBoss.java
@description        The class setting the attributes of the
                    boss of the master realm.
********************************************************/
package worlds.bosses;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class MasterBoss extends Bosses {

    // CONSTRUCTOR
    public MasterBoss() {

        setBossName("Omnius the Operation Overlord");
        setHp(30);
        setMaxHP(30);
        setOffense(1.5);
        setDefense(1.25);
        
        // master has his own unique 'Elder Wand'
        // most powerful wand ever
        bossWand.setName("Elder Wand");
        bossWand.setDefense(2);
        bossWand.setOffense(2.25);
        setLevel(5);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(6);
        setMaxDefense(4);

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Onimus, your empire of chaos stops here. Hand over the final fragment of the Prism, or face the full force of my power.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Onimus: Ah, the insolent worm dares to challenge me? I am the supreme ruler of Operationaria and the galaxy! I will crush you beneath my heel like the insignificant pest you are. Prepare to face oblivion!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your arrogance blinds you. I'll bring an end to your tyranny and ensure that the galaxy knows peace once more, even if it costs me everything.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {

    }
    
}
