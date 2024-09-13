package co.edu.uniquindio.RepositorioHotel.model;

/*Creacion de la clase Restaurante la cual hereda de la clase Servicio e implementa dela interface Consumible*/
public class Restaurante extends Servicio implements Consumible {
    @Override
    public double calcularPrecioServicio() {
        return 50000.0;
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de Restaurante");
    }
}

