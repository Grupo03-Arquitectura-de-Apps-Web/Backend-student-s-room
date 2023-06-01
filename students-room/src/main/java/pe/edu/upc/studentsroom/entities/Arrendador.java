package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name = "arrendadores")
public class Arrendador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_arrendador;
    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;
    @Column(name = "correo_laboral", length = 50, nullable = false)
    private String correo_laboral;
    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;
    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;
    @Column(name = "pais", length = 50, nullable = false)
    private String pais;
    @ManyToOne
    @JoinColumn(name = "idPlan")
    private Plan plan;

    public Arrendador() {
    }

    public Arrendador(int id_arrendador, String nombre, String correo_laboral, String telefono, String ciudad, String pais, Plan plan) {
        this.id_arrendador = id_arrendador;
        this.nombre = nombre;
        this.correo_laboral = correo_laboral;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.pais = pais;
        this.plan = plan;
    }

    public int getId_arrendador() {
        return id_arrendador;
    }

    public void setId_arrendador(int id_arrendador) {
        this.id_arrendador = id_arrendador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_laboral() {
        return correo_laboral;
    }

    public void setCorreo_laboral(String correo_laboral) {
        this.correo_laboral = correo_laboral;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
