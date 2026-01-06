import java.sql.*;
public class dataBase1 {
    public static void main(String[] args)throws Exception {
       Class.forName("org.sqlite.JDBC");
       Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
       Statement st = con.createStatement();

       ResultSet rs = st.executeQuery("select * from students");
       while(rs.next()){
        System.out.print(rs.getInt("roll")+" ");
        System.out.print(rs.getString("city")+" ");
        System.out.print(rs.getInt("deptno")+" ");
        }
    }
}
