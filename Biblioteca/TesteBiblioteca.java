/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author User
 */
public class TesteBiblioteca {

    public static void main(String[] args) {
        Livro L1 = new Livro("DOM CASMURRO",1899,256);
        System.out.println(L1.emprestar(7));
        System.out.println(L1.emprestar(7,"ANA"));
    
        Revista R1 = new Revista("Ciencia hoje", 2024 , 301);
        
        Publicacao[] VETOR = {L1,R1};
    for (Publicacao vetores: VETOR){
        System.out.println(vetores.citar());
    }
    }
}
