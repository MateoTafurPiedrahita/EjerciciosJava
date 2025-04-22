package Ejercicio8b2;

    public class Moto extends Vehiculo {
        private boolean tieneSidecar;
    
        public Moto(String marca, double precio, int cilindrada, boolean tieneSidecar) {
            super(marca, precio, cilindrada);
            this.tieneSidecar = tieneSidecar;
            recalcularCostos();
        }
    
        @Override
        public void calcularImpuestoCirculacion() {
            super.calcularImpuestoCirculacion(); 
            if (tieneSidecar) {
                double impuesto = getImpuestoCirculacion(); 
                setImpuestoCirculacion(impuesto * 1.10); 
            }
        }
    
        private void recalcularCostos() {
            calcularImpuestoCirculacion();
            if (tieneSidecar) {
                setCuotaMesGarage(getCuotaMesGarage() * 1.50);
            }
        }
    }
