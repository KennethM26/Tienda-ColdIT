/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Kenneth martinez
 */
public class Factura {
    
    private int codigo;
    private String Cliente;
    private ArrayList<Item> item;
    private int valortotal;

    public Factura(int codigo, String Cliente, ArrayList<Item> item, int valortotal) {
        this.codigo = codigo;
        this.Cliente = Cliente;
        this.item = item;
        this.valortotal = valortotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }
    
    
    
}
