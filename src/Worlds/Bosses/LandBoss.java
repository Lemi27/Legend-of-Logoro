/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               LandBoss.java
@description        The class setting the attributes of the
                    boss of the land realm.
********************************************************/
package worlds.bosses;

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
    
}
