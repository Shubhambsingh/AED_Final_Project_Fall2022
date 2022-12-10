/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.IncidentDepartment;
//
/**
 *
 * @author Abhishek Sand
 */
public class IncidentDepartment {
    private String fireDepartmentType;
    private int unitCount;

    public String getIncidentDepartmentType() {
        return fireDepartmentType;
    }

    public void setIncidentDepartmentType(String fireDepartmentType) {
        this.fireDepartmentType = fireDepartmentType;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }
    
    public String toString() {
        return fireDepartmentType;
    }
}
