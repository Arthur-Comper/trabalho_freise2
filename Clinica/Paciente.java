/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author User
 */
public class Paciente extends Pessoa{
    private String convenio;
    
    public Paciente(String nome,String convenio){
    super(nome);
    this.convenio=convenio;
    }
    @Override
    public String ficha(){
    return "Paciente: " + nome + ", convenio " + convenio;
    }
    
    
}
