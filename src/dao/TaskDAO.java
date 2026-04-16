package dao;
import model.Task;
import ui.Menu;
import db.DBConnection; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDAO {

    public void newTask(Task task){ //Para añadir tareas a la base de datos
        Connection conn = DBConnection.getConnection();
        String sql = "insert into task (title, description, complete?, userID) values (?, ?, ?, ?)";
        try{ 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, task.getTitle());
        ps.setString(2, task.getDescription());
        ps.setBoolean(3, task.isCompleted());
        ps.setInt(4, task.getUserId());
        }catch(SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void listMyTasks(int userID){ //Para listar las taeas de mi usuario especifico
        String sql = "select * from task where userID = ?";
        try{
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Task task = new Task();
                task.setId(rs.getInt("id"));
                task.setTitle(rs.getString("title"));
                task.setDescription(rs.getString("description"));
                task.setCompleted(rs.getBoolean("completed"));
                task.setUserId(rs.getInt("userID"));
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void updateTask(Task task){
        String sql1 = "update task set title = ? were ";
        String sql2 = "update task set description = ?";
        String sql3 = "update task set completed = ?";
        try{
            Connection conn = DBConnection.getConnection();
            switch (menu.getOption()) {
                case 1:
                    PreparedStatement ps1 = conn.prepareStatement(sql1);
                    ps1.setString(1, task.setTitle());
                case 2:
                    
                case 3:
                    
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción del 1 al 3.");
            }
            PreparedStatement ps = conn.prepareStatement(sql);  
        }
        

    }

}

    

