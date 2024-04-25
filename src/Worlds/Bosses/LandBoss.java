/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               LandBoss.java
@description        The class setting the attributes of the
                    boss of the land realm.
********************************************************/
package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class LandBoss extends Bosses {

    // CONSTRUCTOR
    public LandBoss() {

        setBossName("Terraformer the Land Lacerator");
        setHp(8);
        setOffense(8);
        setDefense(2.1);
        bossWand = new Oak();
        setLevel(2);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
