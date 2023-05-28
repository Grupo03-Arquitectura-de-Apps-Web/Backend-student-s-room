package pe.edu.upc.studentsroom.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;

    @Column(name="nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name="correo_institucional", length = 30, nullable = false)
    private String correo_institucional;

    @Column(name="fecha_nacimiento", nullable = false)
    private LocalDate fecha_nacimiento;

    @Column(name="telefono", length = 30, nullable = false)
    private String telefono;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombre, String correo_institucional, LocalDate fecha_nacimiento, String telefono) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.correo_institucional = correo_institucional;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
