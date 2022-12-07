/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.BloodSupplyAdminRole;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class Locality extends Organization{

    public Locality(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new BloodSupplyAdminRole());
        return roles;
    }
     @Override
     public Type getType() {
        return Organization.Type.Locality;
    } 
    
}
