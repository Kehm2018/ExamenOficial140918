/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompany.model.Venta;
import com.mycompany.configbd.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dao.VentaDAO;

/**
 *
 * @author KEHM PIERRE
 */
public class VentaCtrlImpl implements VentaDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Venta> listDatos;

    public VentaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createVenta(Venta ven) {
        sql = "INSERT INTO public.venta(fecha, concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor) "
                + "values ('"+ ven.getFecha()+"','"+ven.getConcepto()+"',"+ven.getIgv()+","
                + ""+ven.getTotal()+","+ven.getSubtotal()+",'"+ven.getId_cliente_direccion()+"','"+ven.getId_vendedor()+"') ";
     return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Venta> readVenta() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_venta, fecha, concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor from public.venta";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Venta(rs.getString("id_venta"),rs.getString("fecha"),rs.getString("concepto"),
                        rs.getString("igv"), rs.getString("total"), rs.getString("sub_total"), rs.getString("id_cliente_direccion"),
                        rs.getString("id_vendedor")));

           }
        } catch (SQLException ex) {
            Logger.getLogger(VentaCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

   

    @Override
    public boolean deleteVenta(String id) {
        System.out.println("id="+id);
        sql = "DELETE  FROM public.venta "
              + " WHERE id_venta = "+id+ "";        
     return cx.executeInsertUpdate(sql);
    }

    
}
