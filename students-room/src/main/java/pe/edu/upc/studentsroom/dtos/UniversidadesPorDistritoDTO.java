package pe.edu.upc.studentsroom.dtos;

public class UniversidadesPorDistritoDTO {

    private String distrito;
    private int cantidad;

    public UniversidadesPorDistritoDTO() {
    }

    public UniversidadesPorDistritoDTO(String distrito, int cantidad) {
        this.distrito = distrito;
        this.cantidad = cantidad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
