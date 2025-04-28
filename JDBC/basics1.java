
import java.sql.*;



public class basics1 {
        public static void main(String[] args) {
            String constr = "jdbc:mysql://localhost/ri_db";
            String user = "test";
            String pwd = "test123";
            try {
                Connection cn = DriverManager.getConnection(constr,user,pwd);
                Statement st = cn.createStatement();
                System.out.println("Statememnt created");
                st.executeUpdate("create table Students(roll int, name varchar(15),cgpa int )");
                System.out.println("Table created");
                st.executeUpdate("insert into Students value(1,'Aayush',8)");
                st.executeUpdate("insert into Students value(2,'Soni',7)");
                st.executeUpdate("insert into Students value(3,'Rita',6)");
                st.executeUpdate("insert into Students value(4,'Ankur',5)");
                st.executeUpdate("insert into Students value(5,'Ayush',4)");
                System.out.println("Data Entered and saved");

                ResultSet rs = st.executeQuery("select * from Students");
                while(rs.next()){
                    System.out.println("Student roll numbver is  "+rs.getInt(1)+" Name is "+rs.getString(2)+" CGPA is "+rs.getInt(3));
                }
                rs.close();
                st.close();
                cn.close();

            } catch (Exception e) {
                
            }
            
        }
}
