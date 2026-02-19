class Student {

    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void displayReport() {
        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Marks         : " + marks);
        System.out.println("Grade         : " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85);
        s1.displayReport();
    }
}
