/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ricky
 */
public class Usuario {
    private int IdCliente;
    private String nombrecliente1;
    private String nombrecliente2;
    private String apellidocliente1;
    private String apellidocliente2;
    private String tipoidentificacion;
    private int numeroidentificacion;
    private int telefono1;
    private int telefono2;
    private String correo;
    private int ciudad;
    private String direccionresidencia;

    public Usuario() {
    }

    public Usuario(int IdCliente, String nombrecliente1, String nombrecliente2, String apellidocliente1, String apellidocliente2, String tipoidentificacion, int numeroidentificacion, int telefono1, int telefono2, String correo, int ciudad, String direccionresidencia) {
        this.IdCliente = IdCliente;
        this.nombrecliente1 = nombrecliente1;
        this.nombrecliente2 = nombrecliente2;
        this.apellidocliente1 = apellidocliente1;
        this.apellidocliente2 = apellidocliente2;
        this.tipoidentificacion = tipoidentificacion;
        this.numeroidentificacion = numeroidentificacion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccionresidencia = direccionresidencia;
    }

    public Usuario(String nombrecliente1, String apellidocliente1, String tipoidentificacion, int numeroidentificacion, int telefono1, String correo, int ciudad, String direccionresidencia) {
        this.nombrecliente1 = nombrecliente1;
        this.apellidocliente1 = apellidocliente1;
        this.tipoidentificacion = tipoidentificacion;
        this.numeroidentificacion = numeroidentificacion;
        this.telefono1 = telefono1;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccionresidencia = direccionresidencia;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public String getNombrecliente1() {
        return nombrecliente1;
    }

    public String getNombrecliente2() {
        return nombrecliente2;
    }

    public String getApellidocliente1() {
        return apellidocliente1;
    }

    public String getApellidocliente2() {
        return apellidocliente2;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCiudad() {
        return ciudad;
    }

    public String getDireccionresidencia() {
        return direccionresidencia;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public void setNombrecliente1(String nombrecliente1) {
        this.nombrecliente1 = nombrecliente1;
    }

    public void setNombrecliente2(String nombrecliente2) {
        this.nombrecliente2 = nombrecliente2;
    }

    public void setApellidocliente1(String apellidocliente1) {
        this.apellidocliente1 = apellidocliente1;
    }

    public void setApellidocliente2(String apellidocliente2) {
        this.apellidocliente2 = apellidocliente2;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccionresidencia(String direccionresidencia) {
        this.direccionresidencia = direccionresidencia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "IdCliente=" + IdCliente + ", nombrecliente1=" + nombrecliente1 + ", nombrecliente2=" + nombrecliente2 + ", apellidocliente1=" + apellidocliente1 + ". apellidocliente2=" + apellidocliente2 + ", tipoidentificacion=" + tipoidentificacion + ", numeroidenificacion=" + numeroidentificacion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correo=" + correo + ", ciudad=" + ciudad + ", deireccionresidencia=" + direccionresidencia + '}';
    }
}
