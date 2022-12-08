/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class LocalityEnterprise extends Enterprise{

    public LocalityEnterprise(String name) {
        super(name, EnterpriseType.Locality);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}
