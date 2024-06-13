
package paquete2;
/*
en estudiante presencial no tiene un constructor que que asemeje a la clase estudiante 
si en la super clase(estudiante) obligatoriamente se necesita tener en la subclase se necesita un costructor 
(estudiante presencial).
*/
public class EstudiantePresencial extends Estudiante{
    
    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
}
