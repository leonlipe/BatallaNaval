/*
 * Proyecto para la clase de Estructuras de Datos
 * Batalla Naval
 * El programa ejemplifica el uso de Arrays unidimensionales y multidimensionales
 * Así como el uso de algunas implementaciones de Java Collections
 */

package batallanaval;

import mx.redleon.naval.Barco;
import mx.redleon.naval.Coordenada;
import mx.redleon.naval.PortaAviones;
import mx.redleon.naval.Tablero;
import java.io.*;
import java.net.*;

/**
 *
 * @author leon
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Juego de Batalla Naval");
            System.out.println("Opciones del juego:");
            System.out.println("$ java BatallaNaval opciones");
            System.out.println("Donde opciones es alguna de las siguientes:");
            System.out.println("");
            System.out.println("test - Muestra un test del juego");
            System.out.println("offline - Modo Offline con dos jugadores");
            System.out.println("client IP PORT - Modo Online - cliente");
            System.out.println("server PORT - Modo Online - Server");
            
        }else {
          if (args[0].equals("test")){
            BatallaNaval juego = new BatallaNaval();
            juego.test();
          }else if(args[0].equals("offline")){
              
          }else if(args[0].equals("client")){
                String hostName = args[1];
                int portNumber = Integer.parseInt(args[2]);  
                BatallaNaval juego = new BatallaNaval();
                juego.netClient(hostName, portNumber);
          }else if(args[0].equals("server")){
              int portNumber = Integer.parseInt(args[1]);
              BatallaNaval juego = new BatallaNaval();
                juego.netServer(portNumber);
          }
        }
    }
    
    
    public void netServer(int port){
        try (
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();     
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);                   
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + port + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
    public void netClient(String hostname, int port){
         try (
            Socket echoSocket = new Socket(hostname, port);
            PrintWriter out =
                new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn =
                new BufferedReader(
                    new InputStreamReader(System.in))
        ) {
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to   "+          hostname);
            System.exit(1);
        } 
    }
    
    public void test(){
     System.out.println("Juego de batalla naval");
        PortaAviones portaAviones = new PortaAviones();
        portaAviones.posicionaBarco(Barco.NORTH, new Coordenada(5,5));
        PortaAviones portaAviones2 = new PortaAviones();
        portaAviones2.posicionaBarco(Barco.EAST, new Coordenada(7,5));
        System.out.println(portaAviones);
        Tablero tablero = new Tablero();
        System.out.println(tablero);
        tablero.agregaBarco(portaAviones);
        tablero.agregaBarco(portaAviones2);
        tablero.muestraMisBarcos();
        System.out.println(tablero);
        
        System.out.println(tablero.dispara(new Coordenada(1,1)));
        System.out.println(tablero.dispara(new Coordenada(5,5)));
        System.out.println(tablero.dispara(new Coordenada(4,5)));
        System.out.println(tablero.dispara(new Coordenada(3,5)));
        System.out.println(tablero.dispara(new Coordenada(2,5)));
        System.out.println(tablero.dispara(new Coordenada(1,5)));
        System.out.println(tablero.muestraMisDisparos());
        System.out.println(tablero.verificarHundimientos());   
    }
    
}
