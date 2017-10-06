/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version 1.0 
 * ESta clase es la que modela una revista
 */
public class Revista extends Documento{
    protected String anioRevista;
    protected String numeroRevista;
    
    public Revista(){
        anioRevista="";
        numeroRevista="";
    }
    /**
     * Este metodo crea una nueva revista
     * @param idRevista el ide de la revista
     * @param tituloRevista el titulo de la revista
     * @param materiaRevista la materia d ela revista
     * @param cantidadRevista la cantidad de revistaas
     * @param anioPRevista el año d epublicacion
     * @param numeroDeRevista  el numero de edicion de revista
     */
    public void setRevista(String idRevista, String tituloRevista, String materiaRevista, int cantidadRevista, String anioPRevista, String numeroDeRevista){
        super.setDocumento(idRevista, tituloRevista, materiaRevista, cantidadRevista);
        this.anioRevista=anioPRevista;
        this.numeroRevista=numeroDeRevista;
    }
    /**
     * Este metodo retorna el año de la revista
     * @return un String con el año de la revista
     */
    public String getAnioRevista(){
        return this.anioRevista;
    }
    /**
     * Este metodo retorna el numero de revista
     * @return un String con el numero de revista
     */
    public String getNumeroRevista(){
        return this.numeroRevista;
    }
}
