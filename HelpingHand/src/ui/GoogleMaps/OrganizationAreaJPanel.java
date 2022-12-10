/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.GoogleMaps;

import Model.Area.AreaPoint;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import ui.HelpingHands.SPManageOrganization;

/**
 *
 * @author ShubhamSingh
 */
public class OrganizationAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationAreaJPanel
     */
    
    JPanel userProcessContainer;
    AreaPoint locationPoint;
    Browser browser;
    
    public OrganizationAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        locationPoint = new AreaPoint();
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                        .licenseKey("6P830J66YBLTJWT5ASDNY5PPNPKHNB2KS4MCI0PINGED47OBZZ0CPOU9AW0I6WSRK149")
                        .build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        mapCanvas.add(view, "a");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        setAreaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mapCanvas = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(244, 242, 227));
        jPanel1.setForeground(new java.awt.Color(25, 56, 82));

        setAreaBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        setAreaBtn.setForeground(new java.awt.Color(25, 56, 82));
        setAreaBtn.setText("Set Area");
        setAreaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAreaBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/location 32x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(404, 404, 404)
                .addComponent(setAreaBtn)
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(setAreaBtn))
                .addGap(14, 14, 14))
        );

        jSplitPane1.setTopComponent(jPanel1);

        mapCanvas.setBackground(new java.awt.Color(255, 255, 255));
        mapCanvas.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(mapCanvas);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setAreaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAreaBtnActionPerformed
        // TODO add your handling code here:
        try {

            if (browser.url()!= null) {

                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                locationPoint.setLatitude(lat);
                locationPoint.setLongitude(lon);
            }
            System.out.println("Lat" + locationPoint.getLatitude() + locationPoint.getLongitude());

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof SPManageOrganization) {
                SPManageOrganization orgManagement = (SPManageOrganization) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            }else{
                System.out.println("ELSE LOCATION " + componentArray.length);
                System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
            }
         

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Position first");
        }
    }//GEN-LAST:event_setAreaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mapCanvas;
    private javax.swing.JButton setAreaBtn;
    // End of variables declaration//GEN-END:variables
}
