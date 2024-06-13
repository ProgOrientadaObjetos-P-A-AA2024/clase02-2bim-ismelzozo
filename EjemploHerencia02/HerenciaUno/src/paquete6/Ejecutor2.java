/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        
        while(bandera){
            System.out.println("ingresa un saludo");
            String saludo = entrada.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su identificacion: ");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            
            System.out.println("Ingrese el numero de creditos: ");
            int numeroCredito = entrada.nextInt();
            System.out.println("Ingrese el costo de creditos: ");
            double costoCredito = entrada.nextDouble();
            EstudiantePresencial ep = new EstudiantePresencial(nombre, saludo, 
                    cadena, edad, costoCredito, edad);
            ep.calcularMatriculaPresencial();
            entrada.nextLine();
            cadena = String.format("========\n%s\n========\nNombre:\n %s\n========\n"
                    + "Apellido:\n %s\n========\nIdentificacion:\n %s\n========\nEdad:\n %s\n========\n"
                    + "Numero de creditos:\n %s\n========\nCosto Credito:\n %.2f", saludo, 
                    nombre,apellido, identificacion, edad,numeroCredito,costoCredito);
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if(opcion.equals("S")){
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", cadena);
        
        
    }
}




