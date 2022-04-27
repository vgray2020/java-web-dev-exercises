package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        double newQualityScore = grade * courseCredits;

        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        double newGpa = newTotalQualityScore/newTotalNumberOfCredits;
        this.gpa = newGpa;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 38 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 68 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null;
        }
    }


    @Override
    public String toString() {
        return this.name + ":" + this.gpa;
    }
    @Override
    public boolean equals (Object obj) {
        if ((obj instanceof Student) == false);

        Student myStudentObj = (Student) obj;

        if (myStudentObj.name.equals(this.name)) {
            return true;
        }
        else {
            return false;
        }
    }
}
