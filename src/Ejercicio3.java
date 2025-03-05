/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.*/

import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Bienvenido, indique el precio del dispositivo que desea comprar:");
            double precio = sc.nextDouble();
    
            System.out.println("Ingrese la marca del dispositivo:");
            String marca = sc.next();
            marca= marca.toUpperCase();
    
            double descuento = 0.0;
            double IVA = 0.19;
    
            if (precio >= 500) {
                descuento += 0.10;
            }
    
            if (marca.equalsIgnoreCase("NOSY")) {
                descuento += 0.05;
            }
    
            double precioDescuento = precio - (precio * descuento);
    
            double precioFinal = precioDescuento + (precioDescuento * IVA);
    
            System.out.println("El precio del aparato con descuento es: U$ " + precioDescuento);
            System.out.println("El precio final con IVA incluido es: U$ " + precioFinal);
    
        }
    }
    
    
