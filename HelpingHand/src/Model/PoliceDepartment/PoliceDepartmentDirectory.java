/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PoliceDepartment;

import Model.BloodSupply.BloodSupply;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PoliceDepartmentDirectory {
     private ArrayList<PoliceDepartment> policeStationList;
     
     public PoliceDepartmentDirectory(){
     policeStationList = new ArrayList<PoliceDepartment>();
     }

    public ArrayList<PoliceDepartment> getPoliceDepartmentList() {
        return policeStationList;
    }

    public void setPoliceDepartmentList(ArrayList<PoliceDepartment> policeStationList) {
        this.policeStationList = policeStationList;
    }
    
    public PoliceDepartment addPolice() {
        PoliceDepartment police = new PoliceDepartment();
        policeStationList.add(police);
        return police;
    }
    
     public void removePolice(PoliceDepartment police) {
        policeStationList.remove(police);
    }
    
}
