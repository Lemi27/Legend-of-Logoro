/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Oak.java
@description        Child class, Oak, creates the oak 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/

package worlds.wand;

public class Oak extends Wand{

    public Oak()
    {
        super(); 
        setName("Guardian Oakhear"); 
        setDefense(1.5); 
        setOffense(1.25); 
        setPrice(25); 
    }
}