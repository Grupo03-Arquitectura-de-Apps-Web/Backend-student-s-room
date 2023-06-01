package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;

@Entity
@Table(name ="ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCiudad;
    @ManyToOne
    @JoinColumn(name = "idPais")
    private Pais pais;

    @Column(name = "nombreCiudad",length = 50,nullable = false)
    private String nombreCiudad;

    public Ciudad(){

    }

    public Ciudad(int idCiudad, Pais pais, String nombreCiudad) {
        this.idCiudad = idCiudad;
        this.pais = pais;
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
