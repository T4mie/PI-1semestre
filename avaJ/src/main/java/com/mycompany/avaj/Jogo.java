
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
        rankingButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        dicaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        rankingButton.setText("Classficação");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        dicaButton.setText("Dica");
        dicaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dicaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ranking");

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adivinharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaLayout.createSequentialGroup()
                            .addComponent(dicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tentarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(telaLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addGroup(telaLayout.createSequentialGroup()
                            .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56)
                            .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salvarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(atualizarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adivinharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dicaButton)
                    .addComponent(saidaButton)
                    .addComponent(tentarButton))
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankingButton)
                    .addComponent(salvarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarButton)
                    .addComponent(atualizarButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                certo.add(i+1) ;
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
        else if(contador == 6){
           JOptionPane.showMessageDialog(null, "Não consiguiste vagabunda.");
        }
       
    }//GEN-LAST:event_tentarButtonActionPerformed

    private void adivinharTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adivinharTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adivinharTextFieldActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
            Pessoa p = new Pessoa();
            String msg = p.listar();
            JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
                    int ranking = Integer.parseInt( JOptionPane.showInputDialog("ranking: "));
                    String nome = JOptionPane.showInputDialog("nome: ");
                    int pontos =  Integer.parseInt(JOptionPane.showInputDialog("pontos"));
                    int turnos =  Integer.parseInt(JOptionPane.showInputDialog("turnos: "));
                    Pessoa p = new Pessoa();
                    p.setRanking(ranking);
                    p.setNome(nome);
                    p.setPontos(pontos);
                    p.setTurnos(turnos);
                    p.inserir();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        String nome = JOptionPane.showInputDialog("nome");
                     Pessoa p = new Pessoa();
                     p.setNome(nome);
                     p.deletar();
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        int ranking = Integer.parseInt(JOptionPane.showInputDialog("ranking"));
                    String nome = JOptionPane.showInputDialog("nome");
                    int pontos = Integer.parseInt(JOptionPane.showInputDialog("pontos"));
                    int turnos = Integer.parseInt(JOptionPane.showInputDialog("turnos"));
                    Pessoa p = new Pessoa(ranking, nome, pontos, turnos);
                    p.atualizar();
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void dicaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dicaButtonActionPerformed
            int dica =  Integer.parseInt(JOptionPane.showInputDialog("numero da questao:"));
            //construindo a pergunta
            Pergunta p = new Pergunta();
            //setCodPista como o input dica
            p.setCodPista(dica);
            //o metodo pista da classe pergunta se chama msg
            String msg = p.pista();
            //mostrar a resposta msg
            JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_dicaButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adivinharTextField;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton deletarButton;
    private javax.swing.JButton dicaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton saidaButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JPanel tela;
    private javax.swing.JButton tentarButton;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
