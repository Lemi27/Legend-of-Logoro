/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Maple.java
@description        Child class, Maple, creates the maple 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/
package worlds.wand;

public class Maple extends Wand{

    public Maple()
    {
        super(); 
        setName("Silverleaf Maplestar"); 
        setDefense(2); 
        setOffense(1); 
        setPrice(25); 
    }
}