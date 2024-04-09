package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NifTest {

    Nif bueno;
    Nif malo;
    Nif feo;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
       bueno = new Nif(12345678);
       //El error salta directamente aquí porque no se pueden añadir número negativos
       try {
           malo = new Nif(-12345678);
       }catch (IndexOutOfBoundsException e){
           fail("No se puede añadir un negativo");
       }
       feo = new Nif();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testeo asignacion de letra")
    void letra(){
        String caso1 = bueno.toString();
        String[] letra1 = caso1.split("-");
       assertEquals("Z", letra1[1],"Caso Bueno" );

       try {
           String caso2 = malo.toString();
           String[] letra2 = caso2.split("-");
           assertEquals("Z", letra2[1],"Caso Malo" );
       }catch (Exception e){
           fail("Valor debido a valor negativo");
       }

        try {
            String caso3 = feo.toString();
            String[] letra3 = caso3.split("-");
            assertEquals(" ", letra3[1],"Caso Vacío" );
        }catch (Exception e){
            fail("Fallo debido a valor null");
        }
    }
}