package com.mycompany.piladinamica;
public class Pila_Clase_D {
    public nodo_vehiculo tope;
    public nodo_vehiculo inicio;
    public int total;
    
    public Pila_Clase_D(){
        inicio = null;
        tope = null;
        total = 0;
    }
    public boolean pila_vacia(){
        if(total == 0){
            return true;
        }else{
            return false;
        }
    }
    public void push(nodo_vehiculo entrada){
        if(pila_vacia() == true){
            inicio = entrada;
            tope = entrada;
            total++;
        }else{
        	entrada.siguiente=tope;
            tope = entrada;
            total++;
        }
       
    }
    //imprimir placas de vehiculo 
    public void imprimirTopeFondo(){
        if (pila_vacia()==true){
            System.out.println("El estacionamiento esta vacio");
            
        }
        else{
            nodo_vehiculo temporal;
            temporal=inicio;
            String sort[] =  new String[total-1];
            int index = 0;
            while(temporal.siguiente!=null){
                sort[index] = temporal.placa;
                temporal=temporal.siguiente;
                index++;   
            }
            sort[total-1]= temporal.placa;
            for (int i=total-1;i>=0;i--){
              System.out.println(sort[i]);  
            }
        }
    }
        //imprimir placas de vehiculo 
    public void imprimir(){
        if (pila_vacia()==true){
            System.out.println("El estacionamiento esta vacio");
            
        }
        else{
            nodo_vehiculo temporal;
            temporal=tope;
            do{
                System.out.println(temporal.placa);
                temporal=temporal.siguiente;
                
            }while(temporal!=null);
        }
    }
    
    //Buscar las placas del vehiculo y retornar su posición
    public boolean buscarPlacas(String placa){
        nodo_vehiculo temporal;
        temporal=inicio;
        String placas[] =  new String[total-1];
        boolean found=false;
        int index = 0;
        while(temporal.siguiente!=null){
            placas[index] = temporal.placa;
            temporal=temporal.siguiente;
            index++;   
        }
        placas[total-1]= temporal.placa;
        for (int i=total-1;i>=0;i--){
            if (placa.equals(placas[i])){
                found=true;
                System.out.println("la placa:"+placa+" fue encontrada en el lugar"+(i+1));
            }return found;
        }return found;
    }
    public boolean buscarPlacasC(String placa){
        nodo_vehiculo temporal;
        temporal=tope;
        do{
           if (placa.equals(temporal.placa)){
                return true;
            }
            temporal=temporal.siguiente;
        }while(temporal!=null);
        return false;
    }
    
    public nodo_vehiculo SacarVehiculo(String placa) {
    	if(buscarPlacasC(placa)==true) {
    		nodo_vehiculo temporal;
    		temporal=tope;
    		Pila_Clase_D PilaTemp = new Pila_Clase_D();
    		while(temporal.placa!=placa) {
    			nodo_vehiculo vehiculoSacado=pop();
    			PilaTemp.push(vehiculoSacado);
    		}
    		
    	}else {
    		System.out.println("Vehiculo no encontrado");
    		return null;
    	}
		return inicio;
    }
    
    public nodo_vehiculo pop() {
    	if(pila_vacia()==true) {
    		System.out.println("El estacionamiento esta vacio");
    		return null;
    	}else {
    		nodo_vehiculo temporal=tope;
    		tope=tope.siguiente;
    		temporal.siguiente=null;
    		return temporal;
    	}
    }
       
}
    