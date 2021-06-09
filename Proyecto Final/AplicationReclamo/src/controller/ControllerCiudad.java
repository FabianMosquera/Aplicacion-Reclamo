/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import model.BaseDatos;
import model.Ciudad;

/**
 *
 * @author ricky
 */
public class ControllerCiudad {
//    revisar con el profesor
    public boolean MostrarCiudad(Ciudad objc) {
        boolean t=false;
        String sql="insert into ciudad(NombreCiudad)" + " value('"+objc.getNombreCiudad()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }
    
    public LinkedList<Ciudad> consultarCiudad() {
        LinkedList<Ciudad> lc=null;
        String sql="select * from ciudad;";
        Ciudad objc=new Ciudad();
        lc=objc.consultarCiudad(sql);
        
        return lc;
    }
    
}
