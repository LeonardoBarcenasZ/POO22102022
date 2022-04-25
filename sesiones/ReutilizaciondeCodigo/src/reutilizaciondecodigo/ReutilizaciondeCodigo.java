/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipo.Computadora;
import ico.fes.herencia.Alumno;

/**
 *
 * @author Mayra
 */
public class ReutilizaciondeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu= new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook 2");
        compu.setCpu( new Procesador("Intel","i9", 5.0f));
        
        Mouse raton= new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        
        compu.getRaton().setModelo("Gs400");
        System.out.println( compu );
        
        System.out.println(" ----- Herencia ----");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println( alu1 );
        
        Alumno alu2=new Alumno("319073830", "derecho", 2, "Mario", 20);
        System.out.println( alu2 );
        
        
        
    }
    
}
