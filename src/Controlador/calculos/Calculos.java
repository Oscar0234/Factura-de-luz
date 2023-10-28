package Controlador.calculos;

import Controlador.constructor.Constructor;
/**
 *
 * @author Oscar Fonseca
 */
public class Calculos {
    
    public void CalculokWh(Constructor constructor){
    
        int kwh = constructor.getkWh();
        Double ValorkWh = 0.0;
        
        ValorkWh = kwh * 5.798642857142857;
        
        constructor.setEnergiaC$(ValorkWh);
    }
    
    public void alumbradoPublico(Constructor constructor){
    
        Double valorkwh = constructor.getEnergiaC$();
        double alumbrado = 0.0;
        
        alumbrado = valorkwh * 0.1077592047400254;
        
        constructor.setAlumbradopublico(alumbrado);
    }
    
    public void Comercializacion(Constructor constructor){
    
        Double comercializacion = 0.0;
        Double Valorkwh = constructor.getEnergiaC$();
        comercializacion = Valorkwh * 0.0423621290696099;
        
        constructor.setComercializacion(comercializacion);
    }
    
    public void subsidio(Constructor constructor){
    
        Double Total = 0.0;
        int kwh = constructor.getkWh();
        Double Valorkwh= constructor.getEnergiaC$();
        Double alumbrado = constructor.getAlumbradopublico();
        Double comercializacion = constructor.getComercializacion();
        Double subsidio = 0.0;
        
        if(kwh >=50 || kwh<99){
        
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total *0.50;
        }
        if(kwh >=100 || kwh<=150){
            Total = Valorkwh+alumbrado+comercializacion;
            subsidio = Total*0.25;
        
            constructor.setSubsidio(subsidio);
        }
        if(kwh >150){
            Double subcidio = 0.0;
            
            constructor.setSubsidio(subcidio);
        }
    }
    
    public void INE(Constructor constructor){
    
        Double ine = 0.0;
        Double total = 0.0;
        Double Valorkwh = constructor.getEnergiaC$();
        Double alumbrado = constructor.getAlumbradopublico();
        Double comercializacion = constructor.getComercializacion();
        Double Subcidio = constructor.getSubsidio();
        
        total = Valorkwh+alumbrado+comercializacion-Subcidio;
        ine = total * 0.01;
        
        constructor.setINE(ine);
    }
    
     public void Total(Constructor constructor){
     
         Double Total = 0.0;
         Double Valorkwh = constructor.getEnergiaC$();
         Double alumbrado = constructor.getAlumbradopublico();
         Double comercializacion = constructor.getComercializacion();
         Double subsidio = constructor.getSubsidio();
         Double ine = constructor.getINE();
         
         Total = Valorkwh+alumbrado+comercializacion-subsidio+ine;
         
         constructor.setTotaldeuda(Total);
     }
     
     public void totalpagar(Constructor constructor){
     
         
     }
}
