package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Estudiante;
import pe.edu.upc.studentsroom.entities.Habitacion;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class ContratoDeAlquilerDTO {

    private int id_contratodealquier;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_pago;
    private LocalDate fecha_vencimiento;
    private double money;
    private Estudiante estudiante;
    private Habitacion habitacion;

    public int getId_contratodealquier() {
        return id_contratodealquier;
    }

    public void setId_contratodealquier(int id_contratodealquier) {
        this.id_contratodealquier = id_contratodealquier;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
