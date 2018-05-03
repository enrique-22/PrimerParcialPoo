/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.de.carlos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Nigga
 */

public class ListaReserva {
    public ArrayList<Reserva> reservas;
    public ListaClientes clientes;
    //public int ver_por_semana;
    //public int cancelar;
    //public int modificar;
    
    
    public ListaReserva(){
    reservas= new ArrayList<>();
    }
    
     public void nuevaReserva(){
        Reserva reserva=new Reserva();
        Scanner leer= new Scanner(System.in);
         System.out.println("ingrese nobre del cliente:");
        if (buscarCliente(leer.nextLine())){
            Cliente nuevo= new Cliente();
           clientes.add(nuevo);
           reserva.cliente=nuevo;
            System.out.println("desea agregar un paquete s/n");
            String opcion=leer.next();
            if (opcion=="n"){
           reserva.pack=agregarPack;
                   }
            reserva.Total=reserva.habitacion.precio + reserva.pack.precio; 
        }else System.out.println("el cliente ya tiene una reservacion");
        
        
        
    }
     public boolean buscarCliente(String cliente){
         for (Reserva e : reservas){
             if (e.cliente.nombre==cliente){
                 return false;
             }
         }
         return true;
     }

    public ListaReserva(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void nuevoCliente(){
        Scanner leer=new Scanner(System.in);
        
    }
    public Pack agregarPack(ListaPack lista){
        System.out.println("selleccione su paquete a agregar");
        lista.mostrar();
        Utils leer = new Utils();
        int i=leer.pedirEntero();
        int flag=1;
        for (Pack e : lista){
            if (i==flag){
                return e;
            }
        }
        //return NULL;
    }
}

