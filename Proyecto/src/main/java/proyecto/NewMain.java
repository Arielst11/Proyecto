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
    
       // se crean los barcos mediante el constructor para el jugador
       
       Barco jugadorAlmirante1 = new Barco("a",4);
       Barco jugadorCapitan1 = new Barco("c1",3);
       Barco jugadorCapitan2 = new Barco("c2",3);
       Barco jugadorTeniente1 = new Barco("t1",1);
       Barco jugadorTeniente2 = new Barco("t2",1);
       Barco jugadorTeniente3 = new Barco("t3",1);
         
        // se crean los barcos mediante el constructor para el CPU 
         
       Barco cpuAlmirante1 = new Barco("a",4);
       Barco cpuCapitan1 = new Barco("c1",3);
       Barco cpuCapitan2 = new Barco("c2",3);
       Barco cpuTeniente1 = new Barco("t1",1);
       Barco cpuTeniente2 = new Barco("t2",1);
       Barco cpuTeniente3 = new Barco("t3",1);
        
        
        
           
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
    
        JOptionPane.showMessageDialog(null, "Creando tableros de juego");
        
        //Se crea el objeto Tablero para usar los metodos ya programados en esa clase.
        // se crea el arreglo String TableroPropio y se rellenan los campos principales;
        //se imprime para ver el resultado.
        
        Tablero tableroPropio = new Tablero();
        String tableroPropio1 [][] = new String[7][7];
        
       tableroPropio.creacionMarTablero(tableroPropio1);
       tableroPropio.creacionFilaColumna(tableroPropio1);
       tableroPropio.mostrarMapa(tableroPropio1);
       
       
         JOptionPane.showMessageDialog(null, "Para jugar, usted debe agregar 6 barcos, usted tiene 1 barco Almirante, 2 barcos Capitan y 3 barcos Teniente ");    
        //se piden las coordenadas de los barcos y se ingresan al tableroPropio1 (arreglo)
        
        //coordenadas barco Almirante1 (del jugador)
         String fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Admirante");
         jugadorAlmirante1.asignacionCoordenadaX(fila);
         int coordenadaX = jugadorAlmirante1.coordenadaX;
         System.out.println(coordenadaX);
         String columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Admirante");
         jugadorAlmirante1.asignacionCoordenadaY(columna);
         int coordenadaY = jugadorAlmirante1.coordenadaY;
         System.out.println(coordenadaY);   
        // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]" Con un metodo
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorAlmirante1.coordenadaX, jugadorAlmirante1.coordenadaY, jugadorAlmirante1.tipo);
        
        // coordenadas del barco Capitan1 (del jugador)
         fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Capitan 1");
         jugadorCapitan1.asignacionCoordenadaX(fila);
         coordenadaX = jugadorCapitan1.coordenadaX;
         System.out.println(coordenadaX);
         columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Capitan 1");
         jugadorCapitan1.asignacionCoordenadaY(columna);
         coordenadaY = jugadorCapitan1.coordenadaY;
         System.out.println(coordenadaY);   
         // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]"
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorCapitan1.coordenadaX, jugadorCapitan1.coordenadaY, jugadorCapitan1.tipo);
         
         // coordenadas del barco Capitan2 (del jugador)
         fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Capitan 2");
         jugadorCapitan2.asignacionCoordenadaX(fila);
         coordenadaX = jugadorCapitan2.coordenadaX;
         System.out.println(coordenadaX);
         columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Capitan 2");
         jugadorCapitan2.asignacionCoordenadaY(columna);
         coordenadaY = jugadorCapitan2.coordenadaY;
         System.out.println(coordenadaY); 
        // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]"
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorCapitan2.coordenadaX, jugadorCapitan2.coordenadaY, jugadorCapitan2.tipo);
         
        // coordenadas del barco Teniente1 (del jugador)
          fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Teniente 1");
         jugadorTeniente1.asignacionCoordenadaX(fila);
         coordenadaX = jugadorTeniente1.coordenadaX;
         System.out.println(coordenadaX);
         columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Teniente 1");
         jugadorTeniente1.asignacionCoordenadaY(columna);
         coordenadaY = jugadorTeniente1.coordenadaY;
         System.out.println(coordenadaY); 
        // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]"
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorTeniente1.coordenadaX, jugadorTeniente1.coordenadaY, jugadorTeniente1.tipo);
         
         // coordenadas del barco Teniente2 (del jugador)  
         fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Teniente 2");
         jugadorTeniente2.asignacionCoordenadaX(fila);
         coordenadaX = jugadorTeniente2.coordenadaX;
         System.out.println(coordenadaX);
         columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Teniente 2");
         jugadorTeniente2.asignacionCoordenadaY(columna);
         coordenadaY = jugadorTeniente2.coordenadaY;
         System.out.println(coordenadaY);
         // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]"
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorTeniente2.coordenadaX, jugadorTeniente2.coordenadaY, jugadorTeniente2.tipo);
         
         // coordenadas del barco Teniente3 (del jugador)
         fila = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere ingresar el Barco Teniente 3");
         jugadorTeniente3.asignacionCoordenadaX(fila);
         coordenadaX = jugadorTeniente3.coordenadaX;
         System.out.println(coordenadaX);
         columna = JOptionPane.showInputDialog("ingrese la coordenada de la Columna (numero) donde quiere ingresar el Barco Teniente 3");
         jugadorTeniente3.asignacionCoordenadaY(columna);
         coordenadaY = jugadorTeniente3.coordenadaY;
         System.out.println(coordenadaY);
         // se ingresan las coordenadas del barco en el Tablero "String tableroPropio1 [][] = new String[7][7]"
         tableroPropio.ingresaCoordenadasXYTablero(tableroPropio1, jugadorTeniente3.coordenadaX, jugadorTeniente3.coordenadaY, jugadorTeniente3.tipo);
         
         // Se imprime el tablero para ver la ubicacion de los barcos 
         
         JOptionPane.showMessageDialog(null, "Este es su tablero propio");
         tableroPropio.mostrarMapa(tableroPropio1);
         
         
         // se crea el tablero para la CPU.
         
         Tablero tableroCPU = new Tablero(); 
         String tableroCPU1 [][] = new String [7][7];
        // Se rellena el tablero CPU
       tableroCPU.creacionMarTablero(tableroCPU1);
       tableroCPU.creacionFilaColumna(tableroCPU1);
       
         // coordenadas del barco Almirante1 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 1, 6, cpuAlmirante1.tipo);
         // coordenadas del barco Capitan1 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 2, 6, cpuCapitan1.tipo);
         // coordenadas del barco Capitan2 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 3, 6, cpuCapitan2.tipo);
         // coordenadas del barco Teniente1 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 4, 6, cpuTeniente1.tipo);
         // coordenadas del barco Teniente2 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 5, 6, cpuTeniente2.tipo);
         // coordenadas del barco Teniente3 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 6, 6, cpuTeniente3.tipo);
         
        System.out.println(); // linea de separacion de tableros.
         
        
        JOptionPane.showMessageDialog(null, "este es el tablero de su oponente"); // !!!!!!!!!!!!!!!!!!!!!!!!!!! Eliminar esta linea de codigo solo es para testear el mapa del CPU
        tableroCPU.mostrarMapa(tableroCPU1); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Eliminar esta linea de codigo solo es para testear el mapa del CPU
         
        // se crea el tablero de ataque.
         Tablero tableroAtaque = new Tablero();          
         String tableroAtaque1 [][] = new String [7][7];
         tableroAtaque.creacionMarTablero(tableroAtaque1);
         tableroAtaque.creacionFilaColumna(tableroAtaque1);
         
                 
         
        menu1.opcionesMenu();
       
        int barcosJugador = 6;
        int barcosCPU = 6;
        int finalizadorJuego = 0; 
       
       while (finalizadorJuego == 0){
            
        /* if(barcosJugador = 0 || barcosCPU = 0 ){
            finalizadorJuego = 1;
        }
        */    
       int terminadorTurno = 1;
       while (terminadorTurno == 1){
       int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Este es su turno, escriba el numero de la opcion que quiere realizar"));
        switch (seleccion){
            
                
          
            case 1: 
                
             // esta opcion es para atacar.   
             // se selecciona la coorenada X y se guarda en el menu1
             String ataqueX = JOptionPane.showInputDialog("ingrese la coordenada de la fila (letra) donde quiere atacar");
             menu1.ataqueCoordenadaX(ataqueX);
             // se selecciona la coordenada Y y se guarda en el menu1
             String ataqueY = JOptionPane.showInputDialog("ingrese la coordenada de la columna (numero) donde quiere atacar");
             menu1.ataqueCoordenadaY(ataqueY);
              
             
             // en caso de atacar un espacio sin barco
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("=")){
               tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "0";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "0"; 
               JOptionPane.showMessageDialog(null,"su ataque fallo, su ataque cayo en el mar");        
             }
             //En caso de atacar un espacio que ya se habia atacado sin barco
              if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("0")){
               tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "0";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "0"; 
               JOptionPane.showMessageDialog(null,"su ataque fallo, ustd ya habia atacado este punto");        
             }
             //En caso de atacar un espacio que ya tenia un barco destruido.
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("X")){
               tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X"; 
               JOptionPane.showMessageDialog(null,"su ataque fallo, ustd ya habia destruido este barco");        
             }
             
             // en caso de atacar al Almirante1
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("a")){
               cpuAlmirante1.vida = cpuAlmirante1.vida - 1;
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Almirante1, a este barco le queda " +cpuAlmirante1.vida + " de vida" );
               
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Almirante1
               if(jugadorAlmirante1.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Almirante del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
             // en caso de atacar al Capitan1
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("c1")){
               cpuCapitan1.vida = cpuCapitan1.vida - 1;
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Capitan1, a este barco le queda " +cpuCapitan1.vida + " de vida" );
               
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Capitan1
               if(jugadorCapitan1.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Capitan1 del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
              // en caso de atacar al Capitan2
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("c2")){
               cpuCapitan2.vida = cpuCapitan2.vida - 1; 
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Capitan2, a este barco le queda " +cpuCapitan2.vida + " de vida" );
             
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Capitan2
               if(jugadorCapitan2.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Capitan2 del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
              // en caso de atacar al Teniente1
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("t1")){
               cpuTeniente1.vida = cpuTeniente1.vida - 1;
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Teniente1, a este barco le queda " +cpuTeniente1.vida + " de vida" );
           
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Teniente1
               if(cpuTeniente1.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Teniente1 del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
             // en caso de atacar al Teniente2
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("t2")){
               cpuTeniente2.vida = cpuTeniente2.vida - 1;  
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Teniente2, a este barco le queda " +cpuTeniente2.vida + " de vida" );
             
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Teniente2
               if(cpuTeniente2.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Teniente2 del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
             // en caso de atacar al Teniente3
             if(tableroCPU1[menu1.coordenadaX][menu1.coordenadaY].equals("t3")){
               cpuTeniente3.vida = cpuTeniente3.vida - 1;
               JOptionPane.showMessageDialog(null, "ataque exitoso, usted ataque el barco Teniente3, a este barco le queda " +cpuTeniente3.vida + " de vida" );
      
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "*";
            // en caso de destruir el Teniente3
               if(cpuTeniente3.vida == 0){
                  barcosCPU = barcosCPU - 1;
                JOptionPane.showMessageDialog(null, "Usted undio el barco Teniente3 del jugador " + CPU1.getNombre());
                tableroCPU1[menu1.coordenadaX][menu1.coordenadaY] = "X";
               tableroAtaque1[menu1.coordenadaX][menu1.coordenadaY] = "X";         
               }
               }
             
          
                terminadorTurno = 2;
                JOptionPane.showMessageDialog(null, "Su turno ha terminado, el jugador " + CPU1.getNombre()+ " va a atacar ");
                break;
            
            case 2:
               // muestra el tablero propio del Usuario 
               JOptionPane.showMessageDialog(null, "este es su tablero propio"); 
              tableroPropio.mostrarMapa(tableroPropio1);
                break;
            case 3:
            // muestra tablero CPU Trampa
                JOptionPane.showMessageDialog(null, "este es el tablero de su oponente");
                tableroCPU.mostrarMapa(tableroCPU1);
                 break;   
            case 4:
            // muestra el tablero de ataque    
              JOptionPane.showMessageDialog(null, "este es el tablero de ataque");
                tableroAtaque.mostrarMapa(tableroAtaque1);
                break;
           
            case 5:
             // mostrar el marcador (barcos del usuario y barcos del CPU, destruidos, danados y nuevos) !!!!!!!!!!!!!!!!!!!!!!!!    
                
                break;
            case 6:
                menu1.opcionesMenu();
                break; 
            default :
                JOptionPane.showMessageDialog(null, "tiene que seleccionar un valor entre 1 - 6, el valor 6 le permite ver las opciones disponibles");
            
        } 
       
       ///programar los turnos del CPU aqui. (SOLO ATACAR ALEATORIAMENTE) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       
       
       
       }
    
        
        
        
        
        
        
        
        } //ESTE CIERRA EL WHILE DE TURNOS 
    }
}

