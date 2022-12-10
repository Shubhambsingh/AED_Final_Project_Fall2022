/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PoliceDepartment;

/**
 *
 * @author Abhishek
 */
public class PoliceDepartment {
     private String policeType;
    private int unitCount;
/* pubic string name
        
        */
    public String getPoliceType() {
        return policeType;
    }

    public void setPoliceType(String policeType) {
        this.policeType = policeType;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }
    
    @Override
    public String toString() {
        return policeType;
    }
}
