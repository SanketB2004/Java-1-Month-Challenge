package challenges;

class course {
    static int maxcapacity = 30;
int enrollment;
    String courseName;
    String enrroledStudent;

    String[] enrolledStudents=new String[maxcapacity];
    
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