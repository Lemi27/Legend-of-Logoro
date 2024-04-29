/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               LandBoss.java
@description        The class setting the attributes of the
                    boss of the land realm.
********************************************************/
package worlds.bosses;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;
import worlds.wand.Cypress;

public class LandBoss extends Bosses {

    // CONSTRUCTOR
    public LandBoss() {

        setBossName("Terraformer the Land Lacerator");
        setHp(18);
        setMaxHP(18);
        setOffense(1);
        setDefense(1.25);
        bossWand = new Cypress();
        setLevel(2);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(6);
        setMaxDefense(5);
        reward = 15;

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Terraformer, your oppressive rule ends today. Give me the Prism fragment, or suffer the consequences.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Terraformer: Speak to me with respect, insect! I am the ruler of Subtractus, and I crush those who defy me without mercy. Everyone who watches this duel will know that I tolerate no rebels! Prepare to witness true despair!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your cruelty knows no bounds. I'll ensure that you never harm another soul on this planet again.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Terraformer, your oppressive rule ends today. Give me the Prism fragment, or suffer the consequences.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Terraformer: Speak to me with respect, insect! I am the ruler of Subtractus, and I crush those who defy me without mercy. Everyone who watches this duel will know that I tolerate no rebels! Prepare to witness true despair!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your cruelty knows no bounds. I'll ensure that you never harm another soul on this planet again.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {

    }
    
}
