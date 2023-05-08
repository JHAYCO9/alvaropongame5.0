package javaapplication1;

import java.util.List;

public class TaskControler extends Object {
   private List<Tarea> tareas;
   private Consoleview vista;

    public TaskControler(List<Tarea> tareas, Consoleview vista) {
        this.tareas = tareas;
        this.vista = vista;
    }

   
   public void mostrarTareas(){
       vista.mostrarTareas(tareas);
   }
   
   public void crearTarea(String titulo, String descripcion){
       if (titulo == null || titulo.trim().isEmpty()) {
           vista.mostrarMensajes("EL TITULO DE LA TAREA NO PUEDE ESTAR VACIO");
           return;
       }
       
       Tarea tarea = new Tarea(titulo, descripcion);
       tareas.add(tarea);
       
       vista.mostrarMensajes("TAREA CREADA CON EXITO");
   }
   
   public void leerTarea(int numeroTarea){
       if (numeroTarea > 0 && numeroTarea <= tareas.size()) {
           Tarea tarea = tareas.get(numeroTarea - 1);
           vista.mostrarTareas(tareas);
       }else{
           vista.mostrarMensajes("NUMERO DE TAREA INVALIDO");
       }
   }
   
   public void actualizarTarea(int numeroTarea, String titulo, String descripcion, boolean completada){
       if (numeroTarea >  0 && numeroTarea <= tareas.size()) {
           Tarea tarea = tareas.get(numeroTarea - 1);
           
           if (titulo != null && !titulo.trim().isEmpty()) {
               tarea.setTitulo(titulo);
               
           }
           
           tarea.setDescripcion(descripcion);
           tarea.setCompletada(completada);
           
           vista.mostrarMensajes("TAREA ACTUALIZADA CON EXITO");
        }else{
           vista.mostrarMensajes("NUMERO DE TAREA INVALIDO");
       }
   }
   
   public void eliminarTarea(int numeroTarea){
       if (numeroTarea > 0 && numeroTarea <= tareas.size()) {
           tareas.remove(numeroTarea-1);
           vista.mostrarMensajes("TAREA ELIMINADA CON EXITO.");   
       }else{
           vista.mostrarMensajes("NUMERO DE TAREA INVALIDO");
       }
   }
}