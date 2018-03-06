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
public class Sponsor {
    private int id;
    private String name;
    private String email;
    private String cNumber;
    
    // To be revised to actual date type
    private String dateStart;

    public Sponsor() {
    }
    
    public Sponsor(int id, String name, String email, String cNumber, String dateStart) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cNumber = cNumber;
        this.dateStart = dateStart;
    }

    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getcNumber() {
        return cNumber;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }
    
    
    
}
