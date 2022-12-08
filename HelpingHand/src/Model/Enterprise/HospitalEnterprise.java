/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.BloodSupplyAdminRole;
import Model.Role.ClinicAdminRole;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author SejalChandak
 */
public class HospitalEnterprise  extends Enterprise{

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles.add(new ClinicAdminRole());
         roles.add(new BloodSupplyAdminRole());
         return roles;
    }
    
}
