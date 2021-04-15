package com.example.demo;

public class Biblioteca {
    private String provincia;
    private String localidad;
    private String nombre;
    private String direccion_descripcion;
    private String piso;
    private String codigo_postal;
    private String codigo_indicativo_telefono;
    private Integer telefono;
    private String mail;
    private String web;

    public Biblioteca(String provincia, String localidad,String nombre,String direccion_descripcion,String piso,String codigo_postal, String codigo_indicativo_telefono,Integer telefono,String mail, String web){
        this.provincia=provincia;
        this.localidad=localidad;
        this.nombre=nombre;
        this.direccion_descripcion=direccion_descripcion;
        this.piso=piso;
        this.codigo_postal=codigo_postal;
        this.codigo_indicativo_telefono=codigo_indicativo_telefono;
        this.telefono=telefono;
        this.mail=mail;
        this.web=web;
    }

    public String getDireccion_descripcion() {
        return direccion_descripcion;
    }

    public String getCodigo_indicativo_telefono() {
        return codigo_indicativo_telefono;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPiso() {
        return piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getWeb() {
        return web;
    }

    public void setCodigo_indicativo_telefono(String codigo_indicativo_telefono) {
        this.codigo_indicativo_telefono = codigo_indicativo_telefono;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setDireccion_descripcion(String direccion_descripcion) {
        this.direccion_descripcion = direccion_descripcion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
