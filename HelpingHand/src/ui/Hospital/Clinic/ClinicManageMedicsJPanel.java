/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital.Clinic;

import Model.Medic.Medic;
import Model.Medic.MedicDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.OrganizationDirectory;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.LocalityMedicRequest;
import Model.WorkQueue.NGOWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SejalChandak
 */
public class ClinicManageMedicsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicManageMedicsJPanel
     */
   JPanel userProcessContainer;
   Enterprise enterprise;
   EcoSystem ecoSystem;
   UserDetails userAccount;
   OrganizationDirectory organizationDirectory;
    
    public ClinicManageMedicsJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserDetails userAccount,OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.organizationDirectory = organizationDirectory;
        populateMedicTable();
        tblMedic.getTableHeader().setDefaultRenderer(new HeaderColors());
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
        jLabel2 = new javax.swing.JLabel();
        txtMedicType = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddMedic = new javax.swing.JButton();
        btnDeleteMedic = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedic = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Medic");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Medic Type :");

        txtMedicType.setBackground(new java.awt.Color(204, 204, 204));
        txtMedicType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicTypeActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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

        btnDeleteMedic.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteMedic.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteMedic.setText("Delete");
        btnDeleteMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMedicActionPerformed(evt);
            }
        });

        tblMedic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medic Type", "No of Medics"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedic);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMedicType)
                                .addGap(153, 153, 153)
                                .addComponent(btnDeleteMedic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnAddMedic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(190, 190, 190)))
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMedic))
                .addGap(18, 18, 18)
                .addComponent(btnAddMedic)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicActionPerformed
        // TODO add your handling code here:
        MedicDirectory doc = new MedicDirectory();
        if(!txtMedicType.getText().equals("")){
            Medic doctor = ecoSystem.getMedicList().addMedic();
            doctor.setDocName(txtMedicType.getText());
            doctor.setQuantity(0);
            populateMedicTable();
            
            NGOWorkRequest nGOWorkRequest = new NGOWorkRequest();
            nGOWorkRequest.setMedic(doctor);
            
            LocalityMedicRequest communityMedicRequest = new LocalityMedicRequest();
            communityMedicRequest.setMedic(doctor);
            
            txtMedicType.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMedicActionPerformed

    private void btnDeleteMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMedicActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblMedic.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the doctor details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Medic p=(Medic) tblMedic.getValueAt(selectedRow, 0);

            ecoSystem.getMedicList().removeMedic(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the doctor details");
            populateMedicTable();
        }
    }//GEN-LAST:event_btnDeleteMedicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedic;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMedic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedic;
    private javax.swing.JTextField txtMedicType;
    // End of variables declaration//GEN-END:variables

    private void populateMedicTable() {
       DefaultTableModel table= (DefaultTableModel) tblMedic.getModel();
       table.setRowCount(0);
      for (Medic doctor : ecoSystem.getMedicList().getMedicList()) {
            
           Object[] row = new Object[2];
           row[0]= doctor;
           row[1]=doctor.getQuantity();
           table.addRow(row);
    }  
    }
}
