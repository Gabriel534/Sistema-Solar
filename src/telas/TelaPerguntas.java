/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import sistemasolar.JogoDePerguntas;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
/**
 *
 * @author Gabriel
 */
public class TelaPerguntas extends javax.swing.JFrame {
    private final JogoDePerguntas jogo;
    /**
     * Creates new form TelaPerguntas
     */
    public TelaPerguntas() {
        initComponents();
        this.setResizable(false);
        
        URL caminhoImagem = this.getClass().getResource("icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        
        this.jogo = new JogoDePerguntas(this);
        this.jogo.iniciarQuiz();
        this.setBounds(500, 250, 300, 360);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelPergunta = new javax.swing.JLabel();
        RadioA = new javax.swing.JRadioButton();
        RadioD = new javax.swing.JRadioButton();
        RadioB = new javax.swing.JRadioButton();
        RadioC = new javax.swing.JRadioButton();
        RadioE = new javax.swing.JRadioButton();
        buttonProximaPergunta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Solar");

        LabelPergunta.setText("Pergunta");

        RadioA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioAMouseReleased(evt);
            }
        });
        RadioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAActionPerformed(evt);
            }
        });

        RadioD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioDMouseReleased(evt);
            }
        });

        RadioB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioBMouseReleased(evt);
            }
        });

        RadioC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioCMouseReleased(evt);
            }
        });

        RadioE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioEMouseReleased(evt);
            }
        });

        buttonProximaPergunta.setText("Próxima Pergunta");
        buttonProximaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximaPerguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioE)
                            .addComponent(RadioC)
                            .addComponent(RadioB)
                            .addComponent(RadioD)
                            .addComponent(RadioA)
                            .addComponent(LabelPergunta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(buttonProximaPergunta)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelPergunta)
                .addGap(18, 18, 18)
                .addComponent(RadioA)
                .addGap(18, 18, 18)
                .addComponent(RadioB)
                .addGap(18, 18, 18)
                .addComponent(RadioC)
                .addGap(18, 18, 18)
                .addComponent(RadioD)
                .addGap(18, 18, 18)
                .addComponent(RadioE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonProximaPergunta)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProximaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximaPerguntaActionPerformed
        // TODO add your handling code here:
        if(this.RadioA.isSelected()) this.jogo.gravarResposta("a");
        else if(this.RadioB.isSelected()) this.jogo.gravarResposta("b");
        else if(this.RadioC.isSelected()) this.jogo.gravarResposta("c");
        else if(this.RadioD.isSelected()) this.jogo.gravarResposta("d");
        else if(this.RadioE.isSelected()) this.jogo.gravarResposta("e");
        else{
             JOptionPane.showMessageDialog(null, "Erro: Nenhuma resposta Selecionada!", "Erro", JOptionPane.ERROR_MESSAGE);
             return;
        }
        this.jogo.mudarPergunta();
        this.RadioA.setSelected(false);
        this.RadioB.setSelected(false);
        this.RadioC.setSelected(false);
        this.RadioD.setSelected(false);
        this.RadioE.setSelected(false);

        
    }//GEN-LAST:event_buttonProximaPerguntaActionPerformed

    private void RadioEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioEMouseReleased
        // TODO add your handling code here:
        this.RadioA.setSelected(false);
        this.RadioB.setSelected(false);
        this.RadioC.setSelected(false);
        this.RadioD.setSelected(false);
        this.RadioE.setSelected(true);
    }//GEN-LAST:event_RadioEMouseReleased

    private void RadioDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioDMouseReleased
        // TODO add your handling code here:
        this.RadioA.setSelected(false);
        this.RadioB.setSelected(false);
        this.RadioC.setSelected(false);
        this.RadioD.setSelected(true);
        this.RadioE.setSelected(false);
    }//GEN-LAST:event_RadioDMouseReleased

    private void RadioCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioCMouseReleased
        // TODO add your handling code here:
        this.RadioA.setSelected(false);
        this.RadioB.setSelected(false);
        this.RadioC.setSelected(true);
        this.RadioD.setSelected(false);
        this.RadioE.setSelected(false);
    }//GEN-LAST:event_RadioCMouseReleased

    private void RadioBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBMouseReleased
        // TODO add your handling code here:
        this.RadioA.setSelected(false);
        this.RadioB.setSelected(true);
        this.RadioC.setSelected(false);
        this.RadioD.setSelected(false);
        this.RadioE.setSelected(false);
    }//GEN-LAST:event_RadioBMouseReleased

    private void RadioAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioAMouseReleased
        // TODO add your handling code here:
        this.RadioA.setSelected(true);
        this.RadioB.setSelected(false);
        this.RadioC.setSelected(false);
        this.RadioD.setSelected(false);
        this.RadioE.setSelected(false);
    }//GEN-LAST:event_RadioAMouseReleased

    private void RadioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntas().setVisible(true);
            }
        });
    }
    
    public JLabel getLabelPergunta() {
        return LabelPergunta;
    }

    public void setLabelPergunta(JLabel LabelPergunta) {
        this.LabelPergunta = LabelPergunta;
    }

    public JRadioButton getRadioA() {
        return RadioA;
    }

    public void setRadioA(JRadioButton RadioA) {
        this.RadioA = RadioA;
    }

    public JRadioButton getRadioB() {
        return RadioB;
    }

    public void setRadioB(JRadioButton RadioB) {
        this.RadioB = RadioB;
    }

    public JRadioButton getRadioC() {
        return RadioC;
    }

    public void setRadioC(JRadioButton RadioC) {
        this.RadioC = RadioC;
    }

    public JRadioButton getRadioD() {
        return RadioD;
    }

    public void setRadioD(JRadioButton RadioD) {
        this.RadioD = RadioD;
    }

    public JRadioButton getRadioE() {
        return RadioE;
    }

    public void setRadioE(JRadioButton RadioE) {
        this.RadioE = RadioE;
    }

    public JButton getButtonProximaPergunta() {
        return buttonProximaPergunta;
    }

    public void setButtonProximaPergunta(JButton buttonProximaPergunta) {
        this.buttonProximaPergunta = buttonProximaPergunta;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPergunta;
    private javax.swing.JRadioButton RadioA;
    private javax.swing.JRadioButton RadioB;
    private javax.swing.JRadioButton RadioC;
    private javax.swing.JRadioButton RadioD;
    private javax.swing.JRadioButton RadioE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonProximaPergunta;
    // End of variables declaration//GEN-END:variables
}
