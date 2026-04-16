package ui;
import java.util.Scanner;
import dao.TaskDAO;

public class MenuTaskList {
    static TaskDAO taskDAO = new TaskDAO();
    static Scanner rd = new Scanner(System.in);
    static Integer userID;

    public static void listTasks(){
        System.out.println("Ingrese su ID para listar sus tareras...");
        userID = rd.nextInt();
        taskDAO.listMyTasks(userID);
    }
}
