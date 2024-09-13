package co.edu.uniquindio.RepositorioHotel.model;

import java.time.Duration;
import java.time.LocalDateTime;

/*Creación de la clase reserva  */
public class Reserva {
    private  Habitacion habitacion;
    private Cliente cliente;
    private  LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    public Reserva(){
    }

    public Reserva (Habitacion habitacion, Cliente cliente, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    /*Métodos get y set de la clase*/
    public Habitacion getHabitacion() {
        return habitacion; }

    public Cliente getCliente() {
        return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada; }
    
    public LocalDateTime getFechaSalida() {
        return fechaSalida; }
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida; }

    /*Método el cual nos permite calcular el tiempo en dias, que estuvo el cliente en la habitacion*/
    public int calcularTiempo() {
        Duration tiempo = Duration.between(this.fechaEntrada, this.fechaSalida);
        long dias = tiempo.toDays();
        return (int) dias;
    }
    /*Método el cual nos permite calcular el precio total de la habitacion
     tomando los dias reservados y multiplicandolos por el precio de la habitación*/

    public double calcularPrecio(){
        int diasReservados = calcularTiempo();
        double precioHabitacion = habitacion.getPrecio();
        double precioTotal = diasReservados * precioHabitacion;
        for(Servicio servicio : habitacion.getServicio()){
            precioTotal += servicio.calcularPrecioServicio();
        }

        return precioTotal;

    }

}
