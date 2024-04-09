package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p = new Persona();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void getEdad() {
        LocalDate pruebas;

        //El dato por defecto es un buen dato
        assertEquals(34, p.getEdad(), "Valor bueno");

        //Valor malo
        try {
            pruebas = LocalDate.of(1,1,2025);
            p.setNacimiento(pruebas);
            assertEquals(-1, p.getEdad(), "Error por una edad con la que no ha nacido");
        }catch (Exception e){
            fail("El código ha dado error y no -1");
        }

        //Valor null
        try {
            pruebas = null;
            p.setNacimiento(pruebas);
            assertEquals(0, p.getEdad(), "Error por null");
        }catch (Exception e){
            fail("El código ha dado error y no ha devueleto null");
        }
    }
}