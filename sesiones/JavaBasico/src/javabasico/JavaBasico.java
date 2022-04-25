/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author Mayra
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println(dias + 3);
        int temp = Integer.parseInt(dias);
        System.out.println("Dias = " + (temp + 3));
        
        perro dog1 = new perro("Poddle", 1);
        perro dog2 = new perro("Poddle", 1);
        perro dog3 = new perro("Poddle", 1);
        System.out.println(dog1);
        System.out.println(perro.cola);
        System.out.println(dog1.cola);
        System.out.println(dog2.cola);
        System.out.println(dog3.cola);
      
        dog1.ladrar();
        dog2.ladrar();
        dog3.ladrar();
        
        String cad1 = "Hola ";
        String cad2 = "Mundo ";
        String cad3 = cad1 + cad2;
        System.out.println( cad3 );
        System.out.println("Edad : " + edad + "años" );
        
        String res = "";
        if (edad >= 18){
            res = "Mayor de edad";
        }else{
            res = "Menor de edad";
        }
        System.out.println("Eres :" + res );
        System.out.println("-----------");
        
        res = (edad >= 18)?" Mayor de edad":"Menor de edad";
        System.out.println("Eres :" + res );
        
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        /*
        val1 = 000...0111
        and
        val2 = 000...0010
       ----------------------
               000...0010 // 2 decimal
        */
        // desplazamiento a nivel de bits
        int val3 = 1; // 000...0001
        int val4 = val3<<1; //desplazar los bits una posiciion a la izquierda
                            //000.0000
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.out.println("-----Arreglos----");
        
        int [] edades; //aqui solo se declara
        int [] edades2 = new int[5]; //aqui se declara y se reserva memoria
        int [] edades3 = {22,21,20,19,18}; // en este se declara, se reserva e inicializa
        /*
        Ahora se usa igual como lengC, C++, Phyton, etc
        */
        edades2[0]=33;
        System.out.println( edades2[0] );
        System.out.println( edades2[0] );
    }
    
}
