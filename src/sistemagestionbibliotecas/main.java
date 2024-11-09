/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionbibliotecas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    
    public static void main(String[] args) {
        Gestion biblioteca = new Gestion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");    
            System.out.println("5. Mostrar libros");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor));
                    break;
                case 2:
                    System.out.print("Nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID del usuario: ");
                    String id = scanner.nextLine();
                    biblioteca.agregarUsuario(new Usuario(nombre, id));
                    break;
                case 3:
                    System.out.print("Título del libro a prestar: ");
                    String tituloP = scanner.nextLine();
                    biblioteca.prestarLibro(tituloP);
                    break;
                case 4:
                    System.out.print("Título del libro a devolver: ");
                    String tituloD = scanner.nextLine();
                    biblioteca.devolverLibro(tituloD);
                    break;
                case 5:
                    biblioteca.mostrarLibros();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    
}
