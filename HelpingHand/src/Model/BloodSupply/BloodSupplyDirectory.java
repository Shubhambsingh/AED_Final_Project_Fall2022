/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.BloodSupply;

import java.util.ArrayList;

/**
 *
 * @author SejalChandak
 */
public class BloodSupplyDirectory {
    private ArrayList<BloodSupply> bloodBankList;

    public BloodSupplyDirectory() {
        bloodBankList = new ArrayList<>();
    }

    public ArrayList<BloodSupply> getBloodSupplyList() {
        return bloodBankList;
    }

    public void setBloodSupplyList(ArrayList<BloodSupply> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }
    
    public BloodSupply addBlood() {
        BloodSupply blood = new BloodSupply();
        bloodBankList.add(blood);
        return blood;
    }
    
    //Removing an Employee from the Directory
    public void removeBlood(BloodSupply blood) {
        bloodBankList.remove(blood);
    }
    
    
    
}
