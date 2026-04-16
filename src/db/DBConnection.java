package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/taskmanager";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection(){ 
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Error de conexion" + e.getMessage());
            return null;
        }
    }
}

//El pimer getConnection es el nombre del metodo, el segundo es el nombre del metodo de DiverManager. 
