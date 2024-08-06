package ejercicio_2;

public class Calculadora_ejercicio2 {
    double lado, altura, perimetro, area;
    
    public Calculadora_ejercicio2(double lado){
        this.lado = lado;
    }
    double CalcularAltura(){
        return (lado * Math.sqrt(3)) / 2;
    }
    double CalcularArea(){
        return (lado * CalcularAltura()) / 2;
    }
    double CalcularPerimetro(){
        return 3 * lado;
    }
}
