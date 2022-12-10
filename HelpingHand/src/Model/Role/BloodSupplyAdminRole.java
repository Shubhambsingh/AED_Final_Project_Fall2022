/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.BloodOrganization;
import Model.Organization.Organization;
import Model.UserDetails.UserDetails;
import javax.swing.JPanel;
import ui.Hospital.BloodSupply.BloodSupplyWorkAreaJPanel;
import ui.Hospital.HospitalAdminWorkAreaJPanel;
/**
 *
 * @author SejalChandak
 */
public class BloodSupplyAdminRole extends Role{
    

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new BloodSupplyWorkAreaJPanel(UserContainer,userAccount,(BloodOrganization) organization,enterprise,system); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
