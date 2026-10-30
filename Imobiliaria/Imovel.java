/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliaria;

/**
 *
 * @author User
 */
public class Imovel {
    protected String endereco;
    protected double area;
    
    public Imovel(String endereco, double area){
    this.area=area;
    this.endereco=endereco;
    }
    
    public String descrever(){
        return  "Imovel: " + endereco;
    }
    public double valorEstimado(double precoM2){
        return (precoM2 * area);
    }
   public double valorEstimado(double precoM2, double taxa){
        return (area * precoM2) + taxa;    

}
}