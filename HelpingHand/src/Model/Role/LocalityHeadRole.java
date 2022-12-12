/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.ClinicOrganization;
import Model.Organization.Organization;
import Model.UserDetails.UserDetails;
import javax.swing.JPanel;
import ui.Locality.LocalityAdminWorkAreaJPanel;



/**
 *
 * @author SejalChandak
 */
public class LocalityHeadRole extends Role {

//    public EndUserAdminRole() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
     public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new LocalityAdminWorkAreaJPanel(UserContainer,userAccount,enterprise,system);
    }
    
  
  
    
    
}
