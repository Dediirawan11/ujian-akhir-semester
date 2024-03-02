/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo.dedi;

/**
 *
 * @author dedi
 */
public class UASPBODEDI {
    public static void main(String[] args) {
        food mypizza = new pizza("margherita");
        food mysalad = new salad("caesar");
        
        mypizza.cook();// polymorphism
        ((pizza) mypizza).addToppings();//polymorphism
        System.out.println();
        
        mysalad.cook();//polymorphism
        
        
    }
    
}
