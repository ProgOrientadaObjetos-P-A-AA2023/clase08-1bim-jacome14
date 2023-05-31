package paquete1;

import java.io.Serializable;

public class Club implements Serializable{

    private int fundacion;
    private String nombre;
    private String siglas;
    
    public Club(String n, String si, int f){
        fundacion = f;
        nombre = n;
        siglas = si;
    }
    
    public void establecerFundacion(int n){
        fundacion = n;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerSiglas(String n){
        siglas = n;
    }
    
    public int obtenerFundacion(){
        return fundacion;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerSiglas(){
        return siglas;
    }
    
}
