// Archivo: src/biblioteca/Libro.java

import java.util.ArrayList;
import java.util.List;

public class Libro {

    // Representa un libro físico en la biblioteca
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, int ejemplaresTotales) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion; // <- variable mal escrita
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresTotales;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public boolean estaDisponible() {
        return ejemplaresDisponibles > 0;
    }

    public void prestarEjemplar() {
        if (estaDisponible()) ejemplaresDisponibles--;
    }

    public void devolverEjemplar() {
        if (ejemplaresDisponibles < ejemplaresTotales) ejemplaresDisponibles++;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", ejemplaresTotales=" + ejemplaresTotales +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                '}';
    }
}
