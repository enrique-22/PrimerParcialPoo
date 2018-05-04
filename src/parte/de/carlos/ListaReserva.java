/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.de.carlos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */

public class ListaReserva {
    public ArrayList<Reserva> reservas;
    public ArrayList<Cliente> clientes;
    public int ver_por_semana;
    public int cancelar;
    public int modificar;
    
    
    public ListaReserva(){}
    
     public void nuevaReserva(){
        Reserva reserva=new Reserva();
        nuevoCliente();
        
    }

    public ListaReserva(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void nuevoCliente(){
        Scanner leer=new Scanner(System.in);
        
    }
}

