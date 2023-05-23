package pe.edu.upc.studentsroom.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoHabitacion;
    @Column(name = "tipo", length = 40, nullable = false)
    private String tipo;
    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;

    public TipoHabitacion() {}

    public TipoHabitacion(int idTipoHabitacion, String tipo, String descripcion) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
