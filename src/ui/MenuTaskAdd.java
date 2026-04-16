package ui;
import java.util.Scanner;
import dao.TaskDAO;
import model.Task;

public class MenuTaskAdd {
    static String title;
    static String description;
    static boolean isCompleted;
    static int userID;
    Scanner rd = new Scanner(System.in); 

    public void addTask(){
        System.out.println("Ingrese los parametros de la tarea");
        System.err.println("Titulo: ");
        title = rd.nextLine();
        System.out.println("Descripción: ");
        description = rd.nextLine();
        System.out.println("Estado: ");
        isCompleted = rd.nextBoolean();
        System.out.println("ID de usuadio: ");
        userID = rd.nextInt();

        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(isCompleted);
        task.setUserId(userID);

        TaskDAO taskDAO = new TaskDAO();
        taskDAO.newTask(task);
    }
}
