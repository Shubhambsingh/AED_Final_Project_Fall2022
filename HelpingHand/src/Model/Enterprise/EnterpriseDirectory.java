/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author SejalChandak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.HelpingHands){
            enterprise = new HelpingHandsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.NGO){
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Locality)
        {
            enterprise = new LocalityEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Donation){
             enterprise = new Donation(name);
            enterpriseList.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.FSDistributor){
             enterprise = new MealandShelterDistributor(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Emergency){
            enterprise = new Emergency(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
