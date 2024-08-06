
package prueba_figuras;

public class Triangulo {
    int base; 
    int altura; 

    public Triangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    double calcularArea() {
    return (base * altura / 2);
    }
    double calcularPerímetro() {
    return (base + altura + calcularHipotenusa());
    }
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
    }
    public String determinarTipoTriángulo() {
        String nuevo;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa())){
        nuevo = "Es un triángulo equilátero";}
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())){
        nuevo = "Es un triángulo escaleno";} 
        else{
        nuevo = "Es un triángulo isósceles";}
        return nuevo;
        }
}