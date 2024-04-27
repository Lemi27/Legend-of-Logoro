/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               MasterBoss.java
@description        The class setting the attributes of the
                    boss of the master realm.
********************************************************/
package worlds.bosses;

public class MasterBoss extends Bosses {

    // CONSTRUCTOR
    public MasterBoss() {

        setBossName("Omnius the Operation Overlord");
        setHp(8);
        setOffense(8);
        setDefense(3);
        
        // master has his own unique 'Elder Wand'
        // most powerful wand ever
        bossWand.setName("Elder Wand");
        bossWand.setDefense(3);
        bossWand.setOffense(3);
        setLevel(5);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
