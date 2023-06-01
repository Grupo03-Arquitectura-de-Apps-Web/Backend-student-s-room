package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Plan;

public class ArrendadorDTO {
    private int id_arrendador;
    private String nombre;
    private String correo_laboral;
    private String telefono;
    private String ciudad;
    private String pais;
    private Plan plan;

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
