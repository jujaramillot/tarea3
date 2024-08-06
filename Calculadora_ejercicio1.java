
package ejercicio_1;

public class Calculadora_ejercicio1 {
    double horas_tr, vl_hora, retencion;
    
    public Calculadora_ejercicio1(double horas_tr, double vl_hora, double retencion){
        this.horas_tr = horas_tr;
        this.vl_hora = vl_hora;
        this.retencion = retencion;
    }
    double CalcularBruto(){
        return vl_hora * horas_tr;
    }
    double CalcularRetenido(){
        return CalcularBruto() * (retencion/100);
    }
    double CalcularNeto(){
        return CalcularBruto() - CalcularRetenido();
    }
}
