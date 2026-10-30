/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author User
 */
public class Pessoa {
    protected String nome;
    
    public Pessoa(String nome){
    this.nome=nome;
    }
    public String ficha(){
    return  "Pessoa: " + nome;
    }
    
    public String agendar(String data){
    return "Consulta em " +data;
    }
    
    public String agendar(String data,String hora){
    return "Consulta em " + data + " as " + hora;
    
    }
}
