public class Reporte2025 {
    public static void main(String[] args) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double[][] temperaturas = new double[12][]; 

        for (int mes = 0; mes < temperaturas.length; mes++) {
            temperaturas[mes] = new double[diasPorMes[mes]];
            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
                temperaturas[mes][dia] = Math.random() * 40 - 5;  
            }
        }

        double sumaTotal = 0;
        double maxTotal = -100;
        double minTotal = 100;
        int totalDias = 0;

        for (int mes = 0; mes < temperaturas.length; mes++) {
            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
                double temp = temperaturas[mes][dia];
                sumaTotal += temp;
                if (temp > maxTotal) {
                    maxTotal = temp;
                }
                if (temp < minTotal) {
                    minTotal = temp;
                }
                totalDias++;
            }
        }

        System.out.println("=== Estadísticas Anuales ===");
        System.out.println("Temperatura Promedio: " + (sumaTotal / totalDias) + "°C");
        System.out.println("Temperatura Máxima: " + maxTotal + "°C");
        System.out.println("Temperatura Mínima: " + minTotal + "°C");
        System.out.println();

        System.out.println("=== Estadísticas Mensuales ===");
        for (int mes = 0; mes < temperaturas.length; mes++) {
            double sumaMes = 0;
            double maxMes = -100;
            double minMes = 100;

            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
                double temp = temperaturas[mes][dia];
                sumaMes += temp;
                if (temp > maxMes) {
                    maxMes = temp;
                }
                if (temp < minMes) {
                    minMes = temp;
                }
            }

            System.out.println("Mes " + (mes + 1) + " - Promedio: " + (sumaMes / temperaturas[mes].length) + "°C  Máx: " + maxMes + "°C  Mín: " + minMes + "°C");
        }
    }
}
