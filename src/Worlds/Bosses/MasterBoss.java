/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               MasterBoss.java
@description        The class setting the attributes of the
                    boss of the master realm.
********************************************************/
package src.Worlds.Bosses;

public class MasterBoss extends Bosses {

    // CONSTRUCTOR
    public MasterBoss() {

        setBossName("Omnius the Operation Overlord");
        setHp(8);
        setOffense(8);
        bossWand.setDefense(8);
        bossWand.setOffense(8);
        setLevel(5);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
