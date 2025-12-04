// Archivo: src/biblioteca/Libro.java

import java.util.ArrayList;
import java.util.List;

public class Libro {

    // Representa un libro físico en la biblioteca
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private ArrayList<Integer> ejemplaresTotales;
    private List<Integer> ejemplaresDisponibles;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, ArrayList<Integer> ejemplaresTotales, ArrayList<Integer> ejemplaresDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion; // <- variable mal escrita
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
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

    public List<Integer> getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(List<Integer> ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public List<Integer> getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(List<Integer> ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public boolean estaDisponible() {
        if (ejemplaresDisponibles.isEmpty()) {
            return false;
        }
        return true;
    }

    public void prestarEjemplar() {
        if (!ejemplaresDisponibles.isEmpty()) {
            ejemplaresDisponibles--;
        }
    }

    public void devolverEjemplar() {
        ejemplaresDisponibles = ejemplaresDisponibles + 1;
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
