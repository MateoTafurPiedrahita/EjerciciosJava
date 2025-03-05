/* Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra.*/


import java.util.Scanner;
public class Ejercicio10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            final double PAGO_POR_HORA = 5000;
            final int HORAS_NORMALES = 40;
            final double INCREMENTO_EXTRA = 1.2; 
    
            System.out.print("Ingrese las horas trabajadas en la semana: ");
            int horasTrabajadas = sc.nextInt();
            double salario;
    
            if (horasTrabajadas <= HORAS_NORMALES) {
                salario = horasTrabajadas * PAGO_POR_HORA;
            } else {
                int horasExtras = horasTrabajadas - HORAS_NORMALES;
                salario = (HORAS_NORMALES * PAGO_POR_HORA) + (horasExtras * PAGO_POR_HORA * INCREMENTO_EXTRA);
            }
    
            System.out.println("El salario semanal es: $" + salario);
    
            sc.close();
        }
    }
    
