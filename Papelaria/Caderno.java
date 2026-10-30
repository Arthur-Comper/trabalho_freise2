/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.papelaria;

/**
 *
 * @author User
 */
public class Caderno extends Produto{
    private int folhas;
    
    public Caderno(String nome, double preco, int folhas){
    super(nome,preco);
    this.folhas=folhas;
    }
    
    @Override
    public String descrever(){
    return  "Caderno: " + nome + ", " + folhas + " folhas";
    }
}
