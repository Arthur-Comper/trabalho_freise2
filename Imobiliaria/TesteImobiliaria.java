/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imobiliaria;

/**
 *
 * @author User
 */
public class TesteImobiliaria {

    public static void main(String[] args) {
        Casa c1 = new Casa ("RUA A,10" ,80, 3);
        System.out.println(c1.valorEstimado(3000));
        System.out.println(c1.valorEstimado(3000, 2000));
    
        Apartamento ap1 = new Apartamento("RUA B, 200", 60, 5);
        
        Imovel[] imoveis = {ap1, c1};
    for (Imovel VETOR : imoveis){
        System.out.println(VETOR.descrever());
    }
    }
}
