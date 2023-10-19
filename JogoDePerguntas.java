/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasolar;
import java.util.List;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sp300lab
 */
public class JogoDePerguntas {
    
    private List<Pergunta> perguntas;
    private List<String> respostas;
    
    public JogoDePerguntas() {
        
        Astro astro1 = new Astro("Mercúrio", "a", "b", "b", "a", "c", "c", "b");
        Astro astro2 = new Astro("Vênus", "a", "b", "b", "a", "c", "a", "a");
        Astro astro3 = new Astro("Terra", "a", "c", "a", "b", "c", "b", "a");
        Astro astro4 = new Astro("Marte", "a", "c", "c", "c", "c", "d", "c");
        Astro astro5 = new Astro("Júpiter", "b", "d", "b", "e", "b", "e", "d");
        Astro astro6 = new Astro("Saturno", "b", "d", "b", "e", "d", "e", "d");
        Astro astro7 = new Astro("Urano", "b", "d", "b", "e", "a", "b", "d");
        Astro astro8 = new Astro("Netuno", "b", "d", "b", "e", "b", "b", "d");
        Astro astro9 = new Astro("Plutão", "d", "d", "b", "b", "c", "c", "c");
        Astro astro10 = new Astro("Sol", "c", "a", "b", "a", "c", "a", "a");
        
        this.perguntas = new ArrayList();
        this.perguntas.add(new Pergunta("Qual o tipo do seu astro?", "Rochoso", "Gasoso", "Estrela", "Planeta anão", "Satélite"));
        this.perguntas.add(new Pergunta("Qual a temperatura?", "Muito quente", "Quente", "Amena", "Frio"));
        this.perguntas.add(new Pergunta("Seu planeta é habitável? ", "Sim", "não", "talvez futuramente", "Tem pessoas indo para lá nos próximos anos?"));
        this.perguntas.add(new Pergunta("Seu astro tem luas? ", "Não", "1", "2", "3", "Mais que 3"));
        this.perguntas.add(new Pergunta("Seu astro tem anéis?", "Possui anéis com eixo invertido", "Possui um pequeno anel", "Não possui anel", "Ele é conhecido pelos seus anéis"));
        this.perguntas.add(new Pergunta("Qual a cor predominante do seu astro?", "Amarelo", "Azul", "Cinza", "Vermelho", "Marrom"));
        this.perguntas.add(new Pergunta("Seu astro tem atmosfera?", "Não", "rarefeita", "Densa", "Habitável"));
    }
    
    public void iniciarQuiz(){
        for(Pergunta pergunta: perguntas){
            pergunta.exibirPergunta();
            this.respostas.add(pergunta.obterResposta());
        }
        System.out.println("O seu planeta é " + this.gerarResposta());
        
    }
    
    public String gerarResposta(){
        System.out.println("");
        return "";
    }
    
}
