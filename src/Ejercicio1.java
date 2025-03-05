/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Bienvenido indique la cantiad de computadoras que desea comprar");
        int cantidadComputadoras= sc.nextInt();

        double precioComputadora=500.0;

        double totalcompra=precioComputadora*cantidadComputadoras;

        double descuento=0.0;

        if (cantidadComputadoras< 5) {
            descuento=0.10;

         } else if (cantidadComputadoras >= 5 & cantidadComputadoras <10) {
                descuento=0.20;
            } else if (cantidadComputadoras >= 10 )
                 descuento=0.40;    
            
        double montoDescuento = totalcompra*descuento;
        double totalConDescuento = totalcompra - montoDescuento;

        System.out.println("Su total de compra es:  U$"+totalcompra);
        System.out.println("Pero debido a que compro la cantidad de "+ cantidadComputadoras+ (" Computadoras se le dara un descuento del ")+ (descuento*100)+ "%" );
        System.out.println("El monto de su descuento es de: U$ "+ montoDescuento);
        System.out.println("Y el total de su compra con el descuento es de : U$"+ totalConDescuento);
    }


}
