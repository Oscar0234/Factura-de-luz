/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.info;

import Controlador.constructor.Constructor;
import java.util.ArrayList;

/**
 *
 * @author Oscar Fonseca
 */
public class Reguladores {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Reguladores(ArrayList<Object> a){
        this.a = a;
    }
    
    public void eliminarRegistro(int i){
    this.a.remove(i);
    }
    
    public Constructor obtenerRegistro(int i){
        return (Constructor)a.get(i);
    }
    
    public int buscaCodigo(int id){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(id == obtenerRegistro(i).getNºmedidor())return i;
        }
        return -1;
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
}
