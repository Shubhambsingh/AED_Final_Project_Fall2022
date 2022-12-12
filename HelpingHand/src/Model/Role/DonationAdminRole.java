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
import ui.Donation.DonationWorkAreaJPanel;

/**
 *
 * @author Abhishek Sand
 */
public class DonationAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
         return new DonationWorkAreaJPanel(UserContainer, enterprise, ecoSystem, userAccount);
    }

    
}
