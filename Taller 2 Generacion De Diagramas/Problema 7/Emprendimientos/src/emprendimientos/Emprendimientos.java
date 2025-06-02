package emprendimientos;

    import java.time.LocalDate;
import java.time.Period;

public class Emprendimientos {

    public static void main(String[] args) {
     
        Emprendimiento emprendimiento1 = new Emprendimiento(
            "Cafetería El Aroma",
            "1100123456001",
            "Gastronomía",
            "María Pérez",
            "Calle Bolívar y Sucre",
            LocalDate.of(2020, 5, 15),
            5000.0
        );

        System.out.println("--- Información Inicial del Emprendimiento 1 ---");
        emprendimiento1.mostrarInformacion();

        emprendimiento1.setCapitalInicial(7500.0);
        emprendimiento1.setUbicacion("Av. Pío Jaramillo, Centro Comercial");

        System.out.println("\n--- Información Actualizada del Emprendimiento 1 ---");
        emprendimiento1.mostrarInformacion();
        System.out.println("Antigüedad: " + emprendimiento1.calcularAntiguedadEnAnos() + " años");
        System.out.println("Tipo de Negocio: " + emprendimiento1.determinarTipoNegocio());

        System.out.println("\n--- Creando Emprendimiento 2 ---");
        Emprendimiento emprendimiento2 = new Emprendimiento(
            "TecnoSoluciones Loja",
            "1100654321001",
            "Tecnología",
            "Juan López",
            "Av. Universitaria 123",
            LocalDate.of(2018, 1, 1),
            60000.0
        );
        emprendimiento2.mostrarInformacion();
        System.out.println("Antigüedad: " + emprendimiento2.calcularAntiguedadEnAnos() + " años");
        System.out.println("Tipo de Negocio: " + emprendimiento2.determinarTipoNegocio());

        System.out.println("\n--- Creando Emprendimiento 3 ---");
        Emprendimiento emprendimiento3 = new Emprendimiento(
            "Modas Trendy",
            "1100987654001",
            "Moda",
            "Ana García",
            "Centro Histórico Local 5",
            LocalDate.of(2015, 10, 1),
            300000.0
        );
        emprendimiento3.mostrarInformacion();
        System.out.println("Antigüedad: " + emprendimiento3.calcularAntiguedadEnAnos() + " años");
        System.out.println("Tipo de Negocio: " + emprendimiento3.determinarTipoNegocio());
    }
}

class Emprendimiento {
    private String nombreComercial;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private LocalDate fechaInicioActividades;
    private double capitalInicial;

    public Emprendimiento(String nombreComercial, String ruc, String sectorEconomico, String propietario, String ubicacion, LocalDate fechaInicioActividades, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicioActividades = fechaInicioActividades;
        this.capitalInicial = capitalInicial;
    }


    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFechaInicioActividades() {
        return fechaInicioActividades;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInicioActividades(LocalDate fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public int calcularAntiguedadEnAnos() {
        return Period.between(this.fechaInicioActividades, LocalDate.now()).getYears();
    }

    public String determinarTipoNegocio() {
        if (capitalInicial < 10000) { 
            return "Micro Negocio";
        } else if (capitalInicial >= 10000 && capitalInicial < 100000) {
            return "Pequeño Negocio";
        } else {
            return "Mediano Negocio";
        }
    }

    public void mostrarInformacion() {
        System.out.println("------------------------------------");
        System.out.println("Nombre Comercial: " + nombreComercial);
        System.out.println("RUC: " + ruc);
        System.out.println("Sector Económico: " + sectorEconomico);
        System.out.println("Propietario: " + propietario);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Fecha Inicio Actividades: " + fechaInicioActividades);
        System.out.printf("Capital Inicial: $%.2f\n", capitalInicial);
        System.out.println("------------------------------------");
    }
}
