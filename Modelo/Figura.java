package Modelo;

public class Figura {
    // Atributos
    protected double perimetro;
    protected double area;

    // Constructor
    public Figura(){
        this.perimetro = 0;
        this.area = 0;
    }

    // Métodos
    public double mostrarResultadoP(){
        return this.perimetro;
    }

    public double mostrarResultadoA(){
        return this.area;
    }
}