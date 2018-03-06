/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sponsored.schools;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Temp
 */
public class SponsoredSchools {

    static DBManager db = new DBManager();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SchoolInfoForm schoolFrame = new SchoolInfoForm();
        
        schoolFrame.show();
    }
    
}
