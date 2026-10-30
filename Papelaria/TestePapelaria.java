/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.papelaria;

/**
 *
 * @author User
 */
public class TestePapelaria {

    public static void main(String[] args) {
    
    Caderno cad1 = new Caderno("Universitario", 20, 96);
        System.out.println(cad1.precoComDesconto(10));
        System.out.println(cad1.precoComDesconto(90, 8));
    
    Caneta cn1 = new Caneta("BIC" , 5 , "AZUL");
    
    Produto[] produtos ={cad1,cn1};
    
    for (Produto produto : produtos){
        System.out.println(produto.descrever());
    }
    }
}
