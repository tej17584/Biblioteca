
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
    protected ArrayList<Documento> documento;
    protected int diasP;
    protected String idCliente;
    protected String direccionCliente;
    protected int docEnPrestamo;
    protected int docPrestados;
    
    public Cliente(){
        this.documento= new ArrayList<>();
        this.diasP=0;
        this.idCliente="";
        this.direccionCliente="";
        this.docPrestados=0;
        this.docEnPrestamo=0;
    }
    /**
     * Este metodo crea un cliente nuevo
     * @param idCliente el id del cliente nuevo
     * @param direccionCliente la direccion del cliente nuevo 
     */
    public void setCliente(String idCliente, String direccionCliente){
        this.idCliente=idCliente;
        this.direccionCliente=direccionCliente;
        this.diasP=0;
        this.docPrestados=0;
        this.docEnPrestamo=0;
    }
    /**
     * este metodo aumenta los documentos pretados totales
     * @param idCliente 
     */
    public void aumentarDocPrestados(String idCliente){
        if (this.idCliente == null ? idCliente == null : this.idCliente.equals(idCliente)) {
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
    
}
