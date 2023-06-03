package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "publicaciones_favoritas")
public class Publicación_Favorita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_publicacion_favorita;

    @Column(name = "fecha_guardado",nullable = false)
    private LocalDate fecha_guardado;
    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;

    public Publicación_Favorita() {
    }

    public Publicación_Favorita(int id_publicacion_favorita, LocalDate fecha_guardado, Estudiante estudiante, Publicacion publicacion) {
        this.id_publicacion_favorita = id_publicacion_favorita;
        this.fecha_guardado = fecha_guardado;
        this.estudiante = estudiante;
        this.publicacion = publicacion;
    }

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

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
