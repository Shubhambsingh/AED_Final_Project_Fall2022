/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.MealAdminRole;
import Model.Role.Role;
import Model.Role.ShelterAdminRole;
import java.util.HashSet;

/**
 *
 * @author ShubhamSingh
 */
public class ShelterOrganization extends Organization {

    public ShelterOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        
    roles.add(new ShelterAdminRole());
        return roles;
    }
    
      @Override
     public Type getType() {
        return Organization.Type.ShelterOrganization;
    } 
    
}
