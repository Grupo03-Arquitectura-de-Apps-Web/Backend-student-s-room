package pe.edu.upc.studentsroom.dtos;

import java.time.LocalDate;
import java.util.Date;

public class ClientesDeArrendadorDTO {
    private String nombre;
    private String telefono;
    private String ubicacion;
    private String arrendador;

    public ClientesDeArrendadorDTO(String nombre, String telefono, String ubicacion, String arrendador) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.arrendador = arrendador;
    }

    public ClientesDeArrendadorDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getArrendador() {
        return arrendador;
    }

    public void setArrendador(String arrendador) {
        this.arrendador = arrendador;
    }
}