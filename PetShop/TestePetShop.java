/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ava1;

/**
 *
 * @author User
 */
public class TestePetShop {

    public static void main(String[] args) {
        
        Cachorro dog1 = new Cachorro("REX", 3, "LABRADOR");
            System.out.println(dog1.idadeEmMeses());
            System.out.println(dog1.idadeEmMeses(6));
    
            
        Gato cat1 = new Gato("MIA", 2, "curta");
        Animal[] animais = {dog1, cat1};
        for (Animal animal : animais){
            System.out.println(animal.descrever());
        }
    
    }
}
