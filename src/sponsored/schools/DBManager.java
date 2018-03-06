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
    
    
    public ResultSet query( String SQL ) throws SQLException{
        
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);

        return result;
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
        int result = stmt.executeUpdate(SQL);
        return result;        
    }
    
    public int updateRetunrID ( String SQL ) throws SQLException {
        
        Statement stmt = conn.createStatement();
        int id = -1;
        stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
        
        ResultSet result = stmt.getGeneratedKeys();
        
        if(result.next()){
            id = result.getInt(1);
        }
        return id;
    }  
    
    
}
