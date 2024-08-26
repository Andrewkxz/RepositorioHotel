package co.edu.uniquindio.RepositorioHotel;

public class ServicioDeHabitacion extends Servicio implements Consumible{
    @Override
    public double calcularPrecioServicio() {
        return 35000.0;
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo Servicio de Habitacion");
    }
}
