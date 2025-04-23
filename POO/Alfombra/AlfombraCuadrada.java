package Alfombra;

public class AlfombraCuadrada extends Alfombra {
    private double lado;
    
    public AlfombraCuadrada(String color, double preciomedio, double lado) {
        super(color, preciomedio);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String toString() {
        return "AlfombraCuadrada{" +
                "lado=" + lado +
                ", color='" + getColor() + '\'' +
                ", preciomedio=" + getPreciomedio() +
                '}';
    }
    
    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPreciomedio();
    }
    
    @Override
    public double calcularSuperficie() {
        return lado * lado;
    }
    
    @Override
    public double calcularLado() {
        return lado;
    }
}