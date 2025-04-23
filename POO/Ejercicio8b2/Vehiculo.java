package Ejercicio8b2;

public class Vehiculo { 
        private String matricula;
        private String marca;
        private double precio;
        private int cilindrada;
        private double impuestoCirculacion;
        private double cuotaMesGarage;
        protected static final double CUOTA_BASE = 100;
    
        public Vehiculo(String marca, double precio, int cilindrada) {
            this.marca = marca;
            this.precio = precio;
            this.cilindrada = cilindrada;
            this.cuotaMesGarage = CUOTA_BASE;
            calcularImpuestoCirculacion();
        }
    
        // Getters y Setters 
        public String getMatricula() { return matricula; }
        public String getMarca() { return marca; }
        public double getPrecio() { return precio; }
        public int getCilindrada() { return cilindrada; }
        public double getImpuestoCirculacion() { return impuestoCirculacion; } 
        public void setImpuestoCirculacion(double impuesto) { this.impuestoCirculacion = impuesto; } 
        public double getCuotaMesGarage() { return cuotaMesGarage; }
        public void setCuotaMesGarage(double cuota) {
            if (cuota < 0) throw new CuentaNegativa("La cuota no puede ser negativa");
            this.cuotaMesGarage = cuota;
        }
    
        public void calcularImpuestoCirculacion() {
            this.impuestoCirculacion = 0.02 * precio;
        }
    
        public boolean matricular(String matricula) {
            if (matricula.length() == 7) {
                this.matricula = matricula;
                return true;
            }
            return false;
        }
    }

     