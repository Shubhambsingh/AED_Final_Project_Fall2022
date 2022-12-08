/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HelpingHands.Shelter;

import java.util.ArrayList;

/**
 *
 * @author ShubhamSingh
 */
public class ShelterDirectory {
    
      private ArrayList<Shelter> shelterList;

    public ShelterDirectory() {
        this.shelterList = new ArrayList<>();
    }

    public ArrayList<Shelter> getShelterList() {
        return shelterList;
    }

    public void setShelterList(ArrayList<Shelter> shelterList) {
        this.shelterList = shelterList;
    }
    
       public Shelter addShelter() {
        Shelter shelter = new Shelter();
        shelterList.add(shelter);
        return shelter;
    }
    
    //Removing a MealType from the Directory
    public void removeMealType(Shelter shelter) {
        shelterList.remove(shelter);
    }
      
      
    
}
