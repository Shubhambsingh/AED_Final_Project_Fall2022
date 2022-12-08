package Model.HelpingHands.Shelter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ShubhamSingh
 */
public class Shelter {
    
    private String shelterName;
    private String shelterId;
    private int capacity;
    private String location;
    private static int sCount;

    public Shelter() {
        
        shelterId= "Shelter"+" "+(++sCount);
    }

    public String getArea() {
        return location;
    }

    public void setArea(String location) {
        this.location = location;
    }

  
    
    

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public String getShelterId() {
        return shelterId;
    }

    public void setShelterId(String shelterId) {
        this.shelterId = shelterId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getsCount() {
        return sCount;
    }

    public static void setsCount(int sCount) {
        Shelter.sCount = sCount;
    }
    
    
    
}
