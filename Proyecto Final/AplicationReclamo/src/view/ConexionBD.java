/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.BaseDatos;

/**
 *
 * @author ricky
 */
public class ConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BaseDatos objBD=new BaseDatos();
        
        if(objBD.crearConexion()){
            System.out.println("conexión creada");
        }else{
            System.out.println("Conexión no creada");
        }
        
        
    }
    
}
