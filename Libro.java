/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_libros;

/**
 *
 * @author Juan Sebastian
 */
public class Libro {
    private String autor;
    private String version;
    private String editorial;
    private String precio;
    private String abastecer;
    
    
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getVersion(){
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String geteEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getPrecio(){
       return precio;
    }
    public void setPrecio(String precio){
        this.precio = precio;
    }
    public void abastecer(int cantidad){
        this.abastecer(cantidad)= abastecer ;
    }
}
