/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import java.io.Serializable;
import com.mycompany.model.Venta;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.VentaDAO;

/**
 *
 * @author P&D
 */
@ManagedBean(name = "VentaCtrl")
@SessionScoped
public class VentaCtrl implements Serializable {

    private Venta selected;
    private boolean est;
    VentaDAO clidao;
    private ArrayList<Venta> list = new ArrayList<>();

    public VentaCtrl() {
        this.selected = new Venta();
        this.clidao = new VentaCtrlImpl();
    }

    public void createVenta() {        
        if (clidao.createVenta(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Venta> getList() {
        list = clidao.readVenta();
        return list;
    }

    
    public void deleteVenta(String id){
        
        if (clidao.deleteVenta(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Venta getSelected() {
        return selected;
    }

    public void setSelected(Venta selected) {
        this.selected = selected;
    }

}
