/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               FireBoss.java
@description        The class setting the attributes of the
                    boss of the fire realm.
********************************************************/
package worlds.bosses;

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

    }
    
}
