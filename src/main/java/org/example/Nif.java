/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author Néstor Franco
 * ver. 1.0.0.0.0.0.0.0.0.0.12
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable

    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    //Testear
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     *
     *Constructor por defecto de la clase NIF, dejara el número del DNI a 0 y [espacio vacío] como letra
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     *
     *Constructor de la clase NIF, recibe el número del NIF y asignará automáticamente  la letra.
     * @param numero
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     *
     *toString de la clase NIF devolverá de manera clara el NIF con el númnero y la letra asignados ya unidos.
     * @return NIF
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     *
     *Asignación de un nuevo número de NIF en caso de necesitar modificarlo o no tener uno asigando previamente. asignara
     * una nueva letra al número.
     * @param numero
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     *
     *Comprobará que dos objetos del tipo NIF sean o no iguales para evitar repeticiones.
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
