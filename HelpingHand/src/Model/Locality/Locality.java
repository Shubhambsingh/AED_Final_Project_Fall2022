/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Locality;

/**
 *
 * @author Abhishek Sand
 */
public class Locality {
    private int communityMemberCount;
    private String communityName;

    public String getLocalityName() {
        return communityName;
    }

    public void setLocalityName(String communityName) {
        this.communityName = communityName;
    }

    public int getLocalityMemberCount() {
        return communityMemberCount;
    }

    public void setLocalityMemberCount(int communityMemberCount) {
        this.communityMemberCount = communityMemberCount;
    }
    
}
