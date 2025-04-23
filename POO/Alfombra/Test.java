package Alfombra;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");

        AlfombraRedonda ar = new AlfombraRedonda("Blanco", 1000, 2);
        System.out.println(ar.toString());
        System.out.println("Precio de la alfombra: " + ar.calcularPrecio());
        System.out.println("Superficie de la alfombra: " + ar.calcularSuperficie());
        System.out.println("Diámetro de la alfombra: " + ar.calcularLado());

        System.out.println("--------------------------------------------------------");

        AlfombraCuadrada ac = new AlfombraCuadrada("rojo", 1000, 4);
        System.out.println(ac.toString());
        System.out.println("Precio de la alfombra: " + ac.calcularPrecio());
        System.out.println("Lado de la alfombra: " + ac.calcularLado());
        System.out.println("Superficie de la alfombra: " + ac.calcularSuperficie());
    }
}