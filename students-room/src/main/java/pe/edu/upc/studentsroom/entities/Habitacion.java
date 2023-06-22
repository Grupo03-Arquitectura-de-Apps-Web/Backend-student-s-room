package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHabitacion;

    @OneToOne
    @JoinColumn(name = "id_Tipo", nullable = false)
    private TipoHabitacion tipo;
    @Column(name = "Precio", length = 10, nullable = false)
    private float precio;
    @Column(name = "Disponibilidad", length = 10, nullable = false)
    private String disponibilidad;

    @OneToOne
    @JoinColumn(name = "id_Arrendador", nullable = false)
    private Arrendador arrendador;

    @OneToOne
    @JoinColumn(name = "id_Distrito", nullable = false)
    private Distrito distrito;

    @OneToOne
    @JoinColumn(name = "id_Universidad", nullable = false)
    private Universidad universidad;

    public Habitacion() {

    }

    public Habitacion(int idHabitacion, TipoHabitacion tipo, float precio, String disponibilidad, Arrendador arrendador, Distrito distrito, Universidad universidad) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.arrendador = arrendador;
        this.distrito = distrito;
        this.universidad = universidad;
    }

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

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
