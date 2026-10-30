/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author User
 */
public class Atleta {
    protected String nome;
    
    public Atleta(String nome){
    this.nome=nome;
    }
    
    public String apresentar(){
        return "Atleta: " + nome; 
    }
    public String registrarTempo(double segundos){
        return  "Tempo: " + segundos + " s";   
    }
    public String registrarTempo(double segundos, String prova){
        return "Tempo na prova " + prova + ": " + segundos + " s";
    
    }
}
