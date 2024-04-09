/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.TreeSet;

/**
 *
 * @author Néstor Franco, ver. 1.0.0.0.0.0.12
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    /**
     *
     * Recibe una String con el nombre del curso.
     * @param nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     *
     * El toString de la clase curso devolverá los alumnos del curso en cuestión de manera ordenada
     * @return String ordenado
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    //testear
    /**
     *
     *Método que permite añadir nuevos alumnos al curso. Recibe un parametro del tipo Persona.
     * @param p
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
