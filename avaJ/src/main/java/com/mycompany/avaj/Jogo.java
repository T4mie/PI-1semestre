
package com.mycompany.avaj;

import java.util.*;      
import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JFrame {

    public Jogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        adivinharTextField.setDocument(new LimitaCaracteres(numPalavra));
    }
    Pergunta p = new Pergunta();
    
    String correto = "";
    int numPalavra;
    int pontuacao = 7000;
    String resposta = "";
    List<Integer> certo= new ArrayList<Integer>();
    List<Integer> errado = new ArrayList<Integer>();
    int contador = 0;
    int turno = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tela = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        adivinharTextField = new javax.swing.JTextField();
        saidaButton = new javax.swing.JButton();
        tentarButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        comecarButton = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("avaJ");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setResizable(false);

        tela.setBackground(new java.awt.Color(0, 0, 0));
        tela.setPreferredSize(new java.awt.Dimension(640, 360));

        titulo.setFont(new java.awt.Font("Courier New", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 51, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("avaJ");

        adivinharTextField.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        adivinharTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adivinharTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adivinharTextFieldActionPerformed(evt);
            }
        });

        saidaButton.setBackground(new java.awt.Color(153, 51, 255));
        saidaButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        saidaButton.setForeground(new java.awt.Color(255, 255, 255));
        saidaButton.setText("Sair");
        saidaButton.setBorderPainted(false);
        saidaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaButtonActionPerformed(evt);
            }
        });

        tentarButton.setBackground(new java.awt.Color(153, 51, 255));
        tentarButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        tentarButton.setForeground(new java.awt.Color(255, 255, 255));
        tentarButton.setText("Tentar");
        tentarButton.setBorderPainted(false);
        tentarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tentarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentarButtonActionPerformed(evt);
            }
        });

        rankingButton.setBackground(new java.awt.Color(153, 51, 255));
        rankingButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        rankingButton.setForeground(new java.awt.Color(255, 255, 255));
        rankingButton.setText("Classificação");
        rankingButton.setBorderPainted(false);
        rankingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        salvarButton.setBackground(new java.awt.Color(153, 51, 255));
        salvarButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("Salvar");
        salvarButton.setBorderPainted(false);
        salvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        comecarButton.setBackground(new java.awt.Color(153, 51, 255));
        comecarButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        comecarButton.setForeground(new java.awt.Color(255, 255, 255));
        comecarButton.setText("Começar");
        comecarButton.setBorderPainted(false);
        comecarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comecarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comecarButtonActionPerformed(evt);
            }
        });

        tutorialButton.setBackground(new java.awt.Color(153, 51, 255));
        tutorialButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        tutorialButton.setForeground(new java.awt.Color(255, 255, 255));
        tutorialButton.setText("Tutorial");
        tutorialButton.setBorderPainted(false);
        tutorialButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ligia\\Downloads\\java.png")); // NOI18N

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adivinharTextField)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saidaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comecarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tutorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(tentarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(385, 385, 385))))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adivinharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comecarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tentarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        JOptionPane.showMessageDialog(null, """
            Para come\u00e7ar o jogo, clique em Come\u00e7ar e escolha uma das 14 quest\u00f5es, leia a dica,
            escreva seu palpite no campo e clique em Tentar, voc\u00ea ter\u00e1 6 tentativas para tentar acertar a resposta.\n
            A cada tentativa falha voc\u00ea perder\u00e1 pontos. Depois que terminar a partida clique em Salvar para salvar sua pontua\u00e7\u00e3o.
            \nPara ver sua pontua\u00e7\u00e3o clique em Classifica\u00e7\u00e3o!""");
    }//GEN-LAST:event_tutorialButtonActionPerformed

    private void comecarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecarButtonActionPerformed
        int cod =  Integer.parseInt(JOptionPane.showInputDialog("Numero da Questao entre 1 e 14:"));
        if(cod <= 14 && cod>0){
            p.setCodPista(cod);
            String msgp = p.pista();
            correto = p.palavras();
            numPalavra = correto.length();
            adivinharTextField.setDocument(new LimitaCaracteres(numPalavra));
            JOptionPane.showMessageDialog(null, msgp);
        }
        else{
            JOptionPane.showMessageDialog(null, "Número de Questão Inválido");
        }
    }//GEN-LAST:event_comecarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        String nome = JOptionPane.showInputDialog("Nome(5 caracteres): ");
        int pontos = pontuacao;
        int turnos = turno;
        Pessoa p = new Pessoa();

        p.setNome(nome);
        p.setPontos(pontos);
        p.setTurnos(turnos);
        p.inserir();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        Pessoa p = new Pessoa();
        String msg = p.listar();
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void tentarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentarButtonActionPerformed
        String respostaAtual = adivinharTextField.getText().toLowerCase();
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
        turno+=1;
        JOptionPane.showMessageDialog(null, resposta);
        if (respostaAtual.equals(correto)){
            JOptionPane.showMessageDialog(null, "Palavra correta!");
            pontuacao = pontuacao - 1000*turno;
            contador = 0;
        }
        else if(contador == 6){
            JOptionPane.showMessageDialog(null, "Palavra incorreta.\n A Palavra correta era: " + correto + ". \n Você perdeu o jogo.");
            pontuacao = 0;
            contador = 0;

        }
    }//GEN-LAST:event_tentarButtonActionPerformed

    private void saidaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_saidaButtonActionPerformed

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
    private javax.swing.JButton comecarButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton saidaButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JPanel tela;
    private javax.swing.JButton tentarButton;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton tutorialButton;
    // End of variables declaration//GEN-END:variables
}
