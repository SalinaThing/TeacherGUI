
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    //subclass or child class constructor with eight parameters
    public Lecturer (int teacherId, String teacherName, String address, String workingType, String employmentStatus,
    int workingHours,String department,int yearsOfExperience)
    {
    // Calling the superclass constructor with five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
    // Setting additional attributes of Class Lecturer
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0; // Initialized to zero
        this.hasGraded = false; // Initialized to false
    }
    
    //create getter/accessor methods for all variables
    public String getDepartment()
    {
        return this.department;
    }
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    
    // Mutator/setter method for gradedScore
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
    
    // Method name=grade assignments
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) 
    {   
        if (yearsOfExperience >=5 && department == department)
        {  
            if (gradedScore >= 70) 
            {
                System.out.println("The grade is A");
            } else if (gradedScore >= 60)
            {
                System.out.println("The grade is B");
            } else if (gradedScore >= 50) 
            {
                System.out.println("The grade is C");
            } else if (gradedScore >= 40) 
            {
                 System.out.println("The grade is D");
            } else // Less than 40
            {
                System.out.println("The grade is E");
            }
            hasGraded= true;
            this.gradedScore = gradedScore;
             
        } 
        else {
        //Display a suitable message if the lecturer is unable to grade the assignments
            System.out.println("Unable to grade assignment. Either already graded or not eligible.");
        }
    }

    // create a display method with samesignature as teacher class
    public void displayTeacherInfo() {
        // Calling the display method in the superclass (Teacher)
        
        super.displayTeacherInfo();

        // Displaying additional attributes for Lecturer
        System.out.println("Department: " + department);
        System.out.println("YearsOfExperience: " + yearsOfExperience);

        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore );
        } else {
            System.out.println("Graded Score: Not Graded Yet");
        }
    }
    /**
    * compiler.need to know when the body of the scope has been started and ended. 
    * Unable to specify opening and closing of scope willgive error message
    * Proper indentation should be used to make your coding look neat and clean
    * Same signature must me use for display method.*/
}

 
