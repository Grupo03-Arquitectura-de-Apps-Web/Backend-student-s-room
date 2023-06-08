package pe.edu.upc.studentsroom.dtos;

public class DisponiblesDTO {
    private String descripcion;
    private String tipoHabi;
    private String descripHabi;
    private String nombreUni;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoHabi() {
        return tipoHabi;
    }

    public void setTipoHabi(String tipoHabi) {
        this.tipoHabi = tipoHabi;
    }

    public String getDescripHabi() {
        return descripHabi;
    }

    public void setDescripHabi(String descripHabi) {
        this.descripHabi = descripHabi;
    }

    public String getNombreUni() {
        return nombreUni;
    }

    public void setNombreUni(String nombreUni) {
        this.nombreUni = nombreUni;
    }
}
