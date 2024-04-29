/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               WaterBoss.java
@description        The class setting the attributes of the
                    boss of the water realm.
********************************************************/
package worlds.bosses;

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
        reward = 20;

    }

}
