package ui;
import dao.TaskDAO;

public class MenuTaskUpdate extends MenuLogic{
    static TaskDAO taskDAO = new TaskDAO();
    static Integer idUser;
    
    public MenuTaskUpdate(int option) {
        super(option);
    }

    public void updateTask(){
        System.out.println("Q U E  T A R E A  D E S E A  A C T U A L I Z A R ?");
        taskDAO.listMyTasks(idUser);
    }   
}
