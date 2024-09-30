/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import javax.swing.Icon;

public class Nombre {
    
    String nombre;
    private Icon img;
    private String path;

    public Nombre(String nombre, Icon img, String path) {
        this.nombre = nombre;
        this.img = img;
        this.path = path;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
        @Override
    public String toString() {
        return nombre;
    }
    
}
