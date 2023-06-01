package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name = "distritos")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;
    @ManyToOne
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    @Column(name = "nombreDistrito",length = 50,nullable = false)
    private String nombreDistrito;

    public Distrito(){

    }

    public Distrito(int idDistrito, Ciudad ciudad, String nombreDistrito) {
        this.idDistrito = idDistrito;
        this.ciudad = ciudad;
        this.nombreDistrito = nombreDistrito;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
}
