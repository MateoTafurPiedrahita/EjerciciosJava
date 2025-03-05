/*Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.

▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.
▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos. */

import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Ingrese el promedio del estudiante:");
            double promedio = sc.nextDouble();
    
            System.out.println("Ingrese el tipo de programa (T para tecnología, P para profesional):");
            char tipoPrograma = sc.next().toUpperCase().charAt(0);
    
            int materiasReprobadas = 0;
            if (promedio <= 7 && tipoPrograma == 'T') { 
                System.out.println("Ingrese el número de materias reprobadas:");
                materiasReprobadas = sc.nextInt();
            }
    
            int creditos = 0;
            double descuento = 0.0;
            double costoPorCincoCreditos = (tipoPrograma == 'P') ? 30000 : 18000;
    
            if (tipoPrograma == 'T') {
                if (promedio >= 9.5) {
                    creditos = 55;
                    descuento = 0.25;
                } else if (promedio >= 9) {
                    creditos = 50;
                    descuento = 0.10;
                } else if (promedio > 7) {
                    creditos = 50;
                } else {
                    creditos = (materiasReprobadas >= 4) ? 40 : 45;
                }
            } else if (tipoPrograma == 'P') {
                creditos = 55;
                if (promedio >= 9.5) {
                    descuento = 0.20;
                }
            } else {
                System.out.println("Tipo de programa inválido. Use T para Tecnología o P para Profesional.");
                sc.close();
                return;
            }
            double costoTotal = (creditos / 5) * costoPorCincoCreditos;
            double montoDescuento = costoTotal * descuento;
            double totalPagar = costoTotal - montoDescuento;
    
            System.out.println("El estudiante podrá cursar " + creditos + " créditos.");
            System.out.println("Costo sin descuento: $" + costoTotal);
            System.out.println("Descuento aplicado: $" + montoDescuento);
            System.out.println("Total a pagar: $" + totalPagar);
        }
    }
    

