package Controlador.clientes;

import Controlador.constructor.Constructor;
import Controlador.fichero.Fichero_cliente;

/*@author Oscar Fonseca*/

public class Controlador_clientes {
    
        Fichero_cliente Fichero = new Fichero_cliente();
    
    public Controlador_clientes(){}
    
    public boolean agregarcliente(Constructor constructor){
        
        Constructor aux = (Constructor) Fichero.Leerfichero(constructor.getNombre());
        if(aux == null){
            Fichero.Ficherocliente(constructor);
            return true;
        }
        return false;
    }
}
