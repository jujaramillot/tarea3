package ejercicio_5;

public class Calculadora_ejercicio5 {
    String nombre;
    double valHora, hora;
    
    public Calculadora_ejercicio5(String nombre, double valHora, double hora){
        this.hora = hora;
        this.valHora = valHora;
        this.nombre = nombre;
    } 
    String devolverValor(){
        double salario = hora * valHora;
        if (salario > 450000){
            return("El salario de "+ nombre + " es: " + salario);
        }
        else{
            return("El nombre es: " + nombre);
        }
    }
}
