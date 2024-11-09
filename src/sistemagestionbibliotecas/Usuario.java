/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionbibliotecas;

/**
 *
 * @author Usuario
 */
public class Usuario implements Comparable<Usuario> {
    
    private String nombre;
    private String id;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" + 
                "nombre=" + nombre + 
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Usuario o) {
          return this.id.compareToIgnoreCase(o.getId());
          
    }   
    
    
}
