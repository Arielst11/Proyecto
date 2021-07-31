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
public class CPU {

    private String nombre;
    public int cantVictoria;
    public int cantDerrota;

    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void cpuAtaqueFallado (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu){
    
        if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("0")){  
          tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "0" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " fallo");  
           }
         if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("X")){  
          tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "X" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " fue sobre un barco ya destruido");  
           }
         
         if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("=")){  
          tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "0" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " fallo y cayo en el mar");  
           }
        
        
    }
     public void cpuAtaqueAlmirante1 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("a")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " golpeo su barco Almirante");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Almirante le quedan " + nombreBarco.vida + " de vida");
           
           
           }
}

       public void cpuAtaqueCapitan1 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("c1")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " golpeo su barco Capitan1");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Capitan1 le quedan " + nombreBarco.vida + " de vida");
           
           }    
}
       
          public void cpuAtaqueCapitan2 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("c2")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " golpeo su barco Capitan2");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Capitan2 le quedan " + nombreBarco.vida + " de vida");
           
           }    

          
          }  
          
          public void cpuAtaqueTeniente1 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("t1")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " golpeo su barco Teniente1");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Teniente1 le quedan " + nombreBarco.vida + " de vida");
           
           }    
          }  
          public void cpuAtaqueTeniente2 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("t2")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() +  "golpeo su barco Teniente2");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Teniente2 le quedan " + nombreBarco.vida + " de vida");
           
           }    
          }  
       
         public void cpuAtaqueTeniente3 (String tableropropio [][], int coordenadaAtaqueCPUX , int coordenadaAtaqueCPUY , CPU nombreCpu , Barco nombreBarco){
    
       if (tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY].equals("t3")){
           
       tableropropio [coordenadaAtaqueCPUX][coordenadaAtaqueCPUY] = "*" ; 
          JOptionPane.showMessageDialog(null,"El ataque de " + nombreCpu.getNombre() + " golpeo su barco Teniente3");
         nombreBarco.vida = nombreBarco.vida - 1;
           JOptionPane.showMessageDialog(null,"A su barco Teniente3 le quedan " + nombreBarco.vida + " de vida");
           
           }    
          }  
          
          
          
          
          
}