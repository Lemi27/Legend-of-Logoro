/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Mangnolia.java
@description        Child class, Magnolia, creates the magnolia 
                    wand by extending parent class, Wand to
                    change necessary attributes
********************************************************/

package worlds.wand;

public class Magnolia extends Wand {
    
    public Magnolia()
    {
        super(); 
        setName("Tranquil Magnoliaspire"); 
        setDefense(0.5); 
        setOffense(2.5); 
        setPrice(30); 
    }
}