/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               FireBoss.java
@description        The class setting the attributes of the
                    boss of the fire realm.
********************************************************/
package worlds.bosses;

import worlds.wand.Magnolia;

public class FireBoss extends Bosses {

    // CONSTRUCTOR
    public FireBoss() {

        setBossName("Ignitia the Flame Fractionator");
        setHp(8);
        setOffense(8);
        setDefense(2.1);
        bossWand = new Magnolia();
        setLevel(4);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
