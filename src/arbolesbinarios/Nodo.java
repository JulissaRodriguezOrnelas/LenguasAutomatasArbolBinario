/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author julis
 */
public class Nodo {
    //VARIABLES
    private String dato;
    private Nodo izquierda;
    private Nodo derecha;
    //METODO CONSTRUCTOR
    public Nodo(String dato){
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
    //ESTE METODO NOS REGRESA EL VALOR DE 
    //LA VARIABLE DATO
    public String getDato(){
        return dato;
    }
    //ESTE METODO NOS REGRESA EL VALOR DE DATO
    public void setDato(String dato){
        this.dato = dato;
    }
    //NOS REGRESA EL VALOR DE IZQUIERDA
    public Nodo getIzquierda(){
        return izquierda;
    }
    //INICIALIZAMOS LA VARIBLE IZQUIERDA
    public void setIzquierda(Nodo izquierda){
        this.izquierda = izquierda;
    }
    //REGRESAMOS EL DATO QUE ESTA EN LA VARIABLE
    //IZQUIERDA
    public Nodo getDerecha(){
        return derecha;
    }
    //INICIALIZAMOS LA VARIABLE DERECHA
     public void setDerecha(Nodo derecha){
        this.derecha = derecha;
    }
}
