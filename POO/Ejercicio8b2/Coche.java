package Ejercicio8b2;

    public class Coche extends Vehiculo {
        private boolean tieneRadio;
        private boolean tieneNavegador;
    
        public Coche(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
            super(marca, precio, cilindrada);
            this.tieneRadio = tieneRadio;
            this.tieneNavegador = tieneNavegador;
            recalcularCostos();
        }
    
        @Override
        public void calcularImpuestoCirculacion() {
            super.calcularImpuestoCirculacion();
            if (tieneRadio) {
                setImpuestoCirculacion(getImpuestoCirculacion() * 1.01);
            }
            if (tieneNavegador) {
                setImpuestoCirculacion(getImpuestoCirculacion() * 1.02);
            }
        }
    
        private void recalcularCostos() {
            calcularImpuestoCirculacion();
            if (getCilindrada() > 2999) {
                setCuotaMesGarage(getCuotaMesGarage() * 1.20);
            }
        }
    }
