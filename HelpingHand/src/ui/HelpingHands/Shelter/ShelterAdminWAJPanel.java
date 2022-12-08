/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HelpingHands.Shelter;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.MealOrganization;
import Model.Organization.OrganizationDirectory;
import Model.Organization.ShelterOrganization;
import Model.RoundedBorder;
import Model.UserDetails.UserDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ShubhamSingh
 */
public class ShelterAdminWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterAdminWAJPanel
     */
    JPanel userProcessContainer;
    UserDetails userAccount;
    ShelterOrganization shelterOrganization;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    public ShelterAdminWAJPanel(JPanel userProcessContainer,
    UserDetails userAccount,
    ShelterOrganization shelterOrganization,
    Enterprise enterprise,
    EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.shelterOrganization = shelterOrganization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
        jCreateShelterBtn.setBorder(new RoundedBorder(20));
        jManageReq.setBorder(new RoundedBorder(20));
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
        jCreateShelterBtn = new javax.swing.JButton();
        jManageReq = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("SHELTER ORGANIZATION");

        jCreateShelterBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCreateShelterBtn.setText("Create Shelter");
        jCreateShelterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateShelterBtnActionPerformed(evt);
            }
        });

        jManageReq.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jManageReq.setText("Manage Request");
        jManageReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManageReqActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shelter.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shelter.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jManageReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCreateShelterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jCreateShelterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jManageReq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jManageReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManageReqActionPerformed
        // TODO add your handling code here:
         ManageLocalityShelterReqJPanel communityShelterReqJPanel = new ManageLocalityShelterReqJPanel(userProcessContainer,userAccount,enterprise.getOrganizationDirectory(),enterprise, ecoSystem);
        userProcessContainer.add("ManageLocalityShelterReqJPanel", communityShelterReqJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jManageReqActionPerformed

    private void jCreateShelterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateShelterBtnActionPerformed
        // TODO add your handling code here:
        CreateShelterJPanel createShelterJPanel = new CreateShelterJPanel(userProcessContainer,userAccount,enterprise.getOrganizationDirectory(),enterprise, ecoSystem);
        userProcessContainer.add("CreateShelterJPanel", createShelterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jCreateShelterBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCreateShelterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jManageReq;
    // End of variables declaration//GEN-END:variables
}