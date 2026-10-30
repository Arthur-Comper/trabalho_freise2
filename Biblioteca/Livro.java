/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author User
 */
public class Livro extends Publicacao {
    private int paginas;
    
    public Livro(String titulo,int ano, int paginas){
        super(titulo,ano);
        this.paginas=paginas;
    }
    @Override
    public String citar(){
    return titulo + " (" + ano + "), " + paginas + " paginas";
    }
    
    
}
