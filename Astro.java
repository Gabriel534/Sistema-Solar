/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasolar;

import java.util.List;

/**
 *
 * @author sp300lab
 */
public class Astro {
    private String nomeAstro;
    private String resposta1;
    private String resposta2;
    private String resposta3;
    private String resposta4;
    private String resposta5;
    private String resposta6;
    private String resposta7;

    public Astro(String Astro1, String resposta1, String resposta2, String resposta3, String resposta4, String resposta5, String resposta6, String resposta7) {
        this.nomeAstro = Astro1;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.resposta5 = resposta5;
        this.resposta6 = resposta6;
        this.resposta7 = resposta7;
    }
    
    public double gerarPorcentagemDeMatch(List<String> respostas){
        double contador = 0;
        if(resposta1.compareTo(respostas.get(0)) == 0) contador+= 1;
        if(resposta2.compareTo(respostas.get(1)) == 0) contador+= 1;
        if(resposta3.compareTo(respostas.get(2)) == 0) contador+= 1;
        if(resposta4.compareTo(respostas.get(3)) == 0) contador+= 1;
        if(resposta5.compareTo(respostas.get(4)) == 0) contador+= 1;
        if(resposta6.compareTo(respostas.get(5)) == 0) contador+= 1;
        if(resposta7.compareTo(respostas.get(6)) == 0) contador+= 1;
        return (contador/7);
        

    }

    public String getNomeAstro(){
        return this.nomeAstro;
    }

    
}
