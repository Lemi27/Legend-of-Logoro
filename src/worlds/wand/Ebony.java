/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Ebony.java
@description        Child class, Ebony, creates the ebony 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/

package worlds.wand;

public class Ebony extends Wand{
    
    public Ebony()
    {
        super(); 
        setName("Shadowed Ebonyreach"); 
        setDefense(1.5); 
        setOffense(1); 
        setPrice(20); 
    }
}
