/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import model.BaseDatos;
import model.Reclamo;
import model.Respuesta;

/**
 *
 * @author ricky
 */
public class ControllerRespuesta {
    
    public boolean InsertRespuesta(Respuesta objc) {
        boolean t=false;
        String sql="insert into respuesta(comentario, IdReclamofk, idServicio_Al_Clientefk)"
                + " value('"+objc.getComentario()+"', "+objc.getIdReclamofk()+", "+objc.getIdServicio_Al_Clientefk()+");";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

}
