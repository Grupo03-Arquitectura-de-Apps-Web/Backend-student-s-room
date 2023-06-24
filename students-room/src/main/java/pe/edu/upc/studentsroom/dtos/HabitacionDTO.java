package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Arrendador;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.entities.Universidad;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class HabitacionDTO {
    private int idHabitacion;

    private TipoHabitacion tipo;

    private float precio;
    private String disponibilidad;

    private Arrendador arrendador;

    private Distrito distrito;
    private String ubicacion;

    private Universidad universidad;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Arrendador getArrendador() {
        return arrendador;
    }

    public void setArrendador(Arrendador arrendador) {
        this.arrendador = arrendador;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
