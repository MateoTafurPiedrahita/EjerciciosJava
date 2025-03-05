/*Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
con la siguiente tabla:

            Tiempo                               Utilidad
        Menos de 1 año                        5% del salario
        1 año o más y menos de 2 años         7% del salario
        2 años o más y menos de 5 años        10% del salario
        5 años o más y menos de 10 años       15% del salario
        10 años o más                         20% del salario*/
 
 
import java.util.Scanner;

public class Ejercicio9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su salario mensual: ");
            double salario = sc.nextDouble();
    
            System.out.print("Ingrese su antigüedad en la empresa (en años): ");
            int antiguedad = sc.nextInt();
    
            double porcentajeUtilidad;
    
            if (antiguedad < 1) {
                porcentajeUtilidad = 0.05;
            } else if (antiguedad < 2) {
                porcentajeUtilidad = 0.07;
            } else if (antiguedad < 5) {
                porcentajeUtilidad = 0.10;
            } else if (antiguedad < 10) {
                porcentajeUtilidad = 0.15;
            } else {
                porcentajeUtilidad = 0.20;
            }
    
            double utilidad = salario * porcentajeUtilidad;
    
            System.out.println("Su utilidad anual es: U$ " + utilidad);
    
        }
    }
    