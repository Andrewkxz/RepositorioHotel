package co.edu.uniquindio.RepositorioHotel.model;

/*Creación de la clase Limpieza la cual hereda de la clase Servicio e implementa dela interface Consumible*/

public class Limpieza extends Servicio implements Consumible {
    @Override
    public double calcularPrecioServicio() {
        return 20000.0;
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de Limpieza");
    }
}
