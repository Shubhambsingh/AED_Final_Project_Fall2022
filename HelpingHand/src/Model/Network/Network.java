/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Network;
import Model.Enterprise.EnterpriseDirectory;
import Model.Area.AreaPoint;
import Model.Organization.Organization;
import Model.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author SejalChandak
 */
public class Network {
    private String name;
    private AreaPoint locationPoint;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
       
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public AreaPoint getAreaPoint() {
        return locationPoint;
    }

    public void setAreaPoint(AreaPoint locationPoint) {
        this.locationPoint = locationPoint;
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
