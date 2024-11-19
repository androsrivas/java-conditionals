import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña,
        //si son iguales a los datos dados imprimirá en terminal: Acceso concedido,
        //si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta,
        //es decir, que no haga un salto de línea.

        String username = "admin";
        String password = "1234x";

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa nombre de usuario: ");
        String inputUsername = input.nextLine();

        System.out.print("Ingresa la contraseña: ");
        String inputPassword = input.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        input.close();


        input.close();


    }
}
