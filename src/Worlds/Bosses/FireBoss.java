package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class FireBoss extends Bosses {

    public FireBoss() {

        setBossName("Ignitia the Flame Fractionator");
        setHp(8);
        setOffense(8);
        setDefense(2.1);
        bossWand = new Magnolia();
        setLevel(4);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
