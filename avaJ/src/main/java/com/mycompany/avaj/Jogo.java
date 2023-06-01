
package com.mycompany.avaj;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Jogo extends javax.swing.JFrame {

    public Jogo() {
        initComponents();
    }
    String correto = "LEGAL";
    String resposta = "";
    List<Integer> certo= new ArrayList<Integer>();
    List<Integer> errado = new ArrayList<Integer>();
    int contador = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        adivinharTextField = new javax.swing.JTextField();
        saidaButton = new javax.swing.JButton();
        tentarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("avaJ");

        adivinharTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adivinharTextFieldActionPerformed(evt);
            }
        });

        saidaButton.setText("Sair");
        saidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaButtonActionPerformed(evt);
            }
        });

        tentarButton.setText("Tentar");
        tentarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addComponent(saidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tentarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(adivinharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(adivinharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saidaButton)
                    .addComponent(tentarButton))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saidaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_saidaButtonActionPerformed

    private void tentarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentarButtonActionPerformed
        String respostaAtual = adivinharTextField.getText().toUpperCase();
        for(int i=0; i<respostaAtual.length();i++){
            
            
            if(respostaAtual.substring(i,i+1).equals(correto.substring(i,i+1)))
            {
                certo.add(i+1);
            }
            else {
                errado.add(i+1);
            }
        
        
        }
        JOptionPane.showMessageDialog(null,"Posições Corretas: " + certo.toString() + "\nPosições Erradas"+ errado.toString());
        certo.clear();
        errado.clear();
        resposta+= respostaAtual+"\n";
        contador+=1;
        JOptionPane.showMessageDialog(null, resposta);
        if (respostaAtual.equals(correto)){
            JOptionPane.showMessageDialog(null, "FOI PUTA");
        
        }
        else if(contador == 5){
           JOptionPane.showMessageDialog(null, "Não consiguiste vagabunda.");
        }
       
    }//GEN-LAST:event_tentarButtonActionPerformed

    private void adivinharTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adivinharTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adivinharTextFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adivinharTextField;
    private javax.swing.JButton saidaButton;
    private javax.swing.JPanel tela;
    private javax.swing.JButton tentarButton;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
