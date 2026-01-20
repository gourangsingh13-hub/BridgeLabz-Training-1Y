import java.util.*;
class Student {
    int id;
    int age;
    String name;
    String status;
  void printDetails() {
  String college = "ABC College";
 System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }  public static void main(String[] args) {
   Student s1 = new Student();
        s1.id = 1251500584;
        s1.age = 18;
        s1.name = "Gourang";
        s1.status = "active";
        s1.printDetails();
    }
}


