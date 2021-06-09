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
public class TipoReclamo {

    private int idtr;
    private String nombreTipo;

    public TipoReclamo() {
    }

    public TipoReclamo(int idtr, String nombreTipo) {
        this.idtr = idtr;
        this.nombreTipo = nombreTipo;
    }

    public int getIdtr() {
        return idtr;
    }

    public void setIdtr(int idtr) {
        this.idtr = idtr;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        return "TipoReclamo{" + "idtr=" + idtr + ", NombreTipo=" + nombreTipo + '}';
    }

    public LinkedList<TipoReclamo> consultarTipoReclamo(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<TipoReclamo> lc = new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idtr");
                    nomc = rs.getString("nombreTipo");

                    lc.add(new TipoReclamo(idc, nomc));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;
    }
}
