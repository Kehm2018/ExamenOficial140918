/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author KEHM PIERRE
 */
public interface ProductoDAO {
    public boolean createProducto(Producto pro);
    public ArrayList<Producto> readProducto();
    public boolean updateProducto(Producto pro);
    public boolean deleteProducto(String id);
}
