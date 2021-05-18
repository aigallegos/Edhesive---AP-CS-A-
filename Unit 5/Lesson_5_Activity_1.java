public class Student {
    public String firstName;
    public String lastName;
    public int gradeLevel;
    public double gpa;
    public static int idNumber;
    
    public Student() {
        this.firstName = "None";
        this.lastName = "None";
        this.gradeLevel = 0;
        this.gpa = 0.0;
        this.idNumber = idNumber;
        idNumber ++;
    }
    
    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        if ((gradeLevel >= 0)&&(gradeLevel <= 12)) {
            this.gradeLevel = gradeLevel;
        }
        else {
            this.gradeLevel = 0;
        }
        if ((gpa >= 0.0)&&(gpa <= 4.5)) {
            this.gpa = gpa;
        }
        else {
            this.gpa = 0.0;
        }
        this.idNumber = idNumber;
        idNumber ++;
    }
    
    public String toString() {
        String str = this.lastName + ", " + this.firstName + "\nGPA: " + this.gpa + "\nGrade Level: " + this.gradeLevel + " id # " + this.idNumber;
        return str;
    }
}
