package ui;
import java.util.Scanner;
import dao.TaskDAO;
import dao.UserDAO;

public class MenuLogic extends Menu {
    MenuLogic(int option){
        super(option);
    }
    static UserDAO userDAO = new UserDAO();
    static Scanner rd = new Scanner(System.in);
    static Menu menu = new Menu();
    static int op;
    static boolean isRegistered;
    static String username;

    public static void ShowMenu(){
        // System.out.println("Ingrese su ID para iniciar sesión:");
        System.out.println("Ingresa tu nombre de usuario: ");
        username = rd.nextLine();

        userDAO.userExists(username);
        
        // if(){
        //     userDAO.registerUser();
        // }

        System.out.println("""
            B I E N V E N I D O  A L  T A S K  M A N A G E R
            Ingrese la opciones que desea...
            1. Añadir tarea
            2. Listar tareas
            3. Actualizar tarea
            4. Eliminar tarea
            5. Salir
            """);

        op = rd.nextInt();
        menu.setOption(op);

        switch (menu.getOption()) {
            case 1:
                // Lógica para añadir tarea
                break;
            case 2:
                MenuTaskList.listTasks();
                break;
            case 3:
                MenuTaskUpdate.ShowMenu();
                break;
            case 4:
                // Lógica para eliminar tarea
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese una opción del 1 al 5.");
        }
    }
}
