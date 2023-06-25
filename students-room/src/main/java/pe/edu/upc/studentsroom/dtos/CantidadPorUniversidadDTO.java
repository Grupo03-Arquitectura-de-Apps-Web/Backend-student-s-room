package pe.edu.upc.studentsroom.dtos;

public class CantidadPorUniversidadDTO {

    private String universidad;
    private int cantidad;

    public CantidadPorUniversidadDTO() {
    }

    public CantidadPorUniversidadDTO(String universidad, int cantidad) {
        this.universidad = universidad;
        this.cantidad = cantidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
