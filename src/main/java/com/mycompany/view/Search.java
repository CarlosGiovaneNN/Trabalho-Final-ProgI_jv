package com.mycompany.view;

import com.mycompany.trabprogi.Premier;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Search extends javax.swing.JFrame {

    public Search() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        teamS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 180));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Search for the team: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        teamS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton & Hove Albion", "Burnley", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Liverpool", "Luton Town", "Manchester City", "Manchester United", "Newcastle United", "Nottingham Forest", "Sheffield United", "Tottenham Hotspur", "West Ham United", "Wolverhampton Wanderers" }));
        teamS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamSActionPerformed(evt);
            }
        });
        getContentPane().add(teamS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamSActionPerformed
     
    }//GEN-LAST:event_teamSActionPerformed

    //PROCURA O TIME SELECIONADO NA TELA
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        Premier.getPremierLeague().showTeam(teamS.getSelectedItem().toString());
        this.dispose();
    }//GEN-LAST:event_showActionPerformed

    //FECHA
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton show;
    private javax.swing.JComboBox<String> teamS;
    // End of variables declaration//GEN-END:variables
}