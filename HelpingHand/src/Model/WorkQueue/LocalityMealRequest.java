/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author Abhishek
 */
public class LocalityMealRequest extends WorkRequest{
    private int noPeopleRequestingMeal;
    private String location;
    private String purpose;
    private String requestedMealType;
    private int noOfPackets;

    public int getNoOfPackets() {
        return noOfPackets;
    }

    public void setNoOfPackets(int noOfPackets) {
        this.noOfPackets = noOfPackets;
    }

    public int getNoPeopleRequestingMeal() {
        return noPeopleRequestingMeal;
    }

    public void setNoPeopleRequestingMeal(int noPeopleRequestingMeal) {
        this.noPeopleRequestingMeal = noPeopleRequestingMeal;
    }

    public String getArea() {
        return location;
    }

    public void setArea(String location) {
        this.location = location;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRequestedMealType() {
        return requestedMealType;
    }

    public void setRequestedMealType(String requestedMealType) {
        this.requestedMealType = requestedMealType;
    }
    
}
