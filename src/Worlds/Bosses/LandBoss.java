/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               LandBoss.java
@description        The class setting the attributes of the
                    boss of the land realm.
********************************************************/
package src.Worlds.Bosses;

public class LandBoss extends Bosses {

    // CONSTRUCTOR
    public LandBoss() {

        setBossName("Terraformer the Land Lacerator");
        setHp(8);
        setOffense(8);
        bossWand.setDefense(8);
        bossWand.setOffense(8);
        setLevel(2);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
