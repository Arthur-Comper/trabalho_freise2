/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.academia;

/**
 *
 * @author User
 */
public class TesteAcademia {

    public static void main(String[] args) {
        Corredor cor1 = new Corredor("LIA", 10 );
            System.out.println(cor1.registrarTempo(55.2));
            System.out.println(cor1.registrarTempo(58, "100m"));
            
            Nadador n1 = new Nadador("PAULO", "CRAWL");
            
            Atleta[] atletas = {cor1, n1};
    for     (Atleta VETOR : atletas){
                System.out.println(VETOR.apresentar());
    }
    }
}
