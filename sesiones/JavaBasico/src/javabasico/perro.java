/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Mayra
 */
public class perro {
    private String raza;
    private int tamaño;
    static final String cola = "cola";

    public perro() {
    }

    public perro(String raza, int tamaño) {
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "perro{" + "raza=" + raza + ", tama\u00f1o=" + tamaño + '}';
    }
    public void comer(){
        System.out.println("El perro de raza "+this.raza);
        System.out.println("Esta comiendo...");
    }
    public void ladrar(){
        System.out.println("Wof wof wof");
    }
}
