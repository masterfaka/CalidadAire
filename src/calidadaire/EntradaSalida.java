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
class EntradaSalida {

    static void mostrarDatos(ArrayList<Contaminacion> lista) {
        System.out.println("datos blah");//To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < lista.size(); i++) {
            Contaminacion c=lista.get(i);
            System.out.println(c.toString());
            
        }
    }
    static String imprimirValores(ArrayList a){
        String aux="";
        for (int i = 0; i < a.size(); i++) {
           aux=aux+a.get(i)+"µ/m3 \n";
        }
         return aux;
    }
    
}
