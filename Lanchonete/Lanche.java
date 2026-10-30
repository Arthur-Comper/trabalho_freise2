/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonete;

/**
 *
 * @author User
 */
public class Lanche extends Item{
    private int quantidade;
    
    public Lanche(String nome, double preco, int quantidade){
    super(nome, preco);
    this.quantidade=quantidade;
    }
    @Override
    public String descrever(){
        return "Lanche: " + nome + ", " + quantidade + " unidades";
    
    }
    
    
    
}
