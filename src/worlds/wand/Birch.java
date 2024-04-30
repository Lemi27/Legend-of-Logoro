
/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Birch.java
@description        Child class, Birch, creates the birch 
                    wand by extending parent class, Wand
                    to change necessary attributes
********************************************************/
package worlds.wand;

public class Birch extends Wand
{
    public Birch()
    {
        super();
        setName("Birch Scythe");
        setDefense(1.1);
        setOffense(1.1);
        setPrice(10);
    }
}
