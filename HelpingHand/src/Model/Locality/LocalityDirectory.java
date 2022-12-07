/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Locality;

import java.util.ArrayList;
import Model.Locality.Locality;

/**
 *
 * @author Abhishek Sand
 */
public class LocalityDirectory {
    private ArrayList<Locality> communityList;
    public LocalityDirectory(){
        communityList = new ArrayList<Locality>();
    }

    public ArrayList<Locality> getLocalityList() {
        return communityList;
    }

    public void setLocalityList(ArrayList<Locality> communityList) {
        this.communityList = communityList;
    }
    
    
    public Locality addLocality(){
        Locality community = new Locality();
        communityList.add(community);
        return community;
    }
    
    public void removeLocality(Locality community){
        communityList.remove(community);
    }
    
}
