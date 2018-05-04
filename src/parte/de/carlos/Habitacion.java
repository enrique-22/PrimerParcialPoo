package parte.de.carlos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Habitacion {
    public String piso;
    public int N_habitacion;
    public String pack;
    public String tipo;
    public boolean cargo;
    public boolean reservada;
    public boolean en_uso;
    public boolean disponible;
    public boolean precio;

    public Habitacion(String piso, int N_habitacion, String pack, String tipo, boolean cargo, boolean reservada, boolean en_uso, boolean disponible, boolean precio) {
        this.piso = piso;
        this.N_habitacion = N_habitacion;
        this.pack = pack;
        this.tipo = tipo;
        this.cargo = false;
        this.reservada = false;
        this.en_uso = false;
        this.disponible = false;
        this.precio = precio;
    }
}