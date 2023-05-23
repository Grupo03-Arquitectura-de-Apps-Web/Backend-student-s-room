package pe.edu.upc.studentsroom.entities;


import javax.persistence.*;

@Entity
@Table(name = "planes")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;
    @Column(name = "nombre_plan", length = 60, nullable = false)
    private String nombre_plan;

    @Column(name = "precio", nullable = false)
    private int precio;

    @Column(name = "descripcion", length = 300, nullable = false)
    private String descripcion;

    public Plan(){}

    public Plan(int idPlan, String nombre_plan, int precio, String descripcion) {
        this.idPlan = idPlan;
        this.nombre_plan = nombre_plan;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
