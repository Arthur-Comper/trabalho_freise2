/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ava1;

/**
 *
 * @author User
 */
public class Gato extends Animal{
    public String pelagem;
    
    public Gato(String nome, int idade, String pelagem){
    super(nome, idade);
    this.pelagem=pelagem;
    }
    @Override
    public String descrever(){
    return "Gato: " + nome + ", pelagem " + pelagem;
    }
    
}
