package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlDeleteDemo
{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Empl";
        String username = "root";
        String password = "Sanjana@24";
        final String QUERY = "delete from Empl where empno = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(QUERY);
            ps.setInt(1, 121);
            int no = ps.executeUpdate();
            System.out.println(no + " row/s affected");
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            con.close();
            ps.close();
        }
    }
}
