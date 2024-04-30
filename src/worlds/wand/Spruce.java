/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Spruce.java
@description        Child class, Spruce, creates the spruce 
                    wand by extending parent class, Wand to
                    change necessary attributes
********************************************************/


package worlds.wand;

public class Spruce extends Wand {
    
    public Spruce()
    {
        super(); 
        setName("Sapphire Sprig"); 
        setDefense(1.75); 
        setOffense(2); 
        setPrice(35); 
    }
}
