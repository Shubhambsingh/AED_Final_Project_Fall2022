/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author SejalChandak
 */
public class LocalityDonationRequest extends WorkRequest{
    private int noBloodPacketsRequired;
    private String location;
    private boolean add;
    private String requestedDate;
    private String requestedTime;
    private String purpose;
    private String requestedBloodType;

    public String getRequestedBloodType() {
        return requestedBloodType;
    }

    public void setRequestedBloodType(String requestedBloodType) {
        this.requestedBloodType = requestedBloodType;
    }

    public LocalityDonationRequest(){
        add = false;
    }

    public int getNoBloodPacketsRequired() {
        return noBloodPacketsRequired;
    }

    public void setNoBloodPacketsRequired(int noBloodPacketsRequired) {
        this.noBloodPacketsRequired = noBloodPacketsRequired;
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
