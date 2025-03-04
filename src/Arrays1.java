// Gestion de temperatura
// Ejercicio de clase

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps []= new double[30];

        //System.out.println("Ingrese la temperatura del dia 1:" );
        //temps[0] = sc.nextDouble();
        //System.out.println("Ingrese la temperatura del dia 2:" );
        //temps[1] = sc.nextDouble();
        //System.out.println("Ingrese la temperatura del dia 3:" );
        //temps[2] = sc.nextDouble();


        //Llenar el arreglo
        for(int i=0;i<temps.length;i++){
           // System.out.println("Ingrese la temperatura del dia "+ (i+1)+":");
            //temps[i]=sc.nextDouble();
            temps[i]= (Math.random()*(41-20))+20;
            System.out.println(i+"-"+temps[i]);

        }
        //recorrrer arreglos
        int cont40=0;
        double acumTemp=0;


        for (int k = 0; k < temps.length; k++) {
            if (temps[k]>40) {
                cont40++;
                
            }
            acumTemp=acumTemp+temps[k];
            
        }
        //Cuantas temperaturas son mayores y menores al promedio??
        //Valores de temperatuas maximas y minimas
        //Calcular la desviacion estandar
        System.out.println("Cant temperatura mayores a 40 : "+cont40);
        System.out.println("Promedio "+ (acumTemp/temps.length));
    }

}
//promedio de temperatua anual, mensual, minima y minima de cada mes del año 2025
//reporte heladeria en arreglos
