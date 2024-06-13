
package paquete3;

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    /*
    el cosntructor de estudiante distancia 
    */
    public EstudianteDistancia(String n, String ap, String iden, int e){
        super(n, ap, iden, e);
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Reals
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    /*

    @Override
    public String toString() {
        String toString = String.format("===================================\n"
                + "Nombre estudiante: %s\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de asigantura: %.2f\n"
                + "Valor matricula: %.2f", 
                obtenerNombresEstudiante(),
                numeroAsignaturas,costoAsignatura,
                obtenerMatriculaDistancia());
        return toString; 
    }
    */
    @Override
    public String toString() {
        String toString = String.format("============================\n"
                + "%s"
                + "============================\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de asigantura: %.2f\n"
                + "Valor matricula: %.2f"
                + "\n============================\n",
                super.toString(),
                numeroAsignaturas,costoAsignatura,
                obtenerMatriculaDistancia());
        return toString; 
    }

}
