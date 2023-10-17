package models;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(String message) {
        Impresora.getInstance().imprimir(this.nombre, message);
    }

    public String getNombre() {
        return nombre;
    }
}
