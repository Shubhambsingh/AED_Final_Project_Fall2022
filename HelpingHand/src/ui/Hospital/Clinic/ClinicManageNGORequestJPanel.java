/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital.Clinic;

import Model.Medic.Medic;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.OrganizationDirectory;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.LocalityMedicRequest;
import Model.WorkQueue.NGOWorkRequest;
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
public class ClinicManageNGORequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicManageNGORequestJPanel
     */
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserDetails userAccount;
    
    public ClinicManageNGORequestJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise,EcoSystem ecoSystem,UserDetails userAccount) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        tblAvailableMedic.getTableHeader().setDefaultRenderer(new HeaderColors());
        tblRequestTableLocality.getTableHeader().setDefaultRenderer(new HeaderColors());
        
        populateAvailableMedicTbl();
        populateMedicType();
        populateRequestTable();
    }
        private void populateAvailableMedicTbl() {
       DefaultTableModel model = (DefaultTableModel) tblAvailableMedic.getModel();

        model.setRowCount(0);

        for (Medic doctor : ecoSystem.getMedicList().getMedicList()) {

            Object[] row = new Object[2];
            row[0] = doctor;
            row[1] = doctor.getQuantity();
            model.addRow(row);

        }
    }

    private void populateMedicType() {
        for (Medic doctor : ecoSystem.getMedicList().getMedicList()){
            cmbDocType.addItem(doctor.getDocName());
        }
    }

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequestTableLocality.getModel();
        
        model.setRowCount(0);
        

        for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkRequest){ 
               
               if(((NGOWorkRequest) work).getReceiver() == null || ((NGOWorkRequest) work).getReceiver() == userAccount){
               Object[] row = new Object[8];
            row[0] = ((NGOWorkRequest) work).getNoMedicRequired();
            row[1] = ((NGOWorkRequest) work).getRequestDate();
            row[2] = ((NGOWorkRequest) work).getResolveDate();
            row[3] = ((NGOWorkRequest) work).getArea();
            row[4] = ((NGOWorkRequest) work).getMedicType();
            row[5] = work;
            row[6] = ((NGOWorkRequest) work).getSender();
            
            if(((NGOWorkRequest) work).getReceiver() != null){
            row[7] = ((NGOWorkRequest) work).getReceiver();
            }
            
            model.addRow(row);
               }
            
           }
        }
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestTableLocality = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnDeleteReqHosp = new javax.swing.JButton();
        btnApproveReqHospital = new javax.swing.JButton();
        btnRejectReqHospital = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvailableMedic = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        cmbDocType = new javax.swing.JComboBox<>();
        txtNoMedics = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Manage Request From NGO");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Purpose :");

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Request for Medics");

        tblRequestTableLocality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblRequestTableLocality.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No of Medics required", "Date of requirement", "Resolve Date", "Position", "Medic Type", "Status", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestTableLocality.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRequestTableLocality);

        btnAssignToMe.setBackground(new java.awt.Color(102, 217, 255));
        btnAssignToMe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnDeleteReqHosp.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteReqHosp.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteReqHosp.setText("Delete Request");
        btnDeleteReqHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqHospActionPerformed(evt);
            }
        });

        btnApproveReqHospital.setBackground(new java.awt.Color(102, 217, 255));
        btnApproveReqHospital.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApproveReqHospital.setText("Approve Request");
        btnApproveReqHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveReqHospitalActionPerformed(evt);
            }
        });

        btnRejectReqHospital.setBackground(new java.awt.Color(255, 153, 153));
        btnRejectReqHospital.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRejectReqHospital.setText("Reject Request");
        btnRejectReqHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectReqHospitalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Medics available at Hospital");

        tblAvailableMedic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAvailableMedic.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAvailableMedic.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblAvailableMedic);

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtNoMedics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoMedicsKeyPressed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 217, 255));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 217, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Medic Type:");

        jLabel6.setBackground(new java.awt.Color(102, 217, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("No. of Medics:");

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtNoMedics, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(49, 49, 49)
                                        .addComponent(cmbDocType, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssignToMe)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteReqHosp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApproveReqHospital)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRejectReqHospital))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRejectReqHospital)
                    .addComponent(btnApproveReqHospital)
                    .addComponent(btnDeleteReqHosp)
                    .addComponent(btnAssignToMe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDocType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoMedics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableLocality.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            NGOWorkRequest c =  (NGOWorkRequest)tblRequestTableLocality.getValueAt(selectedRow, 5);
          

            c.setStatus("Pending");
            c.setReceiver(userAccount);

            populateRequestTable();

        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnDeleteReqHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqHospActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableLocality.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblRequestTableLocality.getValueAt(selectedRow, 5);

            userAccount.getWorkQueue().getWorkRequestList().remove(p);
            ecoSystem.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnDeleteReqHospActionPerformed

    private void btnApproveReqHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveReqHospitalActionPerformed
        // TODO add your handling code here:

        int selectedRow= tblRequestTableLocality.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            NGOWorkRequest p=(NGOWorkRequest) tblRequestTableLocality.getValueAt(selectedRow, 5);

            int temp=0;
            if(p.getReceiver()!= null){
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    UserDetails a =p.getSender();
                    if(ecoSystem.getMedicList().getMedicList().size()<= 0){
                        JOptionPane.showMessageDialog(null, "No Medics available.");
                        return;
                    }
                    for (Medic v : ecoSystem.getMedicList().getMedicList()) {
                        if (v.getDocName() == p.getMedicType())
                        {
                        //if(p.getDocName().equals(v.getDocName())){
                            if(v.getQuantity()- p.getNoMedicRequired()<0){
                                JOptionPane.showMessageDialog(null, "Not enough Medics available. Wait for sometime");
                                return;
                            }
                            temp=1;
                            v.setQuantity(v.getQuantity()- p.getNoMedicRequired());
                            break;
                        }
                            //}

                    }
                    if(temp==0){
                        JOptionPane.showMessageDialog(null, "No Medics available");
                        return;
                    }

                    p.setStatus("Approved");
                    Date resolveDate = new Date();
                    p.setResolveDate(resolveDate);
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                    populateAvailableMedicTbl();
                    populateRequestTable();
                } else if(p.getStatus().equalsIgnoreCase("Rejected")){
                    JOptionPane.showMessageDialog(null, "You cannot approve the rejected request.");

                }else {
                    JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnApproveReqHospitalActionPerformed

    private void btnRejectReqHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectReqHospitalActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableLocality.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            NGOWorkRequest p=(NGOWorkRequest) tblRequestTableLocality.getValueAt(selectedRow, 5);
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
    }//GEN-LAST:event_btnRejectReqHospitalActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblAvailableMedic.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the doctor details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Medic p= (Medic) tblAvailableMedic.getValueAt(selectedRow, 0);

            ecoSystem.getMedicList().removeMedic(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the doctor details");
            populateAvailableMedicTbl();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNoMedicsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoMedicsKeyPressed
        // TODO add your handling code here:
        //Validator.onlyInteger(evt, txtNoMedics);
    }//GEN-LAST:event_txtNoMedicsKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(!txtNoMedics.getText().equals("")){
            int quant = 0;
            try{
            quant = Integer.parseInt(txtNoMedics.getText());
            }
            catch(Exception e)
                    {
            JOptionPane.showMessageDialog(null, "Enter a proper value !", "Warning", JOptionPane.WARNING_MESSAGE);            
                    }
            String v =  (String) cmbDocType.getSelectedItem();
            int temp = 0;
            for (Medic doctor : ecoSystem.getMedicList().getMedicList()) {
                if (v.equals(doctor.getDocName())) {
                    temp = 1;
                    doctor.setQuantity(doctor.getQuantity() + quant);
                }
            }

            if (temp == 0) {

                JOptionPane.showMessageDialog(null, "Add Medic Type in Manage Medic JPanel", "Warning", JOptionPane.WARNING_MESSAGE);


            }
            populateAvailableMedicTbl();
        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnApproveReqHospital;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteReqHosp;
    private javax.swing.JButton btnRejectReqHospital;
    private javax.swing.JComboBox<String> cmbDocType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAvailableMedic;
    private javax.swing.JTable tblRequestTableLocality;
    private javax.swing.JTextField txtNoMedics;
    // End of variables declaration//GEN-END:variables
}
