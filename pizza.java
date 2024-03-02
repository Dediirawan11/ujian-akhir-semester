/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo.dedi;

class pizza extends food{
    pizza(String name) {
        super(name);
            
}
/**
 *
 * @author dedi
 */
 void cook(){
     System.out.println("bakking a pizza");
 }
 
 void addToppings(){
     System.out.println("adding Topings to the pizza");
     
    }
    
}
