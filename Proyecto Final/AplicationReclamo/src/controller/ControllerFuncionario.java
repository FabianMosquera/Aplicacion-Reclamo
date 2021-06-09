/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BaseDatos;
import model.Funcionario;


/**
 *
 * @author ricky
 */
public class ControllerFuncionario {
    
    public boolean InsertFuncionario(Funcionario objc) {
        boolean t=false;
        String sql="insert into funcionario(nombreFuncionario1, nombreFuncionario2, apellidoFuncionario1, apellidoFuncionario2, telefonoSC, correoSC)"
                + " value('"+objc.getNombreFuncionario1()+"', '"+objc.getNombreFuncionario2()+"', '"+objc.getApellidoFuncionario1()+"', '"+objc.getApellidoFuncionario2()+"', "
                + "'"+objc.getTelefonoSC()+"', '"+objc.getCorreoSC()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public boolean UpdateFuncionario(Funcionario objf) {
        boolean t=false;
        String sql="{call updateFuncionario(?,?,?,?,?,?,?)}";
        Funcionario objf1= new Funcionario();
        t=objf1.UpdateF(sql, objf);
        
        return t;
    }
    
}
