package ejercicio_3;

public class Calculadora_ejercicio3 {
   double a, b; 
   
   public Calculadora_ejercicio3(double a, double b){
       this.a = a;
       this.b = b;
   } 
   public String mirarMayor(){
       String nuevo;
       if (a>b) {
            nuevo = "El primer valor es mayor que el segundo";
        }
        else {
            if (a == b) {
                nuevo = "Los valores son iguales";
            }
            else {
                nuevo = "El segundo valor es mayor que el primero";
            }
        }
       return nuevo;
   }
}
