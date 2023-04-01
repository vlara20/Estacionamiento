package com.mycompany.piladinamica;
public class nodo_vehiculo {
    public String placa;
    public String modelo;
    public String marca;
    public int puertas;
    public String color;
    public String tipomotor;
    public nodo_vehiculo siguiente;
    
    public nodo_vehiculo(){
    
    }
    public nodo_vehiculo(String p){
        placa = p;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }
    
    
    
}
