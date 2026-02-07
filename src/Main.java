import java.util.Scanner;

public class Main {

    public static int welcome(){
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Bienvenido, introduzca 1 para iniciar sesión o 2 para registrarse");
        option = sc.nextInt();

        return option;
    }

    public static User user(){
        Scanner sc = new Scanner (System.in);
        String user;
        String password;

        System.out.println("Introduzca su nombre de usuario");
        user = sc.nextLine();

        System.out.println("Introduzca su contraseña");
        password = sc.nextLine();

        return new User(user, password);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String password;
        int option;
        User userRegiser = null;

        do {
            option = welcome();
            switch (option) {
                case 1:
                    if (userRegiser == null) {
                        System.out.println("No hay un usuario registrado, por favor regístrese primero");
                        break;
                    }

                    System.out.println("Introduzca su nombre de usuario");
                    user = sc.nextLine();
                    System.out.println("Introduzca su contraseña");
                    password = sc.nextLine();

                    if (user.equals(userRegiser.getUser()) && password.equals(userRegiser.getPassword())) {
                        System.out.println("Bienvenido " + userRegiser.getUser());
                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;

                case 2:
                    userRegiser = user();
                    System.out.println("Usuario registrado con éxito");
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (option != 3);
    }
}

// P.D: Hazlo escalable. Puedes usar un ArrayList para almacenar más usuarios y quizás para almacenar ejercicio o reps.