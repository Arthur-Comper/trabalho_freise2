/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lanchonete;

/**
 *
 * @author User
 */
public class TesteLanchonete {

    public static void main(String[] args) {
        Lanche lan1 = new Lanche("X-BURGUER", 18, 2);
            System.out.println(lan1.total());
            System.out.println(lan1.total(2));
        Bebida b1 = new Bebida("SUCO", 8, 300);
    
    Item[] itens = {lan1, b1}; 
 for(Item vetor : itens){
     System.out.println(vetor.descrever());
 }
    
    }
    
    
}
