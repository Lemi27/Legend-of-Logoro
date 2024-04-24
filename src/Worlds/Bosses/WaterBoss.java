/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               WaterBoss.java
@description        The class setting the attributes of the
                    boss of the water realm.
********************************************************/
package src.Worlds.Bosses;

public class WaterBoss extends Bosses {
    
    // CONSTRUCTOR
    public WaterBoss() {

        setBossName("Maritima the Wet Whirler");
        setHp(8);
        setOffense(8);
        bossWand.setDefense(8);
        bossWand.setOffense(8);
        setLevel(3);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }

}
