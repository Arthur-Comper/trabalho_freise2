/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author User
 */
public class Medico extends Pessoa {
    private String especialidade;
    
    public Medico(String nome,String especialidade){
    super(nome);
    this.especialidade=especialidade;
    }
    
    @Override
    public String ficha(){
    return "Medico: " + nome + ", especialidade " + especialidade;
    
    }
    
    
}
