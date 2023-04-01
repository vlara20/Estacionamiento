package com.mycompany.piladinamica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class main {
    public static void main(String[] args){
        /*PILA pila=new PILA();
        pila.push(5);
        pila.push(10);
        pila.push(2);
        pila.push(3);
        pila.push(8);
        pila.push(5);
        pila.push(3);
        pila.push(7);
        pila.push(20);
        pila.push(27);
        pila.push(30);
        System.out.println("****");
        pila.imprimir();
        System.out.println("****");
        pila.pop();
        pila.pop();
        pila.push(30);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();        pila.pop();
        pila.imprimir();*/
	
        /*PILAd pila1 = new PILAd();
        nodo alumno1 = new nodo("David","Torres","Moreno",7);
        pila1.push(alumno1);
        nodo alumno2 = new nodo("Diego","Cruz","Ramos",8);
        pila1.push(alumno2);
        nodo alumno3 = new nodo("Joan","Reza","Hernández",6);
        pila1.push(alumno3);
        nodo alumno4 = new nodo("Alan","Ortíz","Beltrán",7);
        pila1.push(alumno4);
        pila1.imprimir();*/
        Pila_Clase_D parking = new Pila_Clase_D();
        
        nodo_vehiculo C1 = new nodo_vehiculo("A113");
        nodo_vehiculo C2 = new nodo_vehiculo("B114");
        nodo_vehiculo C3 = new nodo_vehiculo("C115");
        parking.push(C1);
        parking.push(C2);
        parking.push(C3);
        parking.imprimir();
        System.out.println("------------------");
        if (parking.buscarPlacasC("D114")==true){
            System.out.println(" SE ENCONTRO");
        }else{
            System.out.println(" no se encontro");
        }
        
        System.out.println("--------------------");
        
        
        System.out.println(parking.pop().placa);
        System.out.println("--------------------");
        parking.imprimir();
        System.out.println("--------------------");
        System.out.println(parking.SacarVehiculo(PilaTemp);
        
    }
    
}
