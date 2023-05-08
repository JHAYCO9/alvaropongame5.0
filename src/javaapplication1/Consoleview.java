package javaapplication1;

import java.util.List;
import java.util.Scanner;

public class Consoleview extends Object {
    private Scanner scanner;
    
    public Consoleview(){
    this.scanner = new Scanner(System.in);
}
    
    public void mostrarTareas(List<Tarea> tareas){
        if (tareas.isEmpty()) {
            System.out.println("NO HAY TAREAS PENDIENTES.");
   
        } else{
            for (int i = 0; i < tareas.size(); i++) {
                Tarea tarea = tareas.get(i);
                String estado = tarea.estaCompletada() ? "COMPLETADA":
                "PENDIENTE";
                System.out.println((i+1) + ". " + tarea.getTitulo() + " (" + estado + ")");
                
                System.out.println("   Descripción: " + tarea.getDescripcion());
                
            }
        }
    }
    
    public int pedirOpcion(){
        System.out.print("Ingrese el numerode tarea que desea marcar como completada (o 0 para salir): ");
        return scanner.nextInt();
    }
    
    public void mostrarMensajes(String mensaje){
        System.out.println(mensaje);
    }
}
     
