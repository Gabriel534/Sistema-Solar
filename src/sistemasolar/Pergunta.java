/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;
import telas.TelaPerguntas;
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
    private TelaPerguntas tela;

    public Pergunta(TelaPerguntas tela, String pergunta, String opção1, String opção2, String opção3, String opção4, String opção5) {
        this.pergunta = pergunta;
        this.opção1 = opção1;
        this.opção2 = opção2;
        this.opção3 = opção3;
        this.opção4 = opção4;
        this.opção5 = opção5;
        this.resposta = "";
        this.tela = tela;
    }
    
    public Pergunta(TelaPerguntas tela, String pergunta, String opção1, String opção2, String opção3, String opção4) {
        this.pergunta = pergunta;
        this.opção1 = opção1;
        this.opção2 = opção2;
        this.opção3 = opção3;
        this.opção4 = opção4;
        this.opção5 = "";
        this.resposta = "";
        this.tela = tela;
    }

    public Pergunta(TelaPerguntas tela, String pergunta, String opção1, String opção2, String opção3) {
        this.pergunta = pergunta;
        this.opção1 = opção1;
        this.opção2 = opção2;
        this.opção3 = opção3;
        this.opção4 = "";
        this.opção5 = "";
        this.resposta = "";
        this.tela = tela;
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
        
        this.tela.getRadioA().setText("a) " + this.opção1);

        this.tela.getRadioB().setText("b) " + this.opção2);

        this.tela.getRadioC().setText("c) " + this.opção3);

        if(this.opção4.compareTo("") == 0){
            this.tela.getRadioD().setVisible(false);  
        }else{
            this.tela.getRadioD().setVisible(true);
            this.tela.getRadioD().setText("d) " + this.opção4);
            }
        
        if(this.opção5.compareTo("") == 0){
            this.tela.getRadioE().setVisible(false);
        }else{
            this.tela.getRadioE().setVisible(true);
            this.tela.getRadioE().setText("e) " + this.opção5);
        }

        this.tela.getLabelPergunta().setText(this.pergunta);

        }
}
