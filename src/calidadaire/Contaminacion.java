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
 * estacion2 magnitud3(elemento.. mirar tabla anexos) fecha5-7 y datos(cantidades) de v
 */
class Contaminacion {
    private String estacion, magnitud, dia,mes, ano;
    private ArrayList<String> datos;

    public Contaminacion(String estacion, String magnitud, String dia, String mes, String ano, ArrayList<String> datos) {
        this.estacion = estacion;
        this.magnitud = magnitud;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.datos = datos;
    }
    

    @Override
    public String toString() {
        String txt="fecha: "+dia+"/"+mes+"/"+ano+", estacion:"+estacion+", ElementoMedido: "+magnitud+
                ", datos/h: "+EntradaSalida.imprimirValores(datos)+"\n";
        return txt; //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }




    
}
