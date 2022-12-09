/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserDetails;

import Model.Employee.Employee;
import Model.Role.Role;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author Abhishek Sand
 */
public class UserDetails {
        
    private String nameuser;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    public UserDetails() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return nameuser;
    }
    
}
