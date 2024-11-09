/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionbibliotecas;

import java.util.TreeSet;

/**
 * 
 * 
 *
 * @author Usuario
 */
public class Gestion {

    private TreeSet<Libro> libros;
    private TreeSet<Usuario> usuarios;

    public Gestion() {
        libros = new TreeSet<>();
        usuarios = new TreeSet<>();
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void prestarLibro(String titulo) {
        Libro libroBuscado = buscarLibro(titulo);
        if (libroBuscado != null) {
            libroBuscado.prestar();
        } else {
            System.out.println("El libro no se encontró.");
        }
    }
    
    
    public void devolverLibro(String titulo) {
        Libro libroBuscado = buscarLibro(titulo);
        if (libroBuscado != null) {
            libroBuscado.devolver();
        } else {
            System.out.println("El libro no se encontró.");
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    private Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}