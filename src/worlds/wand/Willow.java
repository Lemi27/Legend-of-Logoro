/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Willow.java
@description        Child class, Willow, creates the willow 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/
// 1

package worlds.wand;

public class Willow extends Wand{

    public Willow() 
    {
        super();
        setName("Whisperwind Willow");
        setDefense(2);
        setOffense(2); 
        setPrice(40); 
    }
}
