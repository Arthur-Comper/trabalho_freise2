/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author User
 */
public class Publicacao {
    protected String titulo;
    protected int ano;
    
    public Publicacao(String titulo, int ano){
        this.titulo=titulo;
        this.ano=ano;
    }
    
    public String citar(){
        return titulo + " (" + ano + ")";
    }
    public String emprestar(int dias){
        return "Emprestimo de " + dias + " dias";
    }
    public  String emprestar(int dias, String leitor){
        return "Emprestimo de " + dias + " dias para " + leitor;
    }
    
}
