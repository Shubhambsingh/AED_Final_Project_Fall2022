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
import ui.MealandShelter.FSAdminJPanel;

/**
 *
 * @author ShubhamSingh
 */
public class FSAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new FSAdminJPanel(UserContainer,userAccount,organization,enterprise,system); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
    
}
