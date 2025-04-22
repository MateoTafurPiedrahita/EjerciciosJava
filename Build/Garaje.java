package Ejercicio8b2;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private static final int PLAZAS_MAX = 100;
    private List<Vehiculo> plazas = new ArrayList<>();

    public double calcularIngresos() {
        double total = 0;
        for (Vehiculo v : plazas) total += v.getCuotaMesGarage();
        if (total < 400) throw new VamosAlaQuiebra("Ingresos < 400€");
        return total;
    }

    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo vehiculo : plazas) {
            if (vehiculo.getClass().equals(v.getClass())) count++;
        }
        return count;
    }

    public void alquilarPlaza(Vehiculo v) {
        if (v.getMatricula() == null) throw new SinMatricula("Sin matrícula");
        if (plazas.size() >= PLAZAS_MAX) throw new IllegalStateException("Garaje lleno");
        if (v instanceof Moto && contarMotos() >= PLAZAS_MAX * 0.8) {
            throw new IllegalStateException("Límite de motos (80%)");
        }
        plazas.add(v);
    }

    private long contarMotos() {
        long count = 0;
        for (Vehiculo v : plazas) {
            if (v instanceof Moto) count++;
        }
        return count;
    }
}