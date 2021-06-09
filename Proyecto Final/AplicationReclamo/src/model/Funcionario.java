/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricky
 */
public class Funcionario {
    
    private int IdServicio_Al_Cliente;
    String nombreFuncionario1;
    String nombreFuncionario2;
    String apellidoFuncionario1;
    String apellidoFuncionario2;
    String telefonoSC;
    String correoSC;

    public Funcionario() {
    }

    public Funcionario(int IdServicio_Al_Cliente, String nombreFuncionario1, String nombreFuncionario2, String apellidoFuncionario1, String apellidoFuncionario2, String telefonoSC, String correoSC) {
        this.IdServicio_Al_Cliente = IdServicio_Al_Cliente;
        this.nombreFuncionario1 = nombreFuncionario1;
        this.nombreFuncionario2 = nombreFuncionario2;
        this.apellidoFuncionario1 = apellidoFuncionario1;
        this.apellidoFuncionario2 = apellidoFuncionario2;
        this.telefonoSC = telefonoSC;
        this.correoSC = correoSC;
    }

    public Funcionario(String nombreFuncionario1, String apellidoFuncionario1, String telefonoSC, String correoSC) {
        this.nombreFuncionario1 = nombreFuncionario1;
        this.apellidoFuncionario1 = apellidoFuncionario1;
        this.telefonoSC = telefonoSC;
        this.correoSC = correoSC;
    }

    public int getIdServicio_Al_Cliente() {
        return IdServicio_Al_Cliente;
    }

    public void setIdServicio_Al_Cliente(int IdServicio_Al_Cliente) {
        this.IdServicio_Al_Cliente = IdServicio_Al_Cliente;
    }

    public String getNombreFuncionario1() {
        return nombreFuncionario1;
    }

    public void setNombreFuncionario1(String nombreFuncionario1) {
        this.nombreFuncionario1 = nombreFuncionario1;
    }

    public String getNombreFuncionario2() {
        return nombreFuncionario2;
    }

    public void setNombreFuncionario2(String nombreFuncionario2) {
        this.nombreFuncionario2 = nombreFuncionario2;
    }

    public String getApellidoFuncionario1() {
        return apellidoFuncionario1;
    }

    public void setApellidoFuncionario1(String apellidoFuncionario1) {
        this.apellidoFuncionario1 = apellidoFuncionario1;
    }

    public String getApellidoFuncionario2() {
        return apellidoFuncionario2;
    }

    public void setApellidoFuncionario2(String apellidoFuncionario2) {
        this.apellidoFuncionario2 = apellidoFuncionario2;
    }

    public String getTelefonoSC() {
        return telefonoSC;
    }

    public void setTelefonoSC(String telefonoSC) {
        this.telefonoSC = telefonoSC;
    }

    public String getCorreoSC() {
        return correoSC;
    }

    public void setCorreoSC(String correoSC) {
        this.correoSC = correoSC;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "IdServicio_Al_Cliente=" + IdServicio_Al_Cliente + ", NombreFuncionario1=" + nombreFuncionario1 + "nombreFuncionario2=" + nombreFuncionario2 + "apellidoFuncionario1=" + apellidoFuncionario1 + "apellidoFuncionario2=" + apellidoFuncionario2 + "telefonoSC=" + telefonoSC + "correoSC=" + correoSC + '}';
    }

    public boolean UpdateF(String sql, Funcionario objf) {
        boolean t=false;
        CallableStatement cst;
        BaseDatos objbd = new BaseDatos();
        if(objbd.crearConexion()){
            try {
                cst = objbd.getConexion().prepareCall(sql);
                cst.setInt(1, objf.getIdServicio_Al_Cliente());
                cst.setString(2, objf.getNombreFuncionario1());
                cst.setString(3, objf.getNombreFuncionario2());
                cst.setString(4, objf.getApellidoFuncionario1());
                cst.setString(5, objf.getApellidoFuncionario2());
                cst.setString(6, objf.getTelefonoSC());
                cst.setString(7, objf.getCorreoSC());
                cst.execute();
                    t=true;
               
            } catch (SQLException ex) {
                Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return t;
    }
    
}
