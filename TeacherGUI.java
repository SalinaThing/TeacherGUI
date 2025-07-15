
/**
 * Write a description of class bpanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;//importing respective package
public class TeacherGUI implements ActionListener
{
    JFrame frame1,frame2;
    JPanel fpanel,mpanel,mainPanel,bpanel,cpanel,dpanel,epanel;
    JLabel jtitle,itle,tle,le,title,stitle,add,stle,Lec,Tut,satle;
    JLabel ltitle,lteach_id1, lteach_name2,laddress3,lworktype4,lemplystatus5,lworkHours,lteach_dep,lteach_yoe,lgrade,ldep,yoe,tworkHours,tsalary,tspeci,tAca_quali,tper_index,tSalary,tperfor_index,tworHours;
    JTextField fl_teach_id1,fl_teach_name2,fl_address3,fl_worktype4,fl_emplystatus5,fl_workHours,fl_teach_dep,fl_teach_yoe,fl_grade,fl_dep,fl_yoe, ft_workHours,ft_salary,ft_speci,ft_Aca_quali,ft_per_index,ft_Salary,ft_perfor_index,ft_worHours;
    JButton next,bu_addLecturer1,bu_addTutor2,bu_Grade3,bu_setSalary4,bu_RemoveTutor5,bu_LDisplay6,bu_LClear7, bu_TDisplay8,bu_TClear9,nextt;
    Color customColor1,customColor2,custoF2a,custoF2b;
    ArrayList<Teacher>arrl1=new ArrayList<Teacher>();//Creating arrayList 
    public TeacherGUI()
    {
        frame1=new JFrame("Form");
        
        title=new JLabel("*******A WARM WELCOME*******");
        title.setBounds(40,50,1000,50);
        stitle=new JLabel("~~WANGSU UNIVERSITY~~");
        stitle.setBounds(150,130,1000,50);
        add=new JLabel("Address: Boudha,Kathmandu,Nepal");
        add.setBounds(300,190,1000,30);
        itle=new JLabel("Gmail:UniWangsu.gmail.com");
        itle.setBounds(340,230,1000,30);
        jtitle=new JLabel("Job Available:");
        jtitle.setBounds(200,250,300,70);
        Lec=new JLabel("a. Lecturer");
        Lec.setBounds(250,300,150,70);
        Tut=new JLabel("b. Tutor ");
        Tut.setBounds(250,340,150,70);
        next=new JButton(">>>");
        next.setBounds(860,550,60,30);
        stle=new JLabel("Have a good day!!!");
        stle.setBounds(400,450,600,30);
        tle=new JLabel("Have a peace mind.You will be Happy for sure!!");
        tle.setBounds(300,480,600,30);
        le=new JLabel("Be Positive! Be Passionate! Be Perfect!");
        le.setBounds(320,510,600,30);
        
        frame2=new JFrame("Form");
        mainPanel=new JPanel();
        bpanel=new JPanel();
        cpanel=new JPanel();
        dpanel=new JPanel();//.........bpanel=page2
        epanel=new JPanel();
        
        ltitle=new JLabel("University's Teacher Form");
        ltitle.setBounds(350,20,1000,50);
        lteach_id1=new JLabel("TeacherId:");
        lteach_name2=new JLabel("Teacher name:");
        laddress3=new JLabel("Address:");
        lworktype4=new JLabel("Working type:");
        lemplystatus5=new JLabel("Employment status:");
        lworkHours=new JLabel("Working Hours:");//cppanel
        lteach_dep=new JLabel("Department:");
        lteach_yoe=new JLabel("Years of Experience:");//Lecturer JLabel
        bu_addLecturer1=new JButton("Add Lecturer");
        lgrade=new JLabel("gradedScore");
        ldep=new JLabel("department");
        yoe=new JLabel("yearsOfExperience");
        bu_Grade3=new JButton("Grade the Assignments");
        
        tworkHours=new JLabel("WorkingHours:");
        tsalary=new JLabel("Salary:");//dpanel
        tspeci=new JLabel("Specialization:");
        tAca_quali=new JLabel("Academic qualification:");
        tper_index=new JLabel("Performance Index:");//Tutor JLabel
        bu_addTutor2=new JButton("Add Tutor");
        bu_RemoveTutor5=new JButton("Remove Tutor");
        tSalary=new JLabel("New Salary:");
        tperfor_index=new JLabel("New Performance Index:");//set Salary JLabel
        tworHours=new JLabel("WorkingHours:");
        bu_setSalary4=new JButton("Set the Salary");
        bu_LDisplay6=new JButton("Display");
        bu_LClear7=new JButton("Clear");
        bu_TDisplay8=new JButton("Display");
        bu_TClear9=new JButton("Clear");
        nextt=new JButton("<<<");//responsive JButton
        
        
        fl_teach_id1=new JTextField();
        fl_teach_name2=new JTextField();
        fl_address3=new JTextField();
        fl_worktype4=new JTextField();
        fl_emplystatus5=new JTextField();
        fl_workHours=new JTextField();
        fl_teach_dep=new JTextField();
        fl_teach_yoe=new JTextField();//TextField of Lecturer
        fl_grade=new JTextField();
        fl_dep=new JTextField();
        fl_yoe=new JTextField();

        ft_workHours=new JTextField();
        ft_salary=new JTextField();
        ft_speci=new JTextField();
        ft_Aca_quali=new JTextField();
        ft_per_index=new JTextField();//TextField of Tutor
        ft_Salary=new JTextField();
        ft_perfor_index=new JTextField();
        ft_worHours=new JTextField();
        
        
        customColor1 = new Color(32, 141, 168);
        customColor2 = new Color(16, 77, 92);
        fpanel=new JPanel();
        mpanel=new JPanel();
        mpanel.setBounds(20,20,940,600);
        fpanel.setBounds(50,50,400,400);//frame1......main panel
        
        lteach_id1.setBounds(10,80,100,30);
        lteach_name2.setBounds(150,80,120,30);
        laddress3.setBounds(380,80,100,30);
        lworktype4.setBounds(580,80,110,30);
        lemplystatus5.setBounds(805,80,150,30);
        lworkHours.setBounds(50,20,110,30);
        lteach_dep.setBounds(50,60,150,30);
        lteach_yoe.setBounds(50,100,150,30);//setBounds of Lecturer(Jlabel)
        lgrade.setBounds(50,20,110,30);
        ldep.setBounds(50,60,150,30);
        yoe.setBounds(50,100,150,30);
        
        fl_teach_id1.setBounds(80,80,60,30);
        fl_teach_name2.setBounds(245,80,120,30);
        fl_address3.setBounds(440,80,120,30);
        fl_worktype4.setBounds(670,80,120,30);
        fl_emplystatus5.setBounds(930,80,120,30);
        fl_workHours.setBounds(180,20,230,30);
        fl_teach_dep.setBounds(180,60,230,30);
        fl_teach_yoe.setBounds(180,100,230,30);//setBounds of Lecturer(Text-field)
        fl_grade.setBounds(170,20,230,30);
        fl_dep.setBounds(170,60,230,30);
        fl_yoe.setBounds(170,100,230,30);//setBounds of Lecturer(Text-field)
        
        
        tworkHours.setBounds(60,15,120,30);
        tsalary.setBounds(60,55,120,30);
        tspeci.setBounds(60,95,120,30);
        tAca_quali.setBounds(60,135,180,30);
        tper_index.setBounds(60,175,120,30);//setBounds of Tutor(JLabel)
        tworHours.setBounds(60,15,120,30);
        tSalary.setBounds(60,55,120,30);
        tperfor_index.setBounds(60,95,200,30);
        
        ft_workHours.setBounds(220,15,200,30);
        ft_salary.setBounds(220,55,200,30);
        ft_speci.setBounds(220,95,200,30);
        ft_Aca_quali.setBounds(220,135,200,30);
        ft_per_index.setBounds(220,175,200,30);//setBounds of Tutor(Text-field)
        ft_worHours.setBounds(250,15,230,30);
        ft_Salary.setBounds(250,55,230,30);
        ft_perfor_index.setBounds(250,95,230,30);
        
        bu_addLecturer1.setBounds(150,150,150,30);
        bu_addTutor2.setBounds(210,210,150,30);
        bu_Grade3.setBounds(110,145,250,30);
        bu_setSalary4.setBounds(190,135,150,30);
        bu_RemoveTutor5.setBounds(550,580,150,30);
        bu_LDisplay6.setBounds(90,560,160,30);
        bu_LClear7.setBounds(300,560,160,30);
        bu_TDisplay8.setBounds(720,580,150,30);
        bu_TClear9.setBounds(880,580,150,30);
        nextt.setBounds(10,575,60,30);//setBounds of responsive JButton
        
        bpanel.setBounds(20,130,490,200);
        cpanel.setBounds(530,130,505,245);
        dpanel.setBounds(20,340,490,200);
        epanel.setBounds(530,390,505,180);
        mainPanel.setBounds(5,5,1060,620);
    
        mainPanel.add(ltitle);
        mainPanel.add(lteach_id1);
        mainPanel.add(lteach_name2);
        mainPanel.add(laddress3);
        mainPanel.add(lworktype4);
        mainPanel.add(lemplystatus5);
        bpanel.add(lworkHours);
        bpanel.add(lteach_dep);
        bpanel.add(lteach_yoe);
        mainPanel.add(fl_teach_id1);
        mainPanel.add(fl_teach_name2);
        mainPanel.add(fl_address3);
        mainPanel.add(fl_worktype4);
        mainPanel.add(fl_emplystatus5);
        bpanel.add(fl_workHours);
        bpanel.add(fl_teach_dep);
        bpanel.add(fl_teach_yoe);//adding components to the lecPanel.i.e.JLabel and TextField of Lecturer
        
        cpanel.add(tworkHours);
        cpanel.add(tsalary);
        cpanel.add(tspeci);
        cpanel.add(tAca_quali);
        cpanel.add(tper_index);
        cpanel.add(ft_workHours);
        cpanel.add(ft_salary);
        cpanel.add(ft_speci);
        cpanel.add(ft_Aca_quali);
        cpanel.add(ft_per_index);//adding components to the tuPanel
        
        dpanel.add(lgrade);
        dpanel.add(ldep);
        dpanel.add(yoe);
        dpanel.add(fl_grade);
        dpanel.add(fl_dep);
        dpanel.add(fl_yoe);
        
        epanel.add(ft_Salary);
        epanel.add(ft_perfor_index);
        epanel.add(ft_worHours);
        epanel.add(tSalary);
        epanel.add(tperfor_index);
        epanel.add(tworHours);
        
        bpanel.add(bu_addLecturer1);
        cpanel.add(bu_addTutor2);
        dpanel.add(bu_Grade3);
        epanel.add(bu_setSalary4);
        mainPanel.add(bu_RemoveTutor5);
        mainPanel.add(bu_LDisplay6);
        mainPanel.add(bu_LClear7);
        mainPanel.add(bu_TDisplay8);
        mainPanel.add(bu_TClear9);
        mainPanel.add(nextt);////adding components to the Panel.i.e.JButton
        
        custoF2a = new Color(245, 198, 219);
        bu_addLecturer1.addActionListener(this);
        bu_addTutor2.addActionListener(this);
        bu_Grade3.addActionListener(this);
        bu_setSalary4.addActionListener(this);
        bu_RemoveTutor5.addActionListener(this);
        bu_LDisplay6.addActionListener(this);
        bu_LClear7.addActionListener(this);
        bu_TDisplay8.addActionListener(this);
        bu_TClear9.addActionListener(this);
        nextt.addActionListener(this);//Add or register the listener to the source
        next.addActionListener(this);
        
        //add components to panels
        mpanel.add(itle);
        mpanel.add(title);
        mpanel.add(stitle);
        mpanel.add(add);
        mpanel.add(tle);
        mpanel.add(le);
        mpanel.add(stle);
        mpanel.add(jtitle);
        mpanel.add(Lec);
        mpanel.add(Tut);
        mpanel.add(next);
        mpanel.setLayout(new BorderLayout());
        
         // Creating a border for the content pane
        Border border = BorderFactory.createLineBorder(Color.BLACK, 10);
        mpanel.setBorder(border);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2);
        bpanel.setBorder(border1);
        cpanel.setBorder(border1);
        dpanel.setBorder(border1);
        epanel.setBorder(border1);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 4);
        mainPanel.setBorder(border2);
        
        
        ltitle.setFont(new Font("Times New Roman", Font.BOLD, 35));
        mainPanel.setBackground(Color.PINK);
        mainPanel.add(bpanel);
        mainPanel.add(cpanel);
        mainPanel.add(dpanel);
        mainPanel.add(epanel);
        frame2.add(mainPanel);
        
        itle.setFont(new Font("Times New Roman",Font.BOLD,20));
        add.setFont(new Font("Times New Roman",Font.BOLD,20));
        title.setFont(new Font("Times New Roman",Font.BOLD,50));
        stitle.setFont(new Font("Times New Roman",Font.BOLD,45));
        le.setFont(new Font("Times New Roman",Font.BOLD,19));
        tle.setFont(new Font("Times New Roman",Font.BOLD,20));
        stle.setFont(new Font("Times New Roman",Font.BOLD,20));
        jtitle.setFont(new Font("Times New Roman",Font.BOLD,25));
        Lec.setFont(new Font("Times New Roman",Font.BOLD,19));
        Tut.setFont(new Font("Times New Roman",Font.BOLD,20));
        //ltitle.setFont(new Font("Times New Roman", Font.BOLD, 35));
        mpanel.setBackground(Color.PINK);
        stitle.setForeground(Color.RED);
        jtitle.setForeground(customColor2);
        
        
        frame1.add(mpanel);
        frame1.setLayout(null);
        fpanel.setLayout(null);
        frame1.setVisible(true);
        frame1.setResizable(false);
        frame1.setSize(1000,800);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);

        frame2.setLayout(null);
        bpanel.setLayout(null);
        cpanel.setLayout(null);
        dpanel.setLayout(null);
        epanel.setLayout(null);
        mainPanel.setLayout(null);
        frame2.setVisible(false);
        frame2.setResizable(false);
        frame2.setSize(1100,900);
        frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            
            if(e.getSource()==next)
            {
                frame1.setVisible(true);//hide frame1
                frame2.setVisible(true);//show frame2
            }
            else if(e.getSource()==nextt)
            {
                frame1.setVisible(true);//show frame1
                frame2.setVisible(false);//hide frame2
            }
            boolean isAdded=true;
            if(e.getSource()==bu_addLecturer1)
            {
                //Check if any required field is empty
                if(fl_teach_id1.getText().isEmpty()||fl_teach_name2.getText().isEmpty()||fl_address3.getText().isEmpty()||fl_worktype4.getText().isEmpty()||fl_emplystatus5.getText().isEmpty()||fl_workHours.getText().isEmpty()||fl_teach_dep.getText().isEmpty()|| fl_teach_yoe.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please!Fill up the form.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (arrl1 !=null)// ArrayList is not empty, move to iterator
                    {
                        //int size=arrl1.size();
                        for(int i=0;i<arrl1.size();i++)
                        {
                            if(arrl1.get(i) instanceof Lecturer)// Check if obj1 is an instance of Lecturer
                            {
                                int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                                Teacher teach=arrl1.get(i);
                                if(lteach_id1 == teach.getTeacherId())// Compare the teacher ID of obj1 with the input teacher ID
                                {
                                    JOptionPane.showMessageDialog(frame2, "Lecturer already exists with the same ID.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                    isAdded= false;
                                    break; // Stop the loop
                                }
                            
                                else
                                {   
                                    // Add the new lecturer only if it's not a duplicate
                                    isAdded=true;
                                    JOptionPane.showMessageDialog(frame2, "Lecturer added successfully.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
                if(isAdded==true)
                {
                        int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                        String lteach_name2 = fl_teach_name2.getText();
                        String laddress3 = fl_address3.getText();
                        String lworktype4 = fl_worktype4.getText();
                        String lemplystatus5 = fl_emplystatus5.getText();
                        int lworkHours = Integer.parseInt(fl_workHours.getText());
                        String lteach_dep = fl_teach_dep.getText();
                        int lteach_yoe = Integer.parseInt(fl_teach_yoe.getText());
                        
                        Lecturer obj1=new Lecturer(lteach_id1, lteach_name2,laddress3,lworktype4,lemplystatus5,lworkHours,lteach_dep,lteach_yoe);
                        arrl1.add(obj1);
                }
            }
            
            else if(e.getSource()==bu_addTutor2)
            {
                //Check if any required field is empty
                if(fl_teach_id1.getText().isEmpty()||fl_teach_name2.getText().isEmpty()||fl_address3.getText().isEmpty()||fl_worktype4.getText().isEmpty()||fl_emplystatus5.getText().isEmpty()||ft_workHours.getText().isEmpty()||ft_salary.getText().isEmpty()|| ft_speci.getText().isEmpty()||ft_Aca_quali.getText().isEmpty()||ft_per_index.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please!Fill up the form.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (arrl1 !=null)// ArrayList is not empty, move to iterator
                    {
                        //int size=arrl1.size();
                        for(int i=0;i<arrl1.size();i++)
                        {
                            if(arrl1.get(i) instanceof Tutor)// Check if obj1 is an instance of Lecturer
                            {
                                int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                                Teacher teach=arrl1.get(i);
                                if (lteach_id1 == teach.getTeacherId())// Compare the teacher ID of obj1 with the input teacher ID
                                {
                                    JOptionPane.showMessageDialog(frame2, "Tutor already exists with the same ID.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                    isAdded= false;
                                    break; // Stop the loop
                                }
                            
                                else
                                {   
                                    // Add the new lecturer only if it's not a duplicate
                                    isAdded=true;
                                    JOptionPane.showMessageDialog(frame2, "Tutor added successfully.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
                if(isAdded==true)
                {
                        int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                        String lteach_name2 = fl_teach_name2.getText();
                        String laddress3 = fl_address3.getText();
                        String lworktype4 = fl_worktype4.getText();
                        String lemplystatus5 = fl_emplystatus5.getText();
                        int tworkHours = Integer.parseInt(ft_workHours.getText());
                        double tsalary = Double.parseDouble(ft_salary.getText());
                        String tspeci = ft_speci.getText();
                        String tAca_quali = ft_Aca_quali.getText();
                        int tper_index = Integer.parseInt(ft_per_index.getText());
                        
                        Tutor obj1=new Tutor(lteach_id1, lteach_name2,laddress3,lworktype4,lemplystatus5,tworkHours,tsalary,tspeci,tAca_quali,tper_index);
                        arrl1.add(obj1);
                }
            }
            else if(e.getSource()==bu_Grade3)
            {
                    //Check if any required field is empty
                if(fl_teach_id1.getText().isEmpty()||fl_grade.getText().isEmpty()||fl_dep.getText().isEmpty()||fl_yoe.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please!Fill up the form.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //int size=arrl1.size();
                    for(int i=0;i<arrl1.size();i++)
                    {
                        if(arrl1.get(i) instanceof Lecturer)// Check if obj1 is an instance of Lecturer
                        {
                            int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                            Teacher teach=arrl1.get(i);
                            if (lteach_id1!= teach.getTeacherId())// Compare the teacher ID of obj1 with the input teacher ID
                            {
                                JOptionPane.showMessageDialog(frame2, "Valid teacherId already exists in Lecturer.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                isAdded=false;
                                break;
                                
                            }
                        
                            else
                            { 
                                isAdded=true;
                                JOptionPane.showMessageDialog(frame2, "Invalid teacherId in Lecturer.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                if(isAdded==true)
                {
                    int lgrade = Integer.parseInt(fl_grade.getText());
                    String ldep =fl_dep.getText();
                    int yoe=Integer.parseInt(fl_yoe.getText()); 
                    
                    System.out.println("Department: " + ldep);
                    System.out.println("YearsOfExperience: " + yoe);
                    System.out.println("Graded Score: " + lgrade);
                    for(int i=0;i<arrl1.size();i++)
                    {
                        if(arrl1.get(i) instanceof Lecturer)// Check if obj1 is an instance of Lecturer
                        {
                            Lecturer lect=(Lecturer)arrl1.get(i);
                            lect.gradeAssignment(lgrade,ldep,yoe);
                            JOptionPane.showMessageDialog(frame2,"The graded assignment was added.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                    }
                }
            }
            else if(e.getSource()==bu_setSalary4)
            {
                    //Check if any required field is empty
                if(fl_teach_id1.getText().isEmpty()||ft_worHours.getText().isEmpty()||ft_Salary.getText().isEmpty()||ft_perfor_index.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please!Fill up the form.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //int size=arrl1.size();
                    for(int i=0;i<arrl1.size();i++)
                    {
                        if(arrl1.get(i) instanceof Tutor)// Check if obj1 is an instance of Lecturer
                        {
                            int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                            Teacher teach=arrl1.get(i);
                            if (lteach_id1!= teach.getTeacherId())// Compare the teacher ID of obj1 with the input teacher ID
                            {
                                JOptionPane.showMessageDialog(frame2, "Valid teacherId already exists in Tutor.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                            }
                        
                            else
                            {   
                                JOptionPane.showMessageDialog(frame2, "Invalid Tutor Id.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                if(isAdded==true)
                {
                    int tworHours = Integer.parseInt(ft_worHours.getText());
                    double tSalary =Double.parseDouble(ft_Salary.getText());
                    int tperfor_index=Integer.parseInt(ft_perfor_index.getText());   
                    
                    System.out.println("Salary: " + tSalary);
                    System.out.println("WorkHours: " + tworHours);
                    System.out.println("Performance Index: " + tperfor_index);
                    for(int i=0;i<arrl1.size();i++)
                    {
                        if(arrl1.get(i) instanceof Tutor)// Check if obj1 is an instance of Lecturer
                        {
                            
                            Tutor tut=(Tutor)arrl1.get(i);
                            tut.setSalary(tSalary,tperfor_index);
                            JOptionPane.showMessageDialog(frame2,"The set salary was added.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                    }
                }
            }
            else if (e.getSource() == bu_TDisplay8) 
            {   
                for (int i=0;i<arrl1.size();i++)// Iterate through the ArrayList and find instances of Tutor 
                {
                    if (arrl1.get(i) instanceof Tutor) {
                        arrl1.get(i).displayTeacherInfo();
                        System.out.println();
                    }
                }
                JOptionPane.showMessageDialog(frame2,"There are "+ arrl1.size() + " Tutor(s) recorded.");

            }
            else if(e.getSource()==bu_RemoveTutor5)
            {
                //Check if any required field is empty
                if(fl_teach_id1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please!Fill up the form.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //int size=arrl1.size();
                    for(int i=0;i<arrl1.size();i++)
                    {
                        if(arrl1.get(i) instanceof Tutor)// Check if obj1 is an instance of Lecturer
                        {
                            int lteach_id1 = Integer.parseInt(fl_teach_id1.getText());
                            Teacher teach=arrl1.get(i);
                            if (lteach_id1== teach.getTeacherId())// Compare the teacher ID of obj1 with the input teacher ID
                            {
                                JOptionPane.showMessageDialog(frame2, "The Tutor was removed.", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                                Tutor tut=(Tutor)arrl1.get(i);
                                tut.removeTutor();
                            }
                        
                            else
                            {   
                                // Add the new lecturer only if it's not a duplicate
                                isAdded=true;
                                JOptionPane.showMessageDialog(frame2, "The invalid TeacherId id in Tutor .", "Alert type", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
            else if(e.getSource() == bu_LDisplay6) 
            { 
                for(int i=0;i<arrl1.size();i++)// Iterate through the ArrayList and find instances of Lecturer
                {
                    if(arrl1.get(i) instanceof Lecturer)// Check if obj1 is an instance of Lecturer
                    {
                        arrl1.get(i).displayTeacherInfo();
                        System.out.println();
                    }
                }

                JOptionPane.showMessageDialog(frame2,"There are "+ arrl1.size() + " Lecturer(s) recorded.");
            }
            else if(e.getSource()==bu_LClear7)
            {
                JOptionPane.showMessageDialog(frame2,"The text field is clear.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                fl_teach_id1.setText("");
                fl_teach_name2.setText("");
                fl_address3.setText("");
                fl_worktype4.setText("");
                fl_emplystatus5.setText("");
                fl_workHours.setText("");
                fl_teach_dep.setText("");
                fl_teach_yoe.setText("");
                
                fl_grade.setText("");
                fl_dep.setText("");
                fl_yoe.setText("");//Grade Assignment
            }
              else if(e.getSource()==bu_TClear9)
            {  
                JOptionPane.showMessageDialog(frame2,"The text field is clear.","Alert type",JOptionPane.INFORMATION_MESSAGE);
                fl_teach_id1.setText("");
                fl_teach_name2.setText("");
                fl_address3.setText("");
                fl_worktype4.setText("");
                fl_emplystatus5.setText("");
                ft_workHours.setText("");
                
                ft_workHours.setText("");
                ft_salary.setText("");
                ft_speci.setText("");
                ft_Aca_quali.setText("");
                ft_per_index.setText("");// Clear text fields
                
                ft_worHours.setText("");
                ft_Salary.setText("");
                ft_perfor_index.setText("");//setSalary
            }
        }

    
        catch(NumberFormatException e1)
        {
                JOptionPane.showMessageDialog(frame2,"Error in input.Please!Enter correctly.","Alert type",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[]args)
    {
        new TeacherGUI();
    }
}


        