package src.Worlds.Bosses;
import src.Worlds.Wand.*;

public class LandBoss extends Bosses {

    public LandBoss() {

        setHp(8);
        setOffense(8);
        setDefense(2.1);
        bossWand = new Oak();
        setLevel(2);
        setMinAttack(9);
        setMinDefense(9);
        setMaxAttack(9);
        setMaxDefense(9);

    }
    
}
