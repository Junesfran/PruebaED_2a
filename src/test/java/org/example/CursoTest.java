package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Curso a;
    @BeforeEach
    void setUp() {
        a = new Curso("DAM");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void aniadirAlumno() {
        Persona alumno1 = new Persona();
        //Caso bueno
        a.aniadirAlumno(alumno1);


        //Caso null
        try {
            a.aniadirAlumno(null);
        }catch (Exception e){
            fail("Ha saltado un error y no un null");
        }
    }
}