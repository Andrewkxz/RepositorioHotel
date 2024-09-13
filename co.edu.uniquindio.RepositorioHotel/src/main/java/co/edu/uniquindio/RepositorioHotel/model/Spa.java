package co.edu.uniquindio.RepositorioHotel.model;

/*Creacion de la clase Spa la cual hereda de la clase Servicio e implementa de la interface Consumible*/
public class Spa extends Servicio implements Consumible {
    @Override
    public double calcularPrecioServicio() {
        return 30000.0;
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de Spa");
    }
}
