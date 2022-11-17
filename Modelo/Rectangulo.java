package Modelo;

public class Rectangulo extends Figura{
    private double ladoA;
    private double ladoB;

    // Constructor
    public Rectangulo(double la, double lb){
        this.ladoA = la;
        this.ladoB = lb;
    }

    // Métodos
    public double calcularPerimetroR(){
        perimetro = ((2*ladoA) + (2*ladoB));
        return perimetro;
    }

    public double areaR(){
        area = ladoA * ladoB;
        return area;
    }
} 


