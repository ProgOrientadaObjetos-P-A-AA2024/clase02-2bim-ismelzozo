/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        ArrayList<EstudiantePresencial> estudiantes = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer

            // Crear un objeto EstudiantePresencial y calcular la matrícula
            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced, edad, creditos, costo);
            presencial.calcularMatriculaPresencial();

            // Agregar el objeto al ArrayList
            estudiantes.add(presencial);

            // Preguntar si se desea ingresar otro estudiante
            System.out.println("¿Desea ingresar otro estudiante? (s/n)");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        // Mostrar los datos de todos los estudiantes ingresados
        for (EstudiantePresencial estudiante : estudiantes) {
            System.out.printf("%s\n", estudiante);
        }
    }
    /*// me permite utlizar asi sea el punto o la coma sin presentar errores (entrada.useLocale(Locale.US);)
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese nombre");
        String n = entrada.nextLine();
        System.out.println("Ingrese apellido");
        String ap = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String ced = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de créditos");
        int creditos = entrada.nextInt();
        System.out.println("Ingrese costo de créditos");
        double costo = entrada.nextDouble();
        
        EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced, 
                edad, creditos, costo);
        presencial.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", presencial);
    }
     */
}
