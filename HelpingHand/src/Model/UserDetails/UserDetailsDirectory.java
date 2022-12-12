/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserDetails;

import Model.Employee.Employee;
import java.util.ArrayList;
import Model.Role.Role;

/**
 *
 * @author Abhishek Sand
 */
public class UserDetailsDirectory {
    private ArrayList<UserDetails> userAccountList;

    public UserDetailsDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserDetails> getUserDetailsList() {
        return userAccountList;
    }
    
    public UserDetails authenticateUser(String username, String password){
        
        for (UserDetails ua : userAccountList)
            if (ua.getNameuser().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        
        return null;
    }
    
    public UserDetails createUserDetails(String username, String password, Employee employee, Role role){
        UserDetails userAccount = new UserDetails();
        userAccount.setNameuser(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserDetails ua : userAccountList){
            if (ua.getNameuser().equals(username))
                return false;
        }
        return true;
    }
    
}
