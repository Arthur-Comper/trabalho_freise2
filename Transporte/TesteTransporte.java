/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporteescolar;

/**
 *
 * @author User
 */
public class TesteTransporte {

    public static void main(String[] args) {
        Van van1 = new Van("CENTRO", 15);
        System.out.println(van1.lotacao(12));
        System.out.println(van1.lotacao(12, 15));
        
        OnibusEscolar on1 = new OnibusEscolar("BAIRRO", 2);
        
        Transporte[] escolares = {van1, on1};
    for (Transporte VETORES : escolares){
        System.out.println(VETORES.anunciar());
    }
    }
}
