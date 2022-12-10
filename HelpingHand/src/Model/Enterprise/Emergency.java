/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.IncidentDepartmentAdmin;
import Model.Role.PoliceAdminRole;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Abhishek Sand
 */
public class Emergency extends Enterprise{
    public Emergency(String name) {
        super(name, EnterpriseType.Emergency);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new PoliceAdminRole());
        roles.add(new IncidentDepartmentAdmin());
         return roles;
    }
    
}
