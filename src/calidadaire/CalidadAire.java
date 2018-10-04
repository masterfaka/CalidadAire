/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calidadaire;

import java.util.ArrayList;

/**
 *
 * @author Mañanas
 */
public class CalidadAire {

    /**
     * @param args the command line arguments
     * clase para esAs propiedades
     * estacion magnitud(elemento.. mirar tabla anexos) fecha y datos(cantidades) de v
     */
    public static void main(String[] args) {
        ArrayList<Contaminacion> lista=AccesoFichero.obtenerDatos();
        EntradaSalida.mostrarDatos(lista);
        
    }
    
}
