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
public class Menu {
    
    
public int coordenadaX;
public int coordenadaY;    
    
    
    
    
    // Se programa el menu de inicio
    public void menuInicio(){
        int iniciador = 1;
 while(iniciador == 1){
  String condicional = JOptionPane.showInputDialog("Desea jugar? escriba Si o No");
     System.out.println(condicional);
  if (condicional.equals("Si")){
      iniciador = 2;
  }
  if (condicional.equals("No")){
      iniciador = 3;
  }
   System.out.println(iniciador);
  JOptionPane.showMessageDialog(null,"Usted escribio " + condicional); 
 }
 
   if (iniciador == 2) {
      JOptionPane.showMessageDialog(null, "Iniciando Juego");
  }
   if (iniciador == 3) {
      JOptionPane.showMessageDialog(null, "Juego terminado");
      System.exit(0);
  }
           }
   

// opciones del menu 
    public void opcionesMenu(){
       JOptionPane.showMessageDialog(null, "ese es el menu de opciones, tiene que escribir el numero de la opcion que quiere hacer");
       JOptionPane.showMessageDialog(null, "opciones: 1 para atacar , 2 para ver tablero de ataque, 3 ver tablero propio, 4 hacer trampa, 5 mostrar marcador, 6 ver opciones otra vez.");
    
    }

}


        
