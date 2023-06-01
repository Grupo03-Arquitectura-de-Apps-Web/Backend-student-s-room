package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Arrendador;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.entities.Universidad;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class HabitacionDTO {
    private int idHabitacion;

    private TipoHabitacion tipoHabitacion;
    private float precioHabitacion;
    private boolean disponibilidadHabitacion;


    private Arrendador arrendador;


    private Distrito distrito;

    private Universidad universidad;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public boolean isDisponibilidadHabitacion() {
        return disponibilidadHabitacion;
    }

    public void setDisponibilidadHabitacion(boolean disponibilidadHabitacion) {
        this.disponibilidadHabitacion = disponibilidadHabitacion;
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

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
