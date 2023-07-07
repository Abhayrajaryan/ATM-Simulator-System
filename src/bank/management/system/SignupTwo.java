package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        //Creating Religion field
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Railway", Font.BOLD,20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion= new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        //Creating Category field
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD,20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        //Creating Income field
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD,20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        //Creating Educational Qualification field
        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        educationLabel.setBounds(100, 290, 125, 30);
        add(educationLabel);
        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        qualificationLabel.setBounds(100, 315, 200, 30);
        add(qualificationLabel);
        
        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        //Creating Ocuupation field
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);
        
        
        String occupationalValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationalValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        //Creating Pan Number field
        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD,20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        //Creating adhar number field
        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD,20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        //Creating Seniour Citizen field
        JLabel seniourCitizenLabel = new JLabel("Seniour Citizen:");
        seniourCitizenLabel.setFont(new Font("Raleway", Font.BOLD,20));
        seniourCitizenLabel.setBounds(100, 540, 200, 30);
        add(seniourCitizenLabel);
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBounds(300, 540, 100, 30);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBounds(450, 540, 100, 30);
        add(sno);
        
        ButtonGroup seniourCittizenGroup = new ButtonGroup();
        seniourCittizenGroup.add(syes);
        seniourCittizenGroup.add(sno);
        
        
        //Creating Existing Account field
        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD,20));
        existingAccountLabel.setBounds(100, 590, 200, 30);
        add(existingAccountLabel);

        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 14));
        eyes.setBounds(300, 590, 100, 30);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 14));
        eno.setBounds(450, 590, 100, 30);
        add(eno);
        
        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);
        
        //Adding Next Button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        //Creating frame
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        //extracting values
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniourcitizen = null;
        if(syes.isSelected()){
            seniourcitizen = "Yes";
        }else if(sno.isSelected()){
            seniourcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
                //inserting data into database
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '" + sreligion+"', '" +scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniourcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //Signup 3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}

