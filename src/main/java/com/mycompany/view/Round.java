package com.mycompany.view;

import com.mycompany.trabprogi.Premier;
import com.mycompany.view.Menu;

public class Round extends javax.swing.JFrame {
    
    //COLOCA NO JFRAME OS JOGOS
    public Round() {
        initComponents();
        String[] aux = Premier.getDisplay();
        Display_1.setText(aux[0]);
        Display_2.setText(aux[1]);
        Display_3.setText(aux[2]);
        Display_4.setText(aux[3]);
        Display_5.setText(aux[4]);
        Display_6.setText(aux[5]);
        Display_7.setText(aux[6]);
        Display_8.setText(aux[7]);
        Display_9.setText(aux[8]);
        Display_10.setText(aux[9]);
        Display_11.setText(aux[10]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simulate_next = new javax.swing.JButton();
        close = new javax.swing.JButton();
        Display_2 = new javax.swing.JLabel();
        Display_1 = new javax.swing.JLabel();
        Display_4 = new javax.swing.JLabel();
        Display_5 = new javax.swing.JLabel();
        Display_7 = new javax.swing.JLabel();
        Display_3 = new javax.swing.JLabel();
        Display_8 = new javax.swing.JLabel();
        Display_9 = new javax.swing.JLabel();
        Display_11 = new javax.swing.JLabel();
        Display_6 = new javax.swing.JLabel();
        Display_10 = new javax.swing.JLabel();
        Display_12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        simulate_next.setText("Simulate next");
        simulate_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulate_nextActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        Display_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Display_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_12.setText("--------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display_1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_9, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_10, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_11, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_12, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simulate_next)
                        .addGap(147, 147, 147)
                        .addComponent(close)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Display_1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Display_12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simulate_next)
                    .addComponent(close))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SIMULA UMA OUTRA RODADA
    private void simulate_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulate_nextActionPerformed
        Premier.getPremierLeague().simulateRound(false);
        this.dispose();
    }//GEN-LAST:event_simulate_nextActionPerformed

    //FECHA
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Round().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Display_1;
    private javax.swing.JLabel Display_10;
    private javax.swing.JLabel Display_11;
    private javax.swing.JLabel Display_12;
    private javax.swing.JLabel Display_2;
    private javax.swing.JLabel Display_3;
    private javax.swing.JLabel Display_4;
    private javax.swing.JLabel Display_5;
    private javax.swing.JLabel Display_6;
    private javax.swing.JLabel Display_7;
    private javax.swing.JLabel Display_8;
    private javax.swing.JLabel Display_9;
    private javax.swing.JButton close;
    private javax.swing.JButton simulate_next;
    // End of variables declaration//GEN-END:variables
}
