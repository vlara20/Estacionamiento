/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piladinamica;

/**
 *
 * @author David
 */
public class nodo {
    public String name;
    public String apellidop;
    public String apellidom;
    public int calificacion;
    public nodo siguiente;
    
    public nodo(){
    }
    
    public nodo(String n, String p, String m, int c){
        this.name=n;
        this.apellidop=p;
        this.apellidom=m;
        this.calificacion=c;
        this.siguiente=null;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
