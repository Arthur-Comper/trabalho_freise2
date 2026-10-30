/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonete;

/**
 *
 * @author User
 */
public class Item {
    protected String nome;
    protected double preco;
    
    public Item(String nome, double preco){
    this.nome=nome;
    this.preco=preco;
    }
    
    public String descrever(){
        return "Item: " + nome;
    }
    
    public double total(){
        return preco;
    }
    
    public double total(int unidades){
        return (preco*unidades);
    }
    
    
}
