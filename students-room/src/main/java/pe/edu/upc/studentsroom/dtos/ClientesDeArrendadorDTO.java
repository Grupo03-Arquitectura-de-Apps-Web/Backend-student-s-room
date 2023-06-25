package pe.edu.upc.studentsroom.dtos;

import java.util.Date;

public class ClientesDeArrendadorDTO {
    private String nombre;
    private Date fecha_pago;
    private Date fecha_vencimiento;
    private String arrendador;
    public ClientesDeArrendadorDTO(String nombre, Date fecha_pago, Date fecha_vencimiento, String arrendador) {
        this.nombre = nombre;
        this.fecha_pago = fecha_pago;
        this.fecha_vencimiento = fecha_vencimiento;
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

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getArrendador() {
        return arrendador;
    }

    public void setArrendador(String arrendador) {
        this.arrendador = arrendador;
    }
}
