/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.papelaria;

/**
 *
 * @author User
 */
public class Produto {
    protected String nome;
    protected double preco;
    
    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    
    public String descrever(){
    return  "Produto: " + nome;
    }
    
    public double precoComDesconto(double percentual){
    return preco * (1-percentual/100);
    }
    public double precoComDesconto(double percentual, double minimo){
    double resultado = preco * (1-percentual/100);
        if(resultado<minimo){
            return minimo;
        }
        return resultado;
    
    }
    
}
