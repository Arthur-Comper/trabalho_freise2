/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporteescolar;

/**
 *
 * @author User
 */
public class OnibusEscolar extends Transporte {
    private int monitores;
    
    public OnibusEscolar(String linha, int monitores){
    super(linha);
    this.monitores=monitores;
    }
    
    @Override
    public String anunciar(){
        return "Linha " + linha;
    }
    
}
