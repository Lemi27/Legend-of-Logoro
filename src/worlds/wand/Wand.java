/********************************************************
@author(s):         Muhammad Nomaan and Sinan Shana
@date               2024-04-27
@teacher            Andrew Carreiro
@file               Wand.java
@description        Creates the wand characteristics to be inherited by every individual wand type, and creates setters 
                    and getters.
********************************************************/

package worlds.wand;


public class Wand
{
    private String name; 
    private double defense; 
    private double offense; 
    private int price; 
    private boolean isBought; 

    public Wand()
    {
        name = "Default Wand";
        defense = 1;
        offense = 1;
        price = 3;
        isBought = true; 
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
    public double getOffense()
    {
        return this.offense; 
    }
    public int getPrice()
    {
        return this.price; 
    }
    public boolean getIsBought()
    {
        return this.isBought; 
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
    public void setIsBought(boolean isBought)
    {
        this.isBought = isBought; 
    }

    public void displayStatistics()
    {   
        System.out.printf("%-30s%-10s%-10s%-10s%n", this.getName(), this.getDefense(), this.getOffense(), this.getPrice());
    }
}




