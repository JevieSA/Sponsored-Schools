/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sponsored.schools;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Temp
 */
public class SchoolInfoForm extends javax.swing.JFrame {

    public DBManager db = new DBManager();
    
    public SchoolInfoForm( String schoolName ){
        initComponents();
        
        try{
        School[] school = db.getSchoolSpecific(schoolName);
        Sponsor[] sponsor = db.getSponsorsSpecific(school[0].getSponsorID());
        
        // Display school information
        lblSchoolName.setText(school[0].getName());
        lblSchoolContactEmail.setText(school[0].getEmail());
        lblSchoolContactPhoneNumberOne.setText(school[0].getcNumberOne());
        lblSchoolContactNumberTwo.setText(school[0].getcNumberTwo());
        lblSchoolLocation.setText(school[0].getLocation());
        lblSchoolDateStart.setText(school[0].getDateStart());
        lblSchoolDateEnd.setText(school[0].getDateEnd());        
        
        // Diplay sponsor information
        lblSponsorName.setText(sponsor[0].getName());
        lblSponsorContactEmail.setText(sponsor[0].getEmail());
        lblSponsorContactNumber.setText(sponsor[0].getcNumber());
        lblSponsorDateStart.setText(sponsor[0].getDateStart());
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "School Info Frame Error: " + e);
            e.printStackTrace();
        }
    }
    
    /**
     * Creates new form SchoolInfoForm
     */
    public SchoolInfoForm() {
        initComponents();
        
        DBManager db = new DBManager();
        
        try{
        School[] schools = db.getSchools();
        
        String out = "";
        
        for (int i = 0 ; i < schools.length ; i++){
            if(schools[i]!=null)
            out += schools[i].toString()+"\n";
            
        }
        
        JOptionPane.showMessageDialog(this, out);
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSchoolNameFixed = new javax.swing.JLabel();
        lblSchoolContactEmailFixed = new javax.swing.JLabel();
        lblSchoolPhoneNumberOneFixed = new javax.swing.JLabel();
        lblSchoolPhoneNumberTwoFixed = new javax.swing.JLabel();
        lblSchoolLocationFixed = new javax.swing.JLabel();
        lblSchoolDateStartFixed = new javax.swing.JLabel();
        lblSchoolDateEndFixed = new javax.swing.JLabel();
        lblSchoolName = new javax.swing.JLabel();
        lblSchoolContactEmail = new javax.swing.JLabel();
        lblSchoolContactPhoneNumberOne = new javax.swing.JLabel();
        lblSchoolContactNumberTwo = new javax.swing.JLabel();
        lblSchoolLocation = new javax.swing.JLabel();
        lblSchoolDateStart = new javax.swing.JLabel();
        lblSchoolDateEnd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSponsorNameFixed = new javax.swing.JLabel();
        lblSponsorDateStartFixed = new javax.swing.JLabel();
        lblSponsorContactEmailFixed = new javax.swing.JLabel();
        lblSponsorContactNumberFixed = new javax.swing.JLabel();
        lblSponsorName = new javax.swing.JLabel();
        lblSponsorDateStart = new javax.swing.JLabel();
        lblSponsorContactEmail = new javax.swing.JLabel();
        lblSponsorContactNumber = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSchoolInformation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniAddSchool = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSchoolNameFixed.setText("School Name:");

        lblSchoolContactEmailFixed.setText("Contact Email:");

        lblSchoolPhoneNumberOneFixed.setText("Contact number:");

        lblSchoolPhoneNumberTwoFixed.setText("Alternate Number:");

        lblSchoolLocationFixed.setText("Location:");

        lblSchoolDateStartFixed.setText("Date Started:");

        lblSchoolDateEndFixed.setText("Date End:");

        lblSchoolName.setText("n/a");

        lblSchoolContactEmail.setText("n/a");

        lblSchoolContactPhoneNumberOne.setText("n/a");

        lblSchoolContactNumberTwo.setText("n/a");

        lblSchoolLocation.setText("n/a");

        lblSchoolDateStart.setText("n/a");

        lblSchoolDateEnd.setText("n/a");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSchoolDateEndFixed)
                        .addGap(81, 81, 81)
                        .addComponent(lblSchoolDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSchoolDateStartFixed)
                        .addGap(60, 60, 60)
                        .addComponent(lblSchoolDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchoolNameFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSchoolContactEmailFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSchoolPhoneNumberOneFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchoolContactPhoneNumberOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSchoolContactEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSchoolName, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchoolLocationFixed)
                            .addComponent(lblSchoolPhoneNumberTwoFixed))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchoolContactNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSchoolLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolNameFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSchoolName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolContactEmailFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSchoolContactEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolPhoneNumberOneFixed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSchoolContactPhoneNumberOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolPhoneNumberTwoFixed)
                    .addComponent(lblSchoolContactNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolLocationFixed)
                    .addComponent(lblSchoolLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolDateStartFixed)
                    .addComponent(lblSchoolDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolDateEndFixed)
                    .addComponent(lblSchoolDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblSponsorNameFixed.setText("Sponsor Name:");

        lblSponsorDateStartFixed.setText("Date Started:");

        lblSponsorContactEmailFixed.setText("Contact Email:");

        lblSponsorContactNumberFixed.setText("Contact Number:");

        lblSponsorName.setText("n/a");

        lblSponsorDateStart.setText("n/a");

        lblSponsorContactEmail.setText("n/a");

        lblSponsorContactNumber.setText("n/a");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSponsorNameFixed)
                    .addComponent(lblSponsorDateStartFixed)
                    .addComponent(lblSponsorContactEmailFixed)
                    .addComponent(lblSponsorContactNumberFixed))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSponsorContactEmail)
                        .addComponent(lblSponsorName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSponsorDateStart, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblSponsorContactNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSponsorNameFixed)
                    .addComponent(lblSponsorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSponsorDateStartFixed)
                    .addComponent(lblSponsorDateStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSponsorContactEmailFixed)
                    .addComponent(lblSponsorContactEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSponsorContactNumberFixed)
                    .addComponent(lblSponsorContactNumber))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        lblSchoolInformation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSchoolInformation.setText("School Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sponsor Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(349, 349, 349))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSchoolInformation)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSchoolInformation)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("School", jPanel2);

        mnuFile.setText("File");

        mniAddSchool.setText("Add School");
        mnuFile.add(mniAddSchool);

        mniExit.setText("Exit");
        mnuFile.add(mniExit);

        jmbMain.add(mnuFile);

        setJMenuBar(jmbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SchoolInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolInfoForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JLabel lblSchoolContactEmail;
    private javax.swing.JLabel lblSchoolContactEmailFixed;
    private javax.swing.JLabel lblSchoolContactNumberTwo;
    private javax.swing.JLabel lblSchoolContactPhoneNumberOne;
    private javax.swing.JLabel lblSchoolDateEnd;
    private javax.swing.JLabel lblSchoolDateEndFixed;
    private javax.swing.JLabel lblSchoolDateStart;
    private javax.swing.JLabel lblSchoolDateStartFixed;
    private javax.swing.JLabel lblSchoolInformation;
    private javax.swing.JLabel lblSchoolLocation;
    private javax.swing.JLabel lblSchoolLocationFixed;
    private javax.swing.JLabel lblSchoolName;
    private javax.swing.JLabel lblSchoolNameFixed;
    private javax.swing.JLabel lblSchoolPhoneNumberOneFixed;
    private javax.swing.JLabel lblSchoolPhoneNumberTwoFixed;
    private javax.swing.JLabel lblSponsorContactEmail;
    private javax.swing.JLabel lblSponsorContactEmailFixed;
    private javax.swing.JLabel lblSponsorContactNumber;
    private javax.swing.JLabel lblSponsorContactNumberFixed;
    private javax.swing.JLabel lblSponsorDateStart;
    private javax.swing.JLabel lblSponsorDateStartFixed;
    private javax.swing.JLabel lblSponsorName;
    private javax.swing.JLabel lblSponsorNameFixed;
    private javax.swing.JMenuItem mniAddSchool;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenu mnuFile;
    // End of variables declaration//GEN-END:variables
}
