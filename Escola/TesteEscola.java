/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escola;

/**
 *
 * @author User
 */
public class TesteEscola {

    public static void main(String[] args) {
        Professor p1 = new Professor("ANA",3000,"POO");
        System.out.println(p1.bonificacao());
        System.out.println(p1.bonificacao(20));
        
        Coordenador c1 = new Coordenador("BRUNO", 4500, "PEDAGOGICO");
        
        Funcionario[] funcionarios= {p1, c1};
   for (Funcionario funcionario: funcionarios){
       System.out.println(funcionario.descrever());
   }
    }
    
}
