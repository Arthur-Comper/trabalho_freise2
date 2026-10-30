/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporteescolar;

/**
 *
 * @author User
 */
public class Transporte {
    protected String linha;
    
    public Transporte(String linha){
    this.linha=linha;
    }
    
    public String anunciar(){
        return "Linha " + linha;
    }
    
    public String lotacao(int ocupantes){
        return "Ocupantes: " + ocupantes;
    }
    
    public String lotacao(int ocupantes, int capacidade){
        if(ocupantes<=capacidade){
            return "VIAGEM LIBERADA";
        }
        else {
            return "LOTACAO EXCEDIDA";
        }
    
    }
    
    
    
}
