/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.BloodSupply.BloodSupplyDirectory;
import Model.Organization.Organization;
import Model.UserDetails.UserDetails;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Locality.LocalityDirectory;
import java.util.ArrayList;
import java.util.HashSet;
import Model.Medic.MedicDirectory;
import Model.Medic.Medic;
import Model.IncidentDepartment.IncidentDepartmentDirectory;
import Model.MealandShelterDistributor.MealDirectory;
import Model.PoliceDepartment.PoliceDepartmentDirectory;
import Model.Area.AreaPoint;
import Model.Role.BloodSupplyAdminRole;
import Model.Role.ClinicAdminRole;
import Model.Role.DonationAdminRole;
import Model.Role.IncidentDepartmentAdmin;
import Model.Role.HospitalAdminRole;
import Model.Role.PoliceAdminRole;
import Model.HelpingHands.Meal.MealInventory;
import Model.HelpingHands.Shelter.ShelterDirectory;

/**
 *
 * @author SejalChandak
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;
    private MealDirectory foodDirectory;
    private MealInventory foodInventory;
     private ShelterDirectory shelterDirectory;

    private PoliceDepartmentDirectory policeStationList;
    private IncidentDepartmentDirectory fireDepartmentDirectory;

      private AreaPoint locationPoint;

    public AreaPoint getAreaPoint() {
        return locationPoint;
    }

    public void setAreaPoint(AreaPoint locationPoint) {
        this.locationPoint = locationPoint;
    }
      
      

    public ShelterDirectory getShelterDirectory() {
        return shelterDirectory;
    }

    public void setShelterDirectory(ShelterDirectory shelterDirectory) {
        this.shelterDirectory = shelterDirectory;
    }
     
     

    public MealInventory getMealInventory() {
        return foodInventory;
    }

    public void setMealInventory(MealInventory foodInventory) {
        this.foodInventory = foodInventory;
    }
    

    public MealDirectory getMealDirectory() {
        return foodDirectory;
    }

    public void setMealDirectory(MealDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }
    
    private LocalityDirectory communityList;


    private MedicDirectory doctorDirectoryList;
    private BloodSupplyDirectory bloodDirectory;

    public BloodSupplyDirectory getBloodDirectory() {
        return bloodDirectory;
    }

    public PoliceDepartmentDirectory getPoliceDepartmentList() {
        return policeStationList;
    }

    public void setPoliceDepartmentList(PoliceDepartmentDirectory policeStationList) {
        this.policeStationList = policeStationList;
    }

    public void setBloodDirectory(BloodSupplyDirectory bloodDirectory) {
        this.bloodDirectory = bloodDirectory;
    }
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        this.doctorDirectoryList = new MedicDirectory();
        this.communityList = new LocalityDirectory();
        this.bloodDirectory = new BloodSupplyDirectory();
        this.foodDirectory = new MealDirectory();
        this.foodInventory = new MealInventory();
        this.shelterDirectory = new ShelterDirectory();
        this.policeStationList = new PoliceDepartmentDirectory();
        this.fireDepartmentDirectory = new IncidentDepartmentDirectory();
    }

    public IncidentDepartmentDirectory getIncidentDepartmentDirectory() {
        return fireDepartmentDirectory;
    }

    public void setIncidentDepartmentDirectory(IncidentDepartmentDirectory fireDepartmentDirectory) {
        this.fireDepartmentDirectory = fireDepartmentDirectory;
    }

      public LocalityDirectory getLocalityList() {
        return communityList;
    }

    public void setLocalityList(LocalityDirectory communityList) {
        this.communityList = communityList;
    }

    public MedicDirectory getMedicList() {
        return doctorDirectoryList;
    }

    public void setMedicList(MedicDirectory doctorDirectoryList) {
        this.doctorDirectoryList = doctorDirectoryList;
    }

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system) {
        ecosystem = system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new HospitalAdminRole());
        roles.add(new ClinicAdminRole());
        roles.add(new BloodSupplyAdminRole());
        roles.add(new DonationAdminRole());
        roles.add(new PoliceAdminRole());
        roles.add(new IncidentDepartmentAdmin());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        //  if (!this.getUserDetailsDirectory().checkIfUsernameIsUnique(username)) {
        for (Network network : ecosystem.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (UserDetails ua : enterprise.getUserDetailsDirectory().getUserDetailsList()) {
                    if (ua.getNameuser().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserDetails ua : organization.getUserDetailsDirectory().getUserDetailsList()) {
                        if (ua.getNameuser().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        //  }
        return true;
    }

}
