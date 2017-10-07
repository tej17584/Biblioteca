
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version 1.0
 * La clase cliente es la que se enlaca con la Bilbioteca para poder tener una lista de clientes y una lista de documentos
 */
public class Cliente {
    protected ArrayList<Documento> prestamo;
    protected int diasP;
    protected String idCliente;
    protected String direccionCliente;
    protected String nombreCliente;
    protected int docEnPrestamo;
    protected int docPrestados;
    
    public Cliente(){
        this.prestamo= new ArrayList<Documento>();
        this.diasP=0;
        this.idCliente="";
        this.direccionCliente="";
        this.docPrestados=0;
        this.docEnPrestamo=0;
        this.nombreCliente="";
    }
    /**
     * Este metodo crea un cliente nuevo
     * @param idCliente el id del cliente nuevo
     * @param nombreCliente un string con el nombre del cliente
     * @param direccionCliente la direccion del cliente nuevo 
     */
    public void setCliente(String idCliente, String nombreCliente,String direccionCliente){
        this.idCliente=idCliente;
        this.direccionCliente=direccionCliente;
        this.diasP=0;
        this.docPrestados=0;
        this.docEnPrestamo=0;
        this.nombreCliente=nombreCliente;
    }
    /**
     * este metodo aumenta los documentos pretados totales
     * @param idCliente es un string con el id del cliente
     */
    public void aumentarDocPrestados(String idCliente){
        if (this.idCliente.equals(idCliente)) {
            this.docPrestados++;
        }
    }
    
    public void aumentarDocEnPretamo(String idCliente){
        this.docEnPrestamo++;
    }
    
    public int getDocPrestadosTotal(){
        return this.docPrestados;
    }
    
    public String getIdCliente(){
        return this.idCliente;
    }
    public String getDireccionCliente(){
        return this.direccionCliente;
    }
    
    public int getDocPrestados(){
        return this.docEnPrestamo;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public void setPrestamo(Documento doc){
       prestamo.add(doc);   
    }
    
    public int getCantidadArray(String idCliente){
        return this.prestamo.size();
    }
    
   
    
}
