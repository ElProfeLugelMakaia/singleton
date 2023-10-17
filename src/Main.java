import models.Empleado;
import models.Nomina;
import ui.UserInterfaceHandler;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int AGREGAR_EMPLEADO = 1;
    private static final int REALIZAR_IMPRESION = 2;
    private static Scanner instance;

    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        while (true) {
            UserInterfaceHandler.mostrarMenu();

            switch (getScanner().nextInt()) {
                case AGREGAR_EMPLEADO:
                    nomina.addEmployee(getEmployeeName());
                    break;

                case REALIZAR_IMPRESION:
                    Empleado e = nomina.findOneByName(getEmployeeName());
                    while (e == null) {
                        UserInterfaceHandler.opcionInvalida();
                        e = nomina.findOneByName(getEmployeeName());
                    }
                    UserInterfaceHandler.solicitarMensajeAImprimir();
                    e.imprimir(getScanner().next());
                    break;
                default:
                    UserInterfaceHandler.opcionInvalida();
                    break;
            }
        }
    }

    private static String getEmployeeName() {
        UserInterfaceHandler.solicitarNombreEmpleado();
        String name = getScanner().next();
        if (name.contains(" ") && name.split(" ")[0].length() >= 3 && name.split(" ")[1].length() >= 3) {
            return name;
        }
        UserInterfaceHandler.opcionInvalida();
        return getEmployeeName();
    }

    private static Scanner getScanner() {
        if (instance == null) {
            instance = new Scanner(System.in).useDelimiter("\n");
        }
        return instance;
    }
}