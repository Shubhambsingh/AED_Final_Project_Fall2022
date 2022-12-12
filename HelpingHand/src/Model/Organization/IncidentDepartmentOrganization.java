/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.IncidentDepartmentAdmin;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Abhishek
 */
public class IncidentDepartmentOrganization extends Organization{

    public IncidentDepartmentOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new IncidentDepartmentAdmin() );
        return roles;
     
            }
     @Override
     public Type getType() {
        return Organization.Type.IncidentDepartmentOrganization;
    } 
    
}
