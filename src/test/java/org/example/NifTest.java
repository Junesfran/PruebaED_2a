package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NifTest {

    Nif l;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
     //  l = new NIF();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testeo asignacion de letra")
    void letra(){
 //       assertEquals('A', l.calcularLetra(4),"Caso bueno" );
    }
}