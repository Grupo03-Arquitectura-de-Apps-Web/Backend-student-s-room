package pe.edu.upc.studentsroom.dtos;

public class ConteoxEstadoDTO {
    private String estado;
    private int conteo;

    public ConteoxEstadoDTO(String estado, int conteo) {
        this.estado = estado;
        this.conteo = conteo;
    }

    public ConteoxEstadoDTO() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
}
