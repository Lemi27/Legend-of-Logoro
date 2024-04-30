/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Pine.java
@description        Child class, Pine, creates the pine 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/

package worlds.wand;

public class Pine extends Wand{
    
    public Pine()
    {
        super(); 
        setName("Ember Pinecrest"); 
        setDefense(2); 
        setOffense(1.5); 
        setPrice(30); 
    }
}
