package Alfombra;

public abstract class Alfombra {
    private String color;
    private double preciomedio;
    
    public Alfombra(String color, double preciomedio) {
        this.color = color;
        this.preciomedio = preciomedio;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public double getPreciomedio() {
        return preciomedio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPreciomedio(double preciomedio) {
        this.preciomedio = preciomedio;
    }
    
    @Override
    public String toString() {
        return "Alfombra{" +
                "color='" + color + '\'' +
                ", preciomedio=" + preciomedio +
                '}';
    }
    
    // Métodos abstractos
    public abstract double calcularPrecio();
    public abstract double calcularSuperficie();
    public abstract double calcularLado();
}