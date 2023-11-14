/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;
import java.util.List;
import java.util.ArrayList;
import telas.TelaPerguntas;
import telas.Resposta;
/**
 *
 * @author sp300lab
 */
public class JogoDePerguntas {
    
    private final List<Pergunta> perguntas;
    private final List<String> respostas;
    private final List<Astro> astros;
    private int contador = 0;
    private final TelaPerguntas tela;
    
    public JogoDePerguntas(TelaPerguntas tela) {

        this.respostas = new ArrayList<>();
        this.astros = new ArrayList<>();
        
        this.astros.add(new Astro("Mercúrio", "a", "b", "b", "a", "c", "c", "a"));
        this.astros.add(new Astro("Vênus", "a", "b", "b", "a", "c", "a", "c"));
        this.astros.add(new Astro("Terra", "a", "c", "a", "b", "c", "b", "c"));
        this.astros.add(new Astro("Marte", "a", "c", "c", "c", "c", "d", "b"));
        this.astros.add(new Astro("Júpiter", "b", "d", "b", "e", "b", "e", "c"));
        this.astros.add(new Astro("Saturno", "b", "d", "b", "e", "d", "e", "c"));
        this.astros.add(new Astro("Urano", "b", "d", "b", "e", "a", "b", "c"));
        this.astros.add(new Astro("Netuno", "b", "d", "b", "e", "b", "b", "c"));
        this.astros.add(new Astro("Plutão", "d", "d", "b", "b", "c", "c", "a"));
        this.astros.add(new Astro("Sol", "c", "a", "b", "a", "c", "a", "ac"));
        
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
            if(contador == 6){
                this.tela.getButtonProximaPergunta().setText("Finalizar Quiz");
                
            }
            contador +=1;
        
        }
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
        
        Astro vencedor = astros.get(0);
        
        for(Astro astro: astros){
            if(vencedor.gerarPorcentagemDeMatch(respostas) < astro.gerarPorcentagemDeMatch(respostas)) vencedor = astro;
        }
        return vencedor;
    }
    
}
