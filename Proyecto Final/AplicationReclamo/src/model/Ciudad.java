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
public class Ciudad {
    private int IdCiudad;
    private String NombreCiudad;

    public Ciudad() {
    }

    public Ciudad(int IdCiudad, String NombreCiudad) {
        this.IdCiudad = IdCiudad;
        this.NombreCiudad = NombreCiudad;
    }

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }
    
    @Override
    public String toString() {
        return "Ciudad{" + "IdCiudad=" + IdCiudad + ", NombreCiudad=" + NombreCiudad + '}';
    }
    
    public LinkedList<Ciudad> consultarCiudad(String sql) {
        BaseDatos objbd=new BaseDatos();
        LinkedList<Ciudad> lc=new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;
        if(objbd.crearConexion()){
            try {
                Statement st=objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idc=rs.getInt("idCiudad");
                    nomc=rs.getString("NombreCiudad");
                    
                    lc.add(new Ciudad(idc, nomc));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return lc;
    }
}
