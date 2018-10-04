/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calidadaire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 * 
 * 
 * 
 *      * leemos los datos desde posicion 8 MEJOR DE DOS EN DOS EN VES DE CADA UN(POR LA V)
 * estacion2 magnitud3(elemento.. mirar tabla anexos) fecha5-7 y datos(cantidades) de v

 */
class AccesoFichero {

    static ArrayList<Contaminacion> obtenerDatos() {
       ArrayList<Contaminacion> a=new ArrayList<>();
       File arch=new File("C:\\IFCT0609\\contaminacion.csv");
        try {
            FileReader fr= new FileReader(arch);
            BufferedReader br= new BufferedReader(fr);
            String Linea=br.readLine();
            //la primera linea se lee 2 veces por ser CSV!!
            while (Linea!=null) {  
                 
                 String[] aux= Linea.split(";");
              /*   c.setEstacion(aux[2]);
                 c.setMagnitud(aux[3]);
                 c.setAno(aux[5]);
                 c.setMes(aux[6]);
                 c.setDia(aux[7]);*/
                 ArrayList<String> datos_aux=new ArrayList<>();
                 for (int i = 8; i < aux.length; i=i+2) {//esto se podria acer aparte ller stringValores
                     datos_aux.add(aux[i]);     
                 }
                 Contaminacion c= new Contaminacion(aux[2], aux[3],aux[5],aux[6],aux[7],datos_aux);
                 // objeto se contruye con constructor
                 
                 a.add(c);
                 Linea=br.readLine();
            }
           
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
       
       
       return a;
    }


    
}
