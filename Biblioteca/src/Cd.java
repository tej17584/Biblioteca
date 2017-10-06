/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class Cd extends Documento{
    protected String CasaP;
    protected String fechaP;
    
    public Cd(){
        CasaP="";
        fechaP="";
    }
    /**
     * ESte metodo crea un nuevo documento de tipo Cd
     * @param idCD un string con el Id del CD
     * @param tituloCd un string con el titulo
     * @param materiaCd un string con la material del CD
     * @param cantidadCD un int con la cantidad de Cd
     * @param casaProductoraCD un String con la casa de produccion
     * @param fechaProduccionCD  un String con la fecha de produccion
     */
    public void setCd(String idCD, String tituloCd, String materiaCd, int cantidadCD, String casaProductoraCD, String fechaProduccionCD){
        super.setDocumento(idCD, tituloCd, materiaCd, cantidadCD);
        this.CasaP=casaProductoraCD;
        this.fechaP=fechaProduccionCD;
    }
    /**
     * este metodo retorna la casa productora
     * @return Un String con la casa productora
     */
    public String getCasaPCd(){
        return this.CasaP;
    }
    /**
     * Este metodo retorna una fecha
     * @return retorna la fecha de publicacions
     */
    public String getFechaCd(){
        return this.fechaP;
    }
    
    
}
