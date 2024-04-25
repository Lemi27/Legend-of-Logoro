/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               WaterBoss.java
@description        The class setting the attributes of the
                    boss of the water realm.
********************************************************/
package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class WaterBoss extends Bosses {
    
    // CONSTRUCTOR
    public WaterBoss() {

        setBossName("Maritima the Wet Whirler");
        setHp(8);
        setOffense(8);
        setDefense(3);
        bossWand = new Willow();
        setLevel(3);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }

}
