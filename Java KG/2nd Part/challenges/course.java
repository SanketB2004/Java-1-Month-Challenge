package challenges;

class course {
    String[] enrolledStudents;

    static int maxcapacity = 30;
int enrollment;
    String courseName;
    String enrroledStudent;

     
    course(String courseName) {
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxcapacity];
    }
    //String[] enrolledStudents=new String[maxcapacity];
    
    static void setMaxCapacity(int capacity) {
        course.maxcapacity = capacity;
    }


void enrollStudent(String studentName) {

enrolledStudents[enrollment] = studentName;
enrollment++;

}
void unenrollStudent(String studentName) {
    
    System.out.println("Student Removed");
    enrollment--;
    }
}