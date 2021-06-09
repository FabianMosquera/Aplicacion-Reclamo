/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class FuncionarioTp {
    
    private String nombreFuncionario1;
    private String nombreTipo;

    public FuncionarioTp() {
    }
    
    public FuncionarioTp(String nombreFuncionario1, String nombreTipo) {
        this.nombreFuncionario1 = nombreFuncionario1;
        this.nombreTipo = nombreTipo;
    }
    

    /**
     * Get the value of nombreTipo
     *
     * @return the value of nombreTipo
     */
    public String getNombreTipo() {
        return nombreTipo;
    }

    /**
     * Set the value of nombreTipo
     *
     * @param nombreTipo new value of nombreTipo
     */
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }


    /**
     * Get the value of nombreFuncionario1
     *
     * @return the value of nombreFuncionario1
     */
    public String getNombreFuncionario1() {
        return nombreFuncionario1;
    }

    /**
     * Set the value of nombreFuncionario1
     *
     * @param nombreFuncionario1 new value of nombreFuncionario1
     */
    public void setNombreFuncionario1(String nombreFuncionario1) {
        this.nombreFuncionario1 = nombreFuncionario1;
    }

    @Override
    public String toString() {
        return "FuncionarioTp{" + "Nombre del Funcionario=" + nombreFuncionario1 + ", Tipo de reclamo que atendio=" + nombreTipo + '}';
    }

    public LinkedList<FuncionarioTp> buscarFuncionarioTp(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<FuncionarioTp> lc = new LinkedList<>();
        ResultSet rs;
        String nombrefuncionario1;
        String nombreTipo;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    nombrefuncionario1 = rs.getString("nombrefuncionario1");
                    nombreTipo = rs.getString("nombreTipo");

                    lc.add(new FuncionarioTp(nombrefuncionario1, nombreTipo));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;
    }
}
