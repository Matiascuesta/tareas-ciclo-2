package escenarios;
public class Escenarios {

    public static void main(String[] args) {
        EscenarioDeportivo escenario1 = new EscenarioDeportivo("Estadio Loja", 12000, "Av. Occidental", 10, 5, 4);
        EscenarioDeportivo escenario2 = new EscenarioDeportivo("Coliseo Ciudad de Loja", 5000, "Calle Sucre", 5, 3, 2);
        EscenarioDeportivo escenario3 = new EscenarioDeportivo("Piscina Olímpica", 800, "Bolívar y Lourdes", 2, 1, 1);
        EscenarioDeportivo escenario4 = new EscenarioDeportivo("Estadio Reina del Cisne", 10000, "Av. 8 de Diciembre", 8, 4, 3);

        System.out.println("Información de los Escenarios Deportivos:");
        System.out.println(escenario1);
        System.out.println(escenario2);
        System.out.println(escenario3);
        System.out.println(escenario4);

       
    }
}

class EscenarioDeportivo {
    private String nombre;
    private int numeroEspectadores;
    private String direccion;
    private int numeroLocalesComerciales;
    private int numeroPuertasEntrada;
    private int numeroCamerinos;

    public EscenarioDeportivo(String nombre, int numeroEspectadores, String direccion, int numeroLocalesComerciales, int numeroPuertasEntrada, int numeroCamerinos) {
        this.nombre = nombre;
        this.numeroEspectadores = numeroEspectadores;
        this.direccion = direccion;
        this.numeroLocalesComerciales = numeroLocalesComerciales;
        this.numeroPuertasEntrada = numeroPuertasEntrada;
        this.numeroCamerinos = numeroCamerinos;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getNumeroEspectadores() {
        return numeroEspectadores;
    }

    private void setNumeroEspectadores(int numeroEspectadores) {
        this.numeroEspectadores = numeroEspectadores;
    }

    private String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private int getNumeroLocalesComerciales() {
        return numeroLocalesComerciales;
    }

    private void setNumeroLocalesComerciales(int numeroLocalesComerciales) {
        this.numeroLocalesComerciales = numeroLocalesComerciales;
    }

    private int getNumeroPuertasEntrada() {
        return numeroPuertasEntrada;
    }

    private void setNumeroPuertasEntrada(int numeroPuertasEntrada) {
        this.numeroPuertasEntrada = numeroPuertasEntrada;
    }

    private int getNumeroCamerinos() {
        return numeroCamerinos;
    }

    private void setNumeroCamerinos(int numeroCamerinos) {
        this.numeroCamerinos = numeroCamerinos;
    }

    @Override
    public String toString() {
        return "EscenarioDeportivo{" +
                "nombre='" + nombre + '\'' +
                ", numeroEspectadores=" + numeroEspectadores +
                ", direccion='" + direccion + '\'' +
                ", numeroLocalesComerciales=" + numeroLocalesComerciales +
                ", numeroPuertasEntrada=" + numeroPuertasEntrada +
                ", numeroCamerinos=" + numeroCamerinos +
                '}';
    }
}