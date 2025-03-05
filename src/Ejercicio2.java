/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Bienvenido a la serviteca ¿cuantas llantas desea comprar?");
        int cantidadLlantas= sc.nextInt();

        double precioLlantas=0.0;

        if (cantidadLlantas<5) {
            precioLlantas =100.0;
            
        } else if (cantidadLlantas >=5 && cantidadLlantas<10){
            precioLlantas =75.0;
        } else if (cantidadLlantas > 10){
            precioLlantas = 50.0;
        }

        double totalPagar = precioLlantas * cantidadLlantas;
        System.out.println("El precio por cada llanta es de: U$" +precioLlantas);
        System.out.println("El total a pagar por " + cantidadLlantas + " llantas es: U$ " + totalPagar);
    }

}
