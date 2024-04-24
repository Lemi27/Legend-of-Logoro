package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class WaterBoss extends Bosses {
    
    public WaterBoss() {

        setHp(8);
        setOffense(8);
        setDefense(3);
        bossWand = new Willow();
        setLevel(3);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }

}
