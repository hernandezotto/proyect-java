/*
Clase para crear y realizar acciones con los objetos "veículos creados
*/
package Autos;

public class Auto {
    
    //Atributos
    String col; //Color
    String mc; //Marca
    int md; //Modelo
    int cb;    // Caballos de Fuerza
    int pt;    // # de Puertas
    final String mat;  // Matricula identificador Unico no eprmite cambios

    //Constructor para objetos nuevos.
    public Auto() {
        this.col = "";
        this.mc = "";
        this.md = 0;
        this.cb = 0;
        this.pt = 0;
        this.mat = "";
    }
    public Auto(String col, String mc, int md, int cb, int pt, String mat) {
        this.col = col;
        this.mc = mc;
        this.md = md;
        this.cb = cb;
        this.pt = pt;
        this.mat = mat;
    }
   
    //métodos Getters para todos los atributos
    public String getCol() {
        return col;
    }

    public String getMc() {
        return mc;
    }

    public int getMd() {
        return md;
    }

    public int getCb() {
        return cb;
    }

    public int getPt() {
        return pt;
    }

    public String getMat() {
        return mat;
    }
    
    /* 
    Solo se genera el Setter a color haciendo referencia a los 
    requerimientos del ejercicio.    
    */ 
    public void setCol(String col) {
        this.col = col;
    }   
}
