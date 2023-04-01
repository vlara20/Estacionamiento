/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilaestatica;

/**
 *
 * @author David
 */
public class PILA {
    public int tope;
    public int numeros[];
    public int tamanio=10;
    public PILA(){
        this.numeros=new int[tamanio];
        this.tope=-1;
    }
    public void push(int a){
        if(this.tope==tamanio-1){
            System.out.println("PILA llena");
        }
        else{
            this.tope=this.tope+1;
            this.numeros[this.tope]=a;
        }
    }
    public void pop(){
        if(isVacia()==true){
            System.out.println("La pila esta vacia");
        }
        else{
            this.numeros[this.tope]=-9999;
            this.tope=this.tope-1;
        }
    }
    public boolean isVacia(){
        if(this.tope==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void imprimir(){
        for(int i=this.tope;i>=0;i--){
            System.out.println(i+" - "+this.numeros[i]);
        }
    }
}
