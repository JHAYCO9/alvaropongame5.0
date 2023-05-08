package javaapplication1;


public class Tarea extends Object {
     private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaCompletada() {
        return completada;
    }
    
    public void completar(){
        this.completada = true;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

  

    
}
