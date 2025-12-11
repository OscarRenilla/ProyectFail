import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BibliotecaApp {

    private static final Scanner scanner = new Scanner(System.in);
    private BibliotecaService servicio;

    public BibliotecaApp() {
        servicio = new BibliotecaService();
    }

    public static void main(String[] args) {
        new BibliotecaApp().ejecutarMenu();
    }

    private void ejecutarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            imprimirMenu();

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                opcion = -1;
            }

            if (opcion == 1) {
                registrarLibroDesdeConsola();
            } else if (opcion == 2) {
                registrarUsuarioDesdeConsola();
            } else if (opcion == 3) {
                prestarLibroDesdeConsola();
            } else if (opcion == 4) {
                devolverLibroDesdeConsola();
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion no valida");
            }
        }
        scanner.close();
    }

    private void imprimirMenu() {
        System.out.println("\n=== GESTIÓN BIBLIOTECA ===");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("0. Salir");
        System.out.println("Opción: ");
    }

    private void registrarLibroDesdeConsola() {
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Título: ");
        String titulo = scanner.nextLine();
        System.out.println("Autor: ");
        String autor = scanner.nextLine();
        System.out.println("Año publicación: ");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.println("Ejemplares totales: ");
        int totales = Integer.parseInt(scanner.nextLine());

        Libro libro = new Libro(isbn, titulo, autor, anio, totales);
        servicio.registrarLibro(libro);

        System.out.println("Libro registrado correctamente");
    }

    private void registrarUsuarioDesdeConsola() {
        System.out.println("ID usuario: ");
        String id = scanner.nextLine();
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine(); 

        Usuario usuario = new Usuario(id, nombre);
        servicio.registrarUsuario(usuario);

        System.out.println("Usuario registrado correctamente");
    }

    private void prestarLibroDesdeConsola() {
        System.out.println("ID usuario: ");
        String id = scanner.nextLine();
        System.out.println("ISBN libro: ");
        String isbn = scanner.nextLine();

        servicio.prestarLibro(id, isbn);
    }

    private void devolverLibroDesdeConsola() {
        System.out.println("ID usuario: ");
        String id = scanner.nextLine();
        System.out.println("ISBN libro: ");
        String isbn = scanner.nextLine();

        servicio.devolverLibro(id, isbn);
    }
}
