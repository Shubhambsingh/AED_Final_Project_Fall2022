/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HelpingHands;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.RoundedBorder;
import Model.UserDetails.UserDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import ui.Hospital.HospitalCreateEmployee;
import ui.Hospital.HospitalManageOrganization;
import ui.Hospital.HospitalManageUserDetailss;

/**
 *
 * @author ShubhamSingh
 */
public class HelpingHandsAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HelpingHandsAdminJPanel
     */
    JPanel userProcessContainer;
    UserDetails userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem ecoSystem;

    public HelpingHandsAdminJPanel(JPanel userProcessContainer, UserDetails userAccount, 
            Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
        
        ManageOrgBtn.setBorder(new RoundedBorder(20));
        ManageEmpBtn.setBorder(new RoundedBorder(20));
        CreateCredBtn.setBorder(new RoundedBorder(20));
        //ManageOrgBtn.setBorder(new RoundedBorder(20));
        
//        Network network = null;
//        for(Network n:ecoSystem.getNetworkList())
//        {
//            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList())
//            {
//                if (enterprise.equals(e)){
//                    network = n;
//                    break;
//                }
//            }
//            
//        }
//        
//        System.out.println("Network Name "+network);
//        System.out.println("Network Name "+network.getAreaPoint());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SPTitle = new javax.swing.JLabel();
        ManageOrgBtn = new javax.swing.JButton();
        ManageEmpBtn = new javax.swing.JButton();
        CreateCredBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        SPTitle.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        SPTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPTitle.setText("Helping Hands");

        ManageOrgBtn.setBackground(new java.awt.Color(255, 255, 204));
        ManageOrgBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ManageOrgBtn.setText("Manage Organization");
        ManageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrgBtnActionPerformed(evt);
            }
        });

        ManageEmpBtn.setBackground(new java.awt.Color(255, 255, 204));
        ManageEmpBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ManageEmpBtn.setText("Manage Role");
        ManageEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEmpBtnActionPerformed(evt);
            }
        });

        CreateCredBtn.setBackground(new java.awt.Color(255, 255, 204));
        CreateCredBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CreateCredBtn.setText("Manage Organization Credetials");
        CreateCredBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCredBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SAM_Illustrations_Food@2x-1_1.png"))); // NOI18N
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(ManageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(ManageEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(CreateCredBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(SPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel3)))
                .addContainerGap(655, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ManageEmpBtn, ManageOrgBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CreateCredBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CreateCredBtn, ManageEmpBtn, ManageOrgBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void ManageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrgBtnActionPerformed
        // TODO add your handling code here:
        try{
        SPManageOrganization sPManageOrganization = new SPManageOrganization(enterprise,enterprise.getOrganizationDirectory(),userProcessContainer,ecoSystem);
        userProcessContainer.add("SPManageOrganization", sPManageOrganization);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "Some error occurred!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ManageOrgBtnActionPerformed

    private void ManageEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEmpBtnActionPerformed
        // TODO add your handling code here:
        try{
        SPCreateEmployee sPCreateEmployee = new SPCreateEmployee(enterprise.getOrganizationDirectory(),userProcessContainer);
        userProcessContainer.add("SPCreateEmployee", sPCreateEmployee);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Please Create Organization First!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ManageEmpBtnActionPerformed

    private void CreateCredBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCredBtnActionPerformed
        // TODO add your handling code here:
        try{
        SPManageUserDetails sPManageUserDetails = new SPManageUserDetails(userProcessContainer, enterprise);
        userProcessContainer.add("SPManageUserDetails", sPManageUserDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Some Error Occurred!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CreateCredBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateCredBtn;
    private javax.swing.JButton ManageEmpBtn;
    private javax.swing.JButton ManageOrgBtn;
    private javax.swing.JLabel SPTitle;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
