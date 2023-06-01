package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Estudiante;

import java.time.LocalDate;

public class PublicacionFavoritaDTO {

    private int id_publicacion_favorita;
    private LocalDate fecha_guardado;
    private Estudiante estudiante;

    public int getId_publicacion_favorita() {
        return id_publicacion_favorita;
    }

    public void setId_publicacion_favorita(int id_publicacion_favorita) {
        this.id_publicacion_favorita = id_publicacion_favorita;
    }

    public LocalDate getFecha_guardado() {
        return fecha_guardado;
    }

    public void setFecha_guardado(LocalDate fecha_guardado) {
        this.fecha_guardado = fecha_guardado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
