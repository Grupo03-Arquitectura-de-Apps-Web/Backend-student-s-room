package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHabitacion;

    @ManyToOne
    @JoinColumn(name = "Tipo", nullable = false)
    private TipoHabitacion tipoHabitacion;
    @Column(name = "Precio",length =10,nullable = false)
    private float precioHabitacion;
    @Column(name = "Disponibilidad",length =10,nullable = false)
    private String disponibilidadHabitacion;

    @ManyToOne
    @JoinColumn(name = "Arrendador", nullable = false)
    private Arrendador arrendador;

    @ManyToOne
    @JoinColumn(name = "Distrito", nullable = false)
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "Universidad", nullable = false)
    private Universidad universidad;

    public Habitacion(){

    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, float precioHabitacion, String disponibilidadHabitacion, Arrendador arrendador, Distrito distrito, Universidad universidad) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.disponibilidadHabitacion = disponibilidadHabitacion;
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

    public String getDisponibilidadHabitacion() {
        return disponibilidadHabitacion;
    }

    public void setDisponibilidadHabitacion(String disponibilidadHabitacion) {
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
