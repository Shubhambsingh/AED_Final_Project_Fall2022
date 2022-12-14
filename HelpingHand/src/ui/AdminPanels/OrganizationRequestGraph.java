/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdminPanels;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author SejalChandak
 */
public class OrganizationRequestGraph extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationRequestGraph
     */
    JPanel rightSystemAdminPanel;
    EcoSystem ecosystem;
     JFreeChart barChart;

    public OrganizationRequestGraph(JPanel rightSystemAdminPanel, EcoSystem ecosystem) {
    initComponents();
    this.rightSystemAdminPanel = rightSystemAdminPanel;
    this.ecosystem = ecosystem;
    populateComboBox();
    populateBarGraph();
    //createDataBase();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanelMap = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Network: ");

        jPanelMap.setBackground(new java.awt.Color(198, 210, 198));
        jPanelMap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMap.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanelMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(606, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanelMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        populateBarGraph();
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    public void populateBarGraph()
    {
         barChart = ChartFactory.createBarChart(
         "Work Request Status Across Organization",           
         "Enterprises",            
         "Requests",            
         createDataBase(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
 
        ChartPanel chartPanel = new ChartPanel( barChart );   
        jPanelMap.removeAll();
        jPanelMap.add(chartPanel, BorderLayout.CENTER);
        jPanelMap.validate();
        
    }
    private  CategoryDataset createDataBase() {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
       
        Network network = (Network) networkJComboBox.getSelectedItem();

            //System.out.println("Network ->"+network);
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
            {
                HashMap<String, Integer> status = new HashMap<String, Integer>();
                    
                    for(WorkRequest wq : enterprise.getWorkQueue().getWorkRequestList())
                    {
                        
                        //System.out.println("qqq "+wq.getStatus());
                        if (status.containsKey(wq.getStatus()))
                                {
                                    status.put(wq.getStatus(), status.get(wq.getStatus())+1);
                                    
                                }
                        else{
                            status.put(wq.getStatus(), 1);
                        }
                    }
                    
                    for(Map.Entry<String,Integer> set: status.entrySet())
                        
                    {
                        System.out.println("Data to Plot-> "+set.getValue()+enterprise.getName()+set.getKey());
                        dataset.addValue(set.getValue(), enterprise.getName(), set.getKey());
                    }
                    

                
            }
            System.out.println("Dataset "+dataset);
            return dataset;
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelMap;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        for(Network network : ecosystem.getNetworkList())
        {
            networkJComboBox.addItem(network);
        }
        
    }
}
