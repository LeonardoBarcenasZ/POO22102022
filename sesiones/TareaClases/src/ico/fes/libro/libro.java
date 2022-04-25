/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

import ico.fes.clases.autor;
import ico.fes.clases.editorial;

/**
 *
 * @author Mayra
 */
public class libro {
    private String nombre;
    private float numPaginas;
    private autor autor;
    private editorial editorial;

    public libro() {
    }

    public libro(String nombre, float numPaginas, autor autor, editorial editorial) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(float numPaginas) {
        this.numPaginas = numPaginas;
    }

    public autor getAutor() {
        return autor;
    }

    public void setAutor(autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "libro{" + "nombre=" + nombre + ", numPaginas=" + numPaginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
}
