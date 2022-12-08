/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Area.AreaPoint;
import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author SejalChandak
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganization(Type type, String name, AreaPoint locationPoint ){
        Organization organization = null;
        if (type.getValue().equals(Type.NGOOrganization.getValue())){
            organization = new NGOOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DonationOrganization.getValue())){
            organization = new DonationOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClinicOrganization.getValue())){
            organization = new ClinicOrganization(name);
             organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BloodOrganization.getValue())){
            organization = new BloodOrganization(name);
             organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.MealOrganization.getValue())){
            organization = new MealOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ShelterOrganization.getValue())){
            organization = new ShelterOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.EmergencyRequestOrganization.getValue())){
            organization = new EmergencyRequestOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.IncidentDepartmentOrganization.getValue())){
            organization = new IncidentDepartmentOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        
        } else if (type.getValue().equals(Type.PoliceOrganization.getValue())){
            organization = new PoliceOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.FSOrganization.getValue())){
            organization = new FSOrganization(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Locality.getValue())){
            organization = new Locality(name);
            organization.setAreaPoint(locationPoint);
            organizationList.add(organization);
        }

        
        return organization;
    }
}
