/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.IncidentDepartmentAdmin;
import Model.Role.PoliceAdminRole;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class PoliceOrganization extends Organization {

//    @Override
//    public HashSet<Role> getSupportedRole() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    public PoliceOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new PoliceAdminRole() );
        return roles;
     
            }
     @Override
     public Type getType() {
        return Organization.Type.PoliceOrganization;
    } 
    
}
