/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporteescolar;

/**
 *
 * @author User
 */
public class Van extends Transporte {
    private int lugares;
    
    public Van(String linha, int lugares){
    super(linha);
    this.lugares=lugares;
    }
    
    @Override
    public String anunciar(){
        return  "Van da linha " + linha + ", " + lugares + " lugares";
    }
    
    
    
}
