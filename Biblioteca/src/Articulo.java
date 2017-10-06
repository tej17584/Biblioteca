/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version 1.0
 * Esta clase es la que modela un articulo
 */
public class Articulo extends Documento{
    protected String arbitroA;
    
    public Articulo(){
        arbitroA="";
    }
    /**
     * Este crea un nuevo articulo
     * @param idArticulo el ide del articulo
     * @param tituloArticulo el titulo del articulo
     * @param materiaArticulo la materia del articulo
     * @param cantidadArticulo la cantidad de articulos
     * @param arbitroArticulo el arbitro del articulo
     */
    public void setArticulo(String idArticulo, String tituloArticulo, String materiaArticulo, int cantidadArticulo, String arbitroArticulo){
        super.setDocumento(idArticulo, tituloArticulo, materiaArticulo, cantidadArticulo);
        this.arbitroA=arbitroArticulo;
    }
    /**
     * Este metodo te retorna el nombre del arbitro
     * @return un string con el nombre del arbitro
     */
    public String getArbitro(){
        return this.arbitroA;
    }
}
