/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

/**
 *
 * @author User
 */
public class Professor extends Funcionario{
    private String disciplina;
    
    public Professor(String nome, double salario, String disciplina){
    super(nome, salario);
    this.disciplina=disciplina;
    }
@Override
    public String descrever(){
    return  "Professor: " + nome + ", disciplina " + disciplina;
    }
    
}
