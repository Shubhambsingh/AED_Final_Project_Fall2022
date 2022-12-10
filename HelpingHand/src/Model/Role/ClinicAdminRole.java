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
import ui.Hospital.Clinic.ClinicAdminWorkAreaJPanel;

/**
 *
 * @author SejalChandak
 */
public class ClinicAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ClinicAdminWorkAreaJPanel(UserContainer,userAccount,(ClinicOrganization) organization,enterprise,system);
    }
    
}
