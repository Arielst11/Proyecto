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
       JOptionPane.showMessageDialog(null, "opciones: 1 para atacar , 2 para ver su tablero, 3 para hacer trampa, 4 para ver tablero de ataque, 5 mostrar marcador, 6 ver opciones otra vez.");
    
    }

public void ataqueCoordenadaX(String letra){
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
   JOptionPane.showMessageDialog(null, "Usted selecciono la fila "+ letra);
       
   }

public void ataqueCoordenadaY (String numero){
         int coordenadaY;
         if(numero.equals("1")){
             coordenadaY = 1;
             this.coordenadaY = coordenadaY;
              } 
           if(numero.equals("2")){
             coordenadaY = 2;
             this.coordenadaY = coordenadaY;
              } 
           if(numero.equals("3")){
             coordenadaY = 3;
             this.coordenadaY = coordenadaY;
              } 
           if(numero.equals("4")){
             coordenadaY = 4;
             this.coordenadaY = coordenadaY;
              } 
           if(numero.equals("5")){
             coordenadaY = 5;
             this.coordenadaY = coordenadaY;
              } 
       if(numero.equals("6")){
             coordenadaY = 6;        
             this.coordenadaY = coordenadaY;
              } 
  JOptionPane.showMessageDialog(null, "Usted selecciono la columna "+ numero);
   
   }



}


        
