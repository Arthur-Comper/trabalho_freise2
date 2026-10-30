/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliaria;

/**
 *
 * @author User
 */
public class Apartamento extends Imovel{
    private int andar;
    
    public Apartamento(String endereco, double area, int andar){
    super(endereco, area);
    this.andar=andar;
    }
    @Override
    public String descrever(){
        return  "Apartamento: " + endereco + ", andar " + andar;
    
    }
    
    
}
