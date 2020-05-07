/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Logica.Producto;
import Persistencia.BD;
        
/**
 *
 * @author Kenneth martinez
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Probamos la conexi?n a la base de datos
        BD BaseDatos = new BD();
        
  
        // Agregamos Informaci?n a la Base de Datos
        //BaseDatos.AgregarProd(2, "papa", 4000);//listo
         //BaseDatos.Actualizar_prod(2, "platano", 1500);listo
        // Realizar una consulta de los proveedores
        BaseDatos.Consultar();
        BaseDatos.ConsultarProd(3);
        
        //BaseDatos.eliminar(1);//listo
       
    }
    
}
