import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("seaTest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student st = (Student) ois.readObject();  // 🔓 Deserialization
            st.display();

            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Deserialization Failed: " + e);
        }
    }
}
