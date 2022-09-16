/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import model.Profile;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**
 *
 * @author ruishang
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Profile profile;
    public ViewJPanel(Profile profile) {
        this.profile = profile;
        initComponents();
        displayProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewLabel = new javax.swing.JLabel();
        txtDegreeEnd1 = new javax.swing.JTextField();
        txtDegree2 = new javax.swing.JTextField();
        degreeStartLabel2 = new javax.swing.JLabel();
        txtDegreeStart2 = new javax.swing.JTextField();
        txtDegreeEnd2 = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        degreeEndLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        fristnameLabel = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        affiliationLabel = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        majorLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAffiliation = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        txtStreet1 = new javax.swing.JTextField();
        careerLabel = new javax.swing.JLabel();
        txtStreet2 = new javax.swing.JTextField();
        teleLabel = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        degreeLabel1 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        txtMajor = new javax.swing.JTextField();
        degreeStartLabel1 = new javax.swing.JLabel();
        txtCareer = new javax.swing.JTextField();
        streetLable1 = new javax.swing.JLabel();
        txtDegree1 = new javax.swing.JTextField();
        degreeEndLabel1 = new javax.swing.JLabel();
        txtDegreeStart1 = new javax.swing.JTextField();
        streetLable2 = new javax.swing.JLabel();
        degreeLabel2 = new javax.swing.JLabel();
        profilePhoto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 600));

        ViewLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        ViewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewLabel.setText("View Profile");

        degreeStartLabel2.setText("Degree 2 Start");

        cityLabel.setText("City");

        degreeEndLabel2.setText("Degree 2 End");

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        fristnameLabel.setText("First Name");

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        countryLabel.setText("Country");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        lastnameLabel.setText("Last Name");

        affiliationLabel.setText("Affiliation");

        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });

        dobLabel.setText("DOB");

        majorLabel.setText("Major");

        ageLabel.setText("Age");

        careerLabel.setText("Career");

        teleLabel.setText("Telephone Numer");
        teleLabel.setToolTipText("");

        degreeLabel1.setText("Degree 1");

        emailLabel.setText("Email");

        degreeStartLabel1.setText("Degree 1 Start");

        streetLable1.setText("Street Line 1");

        degreeEndLabel1.setText("Degree 1 End");

        streetLable2.setText("Street Line 2");

        degreeLabel2.setText("Degree 2");

        profilePhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(streetLable2)
                            .addComponent(streetLable1)
                            .addComponent(teleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fristnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstname)
                            .addComponent(txtLastname)
                            .addComponent(txtDOB)
                            .addComponent(txtAge)
                            .addComponent(txtTele)
                            .addComponent(txtEmail)
                            .addComponent(txtStreet1)
                            .addComponent(txtStreet2)
                            .addComponent(txtCity)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(degreeEndLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(degreeStartLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(degreeLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(degreeEndLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(degreeStartLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(degreeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(careerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDegreeEnd2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDegreeStart2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDegree2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDegree1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDegreeStart1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDegreeEnd1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(affiliationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAffiliation)
                                    .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fristnameLabel)
                    .addComponent(affiliationLabel)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(majorLabel)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(careerLabel)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(degreeLabel1)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreeStartLabel1)
                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegreeStart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreeEndLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegreeEnd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLable1)
                    .addComponent(degreeLabel2)
                    .addComponent(txtStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegree2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLable2)
                    .addComponent(degreeStartLabel2)
                    .addComponent(txtStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegreeStart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(degreeEndLabel2)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDegreeEnd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleActionPerformed
    
    public void displayProfile (){
        txtFirstname.setText(profile.getFirstName());
        txtLastname.setText(profile.getLastName());
        txtDOB.setText(profile.getBirthDate());
        txtAge.setText(profile.getAge());
        txtTele.setText(profile.getTeleNum());
        txtEmail.setText(profile.getEmail());
        txtStreet1.setText(profile.getStreetLine1());
        txtStreet2.setText(profile.getStreetLine2());
        txtCity.setText(profile.getCity());
        txtCountry.setText(profile.getCountry());
        txtAffiliation.setText(profile.getAffiliation());
        txtMajor.setText(profile.getMajor());
        txtCareer.setText(profile.getCareer());
        txtDegree1.setText(profile.getDegree1());
        txtDegreeStart1.setText(profile.getDegreeStart1());
        txtDegreeEnd1.setText(profile.getDegreeEnd1());
        txtDegree2.setText(profile.getDegree2());
        txtDegreeStart2.setText(profile.getDegreeStart2());
        txtDegreeEnd2.setText(profile.getDegreeEnd2());
        //txtPhotoUrl.setText(profile.getPhotopath());

//        profile.setPhotopath(" testing");

        
        profilePhoto.setIcon(profile.getPhoto());

//        String path = profile.getPhotopath();
//        ImageIcon icon = new ImageIcon(path); 
//        foto.setIcon(icon);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ViewLabel;
    private javax.swing.JLabel affiliationLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel careerLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel degreeEndLabel1;
    private javax.swing.JLabel degreeEndLabel2;
    private javax.swing.JLabel degreeLabel1;
    private javax.swing.JLabel degreeLabel2;
    private javax.swing.JLabel degreeStartLabel1;
    private javax.swing.JLabel degreeStartLabel2;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fristnameLabel;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JLabel profilePhoto;
    private javax.swing.JLabel streetLable1;
    private javax.swing.JLabel streetLable2;
    private javax.swing.JLabel teleLabel;
    private javax.swing.JTextField txtAffiliation;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCareer;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDegree1;
    private javax.swing.JTextField txtDegree2;
    private javax.swing.JTextField txtDegreeEnd1;
    private javax.swing.JTextField txtDegreeEnd2;
    private javax.swing.JTextField txtDegreeStart1;
    private javax.swing.JTextField txtDegreeStart2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMajor;
    private javax.swing.JTextField txtStreet1;
    private javax.swing.JTextField txtStreet2;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
