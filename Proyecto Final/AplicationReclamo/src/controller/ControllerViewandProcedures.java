/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import model.FuncionarioTp;

/**
 *
 * @author ricky
 */
public class ControllerViewandProcedures {
    
    
    public LinkedList<FuncionarioTp> buscarFuncionarioTp() {
        LinkedList<FuncionarioTp> lc=null;
        String sql="select * from consultarfuncionariotiporeclamo;";
        FuncionarioTp objc=new FuncionarioTp();
        lc=objc.buscarFuncionarioTp(sql);
        
        return lc;
    }
}
