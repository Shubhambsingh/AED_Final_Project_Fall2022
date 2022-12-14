/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital;

import Model.Medic.Medic;
import Model.EcoSystem;
import ui.AdminPanels.*;
import Model.Enterprise.Enterprise;
import Model.RoundedBorder;
import Model.UserDetails.UserDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Hospital.Clinic.ClinicManageMedicsJPanel;
/**
 *
 * @author SejalChandak
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserDetails userAccount;
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserDetails userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
                
        btnCreateManageOrganization.setBorder(new RoundedBorder(20));
        btnEmployeeCreation.setBorder(new RoundedBorder(20));
        btnUserDetailssManage.setBorder(new RoundedBorder(20));
        
        //enterpriseNameLabel.setText(enterprise.getName());
        //System.out.println("ui.Hospital.HospitalAdminWorkAreaJPanel.<init>() "+ecoSystem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateManageOrganization = new javax.swing.JButton();
        btnEmployeeCreation = new javax.swing.JButton();
        btnUserDetailssManage = new javax.swing.JButton();
        SPTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        btnCreateManageOrganization.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCreateManageOrganization.setText("Organization");
        btnCreateManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManageOrganizationActionPerformed(evt);
            }
        });

        btnEmployeeCreation.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnEmployeeCreation.setText("Create Employee Details");
        btnEmployeeCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCreationActionPerformed(evt);
            }
        });

        btnUserDetailssManage.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnUserDetailssManage.setText("Manage User Accounts");
        btnUserDetailssManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDetailssManageActionPerformed(evt);
            }
        });

        SPTitle.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        SPTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPTitle.setText("HOSPITAL ADMIN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/istock-1131179196.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCreateManageOrganization, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUserDetailssManage, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEmployeeCreation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(SPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(SPTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnEmployeeCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnUserDetailssManage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManageOrganizationActionPerformed
        // TODO add your handling code here:
        HospitalManageOrganization hospitalManageOrganization = new HospitalManageOrganization(enterprise, enterprise.getOrganizationDirectory(),userProcessContainer,ecoSystem);
        userProcessContainer.add("hospitalManageOrganization", hospitalManageOrganization);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateManageOrganizationActionPerformed

    private void btnEmployeeCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCreationActionPerformed
        // TODO add your handling code here:
        
        try {
        
        HospitalCreateEmployee hospitalCreateEmployee = new HospitalCreateEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("hospitalCreateEmployee", hospitalCreateEmployee);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please create the organiztion", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnEmployeeCreationActionPerformed

    private void btnUserDetailssManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDetailssManageActionPerformed
        // TODO add your handling code here:
        HospitalManageUserDetailss hospitalManageUserDetailss = new HospitalManageUserDetailss(userProcessContainer, enterprise);
        userProcessContainer.add("HospitalManageUserDetailss", hospitalManageUserDetailss);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserDetailssManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SPTitle;
    private javax.swing.JButton btnCreateManageOrganization;
    private javax.swing.JButton btnEmployeeCreation;
    private javax.swing.JButton btnUserDetailssManage;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
