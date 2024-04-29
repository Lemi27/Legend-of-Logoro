/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               FireBoss.java
@description        The class setting the attributes of the
                    boss of the fire realm.
********************************************************/
package worlds.bosses;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;
import worlds.wand.Spruce;

public class FireBoss extends Bosses {

    // CONSTRUCTOR
    public FireBoss() {

        setBossName("Ignitia the Flame Fractionator");
        setHp(24);
        setMaxHP(24);
        setOffense(1.25);
        setDefense(1.25);
        bossWand = new Spruce();
        setLevel(4);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(4);
        setMaxDefense(3);
        reward = 25;

    }


    // methods for storyline as user stumbles upon the Boss
    // will be overriden in each method
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Ignitia, your deceitful schemes have no place in this galaxy. Give me the Prism fragment, or face the consequences.", 50);
        System.out.println("\n"); // 2 newlines
        Utilities.slowPrint("Ignitia: You have the audacity to stand before me? I am the master of Dividia, and I delight in the agony of my enemies. Prepare to be consumed by the flames of your own destruction!", 50);
        System.out.println("\n"); 
        Utilities.slowPrint(character.getFirstName() + ": Your wickedness disgusts me. I'll ensure that you never harm another soul on this planet again.", 50);
        System.out.println("\n"); 
        Utilities.freeze(100); // give character time to read dialogues
    }

    @Override
    public void endStoryline(MainCharacter character)
    {
        Utilities.slowPrint(character.getFirstName() + ": Ignitia, your flames of deceit have been extinguished. Now, give me the Prism fragment and accept your defeat.", 50);
        System.out.println("\n");
        Utilities.slowPrint("Ignitia: You... you think you've bested me? Dividia... will never know peace... My flames... will consume everything...", 50);
        System.out.println("\n");
        Utilities.slowPrint(character.getFirstName() + "Your flames are dying, Ignitia. You have no more tricks up your sleeve, its time to relinquish control of the fragment and let dividia thrive.", 50);
        System.out.println("\n");
        Utilities.slowPrint("Ignitia: Take it... Take the fragment... but know this... fire... fire will always find a way to burn...", 50);
        System.out.println("\n");
        Utilities.freeze(3000);
    }


    
}
/*
**Player:** "Ignitia, your flames of deceit have been extinguished. Now, give me the Prism fragment and accept your defeat."

**Ignitia:** "You... you think you've bested me? Dividia... will never know peace... My flames... will consume everything..."

(Ignitia's fiery aura flickers, barely holding on)

**Player:** "Your flames are dying, Ignitia. You habve no more tricks up your sleeve, its time to relinquish control of the fragment and let dividia thrive."

(Ignitia begrudgingly hands over the Prism fragment)

**Ignitia:** "Take it... Take the fragment... but know this... fire... fire will always find a way to burn..."
 */