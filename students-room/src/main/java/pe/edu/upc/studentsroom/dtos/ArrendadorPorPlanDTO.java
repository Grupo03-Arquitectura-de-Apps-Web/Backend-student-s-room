package pe.edu.upc.studentsroom.dtos;

public class ArrendadorPorPlanDTO {
    private String nombre_plan;
    private int precio;
    private int id_arrendador;

    public ArrendadorPorPlanDTO() {
    }

    public ArrendadorPorPlanDTO(String nombre_plan, int precio, int id_arrendador) {
        this.nombre_plan = nombre_plan;
        this.precio = precio;
        this.id_arrendador = id_arrendador;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getId_arrendador() {
        return id_arrendador;
    }

    public void setId_arrendador(int id_arrendador) {
        this.id_arrendador = id_arrendador;
    }
}
