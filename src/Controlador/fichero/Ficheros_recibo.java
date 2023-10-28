package Controlador.fichero;

import Controlador.calculos.Calculos;
import Controlador.constructor.Constructor;
import Controlador.constructor.Registros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*@author Oscar Fonseca*/

public class Ficheros_recibo {
    Calculos calculo = new Calculos();
    ArrayList<Registros> constructor = new ArrayList<>();
    
    public void Ingresarfichero(Constructor constructor){
        FileWriter fw = null;
        
        calculo.CalculokWh(constructor);
        calculo.alumbradoPublico(constructor);
        calculo.Comercializacion(constructor);
        calculo.subsidio(constructor);
        calculo.Total(constructor);
            try{
            fw = new FileWriter("Recibos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            
            Rg.print(constructor.getNombre()+",");
            Rg.print(constructor.getDireccion()+",");
            Rg.print(constructor.getNºmedidor()+",");
            Rg.print(constructor.getNIS()+",");
            Rg.print(constructor.getDiasfacturados()+",");
            Rg.print(constructor.getMesfacturado()+",");
            Rg.print(constructor.getFechaemicion()+",");
            Rg.print(constructor.getFechavencimiento()+",");
            Rg.print(constructor.getkWh()+",");
            Rg.print(constructor.getPeriodoinicio()+",");
            Rg.print(constructor.getPeriodofinal()+",");
            Rg.print(constructor.getEnergiaC$()+",");
            Rg.print(constructor.getAlumbradopublico()+",");
            Rg.print(constructor.getComercializacion()+",");
            Rg.print(constructor.getSubsidio()+",");
            Rg.print(constructor.getINE()+",");
            Rg.print(constructor.getTotalpagar()+"\n");
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    public Constructor LeerFicheroEmpleado(String Constructor){
        try{
            
            FileReader fr = new FileReader("Recibos.txt");
            BufferedReader bf = new BufferedReader(fr);
            String cadena;
            //la variable recorre todo el fichero cuando haya datos
            while ((cadena = bf.readLine()) != null) {
                //analiza cada atributo, si esta en separado por una ,
                String[] partes = cadena.split(",");
                //se cumple mientras parte se encuentre divido en 3 atributos
                if (partes.length == 16) {
                    String nombre = partes[0].trim();
                    String direccion = partes[1].trim();
                    String nºmedidor= partes[2].trim();
                    int nis =Integer.parseInt( partes[3].trim());
                    int diasfacturados= Integer.parseInt( partes[4].trim());
                    String mesfacturado = partes[5].trim();
                    String fechaemicion = partes[6].trim();
                    String fechavencimiento = partes[7].trim();
                    int kwh = Integer.parseInt(partes[8].trim());
                    String periodoinicial = partes[9].trim();
                    String periodofinal = partes[10].trim();
                    double energiac$ = Double.valueOf(partes[11].trim());
                    double alumbradopublico = Double.valueOf(partes[12].trim());
                    double comercializacion = Double.valueOf(partes[13].trim());
                    double subcidio = Double.valueOf(partes[14].trim());
                    double ine = Double.valueOf(partes[15].trim());
                    double totalpagar = Double.valueOf(partes[16].trim());
                    
                    constructor.add(new Registros(nombre, direccion, nºmedidor, nis, diasfacturados, mesfacturado, fechaemicion, fechavencimiento, kwh, energiac$, alumbradopublico, comercializacion, subcidio, subcidio, ine, periodoinicial, periodofinal, totalpagar, totalpagar));
                }
            }
        }catch(Exception e){e.printStackTrace();}
        
        return null;
    }
    public DefaultTableModel Mostrarregistro(){
        
        Vector vx = new Vector();
        vx.addElement("Nombre");
        vx.addElement("Direccion");
        vx.addElement("Nº de medidor");
        vx.addElement("NIS");
        vx.addElement("Dias facturados");
        vx.addElement("Mes facturado");
        vx.addElement("Fecha de emision");
        vx.addElement("Fecha de vencimiento");
        vx.addElement("Consumo kWh");
        vx.addElement("Periodo inicial");
        vx.addElement("Periodo final");
        vx.addElement("Costo de energia");
        vx.addElement("Alumbrado publico");
        vx.addElement("Comercializacion");
        vx.addElement("Subcidio");
        vx.addElement("INE");
        vx.addElement("Total a pagar");
        
        DefaultTableModel dtm = new DefaultTableModel(vx,0);
        
        try{
            FileReader fr = new FileReader("nominas.txt");
            BufferedReader bf = new BufferedReader(fr);
            String cadena;
            //la variable recorre todo el fichero cuando haya datos
            while ((cadena = bf.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(cadena,",");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                dtm.addRow(x);
            }
        
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
            
        }
        return dtm;
    
    }
}
