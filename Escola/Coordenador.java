/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

/**
 *
 * @author User
 */
public class Coordenador extends Funcionario{
    private String setor;
    
    public Coordenador(String nome, double salario, String setor){
    super(nome,salario);
    this.setor=setor;
    }
    
    @Override
    public String descrever(){
    return "Coordenador: " + nome + ", setor " + setor;
    
    }
    
}
