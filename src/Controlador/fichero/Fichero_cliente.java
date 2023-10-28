package Controlador.fichero;

import Controlador.constructor.Constructor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Fonseca
 */
public class Fichero_cliente {
    Vector vc = new Vector();
    
    ArrayList <Constructor> constructor = new ArrayList<>();
    
    public void GuardarV(Constructor empleado){
        vc .addElement(empleado);
    }
    
    public void Ficherocliente(Constructor constructor){
        FileWriter fw = null;
     try{
            fw = new FileWriter("Clientes.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            
            Rg.print(constructor.getNombre()+",");
            Rg.print(constructor.getDireccion()+",");
            Rg.print(constructor.getNºmedidor()+",");
            Rg.print(constructor.getNIS()+"\n");
            
            
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    
    public Constructor Leerfichero(String Nombre){
     try{
            
            FileReader fr = new FileReader("Clientes.txt");
            BufferedReader bf = new BufferedReader(fr);
            String cadena;
            //la variable recorre todo el fichero cuando haya datos
            while ((cadena = bf.readLine()) != null) {
                //analiza cada atributo, si esta en separado por una ,
                String[] partes = cadena.split(",");
                //se cumple mientras parte se encuentre divido en 3 atributos
                if (partes.length == 4) {
                    String nombre = partes[0].trim();
                    String direccion = partes[1].trim();
                    String nºmemidor = partes[2].trim();
                    int nis = Integer.parseInt( partes[3].trim());
                    //agrega al nuevo usuario al arraylist
                    constructor.add(new Constructor(nombre, direccion, nºmemidor, nis));
                }
            }
        }catch(IOException e){
            e.printStackTrace();}
        return null;
    }
        public DefaultTableModel MostrarEmpleados(){
        
        Vector vx = new Vector();
        vx.addElement("Nombre");
        vx.addElement("Direccion");
        vx.addElement("Nº de medidor");
        vx.addElement("NIS");
        DefaultTableModel dtm = new DefaultTableModel(vx,0);
        
        try{
            FileReader fr = new FileReader("empleados.txt");
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
