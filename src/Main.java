import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/hospital";

        String username = "root";
        String password = "Sa@98112!";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        System.out.println("Hello world!");
    }
}