package instituciondeportiva;
    import java.util.ArrayList;
import java.util.List;
public class InstitucionDeportiva {

   
    public static void main(String[] args) {
     

        InstitucionEducativaPrimaria institucion1 = new InstitucionEducativaPrimaria("Colegio San Jose", "Primaria", 250, 15, 10);
        InstitucionEducativaPrimaria institucion2 = new InstitucionEducativaPrimaria("Escuela La Esperanza", "Primaria", 300, 20, 12);
        InstitucionEducativaPrimaria institucion3 = new InstitucionEducativaPrimaria("Instituto ABC", "Primaria", 200, 12, 8);
        InstitucionEducativaPrimaria institucion4 = new InstitucionEducativaPrimaria("Colegio Nueva Vida", "Primaria", 280, 18, 11);

        System.out.println("Informacion de Instituciones Educativas:");
        System.out.println(institucion1.toString());
        System.out.println(institucion2.toString());
        System.out.println(institucion3.toString());
        System.out.println(institucion4.toString());

        institucion1.setNumeroAlumnos(260);
        System.out.println("\nNumero de alumnos actualizado para " + institucion1.getNombre() + ": " + institucion1.getNumeroAlumnos());
    }
}

class InstitucionEducativaPrimaria {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroAulas;

    public InstitucionEducativaPrimaria(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroAulas) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroAulas = numeroAulas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return this.numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroAulas() {
        return this.numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Tipo: " + tipoInstitucion +
               ", Alumnos: " + numeroAlumnos +
               ", Docentes: " + numeroDocentes +
               ", Aulas: " + numeroAulas;
    }
}