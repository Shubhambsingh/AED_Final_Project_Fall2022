/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author Abhishek Sand
 */
public class LocalityMedicRequest extends WorkRequest{
    
    private int noMedicRequired;
    private int noPeopleAffected;

    public int getNoPeopleAffected() {
        return noPeopleAffected;
    }

    public void setNoPeopleAffected(int noPeopleAffected) {
        this.noPeopleAffected = noPeopleAffected;
    }
    private String location;
    private boolean add;
    private String requestedDate;
    private String requestedTime;
    private String purpose;
    private String doctorType;
    private String zip;

    public String getMedicType() {
        return doctorType;
    }

    public void setMedicType(String doctorType) {
        this.doctorType = doctorType;
    }
    
    public LocalityMedicRequest(){
        add = false;
    }

    public int getNoMedicRequired() {
        return noMedicRequired;
    }

    public void setNoMedicRequired(int noMedicRequired) {
        this.noMedicRequired = noMedicRequired;
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

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    
    
}
