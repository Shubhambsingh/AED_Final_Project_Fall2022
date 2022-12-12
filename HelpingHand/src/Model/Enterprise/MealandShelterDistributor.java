/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.FSAdminRole;
import Model.Role.Role;
import java.util.HashSet;

/**
 *
 * @author ShubhamSingh
 */
public class MealandShelterDistributor extends Enterprise {

    public MealandShelterDistributor(String name) {
        super(name, EnterpriseType.FSDistributor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new FSAdminRole());

        return roles;
    }

}
