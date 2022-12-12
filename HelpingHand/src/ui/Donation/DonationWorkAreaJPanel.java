/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donation;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.DonationWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.NGO.NGOManageRequestDonationJPanel;

/**
 *
 * @author SejalChandak
 */
public class DonationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserDetails userAccount;
    
    public DonationWorkAreaJPanel(JPanel UserContainer, Enterprise enterprise, EcoSystem ecoSystem, UserDetails userAccount) {
        initComponents();
        this.userProcessContainer = UserContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        tblSponsorManageRequestNgo.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateRequestTable();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSponsorManageRequestNgo = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnDeleteRequest = new javax.swing.JButton();
        btnApproveReqSponsor = new javax.swing.JButton();
        btnRejectReqSponsor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Manage Request From NGO");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Blood Supply Camp");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Purpose :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Request for Funding");

        tblSponsorManageRequestNgo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSponsorManageRequestNgo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Amount", "Requirement Date", "Resolve Date", "Venue", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSponsorManageRequestNgo.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblSponsorManageRequestNgo);

        btnAssignToMe.setBackground(new java.awt.Color(102, 217, 255));
        btnAssignToMe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnDeleteRequest.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteRequest.setText("Delete");
        btnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRequestActionPerformed(evt);
            }
        });

        btnApproveReqSponsor.setBackground(new java.awt.Color(0, 153, 51));
        btnApproveReqSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApproveReqSponsor.setText("Approve");
        btnApproveReqSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveReqSponsorActionPerformed(evt);
            }
        });

        btnRejectReqSponsor.setBackground(new java.awt.Color(255, 153, 153));
        btnRejectReqSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRejectReqSponsor.setText("Reject ");
        btnRejectReqSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectReqSponsorActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/location 32x.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NGO_Landscape.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAssignToMe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteRequest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApproveReqSponsor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRejectReqSponsor))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(621, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApproveReqSponsor, btnAssignToMe, btnDeleteRequest, btnRejectReqSponsor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRejectReqSponsor)
                    .addComponent(btnApproveReqSponsor)
                    .addComponent(btnDeleteRequest)
                    .addComponent(btnAssignToMe))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApproveReqSponsor, btnAssignToMe, btnDeleteRequest, btnRejectReqSponsor});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);

            p.setStatus("Pending");
            p.setReceiver(userAccount);

            populateRequestTable();

        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
            userAccount.getWorkQueue().getWorkRequestList().remove(p);
            ecoSystem.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnDeleteRequestActionPerformed

    private void btnApproveReqSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveReqSponsorActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to approve the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
                if(p.getStatus().equalsIgnoreCase("Rejected")){
                    JOptionPane.showMessageDialog(null, "Cannot Approve the Rejected request", "Warning", JOptionPane.WARNING_MESSAGE);
                }else if(p.getStatus().equalsIgnoreCase("Approved")){
                    JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
                }else {
                    if (p.getStatus().equalsIgnoreCase("Pending")) {
                        p.setStatus("Approved");
                        p.setReceiver(userAccount);
                        Date date = new Date();
                        p.setResolveDate(date);
                    }else{
                        JOptionPane.showMessageDialog(null, "Please assign first");
                    }

                }
                populateRequestTable();
            }
    }//GEN-LAST:event_btnApproveReqSponsorActionPerformed

    private void btnRejectReqSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectReqSponsorActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
            if(p.getStatus().equalsIgnoreCase("Approved")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the Approved request", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if(p.getStatus().equalsIgnoreCase("Rejected")){

                JOptionPane.showMessageDialog(null, "Cannot Reject the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    p.setStatus("Rejected");
                    p.setReceiver(userAccount);
                }else{
                    JOptionPane.showMessageDialog(null, "Please assign first");
                }
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_btnRejectReqSponsorActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        DonationSetUpInformation donationSetUpInformation = new DonationSetUpInformation(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, ecoSystem, userAccount);
        userProcessContainer.add("DonationSetUpInformation", donationSetUpInformation);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel5MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveReqSponsor;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnDeleteRequest;
    private javax.swing.JButton btnRejectReqSponsor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSponsorManageRequestNgo;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblSponsorManageRequestNgo.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = ((DonationWorkRequest) work).getRequestedAmount();
            row[1] = ((DonationWorkRequest) work).getRequestDate();
            row[2] = ((DonationWorkRequest) work).getResolveDate();
            row[3] = ((DonationWorkRequest) work).getArea();
            row[4] = work;
            model.addRow(row);
           }
        }
        
        
    }
}
