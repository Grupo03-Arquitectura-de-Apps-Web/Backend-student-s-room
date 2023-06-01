package pe.edu.upc.studentsroom.entities;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
    @Column(name = "fecha_envio", nullable = false)
    private LocalDate fecha_envio;
    @Column(name = "fecha_recepcion",nullable = false)
    private LocalDate fecha_recepcion;
    @Column(name = "tiempo_respuesta", nullable = false)
    private Time tiempo_respuesta;
    @Column(name = "estado", length = 50, nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_arrendador")
    private Arrendador arrendador;

    //Falta agregar un Foreign key mas(Estudiante id)
    //despues de agregar crear un constructor vacio y un constructor que inicialice los atributos
    //finalmente generar getters and setters
    //lo mismo para Mensaje DTO
}
