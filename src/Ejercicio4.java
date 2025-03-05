/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS  COMPRADOS % DESCUENTO
     0 -           2          0%
     2.01 -        5          10%
     5.01 -        10         15%
     10.01      en adelante   20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.*/

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("Bienvenido, indique cuántos kilos de manzanas desea comprar:");
        double kilos = sc.nextDouble();

        double precioPorKilo = 7.0; 
        double totalCompra = kilos * precioPorKilo;
        double descuento = 0.0;

        if (kilos > 10) {
            descuento = 0.20;
        } else if (kilos > 5) {
            descuento = 0.15;
        } else if (kilos > 2 ) {
            descuento = 0.10;
        }

        double totalDescuento = totalCompra * descuento;
        double totalFinal = totalCompra - totalDescuento;

        System.out.println("Su total de compra sin descuento es de : U$ " + totalCompra);
        System.out.println("Se aplicó un descuento del " + (descuento * 100) + "%, equivalente a U$ " + totalDescuento);
        System.out.println("El total a pagar con descuento es: U$ " + totalFinal);

    }
}