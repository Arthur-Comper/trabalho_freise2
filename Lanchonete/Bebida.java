/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonete;

/**
 *
 * @author User
 */
public class Bebida extends Item{
    private int volumeMl;
    
    public Bebida(String nome, double preco, int volumeMl){
    super(nome, preco);
    this.volumeMl=volumeMl;
    }
    @Override
    public String descrever(){
        return "Bebida: " + nome + ", " + volumeMl + " ml";
    }
    
}
