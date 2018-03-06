/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sponsored.schools;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class DBManager {
    
    // Create Connnection
    private Connection conn;
    
    public DBManager(){
        try{
            String urlToDB = (new File("SponsoredSchools.accdb")).getAbsolutePath();
            
            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:ucanaccess://"+urlToDB);
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    /*
    Query Methods Below
    Sends queries to the DB
    Most of them request a return of some type
    */
    
    /**
     * General query statement
     * @param SQL
     * @return
     * @throws SQLException 
     */
    public ResultSet query( String SQL ) throws SQLException{
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);

        return rs;
    }
    
    /**
     * Gets all the schools stored in the database
     * @return School[]
     */
    public School[] getSchools() throws SQLException{
        School[] schools = new School[50];
        
        String SQL = "SELECT * FROM tblSchools";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        
        int c = 0;
        
        while(rs.next()){
                        
            int id = rs.getInt("SchoolID");
            String name = rs.getString("SchoolName");
            int sponsorID = rs.getInt("SponsorID");
            String email = rs.getString("ContactEmail");
            String numberOne = rs.getString("ContactNumberOne");
            String numberTwo = rs.getString("ContactNumberTwo");
            String location = rs.getString("Location");
            String dateStart = rs.getString("DateStart");
            String dateEnd = rs.getString("DateEnd");
            
            schools[c] = new School(id, name, sponsorID, email, numberOne, numberTwo, location, dateStart, dateEnd);
            c++;
        }        
        
        return schools;
    }
      
    public School[] getSchoolSpecific( String schoolName ) throws SQLException{
        
        School[] schools = new School[50];
        
        String SQL = "SELECT * FROM tblSchools WHERE SchoolName = '" + schoolName + "'";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        
        int c = 0;
        
        while(rs.next()){
            
            int id = rs.getInt("SchoolID");
            String name = rs.getString("SchoolName");
            int sponsorID = rs.getInt("SponsorID");
            String email = rs.getString("ContactEmail");
            String numberOne = rs.getString("ContactNumberOne");
            String numberTwo = rs.getString("ContactNumberTwo");
            String location = rs.getString("Location");
            String dateStart = rs.getString("DateStart");
            String dateEnd = rs.getString("DateEnd");
            
            schools[c] = new School(id, name, sponsorID, email, numberOne, numberTwo, location, dateStart, dateEnd);
            c++;            
        }
        
        return schools;
    }
    
    /**
     * Get all sponsor information
     * @return Sponsor[]
     * @throws SQLException 
     */
    public Sponsor[] getSponsors() throws SQLException{
        Sponsor[] sponsors = new Sponsor[50];
        
        String SQL = "SELECT * FROM tblSponsors";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        
        int c = 0;
        
        while(rs.next()){
            int id = rs.getInt("SponsorID");
            String name = rs.getString("SponsorName");
            String email = rs.getString("ContactEmail");
            String number = rs.getString("ContactNumber");
            String dateStart = rs.getString("DateStart");
            
            sponsors[c] = new Sponsor(id, name, email, number, dateStart);
            c++;
        }
        
        return sponsors;        
    }
       
    
    public Sponsor[] getSponsorsSpecific( int sponsID ) throws SQLException{
        Sponsor[] sponsors = new Sponsor[50];
        
        String SQL = "SELECT * FROM tblSponsors WHERE SponsorID = '" + sponsID + "'";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        
        int c = 0;
        
        while(rs.next()){
            int id = rs.getInt("SponsorID");
            String name = rs.getString("SponsorName");
            String email = rs.getString("ContactEmail");
            String number = rs.getString("ContactNumber");
            String dateStart = rs.getString("DateStart");
            
            sponsors[c] = new Sponsor(id, name, email, number, dateStart);
            c++;
        }
        
        return sponsors;        
    }
    
    /*
    Update Methods Below
    Sends requests to DB to update current records
    */   
    
    /**
     * @param SQL
     * @return
     * @throws SQLException 
     */
    public int update(String SQL) throws SQLException {
        
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate(SQL);
        return rs;        
    }
    
    public int updateRetunrID ( String SQL ) throws SQLException {
        
        Statement stmt = conn.createStatement();
        int id = -1;
        stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = stmt.getGeneratedKeys();
        
        if(rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }  
    
    
}
