package pe.edu.upc.studentsroom.dtos;



public class PaisDTO {
    private int idPais;
    private String nombrePais;
    private String capitalPais;
    private String monedaPais;

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
