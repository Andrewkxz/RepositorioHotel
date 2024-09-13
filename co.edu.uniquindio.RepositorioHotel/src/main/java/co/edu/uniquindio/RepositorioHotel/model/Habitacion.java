package co.edu.uniquindio.RepositorioHotel.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
Creación de la clase habitacion, con sus respectivos atributos
 */
public class Habitacion {
    private  String numero;
    private  TipoHabitacion tipoHabitacion;
    private  double precio;
    private Estado estado;
    private Cliente cliente;
    private  final Collection<Servicio> servicio = new LinkedList<>();

    public Habitacion(){
    }

    public Habitacion (String numero, TipoHabitacion tipoHabitacion, double precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.estado = Estado.LIBRE;
        this.cliente = null;
    }

    /*
    Métodos set y get de la clase
     */
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    /*
    Método para actualizar el estado
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(this.estado != null){
            this.estado = Estado.OCUPADO;
        }
        else{
            this.estado = Estado.LIBRE;
        }
    }
    /*
    Método para agregar un servicio
     */
    public void addServicio(Servicio servicio) {
        this.servicio.add(servicio);
    }


    public Collection<Servicio> getServicio() {
        return Collections.unmodifiableCollection(servicio);
    }
}
