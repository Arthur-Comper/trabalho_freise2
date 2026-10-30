/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.papelaria;

/**
 *
 * @author User
 */
public class Caneta extends Produto{
    private String cor;
    
    public Caneta(String nome, double preco,String cor){
    super(nome,preco);
    this.cor=cor;
    }
    
    @Override
    public String descrever(){
    return "Caneta: " + nome + ", cor " + cor;
    
    }
    
}
