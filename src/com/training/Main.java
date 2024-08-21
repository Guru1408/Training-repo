package com.training;

class Person {
    // Encapsulation - name and age store the values privately
    private String name;
    private int age;

    // Constructor 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information (can be overridden by subclasses)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class for inheritance and polymorphism
class Student extends Person {
    // Added encapsulated fields
    private String studentID;
    private String grade;

    // Constructor for base class and derived class fields
    public Student(String name, int age, String studentID, String grade) {
        super(name, age); // Call to the base class constructor
        this.studentID = studentID;
        this.grade = grade;
    }

    // Overriding student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }

    // Getter and setter for the new details
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

// Teacher class for inheritance and polymorphism
class Teacher extends Person {
    // Added encapsulation details
    private String teacherID;
    private String subject;

    // Constructor for base class and derived class
    public Teacher(String name, int age, String teacherID, String subject) {
        super(name, age);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    // Overriding the teacher details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Subject: " + subject);
    }

    // Getter and setter for the new deatils
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Charan", 23, "J01", "A Grade");
        student.displayInfo();

        // Creating a Teacher object
        Teacher teacher = new Teacher("Suresh", 23, "J01", "QA Trainer");
        teacher.displayInfo();
    }
}

