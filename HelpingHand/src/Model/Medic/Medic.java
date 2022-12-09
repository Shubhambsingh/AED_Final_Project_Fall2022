/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Medic;

import Model.Organization.ClinicOrganization;

/**
 *
 * @author Abhishek Sand
 */
public class Medic {
    
    private String doctorType;
    private String doctorId;
    private static int docCount;
    private int quantity;
 public Medic(){
        doctorId= "DOC"+(++docCount);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public String getDocName() {
        return doctorType;
    }

    public void setDocName(String doctorType) {
        this.doctorType = doctorType;
    }

    public String getMedicId() {
        return doctorId;
    } 
    
    @Override
    public String toString(){
        return doctorType;
    }
    
}
