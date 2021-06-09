/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author ricky
 */
public class Respuesta {
    
    private int IdRespuesta;
    private String comentario;
    private String fechaRespuesta;
    private int IdReclamofk;
    private int idServicio_Al_Clientefk;

    public Respuesta() {
    }

    public Respuesta(int IdRespuesta, String comentario, String fechaRespuesta, int IdReclamofk, int idServicio_Al_Clientefk) {
        this.IdRespuesta = IdRespuesta;
        this.comentario = comentario;
        this.fechaRespuesta = fechaRespuesta;
        this.IdReclamofk = IdReclamofk;
        this.idServicio_Al_Clientefk = idServicio_Al_Clientefk;
    }

    public int getIdRespuesta() {
        return IdRespuesta;
    }

    public void setIdRespuesta(int IdRespuesta) {
        this.IdRespuesta = IdRespuesta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(String fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public int getIdReclamofk() {
        return IdReclamofk;
    }

    public void setIdReclamofk(int IdReclamofk) {
        this.IdReclamofk = IdReclamofk;
    }

    public int getIdServicio_Al_Clientefk() {
        return idServicio_Al_Clientefk;
    }

    public void setIdServicio_Al_Clientefk(int idServicio_Al_Clientefk) {
        this.idServicio_Al_Clientefk = idServicio_Al_Clientefk;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "IdRespuesta=" + IdRespuesta + ", comentario=" + comentario + ", fechaRespuesta=" + fechaRespuesta + ", IdReclamofk=" + IdReclamofk + ", idServicio_Al_Clientefk=" + idServicio_Al_Clientefk + '}';
    }
}
