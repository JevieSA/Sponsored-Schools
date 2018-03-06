/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sponsored.schools;

/**
 *
 * @author Temp
 */
public class School {

    private int id;
    private String name;
    private int sponsorID;
    private String email;
    private String cNumberOne;
    private String cNumberTwo;
    private String location;
    
    // To be revised to actual dates
    private String dateStart;
    private String dateEnd;

    public School() {
    }
    
    public School(int id, String name, int sponsorID, String email, String cNumberOne, String cNumberTwo, String location, String dateStart, String dateEnd) {
        this.id = id;
        this.name = name;
        this.sponsorID = sponsorID;
        this.email = email;
        this.cNumberOne = cNumberOne;
        this.cNumberTwo = cNumberTwo;
        this.location = location;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "School{" + "id=" + id + ", name=" + name + ", sponsorID=" + sponsorID + ", email=" + email + ", cNumberOne=" + cNumberOne + ", cNumberTwo=" + cNumberTwo + ", location=" + location + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + '}';
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSponsorID() {
        return sponsorID;
    }

    public String getEmail() {
        return email;
    }

    public String getcNumberOne() {
        return cNumberOne;
    }

    public String getcNumberTwo() {
        return cNumberTwo;
    }

    public String getLocation() {
        return location;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSponsorID(int sponsorID) {
        this.sponsorID = sponsorID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setcNumberOne(String cNumberOne) {
        this.cNumberOne = cNumberOne;
    }

    public void setcNumberTwo(String cNumberTwo) {
        this.cNumberTwo = cNumberTwo;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
    

    
    
}
