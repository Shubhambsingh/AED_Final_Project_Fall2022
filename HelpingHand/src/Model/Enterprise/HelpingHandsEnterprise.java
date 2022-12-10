/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.MealAdminRole;
import Model.Role.Role;
import Model.Role.HelpingHandsAdminRole;
import Model.Role.ShelterAdminRole;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class HelpingHandsEnterprise extends Enterprise{

    public HelpingHandsEnterprise(String name) {
        super(name, EnterpriseType.HelpingHands);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles.add(new MealAdminRole());
         roles.add(new ShelterAdminRole());
         roles.add(new HelpingHandsAdminRole());
         return roles;
    }


    
}
