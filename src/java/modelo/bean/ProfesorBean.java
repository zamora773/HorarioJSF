/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author PRIME
 */
@ManagedBean(name = "profesorBean")
@RequestScoped
public class ProfesorBean {

    private String asignatura;
    private String[] docentes;
    private String carrera;
    private String ciclo;

    /**
     * Creates a new instance of ProfesorBean
     */
    public ProfesorBean() {
    }

    public ProfesorBean(String asignatura, String[] docentes, String carrera, String ciclo) {
        this.asignatura = asignatura;
        this.docentes = docentes;
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String[] getDocentes() {
        return docentes;
    }

    public void setDocentes(String[] docentes) {
        this.docentes = docentes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera.equals("I") ? "Ing. en Sistemas de Información" : "Lic. en Sistemas de Información";
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "ProfesorBean{" + "asignatura=" + asignatura + ", docentes=" + docentes + ", carrera=" + carrera + ", ciclo=" + ciclo + '}';
    }
}
