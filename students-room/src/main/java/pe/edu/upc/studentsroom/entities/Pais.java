package pe.edu.upc.studentsroom.entities;


import javax.persistence.*;

@Entity
@Table(name = "paises")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPais;
    @Column(name = "nombrePais", length = 60, nullable = false)
    private String nombrePais;

    @Column(name = "capitalPais", length = 60, nullable = false)
    private String capitalPais;

    @Column(name = "monedaPais", length = 50, nullable = false)
    private String monedaPais;

    public Pais(){}

    public Pais(int idPais, String nombrePais, String capitalPais, String monedaPais) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
        this.capitalPais = capitalPais;
        this.monedaPais = monedaPais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapitalPais() {
        return capitalPais;
    }

    public void setCapitalPais(String capitalPais) {
        this.capitalPais = capitalPais;
    }

    public String getMonedaPais() {
        return monedaPais;
    }

    public void setMonedaPais(String monedaPais) {
        this.monedaPais = monedaPais;
    }
}
