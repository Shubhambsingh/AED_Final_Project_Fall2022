/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class NGOOrganization extends Organization{

    public NGOOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
     public Type getType() {
        return Organization.Type.NGOOrganization;
    } 
    
}
