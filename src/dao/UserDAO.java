package dao;
import model.User; //importacion de mi model user (/model/User)
import db.DBConnection; //Importacion de la configuracion de mi conexion (/db/DBConnction)
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserDAO {
    public void register(User user){ // métoto para creación de usuario.
        Connection conn = DBConnection.getConnection(); //habre la conexión
        String sql = "insert into users ( username, password) values (?, ?)";// -> Es un mensaje -> intruccion SQL
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString (1, user.getUsername()); 
            ps.setString (2, user.getPassword());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error:" + e.getMessage());
        } 
    }
    public User searchUserName (String username){//método para buscar usuario
        String sql = "select * from users where username = ?";
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString (1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
     }
     public boolean userExists(String username){//método para comprobar que usuario existe
        String sql = "select count(*) from users where username = ?"; 
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1)>0;
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return false;
     }
    }


