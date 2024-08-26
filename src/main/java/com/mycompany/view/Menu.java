/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.trabprogi.Premier;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SimulateRound = new javax.swing.JButton();
        SimulateSeason = new javax.swing.JButton();
        ShowTeam = new javax.swing.JButton();
        SearchTeam = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Leave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SimulateRound.setText("Simulate Round");
        SimulateRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateRoundActionPerformed(evt);
            }
        });
        getContentPane().add(SimulateRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        SimulateSeason.setText("Simulate Season");
        SimulateSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateSeasonActionPerformed(evt);
            }
        });
        getContentPane().add(SimulateSeason, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        ShowTeam.setText("Show Team");
        ShowTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTeamActionPerformed(evt);
            }
        });
        getContentPane().add(ShowTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        SearchTeam.setText("Search Team");
        SearchTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTeamActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        Leave.setText("Leave");
        Leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveActionPerformed(evt);
            }
        });
        getContentPane().add(Leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search620x348.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(620, 348));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SIMULA A RODADA
    private void SimulateRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulateRoundActionPerformed
        Premier.getPremierLeague().simulateRound(false);
    }//GEN-LAST:event_SimulateRoundActionPerformed

    //FECHA
    private void LeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveActionPerformed
        this.dispose();
    }//GEN-LAST:event_LeaveActionPerformed

    //RESETA O CAMPEONATO
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Premier.getPremierLeague().reset();
        JOptionPane.showMessageDialog(this, "Successfully restarted!");
    }//GEN-LAST:event_ResetActionPerformed

    //SIMULA A TEMPORADA
    private void SimulateSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulateSeasonActionPerformed
        Premier.getPremierLeague().simulateTemp();
    }//GEN-LAST:event_SimulateSeasonActionPerformed

    //MOSTRA OS TIME/TABELA
    private void ShowTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTeamActionPerformed
        Premier.getPremierLeague().printAll();
    }//GEN-LAST:event_ShowTeamActionPerformed

    //PROCURA O TIME QUE VOCÊ QUER
    private void SearchTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTeamActionPerformed
        Search frameS = new Search();
        frameS.setDefaultCloseOperation(Search.DISPOSE_ON_CLOSE);
        frameS.setVisible(true);
    }//GEN-LAST:event_SearchTeamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Leave;
    private javax.swing.JButton Reset;
    private javax.swing.JButton SearchTeam;
    private javax.swing.JButton ShowTeam;
    private javax.swing.JButton SimulateRound;
    private javax.swing.JButton SimulateSeason;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
