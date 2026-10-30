/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author User
 */
public class Nadador extends Atleta{
    private String estilo;
    
    public Nadador(String nome, String estilo){
    super(nome);
    this.estilo=estilo;
    }
    
    @Override
    public String apresentar(){
        return "Nadador: " + nome + ", estilo " + estilo;
    
    }
    
}
