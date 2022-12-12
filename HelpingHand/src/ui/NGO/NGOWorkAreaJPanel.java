/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.NGO;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.RoundedBorder;
import Model.UserDetails.UserDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ShubhamSingh
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserDetails userAccount;
    public NGOWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserDetails userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem=ecoSystem;
        this.userAccount = userAccount;
        btnDonation.setBorder(new RoundedBorder(20));
        btnHospital.setBorder(new RoundedBorder(20));
        btnDonation1.setBorder(new RoundedBorder(20));
        //valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHospital = new javax.swing.JButton();
        btnDonation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDonation1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("                 NGO Admin Work Area");

        btnHospital.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnHospital.setText("Hospital Request");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnDonation.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDonation.setText("Donation Request");
        btnDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ngo (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ngo (1).png"))); // NOI18N

        btnDonation1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDonation1.setText("Setup NGO Information");
        btnDonation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonation1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDonation1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDonation1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        try
        {
        NGOManageRequestHospitalJPanel nGOManageRequestHospitalJPanel = new NGOManageRequestHospitalJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, ecoSystem, userAccount);
        userProcessContainer.add("NGOManageRequestHospitalJPanel", nGOManageRequestHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Some error has occured", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationActionPerformed
        // TODO add your handling code here:
        try{
        NGOManageRequestDonationJPanel nGOManageRequestDonationJPanel = new NGOManageRequestDonationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, ecoSystem, userAccount);
        userProcessContainer.add("NGOManageRequestDonationJPanel", nGOManageRequestDonationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Some error has occured", "Warning", JOptionPane.WARNING_MESSAGE);
                }
    }//GEN-LAST:event_btnDonationActionPerformed

    private void btnDonation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonation1ActionPerformed
        // TODO add your handling code here:
        
        try{
         SetupNGOInfoJPanel setupNGOInfoJPanel = new SetupNGOInfoJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, ecoSystem, userAccount);
        userProcessContainer.add("SetupNGOInfoJPanel", setupNGOInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Some error has occured", "Warning", JOptionPane.WARNING_MESSAGE);
                }
    }//GEN-LAST:event_btnDonation1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonation;
    private javax.swing.JButton btnDonation1;
    private javax.swing.JButton btnHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
