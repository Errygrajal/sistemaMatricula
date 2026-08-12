/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UTN
 */
import java.util.Date;

public class Matricula {
    private EstudianteDeilyn estudiante;
    private Date fecha;
    private String estado;

    public Matricula(EstudianteDeilyn estudiante) {
        this.estudiante = estudiante;
        this.fecha = new Date();
        this.estado = "ACTIVA";
    }

    public void mostrarDetalle() {
        System.out.println("=== Detalle de Matrícula ===");
        System.out.println(estudiante.getDatos());
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
    }
}