/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version  1.0
 * Esta clase es la padre, de esta se van a heredar atributos
 */
public class Documento {
    protected String id;
    protected String titulo;
    protected String materia;
    protected int cantidadE;
    protected boolean estado;
    
    public Documento(){
        id="";
        titulo="";
        materia="";
        cantidadE=0;
        estado=false;
    }
    
    /**
     * Este metodo es el que lleva el parametro de cantidad de documento, es decir es un constructor
     * @param idDoc un String con el Id del documento
     * @param tituloDoc un string con el titulo del doc
     * @param materiaDoc un string con la materia del doc
     * @param cantitdadDoc un integer con al cantidad de documentos, es decir para valores iniciales
     */
    public void setDocumento(String idDoc,String tituloDoc, String materiaDoc, int cantitdadDoc){
        this.id=idDoc;
        this.titulo=tituloDoc;
        this.materia=materiaDoc;
        this.estado=true;
        this.cantidadE=cantitdadDoc;
    }
    /**
     * Un String con el ID del documento
     * @return un string con el id
     */
    public String getIdDoc(){
        return this.id;
    }
    /**
     * Un String con el ttulo del documento
     * @return un string con el titulo
     */
    public String getTituloDoc(){
        return this.titulo;
    }
    
    /**
     * Un String con la materia del documento
     * @return un string con la materia
     */
    public String getMateriaDoc(){
        return this.materia;
    }
    
    /**
     * Un int con la cantidad del documento
     * @return un int con la cantidad de docuemntos
     */
    public int getCantidadDoc(){
        return this.cantidadE;
    }
    /**
     * Este metodo retorna si esta disponible o no
     * @return un booleano de la disponibilidad
     */
    public boolean getEstado(){
        if (this.cantidadE==0) {
            return false;
        }
        else{
            return true;
        }
    }

   
    
    
    
    
    
    
    
   
    
}
