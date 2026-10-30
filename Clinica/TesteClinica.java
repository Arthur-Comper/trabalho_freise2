/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinica;

/**
 *
 * @author User
 */
public class TesteClinica {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("CARLA"," UNIMED");
        System.out.println(p1.agendar("12/10/2026"));
        System.out.println(p1.agendar("12/10/2026", "14:00"));
    
        Medico m1 = new Medico("DIEGO", "CLINICA");
    Pessoa[] VETOR ={p1,m1};
    
    for (Pessoa vetores: VETOR){
        System.out.println(vetores.ficha());
    }
    
    }
}
