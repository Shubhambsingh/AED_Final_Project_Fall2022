/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.IncidentDepartment;

//import Model.PoliceDepartment.PoliceDepartment;
import java.util.ArrayList;

/**
 **
 * @author Abhishek Sand
 */
public class IncidentDepartmentDirectory {
    private ArrayList<IncidentDepartment> fireDepartmentList;
     
     public IncidentDepartmentDirectory(){
     fireDepartmentList = new ArrayList<IncidentDepartment>();
     }

    public ArrayList<IncidentDepartment> getIncidentDepartmentList() {
        return fireDepartmentList;
    }

    public void setIncidentDepartmentList(ArrayList<IncidentDepartment> fireDepartmentList) {
        this.fireDepartmentList = fireDepartmentList;
    }
    
    public IncidentDepartment addIncidentDepartment() {
        IncidentDepartment fire = new IncidentDepartment();
        fireDepartmentList.add(fire);
        return fire;
    }
    
     public void removeIncidentDepartment(IncidentDepartment fire) {
        fireDepartmentList.remove(fire);
    }
}
