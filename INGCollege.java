
/**
 * INGCollege class contains GUI for other three classes 
 * i.e Course,AcademicCourse and NonAcademicCourse
 * @Chanda Jaiswal
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/*INGCollege class
 * This class contains GUI for three classes
 * Course, AcademicCourse and NonAcademicCourse
 */
public class INGCollege implements ActionListener 
{
     //Instance variables used in the program
     private JFrame frame, frameRemove;
     
     private JPanel acpanel, nacpanel;
    
     private JLabel idlabelAC, cnlabelAC, cllabelAC, lnlabelAC, lvlabelAC, crlabelAC, sdlabelAC, cdlabelAC, nalabelAC, drlabelAC, rgidlabelAC, idlabelNAC, cnlabelNAC, cllabelNAC,
     inlabelNAC, prlabelNAC, edlabelNAC, sdlabelNAC, cdlabelNAC, drlabelNAC, rgidlabelNAC, removelabel , AC, NAC;
    
     private JTextField idtextAC, cntextAC, cltextAC, lntextAC, lvtextAC, crtextAC, sdtextAC, cdtextAC, natextAC, drtextAC, rgidtextAC, idtextNAC, cntextNAC, cltextNAC, intextNAC,
     prtextNAC, edtextNAC, sdtextNAC, cdtextNAC, drtextNAC, rgidtextNAC, removeCourseIDtext ;
    
     private JButton addbuttonAC, rgbuttonAC, dispbuttonAC, clearbuttonAC, addbuttonNAC, rgbuttonNAC, dispbuttonNAC, clearbuttonNAC, removebutton, removecancelbutton,
     removeconfirmbutton;
     
     //Creating ArrayList
     private ArrayList<Course> courselist = new ArrayList<Course>();
    
     AcademicCourse academic_obj;
     NonAcademicCourse nonacademic_obj;
     
    public void CourseRegistrationForm()
    {
        //JFrame
        frame = new JFrame( "INGCollege Course Registration" );
        
        //Adding JPanel for Academic Course
        acpanel = new JPanel();
        
        /* 
         * Adding TextField with JLabel for Academic Course 
         */
        
        //Adding JLabel for AC text
        AC = new JLabel(" Academic Course Registration ");
        AC.getText();
        AC.setBounds(230,0,350,50);
        
        //Adding Font for AC text
        Font ff_AC = new Font("ARIAL",Font.BOLD, 20);
        AC.setFont(ff_AC);
        
        acpanel.add(AC);
        
        //Adding JLabel for CourseID 
        JLabel idlabelAC = new JLabel("Course ID : ");
        idlabelAC.getText();
        idlabelAC.setBounds(10,50,90,50);
        
        //Adding Font for CourseID 
        Font ff_idlabelAC = new Font("ARIAL", Font.BOLD, 14);
        idlabelAC.setFont(ff_idlabelAC);
        
        acpanel.add(idlabelAC);
        
        //Adding JTextField for CourseID
        idtextAC = new JTextField();
        idtextAC.setBounds(170,60,180,30);
        
        acpanel.add(idtextAC);
        
        //Adding JLabel for Course Name
        cnlabelAC = new JLabel("Course Name : ");
        cnlabelAC.getText();
        cnlabelAC.setBounds(10,90,110,50);
        
        //Adding Font for Course Name
        Font ff_cnlabelAC = new Font("ARIAL", Font.BOLD, 14);
        cnlabelAC.setFont(ff_cnlabelAC);
        
        acpanel.add(cnlabelAC);
        
        //Adding JTextField for Course Name
        cntextAC = new JTextField();
        cntextAC.setBounds(170,100,180,30);
        
        acpanel.add(cntextAC);
        
        //Adding JLabel for CourseID for register
        rgidlabelAC = new JLabel("Course ID : ");
        rgidlabelAC.getText();
        rgidlabelAC.setBounds(400,90,120,50);          
        
        //Adding Font for CourseID for register
        Font ff_rgidlabelAC = new Font("ARIAL", Font.BOLD, 14);
        rgidlabelAC.setFont(ff_rgidlabelAC);
        
        acpanel.add(rgidlabelAC);
        
        //Adding JTextField for CourseID for register
        rgidtextAC = new JTextField();
        rgidtextAC.setBounds(535,100,180,30);          
        
        acpanel.add(rgidtextAC);
        
        //Adding JLabel for Course Leader
        cllabelAC = new JLabel("Course Leader : ");
        cllabelAC.getText();
        cllabelAC.setBounds(400,130,120,50);          
        
        //Adding Font for Course Leader
        Font ff_cllabelAC = new Font("ARIAL", Font.BOLD, 14);
        cllabelAC.setFont(ff_cllabelAC);
        
        acpanel.add(cllabelAC);
        
        //Adding JTextField for Course Leader
        cltextAC = new JTextField();
        cltextAC.setBounds(535,140,180,30);          
        
        acpanel.add(cltextAC);
        
        //Adding JLabel for Lecturer Name
        lnlabelAC = new JLabel("Lecturer Name : ");
        lnlabelAC.getText();
        lnlabelAC.setBounds(400,170,120,50);
        
        //Adding Font for Lecturer Name
        Font ff_lnlabelAC = new Font("ARIAL", Font.BOLD, 14);
        lnlabelAC.setFont(ff_lnlabelAC);
        
        acpanel.add(lnlabelAC);
        
        //Adding JTextField for Lecturer Name
        lntextAC = new JTextField();
        lntextAC.setBounds(535,180,180,30);
        
        acpanel.add(lntextAC);
        
        //Adding JLabel for Duration
        drlabelAC = new JLabel("Duration : ");
        drlabelAC.getText();
        drlabelAC.setBounds(10,130,120,50);
        
        //Adding Font for Duration
        Font ff_drlabelAC = new Font("ARIAL", Font.BOLD, 14);
        drlabelAC.setFont(ff_drlabelAC);
        
        acpanel.add(drlabelAC);
        
        //Adding JTextField for Duration
        drtextAC = new JTextField();
        drtextAC.setBounds(170,140,180,30);
        
        acpanel.add(drtextAC);
        
        //Adding JLabel for Level
        lvlabelAC = new JLabel("Level : ");
        lvlabelAC.getText();
        lvlabelAC.setBounds(10,170,80,50);
        
        //Adding Font for Level
        Font ff_lvlabelAC = new Font("ARIAL", Font.BOLD, 14);
        lvlabelAC.setFont(ff_lvlabelAC);
        
        acpanel.add(lvlabelAC);
        
        //Adding JTextField for Level
        lvtextAC = new JTextField();
        lvtextAC.setBounds(170,180,180,30);
        
        acpanel.add(lvtextAC);
        
        //Adding JLabel for Credit
        crlabelAC = new JLabel("Credit : ");
        crlabelAC.getText();
        crlabelAC.setBounds(10,210,120,50);
        
        //Adding Font for Credit
        Font ff_crlabelAC = new Font("ARIAL", Font.BOLD, 14);
        crlabelAC.setFont(ff_crlabelAC);
        
        acpanel.add(crlabelAC);
        
        //Adding JTextField for Credit
        crtextAC = new JTextField();
        crtextAC.setBounds(170,220,180,30);
        
        acpanel.add(crtextAC);
        
        //Adding JLabel for Starting Date
        sdlabelAC = new JLabel("Starting Date : ");
        sdlabelAC.getText();
        sdlabelAC.setBounds(400,210,130,50);
        
        //Adding Font for Starting Date
        Font ff_sdlabelAC = new Font("ARIAL", Font.BOLD, 14);
        sdlabelAC.setFont(ff_sdlabelAC);
        
        acpanel.add(sdlabelAC);
        
        //Adding JTextField for Starting Date
        sdtextAC = new JTextField();
        sdtextAC.setBounds(535,220,180,30);
        
        acpanel.add(sdtextAC);
        
        //Adding JLabel for Completion Date
        cdlabelAC = new JLabel("Completion Date : ");
        cdlabelAC.getText();
        cdlabelAC.setBounds(400,250,130,50);   
        
        //Adding Font for Completion Date
        Font ff_cdlabelAC = new Font("ARIAL", Font.BOLD, 14);
        cdlabelAC.setFont(ff_cdlabelAC);
        
        acpanel.add(cdlabelAC);
        
        //Adding JTextField for Completion Date
        cdtextAC = new JTextField();
        cdtextAC.setBounds(535,260,180,30);  
        
        acpanel.add(cdtextAC);
        
        //Adding JLabel for Number of Assessments
        nalabelAC = new JLabel("No. of Assessments : ");
        nalabelAC.getText();
        nalabelAC.setBounds(10,250,180,50);
        
        //Adding Font for Number of Assessments
        Font ff_nalabelAC = new Font("ARIAL", Font.BOLD, 14);
        nalabelAC.setFont(ff_nalabelAC);
        
        acpanel.add(nalabelAC);
        
        //Adding JTextField for Number of Assessments
        natextAC = new JTextField();
        natextAC.setBounds(170,260,180,30);
        
        acpanel.add(natextAC);
           
        /*
         * Adding JButton for Academic Course
         */
        
        //Adding JButton for Add
        addbuttonAC = new JButton(" Add ");
        addbuttonAC.setBounds(70,330,120,40);
        
        //Adding Font for Add button
        Font ff_addAC = new Font("ARIAL", Font.BOLD, 14);
        addbuttonAC.setFont(ff_addAC);
        
        addbuttonAC.addActionListener(this);     //Adding actionListener  to the add button
        acpanel.add(addbuttonAC);
        
        //Adding JButton for Register
        rgbuttonAC = new JButton(" Register ");
        rgbuttonAC.setBounds(560,330,120,40);
        
        //Adding Font for Register button
        Font ff_rgAC = new Font("ARIAL", Font.BOLD, 14);
        rgbuttonAC.setFont(ff_rgAC);
        
        rgbuttonAC.addActionListener(this);    //Adding actionListener to the register button
        acpanel.add(rgbuttonAC);
        
        //Adding JButton for Clear
        clearbuttonAC = new JButton(" Clear ");
        clearbuttonAC.setBounds(230,330,120,40);
        
        //Adding Font for Clear button
        Font ff_clearAC = new Font("ARIAL", Font.BOLD, 14);
        clearbuttonAC.setFont(ff_clearAC);
        
        clearbuttonAC.addActionListener(this);        //Adding actionListener to the clear button
        acpanel.add(clearbuttonAC);
        
        //Adding JButton for Display
        dispbuttonAC = new JButton(" Display ");
        dispbuttonAC.setBounds(400,330,120,40);
        
        //Adding Font for Display button
        Font ff_dispAC = new Font("ARIAL", Font.BOLD, 14);
        dispbuttonAC.setFont(ff_dispAC);
        
        dispbuttonAC.addActionListener(this);     //Adding actionListener to the display button
        acpanel.add(dispbuttonAC);
        
        
        //Adding JPanel for Non Academic Course
        nacpanel = new JPanel();
        
        /*
         *  Adding TextField with JLabel for Non Academic Course
         */
        
        //Adding JLabel for NAC text
        NAC = new JLabel(" Non-Academic Course Registration ");
        NAC.getText();
        NAC.setBounds(200,0,350,50);
        
        //Adding Font for NAC text
        Font ff_NAC = new Font("ARIAL",Font.BOLD, 20);
        NAC.setFont(ff_NAC);
        
        nacpanel.add(NAC);
        
        //Adding JLabel for CourseID for Register
        rgidlabelNAC = new JLabel("Course ID : ");
        rgidlabelNAC.getText();
        rgidlabelNAC.setBounds(10,50,90,50);
        
        //Adding Font for CourseID for Register
        Font ff_rgidlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        rgidlabelNAC.setFont(ff_rgidlabelNAC);
        
        nacpanel.add(rgidlabelNAC);
        
        //Adding JTextField for CourseID for Register
        rgidtextNAC = new JTextField();
        rgidtextNAC.setBounds(170,60,180,30);
        
        nacpanel.add(rgidtextNAC);
        
        //Adding JLabel for Course Name
        cnlabelNAC = new JLabel("Course Name : ");
        cnlabelNAC.getText();
        cnlabelNAC.setBounds(400,145,130,50);
        
        //Adding Font for Course Name
        Font ff_cnlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        cnlabelNAC.setFont(ff_cnlabelNAC);
        
        nacpanel.add(cnlabelNAC);
        
        //Adding JTextField for Course Name
        cntextNAC = new JTextField();
        cntextNAC.setBounds(535,155,180,30);
        
        nacpanel.add(cntextNAC);
        
        //Adding JLabel for Course Leader
        cllabelNAC = new JLabel("Course Leader : ");
        cllabelNAC.getText();
        cllabelNAC.setBounds(10,90,120,50);
        
        //Adding Font for Course Leader
        Font ff_cllabelNAC = new Font("ARIAL", Font.BOLD, 14);
        cllabelNAC.setFont(ff_cllabelNAC);
        
        nacpanel.add(cllabelNAC);
        
        //Adding JTextField for Course Leader
        cltextNAC = new JTextField();
        cltextNAC.setBounds(170,100,180,30);
        
        nacpanel.add(cltextNAC);
        
        //Adding JLabel for Instructor Name
        inlabelNAC = new JLabel("Instructor Name : ");
        inlabelNAC.getText();
        inlabelNAC.setBounds(10,130,130,50);
        
        //Adding Font for Instructor Name
        Font ff_inlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        inlabelNAC.setFont(ff_inlabelNAC);
        
        nacpanel.add(inlabelNAC);
        
        //Adding JTextField for Instructor Name
        intextNAC = new JTextField();
        intextNAC.setBounds(170,140,180,30);
        
        nacpanel.add(intextNAC);
        
        //Adding JLabel for CourseID 
        idlabelNAC = new JLabel("Course ID : ");
        idlabelNAC.getText();
        idlabelNAC.setBounds(400,105,120,50);          
        
        //Adding Font for CourseID 
        Font ff_idlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        idlabelNAC.setFont(ff_idlabelNAC);
        
        nacpanel.add(idlabelNAC);
        
        //Adding JTextField for CourseID 
        idtextNAC = new JTextField();
        idtextNAC.setBounds(535,115,180,30);         
        
        nacpanel.add(idtextNAC);
        
        //Adding JLabel for Duration
        drlabelNAC = new JLabel("Duration : ");
        drlabelNAC.getText();
        drlabelNAC.setBounds(400,185,100,50);
        
        //Adding Font for Duration
        Font ff_drlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        drlabelNAC.setFont(ff_drlabelNAC);
        
        nacpanel.add(drlabelNAC);
        
        //Adding JTextField for Duration
        drtextNAC = new JTextField();
        drtextNAC.setBounds(535,195,180,30);
        
        nacpanel.add(drtextNAC);
        
        //Adding JLabel for Prerequisite
        prlabelNAC = new JLabel("Prerequisite : ");
        prlabelNAC.getText();
        prlabelNAC.setBounds(400,225,130,50);
        
        //Adding Font for Prerequisite
        Font ff_prlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        prlabelNAC.setFont(ff_prlabelNAC);
        
        nacpanel.add(prlabelNAC);
        
        //Adding JTextField for Prerequisite
        prtextNAC = new JTextField();
        prtextNAC.setBounds(535,235,180,30);
        
        nacpanel.add(prtextNAC);
        
        //Adding JLabel for Exam Date
        edlabelNAC = new JLabel("Exam Date : ");
        edlabelNAC.getText();
        edlabelNAC.setBounds(10,170,100,50);
        
        //Adding Font for Exam Date
        Font ff_edlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        edlabelNAC.setFont(ff_edlabelNAC);
        
        nacpanel.add(edlabelNAC);
        
        //Adding JTextField for Exam Date
        edtextNAC = new JTextField();
        edtextNAC.setBounds(170,180,180,30);
        
        nacpanel.add(edtextNAC);
        
        //Adding JLabel for Start Date
        sdlabelNAC = new JLabel("Start Date : ");
        sdlabelNAC.getText();
        sdlabelNAC.setBounds(10,210,100,50);
        
        //Adding Font for Start Date
        Font ff_sdlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        sdlabelNAC.setFont(ff_sdlabelNAC);
        
        nacpanel.add(sdlabelNAC);
        
        //Adding JTextField for Start Date
        sdtextNAC = new JTextField();
        sdtextNAC.setBounds(170,220,180,30);
        
        nacpanel.add(sdtextNAC);
        
        //Adding JLabel for Completion Date
        cdlabelNAC = new JLabel("Completion Date : ");
        cdlabelNAC.getText();
        cdlabelNAC.setBounds(10,250,150,50);
        
        //Adding Font for Completion Date
        Font ff_cdlabelNAC = new Font("ARIAL", Font.BOLD, 14);
        cdlabelNAC.setFont(ff_cdlabelNAC);
        
        nacpanel.add(cdlabelNAC);
        
        //Adding JTextField for Completion Date
        cdtextNAC = new JTextField();
        cdtextNAC.setBounds(170,260,180,30);
        
        nacpanel.add(cdtextNAC);
        
        /*
         * Adding JButton for Non Academic Course
         */
        
        //Adding JButton for Add
        addbuttonNAC = new JButton(" Add ");
        addbuttonNAC.setBounds(560,330,120,40); 
        
        //Adding Font for Add button
        Font ff_addNAC = new Font("ARIAL", Font.BOLD, 14);
        addbuttonNAC.setFont(ff_addNAC);
        
        addbuttonNAC.addActionListener(this);        //Adding actionListener to the add button
        nacpanel.add(addbuttonNAC);
        
        //Adding JButton for Register
        rgbuttonNAC = new JButton(" Register ");
        rgbuttonNAC.setBounds(70,330,120,40);  
        
        //Adding Font for Register button
        Font ff_rgNAC = new Font("ARIAL", Font.BOLD, 14);
        rgbuttonNAC.setFont(ff_rgNAC);
        
        rgbuttonNAC.addActionListener(this);       //Adding actionListener to the register button
        nacpanel.add(rgbuttonNAC);
        
        //Adding JButton for Clear
        clearbuttonNAC = new JButton(" Clear ");
        clearbuttonNAC.setBounds(230,330,120,40);   
        
        //Adding Font for Clear button
        Font ff_clearNAC = new Font("ARIAL", Font.BOLD, 14);
        clearbuttonNAC.setFont(ff_clearNAC);
        
        clearbuttonNAC.addActionListener(this);       //Adding actionListener to the clear button
        nacpanel.add(clearbuttonNAC);
        
        //Adding JButton for Remove
        removebutton = new JButton(" Remove ");
        removebutton.setBounds(555,55,120,40);
        
        //Adding Font for Remove button
        Font ff_removebutton = new Font("ARIAL", Font.BOLD, 14);
        removebutton.setFont(ff_removebutton);
        
        removebutton.addActionListener(this);      //Adding actionListener to the remove button
        nacpanel.add(removebutton);
        
        //Adding JButton for Display
        dispbuttonNAC = new JButton(" Display ");
        dispbuttonNAC.setBounds(400,330,120,40);   
        
        //Adding Font for Display button
        Font ff_dispNAC = new Font("ARIAL", Font.BOLD, 14);
        dispbuttonNAC.setFont(ff_dispNAC);
        
        dispbuttonNAC.addActionListener(this);     //Adding actionListener to the display button
        nacpanel.add(dispbuttonNAC);
          
        //Adding JTabbedPane 
        JTabbedPane tb = new JTabbedPane();
        
        //Adding academic and non academic course panel to the tabbedpane
        tb.add("Academic Course", acpanel);
        tb.add("Non Academic Course", nacpanel);
        
        //Setting layout of Academic and Non Academic Course
        acpanel.setLayout(null);
        nacpanel.setLayout(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Exits the application
        frame.add(tb);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(200,150,750,480);
    }
    
    // Method containing GUI for Remove JFrame 
    public void removeGUI() 
    {
        //Adding JFrame for remove
        frameRemove = new JFrame("Remove Non-Academic Course");
        frameRemove.setBounds(410,290,350,200);
        frameRemove.setLayout(null);
        frameRemove.setResizable(false);
        
        //Adding JLabel for Text
        removelabel = new JLabel("Enter the Course ID :");
        removelabel.setBounds(25,25,180,30);
        
        //Adding Font for text
        Font ff_removelabel = new Font("ARIAL", Font.BOLD, 14);
        removelabel.setFont(ff_removelabel);
        
        frameRemove.add(removelabel);
       
        
        //Adding JTextField for text
        removeCourseIDtext = new JTextField();
        removeCourseIDtext.setBounds(190,30,120,30);
        
        frameRemove.add(removeCourseIDtext);
        
        //Adding JButton for remove button
        removeconfirmbutton = new JButton("Remove");
        removeconfirmbutton.setBounds(30,95,100,35);
        
        //Adding Font for remove button
        Font ff_removeconfirmbutton = new Font("ARIAL", Font.BOLD, 14);
        removeconfirmbutton.setFont(ff_removeconfirmbutton);
        
        removeconfirmbutton.addActionListener(this);
        
        //Adding JButton for cancel
        removecancelbutton = new JButton("Cancel");
        removecancelbutton.setBounds(190,95,100,35);
        
        //Adding Font for cancel
        Font ff_removecancelbutton = new Font("ARIAL", Font.BOLD, 14);
        removecancelbutton.setFont(ff_removecancelbutton);
        
        removecancelbutton.addActionListener(this);

        // Adding components to the frame    
        frameRemove.add(removeconfirmbutton);
        frameRemove.add(removecancelbutton);
        
        // Setting frame as visible
        frameRemove.setVisible(true);
    }
    
    //Method for Adding Academic Course
    public void AcademicCourseAdd() 
    {
         /* A academic course is added
          * new local variables are stored from textfields
          */
         boolean repeatCourseID = false;
         
         int durationAC;
         
         int NumberOfAssessmentsAC; 
         
         String courseIDAC = idtextAC.getText();
         
         String course_nameAC= cntextAC.getText();
         
         String levelAC = lvtextAC.getText();
         
         String creditAC = crtextAC.getText().toString();
         
         //If the textfields are empty then it displays a error message
         if(drtextAC.getText().equals("") || courseIDAC.equals("") || natextAC.getText().equals("") || course_nameAC.equals("") || levelAC.equals("") 
         
         || creditAC.equals("") ) {
             
             JOptionPane.showMessageDialog(frame, " Please fill all the fields. ", " ERROR ", 0);
             
            } 
            else {
                //Try Catch block is used to catch exception
                try {
                    int ACcredit = Integer.parseInt(creditAC);
                    
                    durationAC = Integer.parseInt(drtextAC.getText());
                    
                    NumberOfAssessmentsAC = Integer.parseInt(natextAC.getText());
                    
                }
                catch (NumberFormatException NOE) { 
                    
                    JOptionPane.showMessageDialog(frame, " Please enter valid values. ");
                    
                    return;
                    
                }
                
                //Iterates within the arraylist
                for (Course c : courselist) {
                    
                    //Comparing the courseID to courseID entered in the textfield for AcademicCourse
                    if (c.getCourseID().equals(courseIDAC)) {
                        
                        repeatCourseID = true;
                        
                        break;
                        
                    }
                }
                
                if(repeatCourseID == false) {
                    
                    AcademicCourse academic_obj = new AcademicCourse(courseIDAC, course_nameAC, durationAC, levelAC, creditAC , NumberOfAssessmentsAC);
                    
                    courselist.add(academic_obj);
                    
                    //Displays message about the added course and gives the total count of courses added
                    JOptionPane.showMessageDialog(frame, " Academic Course is added. " + "\n  Total courses : " +courselist.size() , "SUCCESS",1); 
                    
                } 
                else { 
                    
                    //If the entered courseID is already in the arraylist, it displays a alert message
                    JOptionPane.showMessageDialog(frame, " Course ID is already added. ", " ALERT ", JOptionPane.WARNING_MESSAGE );
                    
                }
                
         }
            
    }
    
    //Method for registering Academic Course
    public void AcademicCourseRegister() 
    {
        /*
         * A non academic course is registered
         *  new local variables to store values from text field 
         */
        boolean IDFound = false;
        
        String AcCourseID = rgidtextAC.getText();
        
        String course_leaderAC = cltextAC.getText();
        
        String lecturer_nameAC = lntextAC.getText();
        
        String starting_dateAC = sdtextAC.getText();
        
        String completion_dateAC = cdtextAC.getText();
        
        //If textfield is empty then displays a error message
        if(AcCourseID.equals("") || course_leaderAC.equals("") || lecturer_nameAC.equals("") || starting_dateAC.equals("") || completion_dateAC.equals("")){
            
            JOptionPane.showMessageDialog(frame, " Please fill all the fields !! ", "ERROR", 0); 
            
        } 
        else {
                //Iterates within arraylist
                for (Course obj : courselist) {
                    
                     //Comparing courseID
                     if(obj.getCourseID().equals(AcCourseID)) {
                         
                          IDFound = true;
                          
                          //Checks whether the object is an instance of AcademicCourse subclass
                          if (obj instanceof AcademicCourse) {
                              
                                //Object casting
                                AcademicCourse academic_obj = (AcademicCourse) obj;
                                
                                //Register method is called and the condition is checked and if condition is false course is registered
                                 if (academic_obj.getIsRegistered() == false) { //registers the academic course
                                     
                                     academic_obj.registerAcademicCourse(course_leaderAC, lecturer_nameAC, starting_dateAC, completion_dateAC);
                                 
                                     JOptionPane.showMessageDialog(acpanel, " Academic Course is registered. ", " SUCCESS ", 1); //displays a success message
                                 
                                     break;
                                }
                                else if(academic_obj.getIsRegistered() == true){
                                    
                                    JOptionPane.showMessageDialog(acpanel, " Academic Course is already registered. ", " ALERT ", 2);
                                    
                                    break;
                                } 
                          }
                          else { 
                              //If courseID entered is not the courseID for Academic Course
                              JOptionPane.showMessageDialog(frame, " Course ID : "+AcCourseID+ "  is not available for Academic Course. ", " ALERT ",2 );
                              
                                }
                                
                     }
                     
                } 
                
                if (IDFound == false) { 
                    //If courseID entered is not in the arraylist
                     JOptionPane.showMessageDialog(frame, " Invalid CourseID !! ", " ERROR ", 0);
                     
                } 
                
        }
        
    }
    
    //Method for resetting the textfields of AcademicCourse
    public void AcademicCourseClear() 
    {
        //When clear button is clicked , a message is displayed asking for confirmation for the resetting of textfields
        int x = JOptionPane.showConfirmDialog(frame," Do you want to clear the information? ", " INFO ", JOptionPane.YES_NO_OPTION);
        
        if (x == JOptionPane.YES_OPTION){ //if yes option is chosen then it resets the fields
            
            idtextAC.setText(""); 
            
            cntextAC.setText(""); 
            
            cltextAC.setText(""); 
            
            lntextAC.setText(""); 
            
            lvtextAC.setText(""); 
            
            crtextAC.setText(""); 
            
            sdtextAC.setText(""); 
            
            cdtextAC.setText(""); 
            
            natextAC.setText("");
            
            drtextAC.setText("");
            
            rgidtextAC.setText("");
        }
        
        if (x == JOptionPane.NO_OPTION) { //if no option is chosen it doesnot reset the textfields
        }
    }
    
    //Method for displaying the details of Academic Course
    public void AcademicCourseDisplay() 
    {
        boolean Empty = false;
        //Iterates within arraylist
        for(Course obj : courselist) {
            //Checks whether the object is an instance of AcademicCourse class
            if(obj instanceof AcademicCourse) {
                        System.out.println("--------**Details of Academic Course**--------");
                        //Calling display method from AcademicCourse class
                        ((AcademicCourse) obj).display();
                        Empty = true;
            }
        }
        if (Empty == false){
            JOptionPane.showMessageDialog(null, " No record found !!! " , " ERROR " , 0);
            
        }
    }
    
    //Method for adding Non Academic Course
    public void NonAcademicCourseAdd()
    {
        /*
        * When the add button in non academic course is clicked, a course is added
        * local variables stored from textfields
        * try catch block to catch exception
        */
        boolean repeatCourseID = false;
            
        int durationNAC = 0;
            
        String courseIDNAC = idtextNAC.getText();
            
        String course_nameNAC = cntextNAC.getText();
            
        String prerequisiteNAC = prtextNAC.getText();
            
        //If the textfields are empty then it displays a error message
        if (drtextNAC.getText().equals("") || course_nameNAC.equals("") || courseIDNAC.equals("") || prerequisiteNAC.equals("")){
                
                JOptionPane.showMessageDialog(frame, " Please fill all the fields. " , " ERROR ", 0);
                
        }
        else {  
                    
                try {
                        
                        durationNAC = Integer.parseInt(drtextNAC.getText());
                        
                }
                catch (NumberFormatException NOE) {
                        
                    JOptionPane.showMessageDialog(frame, " Please enter valid values. ", " ERROR ", 0);
                    
                    return;
                    
                }
                    
                //Iterates within arraylist
                for (Course u : courselist) {
                        
                    if(u.getCourseID().equals(courseIDNAC)){
                            
                            repeatCourseID = true;
                        
                            break;
                        
                    }
                        
                }
                    
                if (repeatCourseID == false) {
                        
                    nonacademic_obj = new NonAcademicCourse(courseIDNAC, course_nameNAC, durationNAC, prerequisiteNAC);
                        
                    courselist.add(nonacademic_obj);
                        
                    //Displays message about the added course and gives the total count of courses added
                    JOptionPane.showMessageDialog(frame, "  Non Academic Course is added. " + "\n  Total courses : " +courselist.size(), " SUCCESS ", 1);
                        
                }
                
                else {
                        
                    //If the entered courseID is already in the arraylist, it displays a alert message
                    JOptionPane.showMessageDialog(frame, " Course ID is already added. ", " ALERT ", 2);
                    
                }
            
        }
            
    }
    
    //Method for registering Non Academic Course
    public void NonAcademicCourseRegister()
    {
        /*
         * When register button is clicked, non academiccourse is registered
         * new local variables store values from textfields
        */
        boolean IDFound = false;
            
        String NACcourseID = rgidtextNAC.getText();
            
        String NACcourse_leader = cltextNAC.getText();
            
        String NACinstructor_name = intextNAC.getText();
            
        String NACstart_date = sdtextNAC.getText();
            
        String NACcompletion_date = cdtextNAC.getText();
            
        String NACexam_date = edtextNAC.getText();
            
        //If textfield is empty then displays a error message
        if (NACcourseID.equals("") || NACcourse_leader.equals("") || NACinstructor_name.equals("") || NACstart_date.equals("") 
            
            || NACcompletion_date.equals("") || NACexam_date.equals("")) {
                
                JOptionPane.showMessageDialog(frame, " Please fill all the fields. ", " ERROR ", 0);
                
        } 
        else {
                
            //Iterates within list
             for(Course r : courselist) {
                 
                 if (r.getCourseID().equals(NACcourseID)) {
                     
                         IDFound = true;
                         
                    //Checks whether the object is an instance of AcademicCourse subclass
                     if(r instanceof NonAcademicCourse) {
                         
                        //Object casting
                        NonAcademicCourse nonacademic_obj = (NonAcademicCourse) r;
                        
                        //Register method is called and the condition is checked and if condition is false non academic course is registered
                         if (nonacademic_obj.getIsRegistered()==false) {
                             
                             nonacademic_obj.registerNonAcademicCourse(NACcourse_leader, NACinstructor_name, NACstart_date, NACcompletion_date, NACexam_date);
                             
                             JOptionPane.showMessageDialog(frame, " Non Academic Course is registered. ", " SUCCESS ", 1);
                             
                             break;

                        } 
                        else if(nonacademic_obj.getIsRegistered() == true) {
                            
                            JOptionPane.showMessageDialog(frame, " Non Academic course is already registered. ", " ALERT " ,2);
                            
                            break;
                            
                        }
                    }
                    
                    else{ 
                        //If courseID entered is not the courseID for Non Academic Course
                        JOptionPane.showMessageDialog(frame, " Course ID  " +NACcourseID+ " is not available for Non Academic Course. " , " ALERT " ,2);
                        
                    }
                    
                }
                
            }
            
            if(IDFound == false) { 
                    //If courseID entered is not in the arraylist
                    JOptionPane.showMessageDialog(frame, " Invalid CourseID !! " , " ERROR ", 0);
                    
             }
                
        }
            
    }
    
    //Method for resetting the textfields of Non AcademicCourse
    public void NonAcademicCourseClear() 
    {
       //When clear button is clicked , a message is displayed asking for confirmation for the resetting of textfields
       int x= JOptionPane.showConfirmDialog(frame," Do you want to clear the information? ", " INFO ", JOptionPane.YES_NO_OPTION);
            
        if (x == JOptionPane.YES_OPTION){  //if yes option is chosen then it resets the fields
                    idtextNAC.setText(""); 
                    cntextNAC.setText(""); 
                    cltextNAC.setText(""); 
                    intextNAC.setText(""); 
                    prtextNAC.setText(""); 
                    edtextNAC.setText(""); 
                    sdtextNAC.setText(""); 
                    cdtextNAC.setText(""); 
                    drtextNAC.setText("");
                    rgidtextNAC.setText("");
       }
            
       if (x == JOptionPane.NO_OPTION) {
       }
                
    } 
    
    //Method for displaying the details of Academic Course
    public void NonAcademicCourseDisplay() 
    {
          boolean Empty = false;
          //Iterates within arraylist
          for(Course obj : courselist) {
              //Checks whether the ibject is an instance of NonAcademicCourse class
              if(obj instanceof NonAcademicCourse) {
                    Empty = true;
                    System.out.println("--------**Details of Non-Academic Course**--------");
                     //Calling the display method from NonAcademicCourse class
                    ((NonAcademicCourse) obj).display();
              }
          }
          if (Empty == false){
                    JOptionPane.showMessageDialog(null, " No record found !!! " , " ERROR ", 0);
                
          }
            
    }  
    
    //Method for removing course 
    public void NonAcademicCourseRemove()
    {
        //When the remove button is clicked, a couse ID is removed
        boolean IDFound = false;
            
        String CourseIDRemove = removeCourseIDtext.getText(); 
            
        if (CourseIDRemove.equals("")){
                    
                  JOptionPane.showMessageDialog(frameRemove, " Please enter CourseID !! ");
                  
        } 
        else {
                
                //Iterates within the list
                for(Course s : courselist) {
                    
                    if(s.getCourseID().equals(CourseIDRemove)) {
                        
                        IDFound = true;
                        
                        if (s instanceof NonAcademicCourse){ //Checks whether the object is an instance of AcademicCourse subclass
                            
                            nonacademic_obj = (NonAcademicCourse) s;
                            
                            //Remove method from NonAcademicCourse is called and condition are checked 
                            //If  courseID is registered and not removed , the entered courseID is removed
                            if(nonacademic_obj.getIsRemoved() == false && nonacademic_obj.getIsRegistered() == true) {
                                
                                nonacademic_obj.removeNonAcademicCourse();
                                
                                JOptionPane.showMessageDialog(frameRemove, " Course is removed. ");
                                
                                break;
                            } 
                            
                            else if (nonacademic_obj.getIsRemoved() == true && nonacademic_obj.getIsRegistered() == false) {
                                
                                JOptionPane.showMessageDialog(frameRemove," Course was already removed. "," ALERT ",2);
                                
                                break;
                            } 
                            else {
                                
                                JOptionPane.showMessageDialog(frameRemove, " No course to remove. ");
                                
                                break;
                            }
                        } 
                        else { 
                            
                            JOptionPane.showMessageDialog(frameRemove," CourseID " +CourseIDRemove+ " doesnot belong to Non Academic Course ", " ALERT " , 2);
                            
                        }
                        
                    }
                    
                }
                    
                if(IDFound == false) {  //if the courseID is not in araylist, alert message is displayed
                     JOptionPane.showMessageDialog(frameRemove, " Invalid CourseID !! " , " ERROR " ,0);
                }
                
            }
    }
    
    //Method to assign the buttons a certain function when clicked
    public void actionPerformed(ActionEvent ae)
    {
        
        //Adding functionality to the add button of Academic Course to add a course
        if (ae.getSource() == addbuttonAC) {
            
            AcademicCourseAdd();
            
        }
        
        //Adding functionality to the register button Academic Course to register a course
        if (ae.getSource() == rgbuttonAC) {
            
            AcademicCourseRegister();
            
        }
        
        //Adding functionality to the clear button of Academic Course to reset the textfields
        if(ae.getSource() == clearbuttonAC) {
            
            AcademicCourseClear();
            
        }
        
        //Adding functionality to the display buttn of Academic Course to view details of academic course
        if(ae.getSource() == dispbuttonAC) {
            
            AcademicCourseDisplay();
            
        }
        
        //Adding functonality to the add button of Non Academic Course to add a courseID
        if(ae.getSource() == addbuttonNAC) {
            
            NonAcademicCourseAdd();
            
        }
        
        //Adding functionality to the register button of Non Academic Course to register a course
        if(ae.getSource() == rgbuttonNAC) {
            
            NonAcademicCourseRegister();
            
        }
        
        //Adding functionality to the clear button of Non Academic Course to reset te textfields
        if (ae.getSource() == clearbuttonNAC) {
            
            NonAcademicCourseClear(); 
                
        }
            
        //Adding functionality to the display button of Non Academic Course to view details
        if ( ae.getSource() == dispbuttonNAC) {
            
            NonAcademicCourseDisplay(); 
            
        }
        
        //Calling the method containing the remove GUI when remove button is clicked  
            if (ae.getSource() == removebutton) {
                
                //When the remove button in non academic course is clicked, it leads to the GUI created for the remove 
                removeGUI();
                
        }
        
        //Adding functionality to the remove buton of the removeGUI to confirm the removal of course
        if (ae.getSource() == removeconfirmbutton) {
            
            NonAcademicCourseRemove();
            
        }
        
        //Closes the removeGUI frame when pressed
        if (ae.getSource() == removecancelbutton) {
            
            frameRemove.dispose();
            
        }
        
    }
    //Main Method
    public static void main(String[]args) 
    {
        INGCollege ing = new INGCollege();
        ing.CourseRegistrationForm();
    }
}
    