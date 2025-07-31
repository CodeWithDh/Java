package students;

public class students {
    String name;
    int rollNo;
    int marks;

    // Constructor Overloading
    public students(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = 88;
    }

    public void display() {
        System.out.println("Student Name: " + name + " | Roll Number: " + rollNo +
                (marks != -1 ? " | Marks: " + marks : ""));
    }
}
