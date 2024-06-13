
package paquete6;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    public EstudiantePresencial(String n, String a, String iden, int ed){
        super(n, a, iden, ed);
    }
    
    public EstudiantePresencial(String n, String a, String iden, int ed, 
            double costo, int creditos){
        super(n, a, iden, ed);
        costoCredito = costo;
        numeroCreditos = creditos;
    }
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
    @Override
    public String toString() {
        String toString = String.format("==========================\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n"
                + "=========================\n"
                + "Numero de creditos: %s\n"
                + "Valor de credito: %.2f\n"
                + "Matricula: %.2f\n"
                + "=========================",
                nombresEstudiante,
                obtenerApellidoEstudiante(),
                identificacionEstudiante,
                numeroCreditos,
                costoCredito,
                obtenerMatriculaPresencial());
        return toString; 
    }
    
}
