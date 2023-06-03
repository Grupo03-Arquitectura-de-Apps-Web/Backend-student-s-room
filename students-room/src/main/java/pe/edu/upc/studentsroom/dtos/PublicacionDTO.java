package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Habitacion;
import java.time.LocalDate;

public class PublicacionDTO {
    private int idPublicacion;
    private String contenido;
    private LocalDate fecha_publicacion;
    private int num_reacciones;
    private int num_comentarios;
    private int num_compartidos;
    private Habitacion habitacion;

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
