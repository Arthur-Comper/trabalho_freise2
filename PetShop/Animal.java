/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ava1;

/**
 *
 * @author User
 */
public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    
    public String descrever(){
        return "Animal: " + nome + ", " + idade + " anos";
    }
    
    public int idadeEmMeses(){
    return idade*12;
    
    }
    public int idadeEmMeses(int MesesJaVividos){
    return idade*12 + MesesJaVividos;
    
    }
}
