/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;


import Model.EcoSystem;
import Model.Organization.Organization;

import Model.Enterprise.Enterprise;
import Model.UserDetails.UserDetails;

import javax.swing.JPanel;
import ui.AdminPanels.SystemAdminWorkAreaJPanel;
/**
 *
 * @author SejalChandak
 */
public class SystemAdminRole  extends Role{
    
//        public SystemAdminRole(){
//        this.type = RoleType.SystemAdmin;
//    }


    @Override

    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new SystemAdminWorkAreaJPanel(UserContainer,ecoSystem);
    }
        

    
}
