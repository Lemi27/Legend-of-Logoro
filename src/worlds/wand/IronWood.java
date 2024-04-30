/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               IronWood.java
@description        Child class, IronWoos, creates the iron 
                    wood wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/
package worlds.wand;

public class IronWood extends Wand{

    public IronWood()
    {
        super(); 
        setName("Ironbark Sentinel"); 
        setDefense(1.25); 
        setOffense(1.5); 
        setPrice(25); 
    }
}