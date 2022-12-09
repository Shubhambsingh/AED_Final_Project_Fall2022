/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Medic;

import Model.Medic.Medic;
import java.util.ArrayList;

/**
 *
 * @author Abhishek Sand
 */
public class MedicDirectory {
        private ArrayList<Medic> doctorTypeList;
        
          
     public MedicDirectory(){
         System.out.println("Inside Medic Directory");
        doctorTypeList= new ArrayList<>();
                
    }

    public ArrayList<Medic> getMedicList() {
        return this.doctorTypeList;
        
    }

    public void setMedicList(ArrayList<Medic> doctorTypeList) {
        this.doctorTypeList = doctorTypeList;
    }
  
     
    public Medic addMedic() {
        Medic doctor = new Medic();
        doctorTypeList.add(doctor);
        return doctor;
    }
    
    //Removing an Employee from the Directory
    public void removeMedic(Medic doctor) {
        doctorTypeList.remove(doctor);
    }
    
}
