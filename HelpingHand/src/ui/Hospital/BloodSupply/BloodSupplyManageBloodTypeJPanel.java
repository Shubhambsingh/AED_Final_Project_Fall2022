/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital.BloodSupply;

import Model.BloodSupply.BloodSupply;
import Model.BloodSupply.BloodSupplyDirectory;
import Model.Medic.Medic;
import Model.Medic.MedicDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.OrganizationDirectory;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.LocalityBloodRequest;
import Model.WorkQueue.LocalityDonationRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SejalChandak
 */
public class BloodSupplyManageBloodTypeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodSupplyManageBloodTypeJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserDetails userAccount;
    private EcoSystem ecoSystem;
    
    public BloodSupplyManageBloodTypeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,Enterprise enterprise,UserDetails userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        tblBloodSupply.getTableHeader().setDefaultRenderer(new HeaderColors());
        bloodDonationAdd();
        populateBloodTable();
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
        btnBack = new javax.swing.JButton();
        btnDeleteMedic = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodSupply = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBloodGroupType = new javax.swing.JTextField();
        btnAddMedic = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Blood Type");

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteMedic.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteMedic.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteMedic.setText("Delete");
        btnDeleteMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMedicActionPerformed(evt);
            }
        });

        tblBloodSupply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "No. of Packets "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBloodSupply);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Blood Type :");

        txtBloodGroupType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBloodGroupType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupTypeActionPerformed(evt);
            }
        });

        btnAddMedic.setBackground(new java.awt.Color(102, 217, 255));
        btnAddMedic.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAddMedic.setText("Add");
        btnAddMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blood_donation1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddMedic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBloodGroupType, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMedic)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBloodGroupType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMedic)
                    .addComponent(jLabel3))
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMedicActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblBloodSupply.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the doctor details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            BloodSupply p=(BloodSupply) tblBloodSupply.getValueAt(selectedRow, 0);
            
            ecoSystem.getBloodDirectory().removeBlood(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the doctor details");
            populateBloodTable();
        }
    }//GEN-LAST:event_btnDeleteMedicActionPerformed

    private void txtBloodGroupTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupTypeActionPerformed

    private void btnAddMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicActionPerformed
        // TODO add your handling code here:
        BloodSupplyDirectory bankDirectory = new BloodSupplyDirectory();
        if(!txtBloodGroupType.getText().equals("")){
            BloodSupply bloodBank = ecoSystem.getBloodDirectory().addBlood();
            bloodBank.setBloodGroupType(txtBloodGroupType.getText());
            bloodBank.setBloodPackets(0);
            
            populateBloodTable();
            
            LocalityBloodRequest communityBloodRequest = new LocalityBloodRequest();
            communityBloodRequest.setBloodType(bloodBank);
            
            LocalityDonationRequest communityDonationRequest = new LocalityDonationRequest();
            communityDonationRequest.setBloodType(bloodBank);
            
            txtBloodGroupType.setText("");
            bloodDonationAdd();

        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMedicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedic;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMedic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBloodSupply;
    private javax.swing.JTextField txtBloodGroupType;
    // End of variables declaration//GEN-END:variables

    private void populateBloodTable() {
     DefaultTableModel table= (DefaultTableModel) tblBloodSupply.getModel();
     table.setRowCount(0);
      for (BloodSupply bloodBank : ecoSystem.getBloodDirectory().getBloodSupplyList()) {
            
           Object[] row = new Object[2];
           row[0]= bloodBank;
           row[1]=bloodBank.getBloodPackets();
           table.addRow(row);
    }  
    }
    
    
    private void bloodDonationAdd(){
        
         for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList())
             for (BloodSupply bloodBank : ecoSystem.getBloodDirectory().getBloodSupplyList()){
               
             if (work instanceof LocalityDonationRequest)
//                     System.out.println(((LocalityDonationRequest) work).getNoBloodPacketsRequired()
//                     );
             {
     
            
                   
                    if (work.getStatus().equalsIgnoreCase("Requested"))
                    {
                        System.out.println("BLOOD BANK"+work);
                        if (((LocalityDonationRequest) work).getRequestedBloodType().equals(bloodBank.getBloodGroupType()) )
                           {
                               System.out.println("ui.Hospital.BloodSupply.BloodSupplyManageBloodTypeJPanel.bloodDonationAdd()"+bloodBank.getBloodGroupType());
                              
                               
                            bloodBank.setBloodPackets(bloodBank.getBloodPackets() + ((LocalityDonationRequest) work).getNoBloodPacketsRequired());
                            work.setStatus("Approved");
                            work.setReceiver(userAccount);
                            Date resolveDate = new Date();
                            work.setResolveDate(resolveDate);

                           }
                    }
                 
                 
             }
             
         
             }
         populateBloodTable();
         
    
    }
    
    
}
