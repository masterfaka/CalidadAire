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
        //dar formato tabla
        
        System.out.println("Estacion |Magnitud |Fecha \t | 0:00-1:00|1:00-2:00|2:00-3:00|3:00-4:00|4:00-5:00|5:00-6:00| "
                + "6:00-7:00|7:00-8:00|8:00-9:00|9:00-10:00|10:00-11:00|11:00-12:00|12:00-13:00|13:00-14:00|14:00-15:00  | "
                + "15-16:00  | 16-17:00  |17:00-18:00| 18:00-19:00| 19-20:00| 20:00-21:00| 21:00-22:00| 22:00-23:00| 23-0:00");
        for (int i = 0; i < lista.size(); i++) {
            Contaminacion c=lista.get(i);
            System.out.println(c.toString());
            
        }
    }
    static String imprimirValores(ArrayList a){
        String aux="";
        for (int i = 0; i < a.size(); i++) {
           aux=aux+a.get(i)+"µ/m3| ";
        }
         return aux;
    }
    
}
