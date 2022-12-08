/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import Model.Role.NGOAdminRole;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class NGOEnterprise extends Enterprise{

    public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new NGOAdminRole());
        return roles;
    }
    
}
