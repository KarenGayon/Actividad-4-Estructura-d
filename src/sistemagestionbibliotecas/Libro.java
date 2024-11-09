/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionbibliotecas;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

       
    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar(){
        if(disponible){
            disponible=false;
        }else {
            System.out.println("El libro no esta disponible");
        }
    }
    
    public void devolver() {
        disponible=true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + '\'' +
               ", autor=" + autor + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) &&
               Objects.equals(autor, libro.autor);
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareToIgnoreCase(o.getTitulo());
        }

    }
    
    
    
 
  