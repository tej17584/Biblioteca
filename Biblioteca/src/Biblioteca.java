
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @version 1.0
 * ESta clase es la que contiene toda la inteligencia general
 */
public final class Biblioteca {
    ArrayList<Documento> documentos;
    ArrayList<Cliente> clientes;
    Articulo articulo;
    Libro libro;
    Revista revista;
    Cd cd;
    
    public Biblioteca(){
        documentos= new ArrayList<>();
        clientes= new ArrayList<>();
        articulo= new Articulo();
        libro = new Libro();
        revista = new Revista();
        cd= new Cd();
        valoresIniciales();   
    }
    public void valoresIniciales(){
        Articulo a1= new Articulo();
        Articulo a2= new Articulo();
        Articulo a3= new Articulo();
        Libro l1= new Libro();
        Libro l2= new Libro();
        Libro l3= new Libro();
        Libro l4= new Libro();
        Cd c1= new Cd();
        Cd c2= new Cd();
        Cd c3= new Cd();
        Revista r1= new Revista();
        Revista r2= new Revista();
        Revista r3= new Revista();
        a1.setArticulo("111110", "Los Cinco Furiosos", "Ciencia", 5, "Didier Lopez");
        documentos.add(a1);
        a2.setArticulo("111111", "El Mouse", "Tecnologia", 3, "Mouse Lopez");
        documentos.add(a2);
        a3.setArticulo("111112", "La computadora", "Tecnologia", 6, "Marlon Lopez");
        documentos.add(a3);
        l1.setLibro("222220", "La lata", "Francisco Monzon", "Filosofia", "Carnage", 2);
        documentos.add(l1);
        l2.setLibro("222221", "La francesa", "Francisco morataya", "Ciencia", "Carnage", 2);
        documentos.add(l2);
        l3.setLibro("222222", "La Estirpe", "Lilian Rivera", "Historia", "Centurion", 5);
        documentos.add(l3);
        l4.setLibro("222223", "Esperanza", "Mario Flores", "Ciencia", "Ilusiones", 10);
        documentos.add(l4);
        r1.setRevista("333330", "Guatemala Time", "Popular", 15, "2017", "1");
        documentos.add(r1);
        r2.setRevista("333331", "Honduras Time", "Popular", 10, "2016", "12");
        documentos.add(r2);
        r3.setRevista("333332", "Salvador Time", "Popular", 12, "2018", "8");
        documentos.add(r3);
        c1.setCd("444440", "Miriam", "Historia", 20, "Paramaunt", "1992");
        documentos.add(c1);
        c2.setCd("444441", "Chino", "Popular", 20, "Pixar", "2010");
        documentos.add(c2);
        c3.setCd("444442", "Mouseesito", "Filosofia", 20, "Guatemala Discos", "2014");
        documentos.add(c3);
    }
    /**
     * Este metodo es vacio 
     */
    public void getconteoLista(){
        int s=0;
        Documento doc=null;
        for (int i = 0; i < documentos.size(); i++) {
            doc=documentos.get(i);
            System.out.println("Nombre "+doc.getTituloDoc());
        }   
    }
    /**
     * Este metodo crea un nuevo cliente
     * @param idCliente el id del cliente
     * @param direccionCliente la direccion del cliente
     */
    public void setCliente(String idCliente, String nombreCliente,String direccionCliente){
        Cliente cliente= new Cliente();
        cliente.setCliente(idCliente,nombreCliente, direccionCliente);
        clientes.add(cliente);
    }
    public void setPrestamo(String idCliente, String idDocumento){
        Documento doc=null;
        Cliente cliente=null;
        try {
            doc=getDocumentoId(idDocumento);
            cliente=buscarClienteId(idCliente);
            if (cliente.getDocPrestados()==5) {
                JOptionPane.showMessageDialog(null, "No se puede prestar otro documento, ya pasó su limite.");
            } else{
                cliente.setPrestamo(doc);
                cliente.aumentarDocEnPretamo(idCliente);
                cliente.aumentarDocPrestados(idCliente);
                System.out.println(cliente.getCantidadArray(idCliente));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el Id del documento o el Id del cliente");
        }   
    }
    /**
     * Este metodo devuelve un objeto d e tipo documento en la lsita que coincida con el ID de documento
     * @param id un string con el id del documento cualquiera que sea
     * @return el documento que corresponda al ID
     */
    public Documento getDocumentoId(String id){
        Documento doc=null;
        Documento docRetorno=null;
        for (int i = 0; i < documentos.size(); i++) {
            doc=documentos.get(i);
            if (doc.getIdDoc().equals(id)) {
                docRetorno=doc;
            }
        }
        return docRetorno;
    }
    /**
     * Este método retorna un cliente buscado por su ID
     * @param idCliente es un string con el id del cliente
     * @return el cliente que cuadre con el Id ingresado
     */
    public Cliente buscarClienteId(String idCliente){
        Cliente cliente=null;
        Cliente clienteRetorno=null;
        for (int i = 0; i < clientes.size(); i++) {
            cliente=clientes.get(i);
            if (cliente.getIdCliente().equals(idCliente)) {
                clienteRetorno=cliente;
            }
        }
        return clienteRetorno;
    }
    /**
     * Este metodo busca un nombre de un id de cliente
     * @param idCliente el String con el ID del cliente
     * @return un String con el nombre del cliente
     */
    public String buscarNombreCliente(String idCliente){
        String nombreCliente="";
        Cliente cliente=buscarClienteId(idCliente);
        nombreCliente=cliente.getNombreCliente();
        return nombreCliente;
    }
    
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca();
        Cliente cliente= new Cliente();
        System.out.println("HOLAAAAAAAAAA");
        biblioteca.setCliente("17584", "Alejandro Tejada", "zona 18");
        biblioteca.setCliente("17238", "Diego Sevilla", "Mixco");
        biblioteca.setPrestamo("17584", "222222");
        biblioteca.setPrestamo("17584", "222222");
    }
}
