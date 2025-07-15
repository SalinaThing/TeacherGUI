/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher //defines Teacher class
{
    private int teacherId;   // declares six attributes
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor with five parameter
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //create getter/accessor methods for all variables
    public int getTeacherId()
    {
        return this.teacherId;
    }
    public String getTeacherName()
    {
        return this.teacherName;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getEmploymentstatus()
    {
        return this.employmentStatus;
    }
    public int getWorkingHours() {
        return this.workingHours;
    }
     
    //create setter/modifier methods for WorkingHours
    public void setWorkingHours(int workingHours) 
    {
        this.workingHours =workingHours;
    }
    // Display method of Teacher
    public void displayTeacherInfo() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);

        if (workingHours > 0) {
            System.out.println("Working Hours: " + workingHours);
        } else {
            System.out.println("Working Hours: Not Assigned");
        }
    }
    /**
 * compiler.need to know when the body of the scope has been started and ended. 
 * Unable to specify opening and closing of scope willgive error message
 * Proper indentation should be used to make your coding look neat and clean */
}
