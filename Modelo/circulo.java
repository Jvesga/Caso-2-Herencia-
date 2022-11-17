package Modelo;

public class circulo extends Figura
{
    private double r;

    // Constructor
    public circulo(double r){
        this.r = r;
    }

    // Métodos
    public double calcularPerimetroC(){
        perimetro = 2 * (Math.PI * r);
        return perimetro;
    }

    public double areaC(){
        area = (Math.PI * (Math.pow(r, 2)));
        return area;
    }
}