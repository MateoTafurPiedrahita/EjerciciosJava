/*Una empresa quiere hacer una compra de varias piezas de la misma clase a una fábrica de
refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué hacer para
pagar al fabricante.
• Si el monto total de la compra excede de $500.000 la empresa tendrá la capacidad de invertir
de su propio dinero un 55% del monto de la compra, pedir prestado al banco un 30% y el
resto lo pagará solicitando un crédito al fabricante.
• Si el monto total de la compra no excede de $500.000 la empresa tendrá capacidad de
invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito al
fabricante.
• El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a
crédito. */

import java.util.Scanner;

public class Ejercicio11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese el monto total de la compra: $");
            double montoTotal = sc.nextDouble();
            
            double inversionPropia, prestamoBanco = 0, creditoFabricante, interes;
    
            if (montoTotal > 500000) {
                inversionPropia = montoTotal * 0.55;
                prestamoBanco = montoTotal * 0.30;
                creditoFabricante = montoTotal * 0.15;
            } else {
                inversionPropia = montoTotal * 0.70;
                creditoFabricante = montoTotal * 0.30;
            }
    
            interes = creditoFabricante * 0.20;
            double totalPagarFabricante = creditoFabricante + interes;
    
            System.out.println("Inversión propia: $" + inversionPropia);
            System.out.println("Préstamo bancario: $" + prestamoBanco);
            System.out.println("Crédito con fabricante: $" + creditoFabricante);
            System.out.println("Intereses del crédito: $" + interes);
            System.out.println("Total a pagar al fabricante: $" + totalPagarFabricante);
    
            sc.close();
        }
    }
    
