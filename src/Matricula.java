/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
/**
 *
 * @author UTN
 */
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
        System.out.println("Matrícula: " + estudiante.getDatos() + " | Fecha: " + fecha + " | Estado: " + estado);
    }

}
