public class Course 
{ 
    //defining class attributes
    private String courseID;
    private String course_name;
    private String course_leader;
    private int duration;
    //initializing constructor
    public Course(String courseID, String course_name, int duration) 
    {
        this.courseID = courseID;
        this.course_name = course_name;
        this.duration = duration;
        this.course_leader = "";
    }
    //defining accessor methods
    public String getCourseID() 
    {
        return courseID; //getCourseID method returns the value of courseID as string datatype
    }

    public String getCourse_name() 
    {
        return course_name;   //getCourse_name method returns the value of course_name as string datatype
    }

    public int getDuration() 
    {
        return duration;    //getDuration method returns the value of duration as int datatype
    }

    public String getCourse_leader() 
    {
        return course_leader;     //getCourse_leader method returns the value of course_leader as string datatype
    }
    //method to set the course_leader's newname
    public void setCourse_leader(String newname) 
    {
        course_leader = newname;
    }
    // method to display all information of the Course
    public void display() 
    {
        System.out.println(" The courseID is : " +courseID);
        System.out.println(" The name of the course is : " +course_name);
        System.out.println(" The duration is : " +duration);
         if (course_leader != "") {
            System.out.println(" The name of the course leader is : "+course_leader);
        }
    }
}
 