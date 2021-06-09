/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import model.TipoReclamo;

/**
 *
 * @author ricky
 */
public class ControllerTipoReclamo {
    
     public LinkedList<TipoReclamo> consultarTipoReclamo() {
        LinkedList<TipoReclamo> lc=null;
        String sql="select * from tipo_reclamo;";
        TipoReclamo objc=new TipoReclamo();
        lc=objc.consultarTipoReclamo(sql);
        
        return lc;
    }
    
}
