package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
    @Column(name = "fecha_envio", nullable = false)
    private LocalDate fecha_envio;
    @Column(name = "fecha_recepcion",nullable = false)
    private LocalDate fecha_recepcion;
    @Column(name = "tiempo_respuesta", nullable = false)
    private String tiempo_respuesta;
    @Column(name = "estado", length = 50, nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_arrendador")
    private Arrendador arrendador;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    public Mensaje() {
    }

    public Mensaje(int idMensaje, String descripcion, LocalDate fecha_envio, LocalDate fecha_recepcion, String tiempo_respuesta, String estado, Arrendador arrendador, Estudiante estudiante) {
        this.idMensaje = idMensaje;
        this.descripcion = descripcion;
        this.fecha_envio = fecha_envio;
        this.fecha_recepcion = fecha_recepcion;
        this.tiempo_respuesta = tiempo_respuesta;
        this.estado = estado;
        this.arrendador = arrendador;
        this.estudiante = estudiante;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public LocalDate getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDate fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getTiempo_respuesta() {
        return tiempo_respuesta;
    }

    public void setTiempo_respuesta(String tiempo_respuesta) {
        this.tiempo_respuesta = tiempo_respuesta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Arrendador getArrendador() {
        return arrendador;
    }

    public void setArrendador(Arrendador arrendador) {
        this.arrendador = arrendador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
