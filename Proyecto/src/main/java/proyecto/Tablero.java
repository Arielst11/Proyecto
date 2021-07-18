/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author asanc
 */
public class Tablero {

    
    // este metodo rellena el mapa de agua.
    public void creacionMarTablero(String Tablero [] []){
     
     for (int i = 0; i<7; i++){
         for(int j = 0; j<7; j++){
        Tablero [i] [j] = "=";
         }
     
     }
    }  
    // este metodo rellena la casilla [0] [0] y crea los margenes de letras y numeros. 
  public void creacionFilaColumna(String Tablero [] []){
   Tablero [0] [0] = "/";
   Tablero [0] [1] = "1";
   Tablero [0] [2] = "2";
   Tablero [0] [3] = "3";
   Tablero [0] [4] = "4";
   Tablero [0] [5] = "5";
   Tablero [0] [6] = "6";
   Tablero [1] [0] = "A";
   Tablero [2] [0] = "B";
   Tablero [3] [0] = "C";
   Tablero [4] [0] = "D";       
   Tablero [5] [0] = "E";                   
   Tablero [6] [0] = "F";                               
}
   
  //este metodo imprime todo el mapa.
  public void mostrarMapa(String Tablero [][]){
     
     for(int i = 0; i<7; i++){
         for(int j = 0; j<7; j++){
           System.out.print(Tablero [i][j]);
             
         }
      System.out.println();
     }
      }

        
     }
     
 
  
  
  

       
   
          
           
         

