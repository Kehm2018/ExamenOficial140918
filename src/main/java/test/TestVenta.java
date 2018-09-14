package test;


import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.model.Venta;
import java.util.ArrayList;
import com.mycompany.dao.VentaDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KEHM PIERRE
 */
public class TestVenta {

    static ArrayList<Venta> list = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentaDAO vendao;
        vendao = new VentaCtrlImpl();
        
        
//      list = prodao.readVenta();
//for(Venta item: list){
//System.out.println (item.getId_venta()+item.getFecha()+item.getConcepto());
//}


    
//       Venta ven = new Venta();
//        ven.setFecha("14-08-2018");
//        ven.setConcepto("por consumo 222");
//        ven.setId_cliente_direccion("1");
//        ven.setId_vendedor("1");
//        if (vendao.createVenta(ven)) {
//            System.out.print("insertado");
//        } else {
//            System.out.print("error al insertar");
//   
//        }
        
        

         if (vendao.deleteVenta("3")) {
            System.out.print("Elimindo");
        } else {
            System.out.print("error al eliminar");
   
        }


    }
}