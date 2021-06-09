/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
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
public class Reclamo {
    private int IdReclamo;
    private String descripcion;
    private String fechaHoraReclamo;
    private Image IaFactura;
    private String fechaHoraRevision;
    private int IdClientefk;
    private int idtrfk;
    private int idServicio_Al_Clientefk;

    public Reclamo() {
    }

    public Reclamo(int IdReclamo, String descripcion, String fechaHoraReclamo, Image IaFactura, String fechaHoraRevision, int IdClientefk, int idtrfk, int idServicio_Al_Clientefk) {
        this.IdReclamo = IdReclamo;
        this.descripcion = descripcion;
        this.fechaHoraReclamo = fechaHoraReclamo;
        this.IaFactura = IaFactura;
        this.fechaHoraRevision = fechaHoraRevision;
        this.IdClientefk = IdClientefk;
        this.idtrfk = idtrfk;
        this.idServicio_Al_Clientefk = idServicio_Al_Clientefk;
    }

    public int getIdReclamo() {
        return IdReclamo;
    }

    public void setIdReclamo(int IdReclamo) {
        this.IdReclamo = IdReclamo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaHoraReclamo() {
        return fechaHoraReclamo;
    }

    public void setFechaHoraReclamo(String fechaHoraReclamo) {
        this.fechaHoraReclamo = fechaHoraReclamo;
    }

    public Image getIaFactura() {
        return IaFactura;
    }

    public void setIaFactura(Image IaFactura) {
        this.IaFactura = IaFactura;
    }

    public String getFechaHoraRevision() {
        return fechaHoraRevision;
    }

    public void setFechaHoraRevision(String fechaHoraRevision) {
        this.fechaHoraRevision = fechaHoraRevision;
    }

    public int getIdClientefk() {
        return IdClientefk;
    }

    public void setIdClientefk(int IdClientefk) {
        this.IdClientefk = IdClientefk;
    }

    public int getIdtrfk() {
        return idtrfk;
    }

    public void setIdtrfk(int idtrfk) {
        this.idtrfk = idtrfk;
    }

    public int getIdServicio_Al_Clientefk() {
        return idServicio_Al_Clientefk;
    }

    public void setIdServicio_Al_Clientefk(int idServicio_Al_Clientefk) {
        this.idServicio_Al_Clientefk = idServicio_Al_Clientefk;
    }

    @Override
    public String toString() {
        return "Reclamo{" + "IdReclamo:" + IdReclamo + ", descripcion del reclamo:" + descripcion + ", fechaHoraReclamo:" + fechaHoraReclamo + ", IaFactura=" + IaFactura + ", fechaHoraRevision=" + fechaHoraRevision + ", IdClientefk=" + IdClientefk + ", idtrfk=" + idtrfk + ", idServicio_Al_Clientefk=" + idServicio_Al_Clientefk + '}';
    }
    
    public LinkedList<Reclamo> buscarComentario(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<Reclamo> lc = new LinkedList<>();
        ResultSet rs;
        int IdReclamo;
        String descripcion;
        String fechaHoraReclamo;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    IdReclamo = rs.getInt("IdReclamo");
                    descripcion = rs.getString("descripcion");
                    fechaHoraReclamo = rs.getString("fechaHoraReclamo");

                    lc.add(new Reclamo(IdReclamo, descripcion, fechaHoraReclamo, IaFactura, fechaHoraRevision, IdClientefk, idtrfk, idServicio_Al_Clientefk));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;
    }
    
}
