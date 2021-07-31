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
public class Marcador {

 
    
   
    public void vidaBarco(Barco barco ){
        
       if (barco.vida == 0){
           System.out.println("el barco " + barco + "esta destruido" );  
       } 
       else {
           System.out.println("la vida del barco " + barco.tipo + " es " +  barco.vida);        
       }  
       
    }
           
    
    
    
}
