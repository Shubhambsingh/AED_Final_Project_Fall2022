/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author Abhishek Sand
 */
public class LocalityFireRequest extends WorkRequest{
    
    private boolean isAlert;
    private int noPeopleAffected;
    private String location;
    private boolean add;
    private int count;
    private String purpose;

    public int getNoPeopleAffected() {
        return noPeopleAffected;
    }

    public void setNoPeopleAffected(int noPeopleAffected) {
        this.noPeopleAffected = noPeopleAffected;
    }

    public String getArea() {
        return location;
    }

    public void setArea(String location) {
        this.location = location;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getIncidentDepartmentType() {
        return fireDepartmentType;
    }

    public void setIncidentDepartmentType(String fireDepartmentType) {
        this.fireDepartmentType = fireDepartmentType;
    }

    public int getIncidentDepartmentCount() {
        return fireDepartmentCount;
    }

    public void setIncidentDepartmentCount(int fireDepartmentCount) {
        this.fireDepartmentCount = fireDepartmentCount;
    }
    private String fireDepartmentType;
    private int fireDepartmentCount;

    public boolean isIsAlert() {
        return isAlert;
    }

    public void setIsAlert(boolean isAlert) {
        this.isAlert = isAlert;
    }
    
}
