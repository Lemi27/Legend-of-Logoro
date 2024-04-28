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
        setHp(8);
        setOffense(1);
        setDefense(2);
        bossWand = new Ebony();
        setLevel(1);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
