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
public class food {
    String name;
    
    food(String name){
        this.name = name;
    }
    
    void cook(){
        System.out.println("cooking" + name);
        
    }
    
}
