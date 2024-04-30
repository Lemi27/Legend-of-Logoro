/********************************************************
@author(s)          Muhammad Nomaan and Sinan Shana
@date               24-April-2024
@teacher            Andrew Carreiro
@file               Cypress.java
@description        Child class, Cypress, creates the cypress 
                    wand by extending parent class, Wand to
                    change necessary attributes
********************************************************/
package worlds.wand;

public class Cypress extends Wand{
    
    public Cypress()
    {
        super(); 
        setName("Celestial Cypressglen"); 
        setDefense(1.25); 
        setOffense(1.25); 
        setPrice(20); 
    }
}
