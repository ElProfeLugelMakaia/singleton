package models;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> employees;

    public Nomina() {
        this.employees = new ArrayList<>();
    }

    public Empleado addEmployee(String name) {
        Empleado e = new Empleado(name);
        this.employees.add(e);
        return e;
    }

    public Empleado findOneByName(String name) {
        for (Empleado e : this.employees) {
            if (e.getNombre().toLowerCase().contains(name.toLowerCase())) {
                return e;
            }
        }
        return null;
    }
}

