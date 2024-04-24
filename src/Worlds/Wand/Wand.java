/********************************************************
@author(s):         Muhammad and Sinan
@date               *insert here
@teacher            Andrew Carreiro
@file               Shop.java
@description        *insert class description here
********************************************************/
package worlds.Wand;

public class Wand
{
    private String name; 
    private double defense; 
    private double offense; 
    private int price; 

    public Wand()
    {
        name = "Default Wand";
        defense = 1;
        offense = 1;
        price = 3;
    }

    //Getters
    public String getName()
    {
        return this.name; 
    }
    public double getDefense()
    {
        return this.defense; 
    }
    public double offense()
    {
        return this.offense; 
    }
    public int price()
    {
        return this.price; 
    }

    //Setters 
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDefense(double defense)
    {
        this.defense = defense; 
    }
    public void setOffense(double offense)
    {
        this.offense = offense; 
    }
    public void setPrice(int price)
    {
        this.price = price; 
    }
}




