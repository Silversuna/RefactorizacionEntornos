/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Miguel Ángel
 * El modelo constará de una clase llamada EstadoDeVuelo. De
esta clase sólo existirá un objeto en la aplicación. Esta clase
contendrá dos atributos enteros, la altitud y el rumbo, así
como los métodos observadores y mutadores necesarios.
También tendrá un atributo de la clase desarrollada en el punto
b.
 */
public class EstadoDeVueloO implements Serializable {
    
    private int altitud, rumbo;
    
    private static CajaNegra miCajaNegra;
    
    private static EstadoDeVueloO miEstado;
    
    private EstadoDeVueloO() {
          altitud=0;
          rumbo=0;
          
          miCajaNegra= new CajaNegra();// inicializacion de un objeto
    }
    
    public static EstadoDeVueloO devolverEstado(){
        if(miEstado==null) miEstado = new EstadoDeVueloO();
        return miEstado;
    }
    

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) throws IOException {
        this.altitud = altitud;
         miCajaNegra.registraEstado(this);
    }

    public int getRumbo() {
        return rumbo;
    }

    public void setRumbo(int rumbo) throws IOException {
        this.rumbo = rumbo;
         miCajaNegra.registraEstado(this);
    }
    
    
    
}
