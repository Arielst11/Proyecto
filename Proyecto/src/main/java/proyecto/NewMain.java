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
public class NewMain {

    public static void main(String[] args) {
        // se se crean nuevos items de cada clase.
        Jugador jugador1 = new Jugador();
        Menu menu1 = new Menu();
        CPU CPU1 = new CPU();
        Barco Almirante = new Barco("Almirante", 4, 1);
        Barco Capitan = new Barco("Capitan", 3, 2);
        Barco Teniente = new Barco("Teniente", 1, 3);
       
        
        //INICIO DEL PROGRAMA! *************************************************
        
        //se inicia el programa, se pregunta si se quiere jugar o no, no = termina el programa.
        menu1.menuInicio();
        // se pregunta al jugador su nombre y edad del jugador
        String nameJugador = JOptionPane.showInputDialog("Ingrese su nombre");
        jugador1.setNombre(nameJugador);
        String edad = JOptionPane.showInputDialog("Escriba su edad");
        int edadJugador = Integer.parseInt(edad);
        jugador1.setEdad(edadJugador);
        // se pregunta el nombre que se le quiere dar  la CPU
        String cpuNombre = JOptionPane.showInputDialog("Escriba el nombre del contrincante (CPU) ");
        CPU1.setNombre(cpuNombre);
    
        // falta programar el tablero, ubicacion de barcos del usuario y CPU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // antes de continuar, hay que completar el tablero, ubicacion de barcos del usuario y del CPU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        
        
        
       
       
        /* este es el menu de opciones que tiene el jugador, meter todo esto como un metodo y llamarlo cada vez que el jugador tiene el turno. (falta completar las opciones), el turno del jugador termina solo
       si selecciona el caso 1.*/
        
        
        menu1.opcionesMenu();
       int interruptor = 1;
       while (interruptor == 1){
       int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de la opcion que quiere realizar"));
        switch (seleccion){
            
                
            // programar los ataques cuando se tenga listo el tablero del usuario y del CPU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case 1: 
                
                interruptor = 2;
                JOptionPane.showMessageDialog(null, "Su turno ha terminado, el jugador " + CPU1.getNombre()+ " va a atacar ");
                break;
           // programar el tablero de ataque !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case 2:
                break;
            //programar tablero del usuario (mostrar el tablero del usuario)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case 3:
                break;
           // programar hacer trampa (mostrar el tablero de la CPU)!!!!!!!!!!!!!!!!!!!!!
            case 4:
                break;
            // mostrar el marcador (barcos del usuario y barcos del CPU, destruidos, danados y nuevos) !!!!!!!!!!!!!!!!!!!!!!!!
            case 5:
                break;
            case 6:
                menu1.opcionesMenu();
                break; 
            default :
                JOptionPane.showMessageDialog(null, "tiene que seleccionar un valor entre 1 - 6, el valor 6 le permite ver las opciones disponibles");
            
        } 
       }
         
    
    
    
    }

}
