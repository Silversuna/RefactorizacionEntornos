/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.EstadoDeVueloO;
import java.io.IOException;

/**
 *
 * @author Miguel Ángel
 */
public class ControladorPiloto {
    
     // el ser el controlador tiene que tener un objeto de la vista ademas tiene que acceder a los datos de la vista
    
    private Piloto vista;
    
    // este atributo se inicializa en un constructor

    public ControladorPiloto(Piloto vista) {
        this.vista = vista;
    }
    
    public void modificarRumbo() throws IOException {
        
        int nuevoRumbo = Integer.parseInt(vista.getjTextFieldRumbo().getText());
        //try {
            EstadoDeVueloO.devolverEstado().setRumbo(nuevoRumbo);
        //} catch (IOException ex) {
            // llama al error en la vista 
            //vista.mostrarMensajeErrorCajaNegra();
        //}
    }
    
    
    public void modificarAltitud() throws IOException{
        int nuevaAltitud = Integer.parseInt(vista.getjTextFieldAltitud().getText());
        EstadoDeVueloO.devolverEstado().setAltitud(nuevaAltitud);
    }
    
    // NOTA : LLAMAREMOS DESDE LA VISTA A ESTE CONTROLADOR EN CADA UNO DE LOS ACTIONS PERFORM
    
}
