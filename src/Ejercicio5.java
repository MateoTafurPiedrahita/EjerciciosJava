/*El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.*/

import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Ingrese el saldo actual de la empresa:");
            double saldoActual = sc.nextDouble();
            double nuevoSaldo = saldoActual;
            double prestamo = 0;
    
            if (saldoActual < 0) {
                prestamo = 10000 - saldoActual;
                nuevoSaldo = 10000;
            } else if (saldoActual > 0 && saldoActual < 20000) {
                prestamo = 20000 - saldoActual;
                nuevoSaldo = 20000;
            }
    
            double equipoComputo = 5000;
            double mobiliario = 2000;
            double restante = nuevoSaldo - (equipoComputo + mobiliario);
            double insumos = restante / 2;
            double incentivos = restante / 2;
    
            if (prestamo > 0) {
                System.out.println("Se pedirá un préstamo de: U$ " + prestamo);
            } else {
                System.out.println("No es necesario solicitar préstamo.");
            }
    
            System.out.println("Distribución del presupuesto:");
            System.out.println("- U$" + equipoComputo + " para equipo de cómputo");
            System.out.println("- U$" + mobiliario + " para mobiliario");
            System.out.println("- U$" + insumos + " para compra de insumos");
            System.out.println("- U$" + incentivos + " para incentivos al personal");
        }
    }