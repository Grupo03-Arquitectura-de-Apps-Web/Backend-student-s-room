package pe.edu.upc.studentsroom.dtos;

import pe.edu.upc.studentsroom.entities.Arrendador;

import java.sql.Time;
import java.time.LocalDate;

public class MensajeDTO {
    private int idMensaje;
    private String descripcion;
    private LocalDate fecha_envio;
    private LocalDate fecha_recepcion;
    private Time tiempo_respuesta;
    private String estado;
    private Arrendador arrendador;

    //Agregar el private de Estudiante y generar getters and setters
}
