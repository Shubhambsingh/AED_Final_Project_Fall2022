/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HelpingHands;

import Model.EcoSystem;
import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ShubhamSingh
 */
public class SPManageUserDetails extends javax.swing.JPanel {

    /**
     * Creates new form SPManageUserDetails
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    HashMap<String, Role> myRole;
    public SPManageUserDetails(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
         this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer; 
        tblUserDetailss.getTableHeader().setDefaultRenderer(new HeaderColors());
         populateOrganizationComboBox();
         fillTheTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     private void populateEmployeeComboBox(Organization organization) {
         comboBoxEmployee.removeAllItems();
         
         for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            comboBoxEmployee.addItem(employee);
         
    }
}
     
      private void populateRoleComboBox(Enterprise e){
        comboBoxRole.removeAllItems();
        myRole = new HashMap<String, Role>();
        for (Role role : e.getSupportedRole()){
            
           myRole.put(role.toString().substring(20),role);   
        }
        for (Map.Entry<String,Role> set:myRole.entrySet())
        {
            comboBoxRole.addItem(set.getKey());
        }
        
    }

    private void populateOrganizationComboBox() {
        comboBoxOrganiztion.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboBoxOrganiztion.addItem(organization);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        comboBoxEmployee = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboBoxOrganiztion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnCreateUserAccount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Role");

        jLabel3.setBackground(new java.awt.Color(102, 217, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setText("Employee");

        comboBoxOrganiztion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrganiztionActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 217, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setText("Organization");

        btnCreateUserAccount.setBackground(new java.awt.Color(204, 204, 213));
        btnCreateUserAccount.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCreateUserAccount.setText("Create");
        btnCreateUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserAccountActionPerformed(evt);
            }
        });

        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserAccounts);

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack.setBackground(new java.awt.Color(204, 204, 213));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 217, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("Password");

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE CREDENTIALS");

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("User Name");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee128x.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnCreateUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnCreateUserAccount))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxOrganiztionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrganiztionActionPerformed
        Organization organization = (Organization) comboBoxOrganiztion.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_comboBoxOrganiztionActionPerformed

    private void btnCreateUserDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserDetailsActionPerformed

        try {
            String userName = txtUserName.getText();
            String password = txtPassword.getText();

            if ("".equals(userName)) {
                JOptionPane.showMessageDialog(null, "Please enter username!!", "Warning", JOptionPane.WARNING_MESSAGE);
                //return;
            } else if ("".equals(password)) {
                JOptionPane.showMessageDialog(null, "Please enter password!!", "Warning", JOptionPane.WARNING_MESSAGE);
                //return;
            } else {
                if (EcoSystem.checkIfUsernameIsUnique(userName)) {
                    Organization organization = (Organization) comboBoxOrganiztion.getSelectedItem();
                    Employee employee = (Employee) comboBoxEmployee.getSelectedItem();
                    Role role = (Role) myRole.get(comboBoxRole.getSelectedItem());

                    organization.getUserDetailsDirectory().createUserDetails(userName, password, employee, role);

                    fillTheTable();
                    resetFields();;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateUserDetailsActionPerformed

       public void resetFields() {
        txtUserName.setText("");
        txtPassword.setText("");
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    private void fillTheTable() {
        DefaultTableModel model = (DefaultTableModel) tblUserDetailss.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserDetails ua : organization.getUserDetailsDirectory().getUserDetailsList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole().toString().substring(20);
                ((DefaultTableModel) tblUserDetailss.getModel()).addRow(row);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUserAccount;
    private javax.swing.JComboBox comboBoxEmployee;
    private javax.swing.JComboBox comboBoxOrganiztion;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUserAccounts;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
