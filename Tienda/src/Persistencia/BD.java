/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.*;
/**
 *
 * @author Kenneth martinez
 */
public class BD {
    
    private String url, login, password;
        Connection conexion = null;
        
        public BD(){//constructor para establecer la conexion con la base de datos
            
            url = new String("jdbc:mysql://localhost/tienda");
            login = new String("root");
            password = new String("");
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = (Connection) DriverManager.getConnection(url,login, "");
                System.err.println("Conexion exitosa");
                
            } catch (Exception e) {
                System.out.println("Error al tratar de abrir la base de datos");
            }     
        }
        
        //metodo para consultar los productos
        public void Consultar(){
      
            int Codigo;
            String Nombre;
            int Valor;
            String ComandoSQL="SELECT * FROM producto";
            
                    //miInventario.append("Referencia"+"\t"+"Nombre"+"\t"+"Cantidad"+"\t"+"Precio"+"\n");
            try{
                    
                    Statement stmt = (Statement) conexion.createStatement();
                    ResultSet resultado = stmt.executeQuery(ComandoSQL);
                    
                    while(resultado.next())
                    {
                
                        Codigo = resultado.getInt(1);
                        Valor = resultado.getInt(2);
                        Nombre = resultado.getString(3);
                        System.out.println(Codigo + " " + Nombre + " " + Valor + "\n");
                    }
                    // Cerramos la interfaz Statement
                    stmt.close();
                } catch (java.sql.SQLException er) 
                {
                System.out.println("No se pudo realizar la operaci?n");
                }
        }
        
        //metodo para consultar valor del producto
        public void ConsultarProd(int cod){
      
            int Valor;
            
            String ComandoSQL="SELECT Valor FROM producto where Codigo = '" +cod;
            
                    //miInventario.append("Referencia"+"\t"+"Nombre"+"\t"+"Cantidad"+"\t"+"Precio"+"\n");
            try{
                    
                    Statement stmt = (Statement) conexion.createStatement();
                    ResultSet resultado = stmt.executeQuery(ComandoSQL);
                    
                    while(resultado.next())
                    {
                
                        Valor = resultado.getInt(1);
                        System.out.println("El valor es:  " + Valor + "\n");
                    }
                    // Cerramos la interfaz Statement
                    stmt.close();
                } catch (java.sql.SQLException er) 
                {
                System.out.println("No se pudo realizar la operaci?n");
                }
            
        }
        
        //metodo para realizar los registros en la tabla producto
        public void AgregarProd(int cod, String nombre, int valor){
           
            String ComandoSQL="INSERT INTO producto VALUES ('" + cod + "','" + valor +"', '"+ nombre + "');";
            try{
                
                    Statement stmt = (Statement) conexion.createStatement();
                    stmt.executeUpdate(ComandoSQL);
                    System.out.println("Producto agregado!");
                    
                    // Cerramos la interfaz Statement
                    stmt.close();
                    
                } catch (java.sql.SQLException er) {
                System.out.println("No se pudo agregar el producto");
                }
            }
        
        //metodo para eliminar producto
        public void eliminar(int cod){
           
            String ComandoSQL="DELETE FROM producto where Codigo = " + cod;
            try{
                
                    Statement stmt = (Statement) conexion.createStatement();
                    stmt.executeUpdate(ComandoSQL);
                    System.out.println("Producto eliminado!");
                    
                    // Cerramos la interfaz Statement
                    stmt.close();
                    
                } catch (java.sql.SQLException er) {
                System.out.println("No se pudo agregar el producto");
                }
            }
        
        //metodo para actualizar producto
        public void Actualizar_prod(int cod, String nombre, int total){
            //update producto set Valor = valor, Nombre = nombre where Codigo = codigo;
            String comando="UPDATE producto set valor='" + total + "', nombre='"+ nombre +"' where codigo='"+cod+" ';";
            //String comando="UPDATE producto set Valor = '" + total + "', Nombre '" +nombre+"' where Codigo = '"+ cod +"');";
            try {
                Statement stmt = (Statement) conexion.createStatement();
                stmt.executeUpdate(comando);
                System.err.println("Registro exitoso");
                try {
                    
                } catch (Exception e) {
                }
            } catch (Exception e) {
             System.out.println("No se pudo realizar la operaci?n");   
            }
            
        }
    
}
