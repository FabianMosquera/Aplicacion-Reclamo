/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.LinkedList;
import model.BaseDatos;

import model.Reclamo;

/**
 *
 * @author ricky
 */
public class ControllerReclamo {
    public boolean InsertReclamo(Reclamo objc) {
        boolean t=false;
        String sql="insert into reclamo(descripcion, IaFactura, IdClientefk, idtrfk, idServicio_Al_Clientefk)"
                + " value('"+objc.getDescripcion()+"', '"+objc.getIaFactura()+"', "+objc.getIdClientefk()+", "+objc.getIdtrfk()+", "
                + " "+objc.getIdServicio_Al_Clientefk()+");";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
    
    
    public LinkedList<Reclamo> buscarComentario() {
        LinkedList<Reclamo> lc=null;
        String sql="select * from reclamo;";
        Reclamo objc=new Reclamo();
        lc=objc.buscarComentario(sql); 
        return lc;
    }
}
