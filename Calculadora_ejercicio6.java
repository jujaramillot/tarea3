package ejercicio_6;

public class Calculadora_ejercicio6 {
    double a, b, c;
    
    public Calculadora_ejercicio6(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double discriminante = Math.pow(b, 2) - (4 * a * c);
    
    String hallarSoluciones(){
        if (discriminante > 0) {
            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return("Las soluciones son " + solucion1 + " y " + solucion2);
        } else if (discriminante == 0) {
            double solucion = -b / (2 * a);
            return("La solución es " + solucion);
        } else {
            return("La ecuación no tiene soluciones reales.");
        }
    }
}
