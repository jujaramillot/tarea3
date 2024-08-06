package ejercicio_4;

public class Calculadora_ejercicio4 {
    double patrimonio, matricula;
    int estrato;
    String nombre, numInscripcion;
    
    public Calculadora_ejercicio4(double patrimonio, double matricula, int estrato,String nombre, String numInscripcion){
        this.estrato = estrato;
        this.patrimonio = patrimonio;
        this.matricula = matricula;
    }
  
    String calcularMatricula(){
        matricula = 50000;

        if (patrimonio > 2000000 && estrato > 3) {
            matricula = matricula + (0.03*patrimonio);
        }
        return("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numInscripcion + 
                " Y NOMBRE " + nombre + " DEBE PAGAR: $" + matricula);
    }
}
