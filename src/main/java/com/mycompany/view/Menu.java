package com.mycompany.view;

import com.mycompany.trabprogi.Premier;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SimulateRound = new javax.swing.JButton();
        SimulateSeason = new javax.swing.JButton();
        ShowTeam = new javax.swing.JButton();
        SearchTeam = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Leave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(172, 298));
        setPreferredSize(new java.awt.Dimension(172, 298));

        SimulateRound.setText("Simulate Round");
        SimulateRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateRoundActionPerformed(evt);
            }
        });

        SimulateSeason.setText("Simulate Season");
        SimulateSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateSeasonActionPerformed(evt);
            }
        });

        ShowTeam.setText("Show Team");
        ShowTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTeamActionPerformed(evt);
            }
        });

        SearchTeam.setText("Search Team");
        SearchTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTeamActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Leave.setText("Leave");
        Leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SimulateRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SimulateSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ShowTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Leave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SimulateRound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SimulateSeason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShowTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Leave)
                .addContainerGap(19, Short.MAX_VALUE))
        );

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
    // End of variables declaration//GEN-END:variables
}
