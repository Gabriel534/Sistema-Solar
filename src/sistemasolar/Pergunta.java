/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;
import telas.TelaPerguntas;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
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
        JPanel panel = (JPanel)this.tela.getContentPane();
        
        int nComponentes = panel.getComponentCount();
        
        for(int x=0; x< nComponentes; x++){
            String classe = panel.getComponent(x).toString();
            if(classe.contains("javax.swing.JRadioButton")){
                JRadioButton button = (JRadioButton)panel.getComponent(x);
                if(button.getText().contains("a) ")){
                    button.setText("a) " + this.opção1);
                    
                }else if(button.getText().contains("b) ")){
                    button.setText("b) " + this.opção2);
                    
                }else if(button.getText().contains("c) ")){
                    button.setText("c) " + this.opção3);
                    
                }else if(button.getText().contains("d) ")){
                    if(this.opção4.compareTo("") == 0){
                        button.setVisible(false);
                    }else{
                        button.setVisible(true);
                        button.setText("d) " + this.opção4);
                    }
                }else if(button.getText().contains("e) ")){
                    if(this.opção5.compareTo("") == 0){
                        button.setVisible(false);
                    }else{
                        button.setVisible(true);
                        button.setText("e) " + this.opção5);
                    }
                    
                }
            }else if(classe.contains("javax.swing.JLabel")){
                JLabel label = (JLabel)panel.getComponent(x);
                label.setText(this.pergunta);
                
            }
                    
                    }
    }
}
