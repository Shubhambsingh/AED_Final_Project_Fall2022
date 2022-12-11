/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Locality;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.LocalityFireRequest;
import Model.WorkQueue.LocalityPoliceRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek Sand
 */
public class RequestIncidentDepartmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestIncidentDepartmentJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserDetails account;
    private EcoSystem ecoSystem;
    public RequestIncidentDepartmentJPanel(JPanel userProcessContainer, UserDetails account, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecoSystem = ecoSystem;
        tblRequest.getTableHeader().setDefaultRenderer(new HeaderColors());
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

        txtVenue = new javax.swing.JTextField();
        txtPeopleCount = new javax.swing.JTextField();
        btnSendRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emergencyTypeComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        doctorTypeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 140, -1));
        add(txtPeopleCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, -1));

        btnSendRequest.setBackground(new java.awt.Color(102, 217, 255));
        btnSendRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSendRequest.setText("Send Request");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 140, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Community Fire Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 343, -1));

        tblRequest.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Units Dispatched", "People Affected", "Request Date", "Resolution Date", "Venue", "Unit Type", "Severity", "Status", "Sender", "Receiver"
            }
        ));
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, 190));

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Respondant Type:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Emergency Type :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        emergencyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High", "Immediate" }));
        add(emergencyTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Area :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        doctorTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer Service", "Survelliance Team", "Emergency Response" }));
        add(doctorTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 140, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Number of People Affected :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fireWorkRequest512xx.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 510, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Emergency_ser_team.jpeg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 130, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        // TODO add your handling code here:

        if(txtPeopleCount.getText().isEmpty() || txtVenue.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please add all the fields");
        return;
        }
        
        LocalityFireRequest request = new LocalityFireRequest();

        // request.setNoMedicRequired(Integer.parseInt(txtMedicCount.getText()));
        request.setArea(txtVenue.getText());
        Date requestDate = new Date();
        request.setRequestDate(requestDate);
        //                request.setRequestedTime(txtTime.getText());
        // request.setPurpose(txtRequestType.getText());
        request.setStatus("Requested");
        request.setSender(account);
        
        try{
                request.setNoPeopleAffected(Integer.parseInt(txtPeopleCount.getText()));

        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Please enter numeric value");
        return;
        }
        
        try{
        request.setIncidentDepartmentType(doctorTypeComboBox.getSelectedItem().toString());
        request.setPurpose(emergencyTypeComboBox.getSelectedItem().toString());
        }catch(NullPointerException n){
        JOptionPane.showMessageDialog(this, "Please choose one option");
        return;
        }
        
        
        account.getWorkQueue().getWorkRequestList().add(request);
        enterprise.getWorkQueue().getWorkRequestList().add(request);
        ecoSystem.getWorkQueue().getWorkRequestList().add(request);

        populateRequestTable();

        //            JOptionPane.showMessageDialog(null,"Enter date in specified format", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    
    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(work instanceof LocalityFireRequest && work.getSender() == account){
                Object[] row = new Object[10];
                row[0] = ((LocalityFireRequest) work).getIncidentDepartmentCount() ;
                row[1] = ((LocalityFireRequest) work).getNoPeopleAffected() ;
                row[2] = ((LocalityFireRequest) work).getRequestDate() ;
                row[3] = ((LocalityFireRequest) work).getResolveDate() ;
                row[7] = work;
                row[4] = ((LocalityFireRequest) work).getArea() ;
                row[5] = ((LocalityFireRequest) work).getIncidentDepartmentType() ;
                row[6] = ((LocalityFireRequest) work).getPurpose() ;
                row[8] = ((LocalityFireRequest) work).getSender();
                if(((LocalityFireRequest) work).getReceiver() != null){
                     row[9] = ((LocalityFireRequest) work).getReceiver().getNameuser() ;
                }
               

                model.addRow(row);
            
            }
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JComboBox<String> doctorTypeComboBox;
    private javax.swing.JComboBox<String> emergencyTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtPeopleCount;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
