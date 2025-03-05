/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

     EDAD                            NIVEL HEMOGLOBINA
   0 - 1 mes                             13 - 26 g%
   > 1 y < = 6 meses                     10 - 18 g%
   > 6 y < = 12 meses                    11 - 15 g%
   > 1 y < = 5 años                    11.5 - 15 g%
   > 5 y < = 10 años                 12.6 - 15.5 g%
   > 10 y < = 15 años                  13 - 15.5 g%
   Mujeres > 15 años                     12 - 16 g%
   Hombres > 15 años                    14 - 18 g%*/
   import java.util.Scanner;
public class Ejercicio6 {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese la edad en años:");
          double edadAnios = sc.nextDouble();
          int edadMeses = (int) (edadAnios * 12); 
  
          System.out.println("Ingrese el nivel de hemoglobina en g%:");
          double hemoglobina = sc.nextDouble();
  
          String sexo = "";
          if (edadAnios > 15) { 
              System.out.println("Ingrese el sexo (M para masculino, F para femenino):");
              sexo = sc.next().toUpperCase();
          }
          double minNivel = 0, maxNivel = 0;
  
          if (edadMeses >= 0 && edadMeses <= 1) {
              minNivel = 13; maxNivel = 26;
          } else if (edadMeses > 1 && edadMeses <= 6) {
              minNivel = 10; maxNivel = 18;
          } else if (edadMeses > 6 && edadMeses <= 12) {
              minNivel = 11; maxNivel = 15;
          } else if (edadAnios > 1 && edadAnios <= 5) {
              minNivel = 11.5; maxNivel = 15;
          } else if (edadAnios > 5 && edadAnios <= 10) {
              minNivel = 12.6; maxNivel = 15.5;
          } else if (edadAnios > 10 && edadAnios <= 15) {
              minNivel = 13; maxNivel = 15.5;
          } else if (edadAnios > 15) { 
              if (sexo.equals("F")) {
                  minNivel = 12; maxNivel = 16;
              } else if (sexo.equals("M")) {
                  minNivel = 14; maxNivel = 18;
              } else {
                  System.out.println("Sexo inválido. Use M o F.");
                  sc.close();
                  return;
              }
          } else {
              System.out.println("Edad inválida.");
              sc.close();
              return;
          }

          if (hemoglobina < minNivel) {
              System.out.println("Diagnóstico: Positivo para anemia.");
          } else {
              System.out.println("Diagnóstico: Negativo para anemia.");
          }
      }
  }
  