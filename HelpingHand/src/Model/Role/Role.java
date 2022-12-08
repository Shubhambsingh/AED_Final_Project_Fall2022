/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserDetails.UserDetails;
import java.awt.Component;

import javax.swing.JPanel;
/**
 *
 * @author SejalChandak
 */
public abstract class Role {

  

    
        public enum RoleType {
        SystemAdmin("System Admin"),
        NGOAdminRole("NGO Admin Role"),
        MedicAdminRole("Medic Admin Role"),
        ClinicAdminRole("Clinic Admin Role"),
        BloodSupplyAdminRole("Blood Bank Admin Role"),
        DonationAdminRole("Donation Admin Role"),
        EmergencyAdminRole("Emergency Admin Role"),
        HelpingHandsAdminRole("Service Provider Admin Role"),
        LocalityHeadRole("Locality Head Role"),
        HospitalAdminRole("Hospital Admin Role"),
        MealAdminRole("Meal Organization Admin Role"),
        ShelterAdminRole("Shelter Organization Admin Role"),
        FSAdminRole("Meal and Shelter Admin Role");

        

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public RoleType type;

        public abstract JPanel createWorkArea(JPanel UserContainer, 
            UserDetails userAccount, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system);


    @Override
    public String toString() {
        return this.getClass().toString();
    }
    
  
    
}
