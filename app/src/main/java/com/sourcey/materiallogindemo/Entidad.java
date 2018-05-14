package com.sourcey.materiallogindemo;

/**
 * Created by David on 20/02/2018.
 */

public class Entidad {
    private int imgFoto;
    private String titulo;
    private String contenido;

    public Entidad(int imgFoto, String titulo, String contenido){
        this.imgFoto=imgFoto;
        this.titulo=titulo;
        this.contenido=contenido;



    }
    public int getImgFoto(){return imgFoto;}
    public String getTitutlo(){return titulo;}
    public String getcONTENIDO(){return contenido;}
}
