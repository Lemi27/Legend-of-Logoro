package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class MasterBoss extends Bosses {

    public MasterBoss() {

        setHp(8);
        setOffense(8);
        setDefense(3);
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
