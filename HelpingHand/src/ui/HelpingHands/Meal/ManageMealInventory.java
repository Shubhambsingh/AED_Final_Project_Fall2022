/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HelpingHands.Meal;

import Model.MealandShelterDistributor.Meal;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Organization.OrganizationDirectory;
import Model.UserDetails.UserDetails;
import Model.Utils.HeaderColors;
import Model.WorkQueue.LocalityMealRequest;
import Model.WorkQueue.MealOrgWorkQueue;
import Model.WorkQueue.MealOrgWorkRequest;
import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ShubhamSingh
 */
public class ManageMealInventory extends javax.swing.JPanel {

    /**
     * Creates new form ManageMealInventory
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserDetails userAccount;
    OrganizationDirectory organizationDirectory;
    private int quantity = 0;
    private String selectedMealType;
    private double totalPrice = 0;
    
    public ManageMealInventory(JPanel userProcessContainer,
   Enterprise enterprise,
   EcoSystem ecoSystem,
   UserDetails userAccount,
   OrganizationDirectory organizationDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        jAvaMealTable1.getTableHeader().setDefaultRenderer(new HeaderColors());
        jAvaMealTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        
        
        populateMealTypeComboBox();
        fillTheRequestedTable();
         populateMealInventory();
    }

    
   private void populateMealTypeComboBox() {
        jComboBoxMealType.removeAllItems();

        for (Meal food : ecoSystem.getMealDirectory().getMealList()) {
            jComboBoxMealType.addItem(food.getMealType());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jAvaMealTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMealType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTxtMealQnty = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAvaMealTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FOOD INVENTORY");

        jAvaMealTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Food Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jAvaMealTable);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Food Packets/ Quantity Available ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Buy Food From FS Distributor");

        jLabel4.setText("Food Type:");

        jComboBoxMealType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMealType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMealTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity:");

        jTxtMealQnty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMealQntyActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Buy Food");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jAvaMealTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Food Type", "Quantity", "Total Price", "Request Date", "Resolved Date", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jAvaMealTable1);
        if (jAvaMealTable1.getColumnModel().getColumnCount() > 0) {
            jAvaMealTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        backJButton.setBackground(new java.awt.Color(102, 217, 255));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fs1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxMealType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtMealQnty))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6)
                                .addGap(0, 57, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBoxMealType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTxtMealQnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMealTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMealTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMealTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if ("".equals(jTxtMealQnty.getText())) {
                JOptionPane.showMessageDialog(null, "Enter the quantity!");
            } else {
                quantity = Integer.parseInt(jTxtMealQnty.getText());
                selectedMealType = jComboBoxMealType.getSelectedItem().toString();
                MealOrgWorkRequest foodOrgWorkRequest = new MealOrgWorkRequest(selectedMealType, quantity);
                calculateTotalPrice();
                foodOrgWorkRequest.setTotalPrice(totalPrice);
                foodOrgWorkRequest.setRequestDate(new Date());
                foodOrgWorkRequest.setStatus("Requested");
                foodOrgWorkRequest.setSender(userAccount);
                ecoSystem.getWorkQueue().getWorkRequestList().add(foodOrgWorkRequest);
                resetFields();
                fillTheRequestedTable();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantity should be integer value!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

       public void resetFields() {
        jTxtMealQnty.setText("");
       
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jTxtMealQntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMealQntyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMealQntyActionPerformed

    private void fillTheRequestedTable() {
        DefaultTableModel model = (DefaultTableModel) jAvaMealTable1.getModel();
        model.setRowCount(0);
        
        for(WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(work instanceof MealOrgWorkRequest){
                Object[] row = new Object[7];
                row[0] = ((MealOrgWorkRequest) work).getMealReqId() ;
                row[3] = ((MealOrgWorkRequest) work).getRequestDate() ;
                row[1] = ((MealOrgWorkRequest) work).getMealType() ;
                row[2] = ((MealOrgWorkRequest) work).getQuantity() ;
                row[6] = work;
                row[5] = ((MealOrgWorkRequest) work).getResolveDate() ;
                row[4] = ((MealOrgWorkRequest) work).getRequestDate();
                model.addRow(row);
            
            }
        }

//        for (int i = 0; i < ecoSystem.getWorkQueue().getWorkRequestList().size(); i++) {
//            MealOrgWorkRequest work = (MealOrgWorkRequest) ecoSystem.getWorkQueue().getWorkRequestList().get(i);
//            Object[] row = new Object[7];
//            row[0] = work.getMealReqId();
//            row[1] = work.getMealType();
//            row[2] = work.getQuantity();
//            row[3] = work.getTotalPrice();
//            row[4] = work.getRequestDate();
//            row[5] = work.getResolveDate();
//            row[6] = work;
//            table.addRow(row);
//        }
    }

    private void calculateTotalPrice() {
        for (Meal food : ecoSystem.getMealDirectory().getMealList()) {
            if (selectedMealType.equals(food.getMealType())) {
                totalPrice = quantity * food.getPrice();
            }
        }
    }

    private void updateMealInventory() {
        boolean flag = false;
        for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()) {
//            MealOrgWorkRequest work = (MealOrgWorkRequest) ecoSystem.getWorkQueue().getWorkRequestList().get(i);

             if(work instanceof MealOrgWorkRequest){
              if (work.getStatus().equals("Approved")) {
                System.out.println("Approved 1");
                for (Meal f : ecoSystem.getMealInventory().getMealInventory()) {
                    if (f.getMealType().equals(((MealOrgWorkRequest) work).getMealType())) {
                        f.setQuantity(f.getQuantity() + ((MealOrgWorkRequest) work).getQuantity());
                        work.setStatus("Processed");
                        flag = true;
                    }
                }
                if (!flag) {
                    Meal food = new Meal();
                    food.setMealType(((MealOrgWorkRequest) work).getMealType());
                    food.setQuantity(((MealOrgWorkRequest) work).getQuantity());
                    work.setStatus("Processed");
                    ecoSystem.getMealInventory().getMealInventory().add(food);
                }
            }
             }
           

        }
    }
    
    public void populateMealInventory() {
        System.out.println("ui.HelpingHands.Meal.ManageMealInventory.populateMealInventory()");
        updateMealInventory();
        DefaultTableModel table = (DefaultTableModel) jAvaMealTable.getModel();
        table.setRowCount(0);

        for (int i = 0; i < ecoSystem.getMealInventory().getMealInventory().size(); i++) {
            Meal food = ecoSystem.getMealInventory().getMealInventory().get(i);
            Object[] row = new Object[3];
            row[0] = food;
            row[1] = food.getMealType();
            row[2] = food.getQuantity();
            table.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable jAvaMealTable;
    private javax.swing.JTable jAvaMealTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxMealType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtMealQnty;
    // End of variables declaration//GEN-END:variables
}