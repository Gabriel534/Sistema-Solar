/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasolar;

import java.util.Scanner;
/**
 *
 * @author sp300lab
 */
public class Pergunta {
    private String pergunta;
    private String opção1;
    private String opção2;
    private String opção3;
    private String opção4;
    private String opção5;
    private String resposta;

    public Pergunta(String pergunta, String opção1, String opção2, String opção3, String opção4, String opção5) {
        this.pergunta = pergunta;
        this.opção1 = opção1;
        this.opção2 = opção2;
        this.opção3 = opção3;
        this.opção4 = opção4;
        this.opção5 = opção5;
        this.resposta = "";
    }
    
    public Pergunta(String pergunta, String opção1, String opção2, String opção3, String opção4) {
        this.pergunta = pergunta;
        this.opção1 = opção1;
        this.opção2 = opção2;
        this.opção3 = opção3;
        this.opção4 = opção4;
        this.opção5 = "";
        this.resposta = "";
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpção1() {
        return opção1;
    }

    public void setOpção1(String opção1) {
        this.opção1 = opção1;
    }

    public String getOpção2() {
        return opção2;
    }

    public void setOpção2(String opção2) {
        this.opção2 = opção2;
    }

    public String getOpção3() {
        return opção3;
    }

    public void setOpção3(String opção3) {
        this.opção3 = opção3;
    }

    public String getOpção4() {
        return opção4;
    }

    public void setOpção4(String opção4) {
        this.opção4 = opção4;
    }

    public String getOpção5() {
        return opção5;
    }

    public void setOpção5(String opção5) {
        this.opção5 = opção5;
    }
    
    
    public void exibirPergunta(){
        System.out.println(this.pergunta);
        System.out.println("a) " + this.opção1);
        System.out.println("b) " + this.opção2);
        System.out.println("c) " + this.opção3);
        System.out.println("d) " + this.opção4);
        if(this.opção5.compareTo("") != 0){
            System.out.println("e) " + this.opção5);
        }
    }
    
    public String obterResposta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Resposta: ");
        this.resposta = scanner.nextLine();
        return this.resposta;
    }
}
