/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;
import java.util.List;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import telas.TelaPerguntas;
import telas.Resposta;
/**
 *
 * @author sp300lab
 */
public class JogoDePerguntas {
    
    private List<Pergunta> perguntas;
    private List<String> respostas;
    private Astro astro1;
    private Astro astro2;
    private Astro astro3;
    private Astro astro4;
    private Astro astro5;
    private Astro astro6;
    private Astro astro7;
    private Astro astro8;
    private Astro astro9;
    private Astro astro10;
    private int contador = 0;
    private TelaPerguntas tela;
    
    public JogoDePerguntas(TelaPerguntas tela) {

        this.respostas = new ArrayList<>();
        
        this.astro1 = new Astro("Mercúrio", "a", "b", "b", "a", "c", "c", "a");
        this.astro2 = new Astro("Vênus", "a", "b", "b", "a", "c", "a", "c");
        this.astro3 = new Astro("Terra", "a", "c", "a", "b", "c", "b", "c");
        this.astro4 = new Astro("Marte", "a", "c", "c", "c", "c", "d", "b");
        this.astro5 = new Astro("Júpiter", "b", "d", "b", "e", "b", "e", "c");
        this.astro6 = new Astro("Saturno", "b", "d", "b", "e", "d", "e", "c");
        this.astro7 = new Astro("Urano", "b", "d", "b", "e", "a", "b", "c");
        this.astro8 = new Astro("Netuno", "b", "d", "b", "e", "b", "b", "c");
        this.astro9 = new Astro("Plutão", "d", "d", "b", "b", "c", "c", "a");
        this.astro10 = new Astro("Sol", "c", "a", "b", "a", "c", "a", "ac");
        
        this.tela = tela;
        
        this.perguntas = new ArrayList();
        this.perguntas.add(new Pergunta(tela, "Qual o tipo do seu astro?", "Rochoso", "Gasoso", "Estrela", "Planeta anão", "Satélite"));
        this.perguntas.add(new Pergunta(tela,"Qual a temperatura?", "Muito quente", "Quente", "Amena", "Frio"));
        this.perguntas.add(new Pergunta(tela,"Seu astro é habitável? ", "Sim", "não", "talvez futuramente"));
        this.perguntas.add(new Pergunta(tela,"Seu astro tem luas? ", "Não", "1", "2", "3", "Mais que 3"));
        this.perguntas.add(new Pergunta(tela,"Seu astro tem anéis?", "Possui anéis com eixo invertido", "Possui um pequeno anel", "Não possui anel", "Ele é conhecido pelos seus anéis"));
        this.perguntas.add(new Pergunta(tela,"Qual a cor predominante do seu astro?", "Amarelo", "Azul", "Cinza", "Vermelho", "Marrom"));
        this.perguntas.add(new Pergunta(tela,"Seu astro tem atmosfera?", "Não", "rarefeita", "Densa"));
    }
    
    public void iniciarQuiz(){
        perguntas.get(contador).exibirPergunta();
        contador +=1;
        
    }
    
    public void mudarPergunta(){
        if(contador <= 6){
            perguntas.get(contador).exibirPergunta();
            contador +=1;}
        else{
            this.mostrarVencedor();
        }
    }
    
    public void gravarResposta(String resp){
        this.respostas.add(resp);
    }
    
    public void mostrarVencedor(){
        Astro vencedor = this.obterAstroVencedor();
        Resposta telaResposta = new Resposta(vencedor, vencedor.gerarPorcentagemDeMatch(respostas));
        telaResposta.setVisible(true);
        this.tela.dispose();
    }
    
    public Astro obterAstroVencedor(){
        Astro vencedor = astro1;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro2.gerarPorcentagemDeMatch(respostas)) vencedor = astro2;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro3.gerarPorcentagemDeMatch(respostas)) vencedor = astro3;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro4.gerarPorcentagemDeMatch(respostas)) vencedor = astro4;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro5.gerarPorcentagemDeMatch(respostas)) vencedor = astro5;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro6.gerarPorcentagemDeMatch(respostas)) vencedor = astro6;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro7.gerarPorcentagemDeMatch(respostas)) vencedor = astro7;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro8.gerarPorcentagemDeMatch(respostas)) vencedor = astro8;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro9.gerarPorcentagemDeMatch(respostas)) vencedor = astro9;
        if(vencedor.gerarPorcentagemDeMatch(respostas) < astro10.gerarPorcentagemDeMatch(respostas)) vencedor = astro10;
        return vencedor;
    }
    
}
