/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import java.io.Serializable;
import com.mycompany.model.Producto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.ProductoDAO;

/**
 *
 * @author P&D
 */
@ManagedBean(name = "ProductoCtrl")
@SessionScoped
public class ProductoCtrl implements Serializable {

    private Producto selected;
    private boolean est;
    ProductoDAO clidao;
    private ArrayList<Producto> list = new ArrayList<>();

    public ProductoCtrl() {
        this.selected = new Producto();
        this.clidao = new ProductoCtrlImpl();
    }

    public void createProducto() {        
        if (clidao.createProducto(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Producto> getList() {
        list = clidao.readProducto();
        return list;
    }

    public void updateProducto(Producto pro) {
        System.out.println("Cliente = "+pro.getNombre());
        if (clidao.updateProducto(pro)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
    }
    public void prepareUpdate(Producto pro){
    this.selected = new Producto();
        System.out.println("ID_PRODUCTO "+pro.getId_producto());
    this.selected = pro;
    }
    
    public void deleteProducto(String id){
        
        if (clidao.deleteProducto(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }

}
