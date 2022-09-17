/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import model.Profile;
import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author ruishang
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Profile profile;
    public CreateJPanel(Profile profile) {
        this.profile = profile;
        initComponents();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        degreeEndLabel2 = new javax.swing.JLabel();
        fristnameLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        affiliationLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        majorLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        careerLabel = new javax.swing.JLabel();
        teleLabel = new javax.swing.JLabel();
        degreeLabel1 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        degreeStartLabel1 = new javax.swing.JLabel();
        streetLable1 = new javax.swing.JLabel();
        degreeEndLabel1 = new javax.swing.JLabel();
        streetLable2 = new javax.swing.JLabel();
        degreeLabel2 = new javax.swing.JLabel();
        degreeStartLabel2 = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        localPhoto = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTele = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAffiliation = new javax.swing.JTextField();
        txtStreet1 = new javax.swing.JTextField();
        txtStreet2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtMajor = new javax.swing.JTextField();
        txtCareer = new javax.swing.JTextField();
        txtDegree1 = new javax.swing.JTextField();
        txtDegreeStart1 = new javax.swing.JTextField();
        txtDegreeEnd1 = new javax.swing.JTextField();
        txtDegree2 = new javax.swing.JTextField();
        txtDegreeStart2 = new javax.swing.JTextField();
        txtDegreeEnd2 = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        uploadBtn = new javax.swing.JButton();
        uploadAdr = new javax.swing.JLabel();

        CreateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CreateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateLabel.setText("Create Profile");

        cityLabel.setText("City");

        degreeEndLabel2.setText("Degree 2 End");

        fristnameLabel.setText("First Name");

        countryLabel.setText("Country");

        lastnameLabel.setText("Last Name");

        affiliationLabel.setText("Affiliation");

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

        degreeStartLabel2.setText("Degree 2 Start");

        photoLabel.setText("Profile Image");

        localPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel22.setText("From local");

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(countryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                    .addComponent(txtCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(photoLabel)
                                    .addComponent(localPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(uploadAdr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel22)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(degreeEndLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(degreeStartLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(degreeLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(degreeEndLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(degreeStartLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(degreeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(careerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDegreeStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDegreeEnd1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDegree2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDegreeStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDegreeEnd2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(affiliationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAffiliation)
                                            .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CreateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(uploadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadAdr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(photoLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(localPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(265, 265, 265))))
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

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        profile.setFirstName(txtFirstname.getText());
        profile.setLastName(txtLastname.getText());
        profile.setBirthDate(txtDOB.getText());
        profile.setAge(txtAge.getText());
        profile.setTeleNum(txtTele.getText());
        profile.setEmail(txtEmail.getText());
        profile.setEmail(txtEmail.getText());
        profile.setStreetLine1(txtStreet1.getText());
        profile.setStreetLine2(txtStreet2.getText());
        profile.setCity(txtCity.getText());
        profile.setCountry(txtCountry.getText());
        profile.setAffiliation(txtAffiliation.getText());
        profile.setMajor(txtMajor.getText());
        profile.setCareer(txtCareer.getText());
        profile.setDegree1(txtDegree1.getText());
        profile.setDegreeStart1(txtDegreeStart1.getText());
        profile.setDegreeEnd1(txtDegreeEnd1.getText());
        profile.setDegree2(txtDegree2.getText());
        profile.setDegreeStart2(txtDegreeStart2.getText());
        profile.setDegreeEnd2(txtDegreeEnd2.getText());
        profile.setPhoto(localPhoto.getIcon());
        

        
//    private String degree1;
//    private String degreeStart1;
//    private String degreeEnd1;
//    private String degree2;
//    private String degreeStart2;
//    private String degreeEnd2;
//    private String photopath;
        
        //Prompt user profile was successfully saved
        JOptionPane.showMessageDialog(null,"Create profile successfully !");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        String path=file.getAbsolutePath();
        
        // Resize the image
        Image im = Toolkit.getDefaultToolkit().createImage(path);
        // get size from window
        im = im.getScaledInstance(localPhoto.getWidth(), localPhoto.getHeight(), Image.SCALE_SMOOTH); 
        // Assign profile photo
        ImageIcon photoImage =new ImageIcon(im);
        
        
        //  Find out if upload file is img format or nots
        if(path.indexOf("png") != -1 ||path.indexOf("jpeg") != -1 ||path.indexOf("jpg") != -1 ) {
            // Set resized img as profile photo
  
            localPhoto.setIcon(photoImage);
            // Get image local location
            uploadAdr.setText(path);
            System.out.println(" Phtoto Upload Successfully !");
        } else {
     
            localPhoto.setText(" No Photo Selected ");
            System.out.println(" No Phtoto Selected !");
        }
    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateLabel;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel localPhoto;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton saveBtn;
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
    private javax.swing.JLabel uploadAdr;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
