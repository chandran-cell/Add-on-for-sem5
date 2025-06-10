package day4;
class Calculator {
    
    public int sum(int a, int b) {
        return a + b;
    }

   
    public double sum(double a, double b) {
        return a + b;
    }
}


class Student {
    private String name;
    private int rollNo;
    private int marks;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = 0;  
    }

    public void assignMarks(int marks) {
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Student: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
    }
}


public class StudtMantSystem {

    public static void main(String[] args) {
       
        Calculator calc = new Calculator();
        System.out.println("Sum of int: " + calc.sum(10, 20));
        System.out.println("Sum of double: " + calc.sum(10.5, 20.7));

       

        
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

       
        s1.assignMarks(75);
        s2.assignMarks(35);

       
        s1.displayResult();
        
        s2.displayResult();
    }
}



