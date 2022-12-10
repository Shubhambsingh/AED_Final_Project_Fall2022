/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import java.util.HashSet;
import Model.Role.MedicAdminRole;

/**
 *
 * @author SejalChandak
 */
/*
string test
*/
public class ClinicOrganization extends Organization{

    public ClinicOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new MedicAdminRole() );
        return roles;
     
            }
     @Override
     public Type getType() {
        return Organization.Type.ClinicOrganization;
    } 
    
}
