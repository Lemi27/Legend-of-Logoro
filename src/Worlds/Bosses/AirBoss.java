/********************************************************
@author(s)          Lemi Miyu
@date               24-April-2024
@teacher            Andrew Carreiro
@file               AirBoss.java
@description        The class setting the attributes of the
                    boss of the air realm.
********************************************************/
package src.Worlds.Bosses;

public class AirBoss extends Bosses {

    public AirBoss() {

        setBossName("Aeritha the Summator");
        setHp(8);
        setOffense(8);
        bossWand.setDefense(8);
        bossWand.setOffense(8);
        setLevel(1);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
