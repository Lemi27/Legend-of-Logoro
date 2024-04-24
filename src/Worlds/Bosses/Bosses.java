/********************************************************
@author(s)          Fawaaz Kamali Siddiqui and Lemi Miyu
@date               24 April 2024
@teacher            Andrew Carreiro
@file               Bosses.java
@description        Parent class for the Bosses, creating 
                    necessary attributes for bosses.
********************************************************/

package src.Worlds.Bosses;
import src.Worlds.Wand.*;


public class Bosses {

    // CLASS VARIABLES
    private String bossName;
    private double hp;
    private double offense;
    Wand bossWand = new Wand();
    int level;
    private int minAttack;
    private int minDefense;
    private int maxAttack;
    private int maxDefense;

    public Bosses(){
        
        bossName = "";
        hp = 0;
        offense = 0;
        bossWand.setName("Boss Wand");
        bossWand.setDefense(0);
        bossWand.setOffense(0);
        minAttack = 0;
        minDefense = 0;
        maxAttack = 0;
        maxDefense = 0; 

    }

    // GETTERS

    public String getBossName() {

        return this.bossName;

    }

    public double getHp() {

        return this.hp;

    }

    public double getOffense() {

        return this.offense;

    }

    public int level() {

        return this.level;

    }

    public int getMinAttack() {

        return this.minAttack;

    }

    public int getMinDefense() {

        return this.minDefense;

    }

    public int getMaxAttack() {

        return this.maxAttack;

    }

    public int getMaxDefense() {

        return this.maxDefense;

    }

    // SETTERS

    public void setBossName(String bossName) {

        this.bossName = bossName;

    }

    public void setHp(double hp) {

        this.hp = hp;

    }

    public void setOffense(double offense) {

        this.offense = offense;

    }

    public void setLevel(int level) {

        this.level = level;

    }

    public void setMinAttack(int minAttack) {

        this.minAttack = minAttack;

    }

    public void setMinDefense(int minDefense) {

        this.minDefense = minDefense;

    }

    public void setMaxAttack(int maxAttack) {

        this.maxAttack = maxAttack;

    }

    public void setMaxDefense(int maxDefense) {

        this.maxDefense = maxDefense;

    }

}
