/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudiantePresencial ep = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        ep.establecerNumeroCreditos(100);
        ep.establecerCostoCredito(5);
        ep.calcularMatriculaPresencial();
        
        System.out.println(ep);

    }
}
