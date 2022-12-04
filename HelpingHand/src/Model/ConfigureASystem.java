/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Employee.Employee;
import Model.UserDetails.UserDetails;
import Model.Role.SystemAdminRole;
/**
 *
 * @author SejalChandak, ShubhamSingh
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("SYSTEM");
        
        UserDetails ua = system.getUserDetailsDirectory().createUserDetails("admin", "admin", employee, new SystemAdminRole());
        
        return system;
    }
}
