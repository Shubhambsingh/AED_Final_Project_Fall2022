/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserDetails.UserDetails;
import javax.swing.JPanel;
import ui.Emergency.PoliceDepartment.PoliceAdminRoleWorkAreaJPanel;

/**
 *
 * @author Abhishek Sand
 */
public class PoliceAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return new PoliceAdminRoleWorkAreaJPanel(UserContainer, userAccount, organization, enterprise, system);
    
    }
    
}
