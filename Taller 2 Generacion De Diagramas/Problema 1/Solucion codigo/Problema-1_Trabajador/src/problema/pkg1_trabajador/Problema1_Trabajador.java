package problema.pkg1_trabajador;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Trabajador {

    public static void main(String[] args) {
        AplicacionPrincipal miApp = new AplicacionPrincipal();
        miApp.inicializarTrabajadores();
        miApp.mostrarTrabajadores();
    }
}

class Trabajador {
    public String nombres;
    public String apellidos;
    public double sueldo;
    public String dni;

    public Trabajador(String nombres, String apellidos, double sueldo, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.dni = dni;
    }

    public Trabajador() {
    }

    public void establecerNombres(String nombres) {
        this.nombres = nombres;
    }

    public void establecerApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void establecerDni(String dni) {
        this.dni = dni;
    }

    public String obtenerNombres() {
        return this.nombres;
    }

    public String obtenerApellidos() {
        return this.apellidos;
    }

    public double obtenerSueldo() {
        return this.sueldo;
    }

    public String obtenerDni() {
        return this.dni;
    }

    @Override
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", dni=" + dni + "]";
    }
}

class AplicacionPrincipal {
    private List<Trabajador> listaTrabajadores;

    public AplicacionPrincipal() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public void inicializarTrabajadores() {
        Trabajador t1 = new Trabajador("Ana", "Gomez", 1200.50, "0987654321");
        this.listaTrabajadores.add(t1);

        Trabajador t2 = new Trabajador();
        t2.establecerNombres("Luis");
        t2.establecerApellidos("Perez");
        t2.establecerSueldo(1500.00);
        t2.establecerDni("1234567890");
        this.listaTrabajadores.add(t2);

        Trabajador t3 = new Trabajador("Maria", "Rodriguez", 1350.75, "0912345678");
        this.listaTrabajadores.add(t3);

        Trabajador t4 = new Trabajador("Carlos", "Sanchez", 1100.25, "0987654322");
        this.listaTrabajadores.add(t4);

        System.out.println("Se han inicializado 4 trabajadores en la colección.");
    }

    public void mostrarTrabajadores() {
        System.out.println("\n--- Lista de Trabajadores ---");
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t.toString());
        }
        System.out.println("-----------------------------");
    }
}