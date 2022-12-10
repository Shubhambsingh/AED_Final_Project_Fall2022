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
import ui.Medic.MedicWorkAreaJPanel;

//import userinterface.Hospital.Clinic.Pharmacy.MedicJPanel;

/**
 *
 * @author SejalChandak
 */
public class MedicAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new MedicWorkAreaJPanel(UserContainer,userAccount,organization,enterprise,system);
    }
    
}
