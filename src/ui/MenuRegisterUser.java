package ui;
import dao.UserDAO;
import java.util.Scanner;
import model.User;

public class MenuRegisterUser {
    static String username;
    static String password;
    static Scanner rd = new Scanner(System.in);
    static UserDAO userDAO = new UserDAO();

    public static  void InsertUser() {
        System.out.println("Ingrese su nombre: ");
        username = rd.nextLine();
        System.out.println("Ingrese su contraseña: ");
        password = rd.nextLine();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userDAO.register(user);
    }
}
