/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.BloodSupply;

/**
 *
 * @author SejalChandak
 */
public class BloodSupply {
    
    private String bloodGroupType;
    private int bloodPackets;
    private static int bCount = 1;
    private String bloodId;
    
    public BloodSupply(){
        bloodId= "Blood"+(++bCount);
    }

    public String getBloodGroupType() {
        return bloodGroupType;
    }

    public void setBloodGroupType(String bloodGroupType) {
        this.bloodGroupType = bloodGroupType;
    }

    public int getBloodPackets() {
        return bloodPackets;
    }

    public void setBloodPackets(int bloodPackets) {
        this.bloodPackets = bloodPackets;
    }

    public static int getbCount() {
        return bCount;
    }

    public static void setbCount(int bCount) {
        BloodSupply.bCount = bCount;
    }

    public String getBloodId() {
        return bloodId;
    }

    public void setBloodId(String bloodId) {
        this.bloodId = bloodId;
    }
    
    @Override
    public String toString() {
        return bloodGroupType;
    }
    
    
}
