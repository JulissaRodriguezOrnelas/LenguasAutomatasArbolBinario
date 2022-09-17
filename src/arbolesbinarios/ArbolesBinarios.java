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
public class ArbolesBinarios {

    //VARIABLES
    private Nodo raiz;
    private String cad = "";
    private int cont = 0;
    //MÉTODO CONSTRUCTOR
    public ArbolesBinarios(String dato){
        raiz = new Nodo(dato);
        raiz.setIzquierda(null);
        raiz.setDerecha(null);
    }
    
    public void insertarIzquierda(String dato, Nodo ref){
        if(ref!=null){
            Nodo nuevo = new Nodo(dato);
            ref.setIzquierda(nuevo);
        }
    }
    public void insertarDerecha(String dato, Nodo ref){
        if(ref!=null){
            Nodo nuevo = new Nodo(dato);
            ref.setDerecha(nuevo);
        }
    }
    public String niveles(Nodo ref){
        if(ref!=null){
            if(ref==raiz){
                cad="";
            }
            cad = cad +" "+ref.getDato();
            niveles(ref.getIzquierda());
            niveles(ref.getDerecha());
        }return cad;
    }
    public String preOrden(Nodo ref){
        if(ref!=null){
            if(ref==raiz){
                cad = "";
            }
            cad = cad + " " + ref.getDato();
            preOrden(ref.getIzquierda());
            preOrden(ref.getDerecha());
        }
        return cad;
    }
    public String inOrden(Nodo ref){
        if(ref!=null){
            if(ref==null){
                cad = "";
            }
            inOrden(ref.getIzquierda());
            cad = cad + " " + ref.getDato();
            inOrden(ref.getDerecha());
        }
        return cad;
    }
    public String posOrden(Nodo ref){
        if(ref!=null){
            if(ref==null){
                cad = "";
            }
            posOrden(ref.getIzquierda());
            posOrden(ref.getDerecha());
            cad = cad + " " + ref.getDato();
        }
        return cad;
    }
    public Nodo getRaiz(){
        return raiz;
    }
    public static void main(String[] args) {
        //VARIABLES
        
        
    }
    
}
