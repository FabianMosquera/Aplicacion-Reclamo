/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BaseDatos;
import model.Ciudad;
import model.Usuario;

/**
 *
 * @author ricky
 */
public class ControllerUsuario {
    
    public boolean InsertUsuario(Usuario objc) {
        boolean t=false;
        String sql="insert into usuario(nombreCliente1, nombreCliente2, apellidoCliente1, apellidoCliente2, tipoIdentificacion, numeroIdentificacion, telefono1, telefono2, correo, ciudad, direccionResidencia)"
                + " value('"+objc.getNombrecliente1()+"', '"+objc.getNombrecliente2()+"', '"+objc.getApellidocliente1()+"', '"+objc.getApellidocliente2()+"', '"+objc.getTipoidentificacion()+"', "
                + "'"+objc.getNumeroidentificacion()+"', '"+objc.getTelefono1()+"', '"+objc.getTelefono2()+"', '"+objc.getCorreo()+"', "+objc.getCiudad()+", '"+objc.getDireccionresidencia()+"');";
        
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

}
