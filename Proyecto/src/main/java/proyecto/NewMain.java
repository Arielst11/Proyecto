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
       Barco jugadorCapitan1 = new Barco("c",3);
       Barco jugadorCapitan2 = new Barco("c",3);
       Barco jugadorTeniente1 = new Barco("t",1);
       Barco jugadorTeniente2 = new Barco("t",1);
       Barco jugadorTeniente3 = new Barco("t",1);
         
        // se crean los barcos mediante el constructor para el CPU 
         
       Barco cpuAlmirante1 = new Barco("a",4);
       Barco cpuCapitan1 = new Barco("c",3);
       Barco cpuCapitan2 = new Barco("c",3);
       Barco cpuTeniente1 = new Barco("t",1);
       Barco cpuTeniente2 = new Barco("t",1);
       Barco cpuTeniente3 = new Barco("t",1);
        
        
        
           
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
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 1, 1, cpuAlmirante1.tipo);
         // coordenadas del barco Capitan1 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 2, 2, cpuCapitan1.tipo);
         // coordenadas del barco Capitan2 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 3, 3, cpuCapitan2.tipo);
         // coordenadas del barco Teniente1 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 4, 4, cpuTeniente1.tipo);
         // coordenadas del barco Teniente2 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 5, 5, cpuTeniente2.tipo);
         // coordenadas del barco Teniente3 (del CPU)
         tableroCPU.ingresaCoordenadasXYTablero(tableroCPU1, 6, 6, cpuTeniente3.tipo);
         
        System.out.println(); // linea de separacion de tableros.
         
        
        JOptionPane.showMessageDialog(null, "este es el tablero de su oponente"); // !!!!!!!!!!!!!!!!!!!!!!!!!!! Eliminar esta linea de codigo solo es para testear el mapa del CPU
         tableroCPU.mostrarMapa(tableroCPU1); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Eliminar esta linea de codigo solo es para testear el mapa del CPU

      
        /* este es el menu de opciones que tiene el jugador, meter todo esto como un metodo y llamarlo cada vez que el jugador tiene el turno. (falta completar las opciones), el turno del jugador termina solo
       si selecciona el caso 1.*/
        
        
        menu1.opcionesMenu();
       int terminadorTurno = 1;
       while (terminadorTurno == 1){
       int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de la opcion que quiere realizar"));
        switch (seleccion){
            
                
            // programar los ataques cuando se tenga listo el tablero del usuario y del CPU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case 1: 
                
                terminadorTurno = 2;
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