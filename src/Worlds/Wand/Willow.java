/********************************************************
@author(s)          Sinan Shana, Muhummad Nomaan
@date               2024-04-27
@teacher            Andrew Carreiro
@file               Willow.java
@description        The class setting the attributes of the willow wand.
********************************************************/

package worlds.wand;

public class Willow extends Wand{

    public Willow() 
    {
        super();
        setName("Whisperwind Willow");
        setDefense(1.25);
        setOffense(2); 
        setPrice(4);
        setIsBought(true);   
    }
}
