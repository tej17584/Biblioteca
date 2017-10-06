/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version 1.0
 * Esta clase es la que modela un libro
 */
public class Libro extends Documento{
    protected String editorialL;
    protected String autorL;
    
    public Libro(){
        //se inicializan los valores de la clase
        editorialL="";
        autorL="";
    }
    /**
     * Este metodo genera libros
     * @param idLibro
     * @param tituloLibro
     * @param autorLibro
     * @param materiaLibro
     * @param editorialLibro
     * @param cantidadLibro 
     */
    public void setLibro(String idLibro, String tituloLibro, String autorLibro,String materiaLibro,String editorialLibro,int cantidadLibro){
        super.setDocumento(idLibro, tituloLibro, materiaLibro, cantidadLibro);
        this.editorialL=editorialLibro;
        this.autorL=autorLibro;
    }
    /**
     * Este metodo retorna un string con la editorial del libro
     * @return un String con la editorial
     */
    public String getEditorial(){
        return this.editorialL;
    }
    /**
     * Este retorna el autor del libro
     * @return un string con el autor 
     */
    public String getAutorLibro(){
        return this.autorL;
    }
}
