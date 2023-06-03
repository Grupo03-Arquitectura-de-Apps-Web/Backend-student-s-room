package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "publicaciones")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(name = "contenido",length = 200,nullable = false)
    private String contenido;
    @Column(name = "fecha_publicacion",nullable = false)
    private LocalDate fecha_publicacion;
    @Column(name = "num_reacciones",nullable = false)
    private int num_reacciones;
    @Column(name = "num_comentarios",nullable = false)
    private int num_comentarios;
    @Column(name = "num_compartidos",nullable = false)
    private int num_compartidos;
    @ManyToOne
    @JoinColumn(name = "idHabitacion")
    private Habitacion habitacion;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, String contenido, LocalDate fecha_publicacion, int num_reacciones, int num_comentarios, int num_compartidos, Habitacion habitacion) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.fecha_publicacion = fecha_publicacion;
        this.num_reacciones = num_reacciones;
        this.num_comentarios = num_comentarios;
        this.num_compartidos = num_compartidos;
        this.habitacion = habitacion;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getNum_reacciones() {
        return num_reacciones;
    }

    public void setNum_reacciones(int num_reacciones) {
        this.num_reacciones = num_reacciones;
    }

    public int getNum_comentarios() {
        return num_comentarios;
    }

    public void setNum_comentarios(int num_comentarios) {
        this.num_comentarios = num_comentarios;
    }

    public int getNum_compartidos() {
        return num_compartidos;
    }

    public void setNum_compartidos(int num_compartidos) {
        this.num_compartidos = num_compartidos;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
