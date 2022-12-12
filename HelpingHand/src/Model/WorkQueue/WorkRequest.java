/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;
import Model.BloodSupply.BloodSupply;
import Model.Medic.Medic;
import Model.UserDetails.UserDetails;
import java.util.Date;
/**
 *
 * @author Abhishek Sand
 */
public abstract class WorkRequest {
    
    private String message;
    private UserDetails sender;
    private UserDetails receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Medic doctor;
    private BloodSupply bloodType;
    private String zipCode;
    

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public BloodSupply getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodSupply bloodType) {
        this.bloodType = bloodType;
    }

    public Medic getMedic() {
        return doctor;
    }

    public void setMedic(Medic doctor) {
        this.doctor = doctor;
    }
    

    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserDetails getSender() {
        return sender;
    }

    public void setSender(UserDetails sender) {
        this.sender = sender;
    }

    public UserDetails getReceiver() {
        return receiver;
    }

    public void setReceiver(UserDetails receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    
    public String toString(){
        return this.status;
    }
    
}
