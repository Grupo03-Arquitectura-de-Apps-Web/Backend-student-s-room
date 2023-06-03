package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "contratosdealquiler")
public class ContratoDeAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contratodealquier;

    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
    @Column(name = "fecha_inicio",nullable = false)
    private LocalDate fecha_inicio;
    @Column(name = "fecha_pago",nullable = false)
    private LocalDate fecha_pago;
    @Column(name = "fecha_vencimiento",nullable = false)
    private LocalDate fecha_vencimiento;
    @Column(name = "money",nullable = false)
    private double money;

    @OneToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idHabitacion")
    private Habitacion habitacion;

    public ContratoDeAlquiler() {
    }

    public ContratoDeAlquiler(int id_contratodealquier, String descripcion, LocalDate fecha_inicio, LocalDate fecha_pago, LocalDate fecha_vencimiento, double money, Estudiante estudiante, Habitacion habitacion) {
        this.id_contratodealquier = id_contratodealquier;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_pago = fecha_pago;
        this.fecha_vencimiento = fecha_vencimiento;
        this.money = money;
        this.estudiante = estudiante;
        this.habitacion = habitacion;
    }

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
