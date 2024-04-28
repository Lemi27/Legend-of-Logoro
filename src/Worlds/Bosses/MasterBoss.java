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
        setHp(30);
        setMaxHP(30);
        setOffense(1.75);
        setDefense(1.75);
        
        // master has his own unique 'Elder Wand'
        // most powerful wand ever
        bossWand.setName("Elder Wand");
        bossWand.setDefense(2.5);
        bossWand.setOffense(3);
        setLevel(5);
        setMinAttack(1);
        setMinDefense(1);
        setMaxAttack(6);
        setMaxDefense(4);

    }
    
}
