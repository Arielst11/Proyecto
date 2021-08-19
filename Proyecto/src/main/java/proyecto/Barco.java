/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author asanc
 */
public class Barco {

    public String tipo;
    public int vida;
    public int coordenadaX;
    public int coordenadaY;

    public Barco() {
    }

    public Barco(String tipo, int vida) {
        this.tipo = tipo;
        this.vida = vida;
    }

    //traduccion de Letras a numeros y asignacion de coordenadaX(letra)
    public void asignacionCoordenadaX(String letra) {
        int coordenadaX;
        if (letra.equals("A")) {
            coordenadaX = 1;
            this.coordenadaX = coordenadaX;
        }
        if (letra.equals("B")) {
            coordenadaX = 2;
            this.coordenadaX = coordenadaX;
        }
        if (letra.equals("C")) {
            coordenadaX = 3;
            this.coordenadaX = coordenadaX;
        }
        if (letra.equals("D")) {
            coordenadaX = 4;
            this.coordenadaX = coordenadaX;
        }
        if (letra.equals("E")) {
            coordenadaX = 5;
            this.coordenadaX = coordenadaX;
        }
        if (letra.equals("F")) {
            coordenadaX = 6;
            this.coordenadaX = coordenadaX;
        }
        JOptionPane.showMessageDialog(null, "Usted selecciono la fila " + letra);

    }

    //traduccion de Letras a numeros y asignacion de coordenadaX(letra)
    public void asignacionCoordenadaY(String numero) {
        int coordenadaY;
        if (numero.equals("1")) {
            coordenadaY = 1;
            this.coordenadaY = coordenadaY;
        }
        if (numero.equals("2")) {
            coordenadaY = 2;
            this.coordenadaY = coordenadaY;
        }
        if (numero.equals("3")) {
            coordenadaY = 3;
            this.coordenadaY = coordenadaY;
        }
        if (numero.equals("4")) {
            coordenadaY = 4;
            this.coordenadaY = coordenadaY;
        }
        if (numero.equals("5")) {
            coordenadaY = 5;
            this.coordenadaY = coordenadaY;
        }
        if (numero.equals("6")) {
            coordenadaY = 6;
            this.coordenadaY = coordenadaY;
        }
        JOptionPane.showMessageDialog(null, "Usted selecciono la columna " + numero);

    }

}
