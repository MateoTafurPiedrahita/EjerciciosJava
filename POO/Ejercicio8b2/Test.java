package Ejercicio8b2;
import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Garaje garage = new Garaje();
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("\n--- MENÚ GARAJE ---");
                System.out.println("1. Añadir vehículo");
                System.out.println("2. Ver ingresos");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
    
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
    
                switch (opcion) {
                    case 1 -> agregarVehiculo(garage, scanner);
                    case 2 -> {
                        try {
                            System.out.println("💰 Ingresos: " + garage.calcularIngresos() + "€");
                        } catch (VamosAlaQuiebra e) {
                            System.out.println("⚠️ " + e.getMessage());
                        }
                    }
                    case 3 -> System.exit(0);
                    default -> System.out.println("❌ Opción inválida");
                }
            }
        }
    
        private static void agregarVehiculo(Garaje garage, Scanner scanner) {
            System.out.println("\n--- AÑADIR VEHÍCULO ---");
            System.out.print("Tipo (Coche=C, Moto=M): ");
            String tipo = scanner.nextLine().toUpperCase();
    
            System.out.print("Matrícula (7 caracteres): ");
            String matricula = scanner.nextLine();
    
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
    
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
    
            System.out.print("Cilindrada: ");
            int cilindrada = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
    
            try {
                Vehiculo vehiculo;
                if (tipo.equals("C")) {
                    System.out.print("¿Tiene radio? (S/N): ");
                    boolean radio = scanner.nextLine().equalsIgnoreCase("S");
                    System.out.print("¿Tiene navegador? (S/N): ");
                    boolean navegador = scanner.nextLine().equalsIgnoreCase("S");
                    vehiculo = new Coche(marca, precio, cilindrada, radio, navegador);
                } else {
                    System.out.print("¿Tiene sidecar? (S/N): ");
                    boolean sidecar = scanner.nextLine().equalsIgnoreCase("S");
                    vehiculo = new Moto(marca, precio, cilindrada, sidecar);
                }
    
                if (vehiculo.matricular(matricula)) {
                    garage.alquilarPlaza(vehiculo);
                    System.out.println("✅ Vehículo añadido correctamente.");
                } else {
                    System.out.println("❌ La matrícula debe tener 7 caracteres.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }