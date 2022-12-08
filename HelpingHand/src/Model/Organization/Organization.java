/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Employee.EmployeeDirectory;
import Model.Role.Role;
import Model.UserDetails.UserDetailsDirectory;
import Model.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashSet;
import Model.Employee.Employee;
import Model.Area.AreaPoint;
/**
 *
 * @author SejalChandak
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserDetailsDirectory userAccountDirectory;
    private int organizationID;
    private Employee employee;
    private Role role;
    private AreaPoint locationPoint;
    private double nearestAreaPoint;
    private Type type;

    public AreaPoint getAreaPoint() {
        return locationPoint;
    }

    public void setAreaPoint(AreaPoint locationPoint) {
        this.locationPoint = locationPoint;
    }

    public double getNearestAreaPoint() {
        return nearestAreaPoint;
    }

    public void setNearestAreaPoint(double nearestAreaPoint) {
        this.nearestAreaPoint = nearestAreaPoint;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    

    public Role getRole() {
        return role;
    }

    public Employee getEmployee() {
        return employee;
    }
    private static int counter=0;
    public HashSet<Role> roles;
    
    
    public enum Type{
        NGOOrganization("NGO Organization"),
        DonationOrganization("Donation Organization"),
        FSOrganization("FS Organization"),
        BloodOrganization("Blood Organization"),
        ClinicOrganization("Clinic Organization"),
        MealOrganization("Meal Organization"),
        ShelterOrganization("Shelter Organization"),
        EmergencyRequestOrganization("Emergency Request Organization"),
        PoliceOrganization("Police Organization"),
        IncidentDepartmentOrganization("Fire Department Organization"),
        Locality("Locality");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserDetailsDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();
    
    public UserDetailsDirectory getUserDetailsDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
