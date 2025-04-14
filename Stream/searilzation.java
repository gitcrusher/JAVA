import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String a, int b) {
        name = a;
        age = b;
    }

    void display() {
        System.out.println("Name is - " + name + ", age is - " + age);
    }
}

public class searilzation {
    public static void main(String[] args) {
        Student st = new Student("Aayush", 10);

        try {
            FileOutputStream fos = new FileOutputStream("seaTest.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st);  // ✅ Serialization

            oos.close();
            fos.close();

            System.out.println("Serialization Done");
        } catch (Exception e) {
            System.out.println("Serialization Failed: " + e);
        }
    }
}
