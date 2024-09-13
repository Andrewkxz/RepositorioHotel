package co.edu.uniquindio.RepositorioHotel.model;


import java.util.Collection;
import java.util.LinkedList;
/* creación de clase cliente con los atributos privados nombre y dni, y una colección de reservas */
public class Cliente {
    private  String nombre;
    private  String dni;
    private  Collection<Reserva> reservas = new LinkedList<>();

    public Cliente(){
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    /*Métodos get y set de la clase*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }
}

