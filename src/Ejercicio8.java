/*El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
de 25 años o más. */
import java.util.Scanner;

public class Ejercicio8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            System.out.print("Ingrese su antigüedad en el empleo (en años): ");
            int antiguedad = sc.nextInt();

            if (edad >= 60 && antiguedad < 25) {
                System.out.println("Usted califica para la jubilación por edad.");
            } else if (edad < 60 && antiguedad >= 25) {
                System.out.println("Usted califica para la jubilación por antigüedad joven.");
            } else if (edad >= 60 && antiguedad >= 25) {
                System.out.println("Usted califica para la jubilación por antigüedad adulta.");
            } else {
                System.out.println("Usted no califica para ninguna modalidad de jubilación.");
            }

        }
    }
    
