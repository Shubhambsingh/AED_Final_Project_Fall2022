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
import ui.HelpingHands.HelpingHandsAdminJPanel;

/**
 *
 * @author ShubhamSingh
 */
public class HelpingHandsAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserDetails userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new HelpingHandsAdminJPanel(userProcessContainer,userAccount,organization,enterprise, ecoSystem);
    }
    
}
