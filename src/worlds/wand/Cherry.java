/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Cherry.java
@description        Child class, Cherry, creates the cherry 
                    wand by extending parent class, Wand to
                    change necessary attributes
********************************************************/
package worlds.wand;

public class Cherry extends Wand
{
    public Cherry()
    {
        super();
        setName("Cherry Scepter");
        setDefense(1.1);
        setOffense(1.3);
        setPrice(15);
    }
}
