/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author User
 */
public class Corredor extends Atleta {
    private double distanciaKm;
    
    public Corredor(String nome, double distanciaKm){
    super(nome);
    this.distanciaKm=distanciaKm;
    }
    
    @Override
    public String apresentar(){
    return "Corredor: " + nome + ", " + distanciaKm + " km";
    }
    
}
