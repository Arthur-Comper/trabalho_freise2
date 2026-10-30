/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliaria;

/**
 *
 * @author User
 */
public class Casa extends Imovel {
    private int quartos;
    
    public Casa (String endereco, double area, int quartos){
    super(endereco,area);
    this.quartos=quartos;
    }
    @Override
    public String descrever(){
        return "Casa: " + endereco + ", " + quartos + " quartos";
    }
}
