package javaapplication1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        TaskController controller = new TaskController();

        controller.showTasks();

        System.out.println("¿Qué acción desea realizar? (crear, leer, actualizar, eliminar)");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine().toLowerCase();

        switch (action) {
            case "crear":
                controller.createTask();
                break;
            case "leer":
                controller.readTask();
                break;
            case "actualizar":
                controller.updateTask();
                break;
            case "eliminar":
                controller.deleteTask();
                break;
            default:
                System.out.println("Acción no válida. Saliendo del programa...");
                System.exit(0);
        }

        controller.showTasks();
    }
}
    
