package test;


import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.model.Producto;
import java.util.ArrayList;
import com.mycompany.dao.ProductoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KEHM PIERRE
 */
public class TestProducto {

    static ArrayList<Producto> list = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO prodao;
        prodao = new ProductoCtrlImpl();
        
        
//      list = prodao.readProducto();
//for(Producto item: list){
//System.out.println (""+item.getId_producto()+item.getNombre()+item.getDescripcion());
//}
//    
//       Producto pro = new Producto();
//        pro.setId_categoria("3");
//        pro.setId_unimed("2");
//        pro.setNombre("Lecha");
//        pro.setDescripcion("5448");
//        pro.setCodigo("65654");
//        if (prodao.createProducto(pro)) {
//            System.out.print("insertado");
//        } else {
//            System.out.print("error al insertar");
//   
//        }



          Producto pro = new Producto();
          pro.setId_producto("4");
        pro.setNombre("Leche Gloria");
        pro.setDescripcion("de vaca");
        pro.setCodigo("11111");
        if (prodao.updateProducto(pro)) {
            System.out.print("insertado");
        } else {
            System.out.print("error al insertar");
   
        }

        
        

         if (prodao.deleteProducto("3")) {
            System.out.print("Elimindo");
        } else {
            System.out.print("error al eliminar");
   
        }
    }
}