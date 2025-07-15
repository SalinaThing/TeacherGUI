
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher //defines Tutor class
{
    private double salary; //declares five attributes
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor of child or subclass with ten parameters
    public Tutor(int teacherId, String teacherName, String address, String workingType,
                 String employmentStatus, int workingHours, double salary, String specialization,
                 String academicQualifications, int performanceIndex) 
    {
        // Calling the superclass constructor with five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        // Setting additional attributes
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; // Initialized to false
    }

    // Accessor/getter methods of Tutor class
    public double getSalary() 
    {
        return this.salary;
    }

    public String getSpecialization() 
    {
        return this.specialization;
    }

    public String getAcademicQualifications() 
    {
        return this.academicQualifications;
    }

    public int getPerformanceIndex() 
    {
        return this.performanceIndex;
    }

    public boolean getisCertified() {
        return this.isCertified;
    }

    // Mutator method for salary
    public void setSalary(double salary, int performanceIndex) 
    {
        // Assuming getWorkingHours() is the correct method to retrieve working hours
        if (performanceIndex >= 5) 
        {
            if(getWorkingHours() > 20) 
            {
                double appraisalPercentage;
                if (performanceIndex >= 5 && performanceIndex <= 7) 
                {
                    appraisalPercentage = 0.05;
                } 
                else if(performanceIndex >=8 && performanceIndex <=9) 
                {
                    appraisalPercentage = 0.1;
                } 
                else if(performanceIndex ==10) 
                {
                appraisalPercentage = 0.2; 
                }else
                {
                    appraisalPercentage=0;//default for other performance index
                }
                // Calculate salary after appraisal
                salary =salary+salary * appraisalPercentage;
        
                this.salary=salary;
                this.performanceIndex=performanceIndex;

                // Set isCertified to true after appraisal
                isCertified = true;
            } 
        }
        //if conditionjust in casethe salary cannot be updated
        if(isCertified ==false)
        {
            System.out.println("Salary cannot be approved");
        
        }
    }
    
    // Method to remove Tutor
    public void removeTutor() {
        //check whether the tutor has not been certified yet
        if (isCertified==false) {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;

            isCertified = false;// Set isCertified to false
        }
        else{
            System.out.println("Cannot certified tutor");
        }
    }

    // create a display method with samesignature as teacher class
    public void displayTeacherInfo() {
        super.displayTeacherInfo();
        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
    /**
    * compiler.need to know when the body of the scope has been started and ended. 
    * Unable to specify opening and closing of scope willgive error message.
    * Proper indentation should be used to make your coding look neat and clean.
    * Same signature must me use for display method.
    * proper knowlege about inheritance,encapsulation and so on can make your code more systematically.*/
}