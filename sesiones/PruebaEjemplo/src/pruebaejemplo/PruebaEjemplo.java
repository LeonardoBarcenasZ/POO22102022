/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Mayra
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombres = new String [5]; 
        
        nombres[0] = "Arturo";
        nombres[1] = "Rocio";
        nombres[2] = "Mayra";
        nombres[3] = "Ximena";   
        nombres[4] = "Gabriel";   

        for(String nombre : nombres)
        {

    }
        int [] idCliente = {7890731, 0601260, 33659596, 45388100, 53571505};
        int [] balance = {9000, 2000000,5000, 1000000, 7000};
        
        String Arturo     =  ("Nombre: " + nombres [0] + " ID del cliente: " + idCliente [0]+ " Saldo disponible: " + balance [0] );
        
        String Rocio     =  ("Nombre: " + nombres [1] + " ID del cliente: " + idCliente [1]+ " Saldo disponible: " + balance [1] );
        
        String Mayra     =  ("Nombre: " + nombres [2] + " ID del cliente: " + idCliente [2]+ " Saldo disponible: " + balance [2] );
        
        String Ximena     =  ("Nombre: " + nombres [3] + " ID del cliente: " + idCliente [3]+ " Saldo disponible: " + balance [3] );
        
        String Gabriel     =  ("Nombre: " + nombres [4] + " ID del cliente: " + idCliente [4]+ " Saldo disponible: " + balance [4] );
        
        System.out.println(Arturo);
        
        System.out.println(Rocio);
        
        System.out.println(Mayra);
        
        System.out.println(Ximena);
        
        System.out.println(Gabriel);
        
        String res = "";
        for (int i:balance){
            if( i < 50000){
                res = "Cliente Regular";
            }else{
                res = "Cliente Premium";
            }
        
            System.out.println("---------------------------------------");
            System.out.println( "Nivel de los clientes: "  + res );
            
        }
    }
    
}
