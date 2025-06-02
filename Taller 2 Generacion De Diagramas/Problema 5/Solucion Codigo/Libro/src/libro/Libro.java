    package libro;

    public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String isbn, int anoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacion = anoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarInformacion() {
        System.out.println("--- Información del Libro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de Publicación: " + anoPublicacion);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("----------------------------");
    }

    @Override
    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + ", ISBN=" + isbn +
               ", Año=" + anoPublicacion + ", Páginas=" + numeroPaginas + "]";
    }
}

    class MainLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474704", 1967, 417);
        libro1.mostrarInformacion();

        System.out.println();

        Libro libro2 = new Libro();
        libro2.setTitulo("El Señor de los Anillos");
        libro2.setAutor("J.R.R. Tolkien");
        libro2.setIsbn("978-0618260274");
        libro2.setAnoPublicacion(1954);
        libro2.setNumeroPaginas(1178);
        libro2.mostrarInformacion();

        System.out.println(); 

        System.out.println("El autor de '" + libro1.getTitulo() + "' es: " + libro1.getAutor());
    }
}
