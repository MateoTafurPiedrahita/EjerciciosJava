package Alfombra;

public class AlfombraRedonda extends Alfombra {
    private double radio;

    public AlfombraRedonda(String color, double preciomedio, double radio) {
        super(color, preciomedio);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        return "AlfombraRedonda{" +
                "radio=" + radio +
                ", color='" + getColor() + '\'' +
                ", preciomedio=" + getPreciomedio() +
                '}';
    }
    
    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPreciomedio();
    }
    
    @Override
    public double calcularLado() {
        return radio * 2; // Diámetro
    }
}