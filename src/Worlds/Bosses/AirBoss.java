/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               AirBoss.java
@description        The class setting the attributes of the
                    boss of the air realm.
********************************************************/

package worlds.bosses;

import worlds.wand.Ebony;

public class AirBoss extends Bosses {

    // CONSTRUCTOR
    public AirBoss() {

        setBossName("Aeritha the Summator");
        setHp(16);
        setMaxHP(16);
        setOffense(1);
        setDefense(1.25);
        bossWand = new Ebony();
        setLevel(1);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(5);
        setMaxDefense(4);

    }
    
}
