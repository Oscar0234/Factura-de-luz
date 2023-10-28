package Controlador.info;

import Controlador.constructor.Constructor;
import javax.swing.JOptionPane;
import Controlador.constructor.Registros.*;
import java.util.ArrayList;

/*@author Oscar Fonseca*/

public class Metodo {
    
    Reguladores rp;

    public Metodo() {
        rp = new Reguladores();
    }
    
    public void eliminarRegistro(Constructor constructor){
        try{
            if(leerMedidor(constructor)== null) {
            } else {
                String medidor = rp.buscaCodigo(leerMedidor(constructor));
                if(medidor == null) ; else {
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto","Si/No",0);
                    if(s == 0){
                        eliminarRegistro(medidor);
                        
                        
                        
                        constructor.setNombre("");
                        constructor.setDireccion("");
                        constructor.setNºmedidor("");
                        constructor.setNIS(s);
                    }
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
        public String leerMedidor(Constructor constructor){
        try{
            String medidor = constructor.getNºmedidor().trim();
            return medidor;
        }catch(Exception ex){
            return null;
        }
    }
    
}
