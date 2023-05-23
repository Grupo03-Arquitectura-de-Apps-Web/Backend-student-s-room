package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name="universidades")

public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idUniversidad;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "sede")
    private String sede;
    @Column(name = "ubicacion")
    private String ubicacion;

    public Universidad() {
    }
    public Universidad(int idUniversidad, String nombre, String sede, String ubicacion) {
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
        this.sede = sede;
        this.ubicacion = ubicacion;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
