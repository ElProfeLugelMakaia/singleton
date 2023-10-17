package ui;

public class UserInterfaceHandler {

    public static void mostrarMenu() {
        System.out.println("Ingrese una opción del menú" +
                "\n 1. Agregar un empleado" +
                "\n 2. Realizar una impresion");
    }

    public static void solicitarNombreEmpleado() {
        System.out.println("Cordial saludo.\n Por favor, ingrese el nombre del empleado.\n Gracias de antemano");
    }

    public static void solicitarMensajeAImprimir(){
        System.out.println("Ingrese el mensaje a imprimir");
    }

    public static void opcionInvalida(){
        System.out.println("El valor ingresado no es valido, inténtelo nuevamente");
    }



}
