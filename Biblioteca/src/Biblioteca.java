
import java.awt.AWTError;
import java.awt.HeadlessException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
public  class Biblioteca {
    protected ArrayList<Documento> documentos;
    protected ArrayList<Cliente> clientes;
    protected Articulo articulo;
    protected Libro libro;
    protected Revista revista;
    protected Cd cd;
    
    public Biblioteca(){
        documentos= new ArrayList<>();
        clientes= new ArrayList<>();
        articulo= new Articulo();
        libro = new Libro();
        revista = new Revista();
        cd= new Cd();
        valoresIniciales();   
    }
    private void valoresIniciales(){
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
        a2.setArticulo("111111", "El Mouse", "Tecnologia", 5, "Mouse Lopez");
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
     * Este metodo genera libros
     * @param idLibro un string con el id del libro
     * @param tituloLibro un string con el titulo del libro
     * @param autorLibro un string con el autor del libro
     * @param materiaLibro un String con la material del libro
     * @param editorialLibro un string con la editorial del libro
     * @param cantidadLibro un int con la cantidad de libros
     */
    public void setLibro(String idLibro, String tituloLibro, String autorLibro,String materiaLibro,String editorialLibro,int cantidadLibro){
        Libro libro= new Libro();
        libro.setLibro(idLibro, tituloLibro, autorLibro, materiaLibro, editorialLibro, cantidadLibro);
        documentos.add(libro);
        JOptionPane.showMessageDialog(null, "Libro ingresado con exito");
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
        Cd cd= new Cd();
        cd.setCd(idCD, tituloCd, materiaCd, cantidadCD, casaProductoraCD, fechaProduccionCD);
        JOptionPane.showMessageDialog(null, "Cd ingresado con exito");
        documentos.add(cd);
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
        Revista revista= new Revista();
        revista.setRevista(idRevista, tituloRevista, materiaRevista, cantidadRevista, anioPRevista, numeroDeRevista);
        documentos.add(revista);
        JOptionPane.showMessageDialog(null, "Revista ingresado con exito");
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
        Articulo articulo = new Articulo();
        articulo.setArticulo(idArticulo, tituloArticulo, materiaArticulo, cantidadArticulo, arbitroArticulo);
        documentos.add(articulo);
        JOptionPane.showMessageDialog(null, "Articulo ingresado con exito");
    }
    
    /**
     * Este metodo crea un nuevo cliente
     * @param idCliente el id del cliente
     * @param nombreCliente el nombre del cliente
     * @param direccionCliente la direccion del cliente
     */
    public void setCliente(String idCliente, String nombreCliente,String direccionCliente){
        Cliente cliente= new Cliente();
        cliente.setCliente(idCliente,nombreCliente, direccionCliente);
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente ingresado con exito");
    }
    /**
     * Este metodo configura un nuevo prestamo
     * @param idCliente un string con el id del cliente
     * @param idDocumento un string con el id del documento
     */
    public void setPrestamo(String idCliente, String idDocumento){
        Documento doc=null;
        Cliente cliente=null;
        try {
            doc=getDocumentoId(idDocumento);
            cliente=buscarClienteId(idCliente);
            if ((cliente.getDocPrestados()==5)) {
                JOptionPane.showMessageDialog(null, "No se puede prestar otro documento, ya pasó su limite.");
            }else if (doc.getCantidadDoc()<=0) {
                JOptionPane.showMessageDialog(null, "No hay existencias para este documento. Intente otro dia.");
            }  
            else{
                cliente.setPrestamo(doc);
                cliente.aumentarDocEnPretamo(idCliente);
                cliente.aumentarDocPrestados(idCliente);
                doc.disminuirCantidad();
                JOptionPane.showMessageDialog(null, "Prestamo ingresado con exito");
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el Id del documento o el Id del cliente");
        }  
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error vuelva a intentarlo.");
        }
    }
    /**
     * Este metodo devuelve un libro a la biblioteca
     * @param idCliente un stringcon el Id del cliente
     * @param idDocumento un string con el id del documento
     */
    public void setRetorno(String idCliente, String idDocumento){
        Documento doc=null;
        Cliente cliente=null;
        try {
            doc=getDocumentoId(idDocumento);
            cliente=buscarClienteId(idCliente);
            doc.disminuirCantidad();
            cliente.quitarDocEnPrestamo();
            JOptionPane.showMessageDialog(null, "Devolucion hecha con exito.");
        } catch (NullPointerException e) {
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
     * Este metodo nos verifica si existe el doc
     * @param idDoc un strin con el id del documento
     * @return un booleano que nos indica si esxiste o no
     */
    public boolean verificarIDDoc(String idDoc){
        boolean retorno=false;
        Documento doc= null;
        for (int i = 0; i < documentos.size(); i++) {
            doc=documentos.get(i);
            if (doc.getIdDoc().equals(idDoc)) {
                retorno=true;
                return retorno;
            }
        }
        return retorno;
    }
    /**
     * Este metodo verifica que hayan clientes con ese ID
     * @param idCliente un id con el cliente un string
     * @return un tipo booleano que indica si esta o no
     */
    public boolean verificarIdCliente(String idCliente){
        boolean retorno=false;
        Cliente cliente=null;
        for (int i = 0; i < clientes.size(); i++) {
            cliente=clientes.get(i);
            if (cliente.getIdCliente().equals(idCliente)) {
                retorno=true;
                return retorno;
            }
        }
        return retorno;
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
     * Este método retorna un cliente basado en sus libros
     * @param cantLibros es un string con el id del cliente
     * @return el cliente que cuadre con el los doc ingresado
     */
    public Cliente buscarClienteCantDoc(int cantLibros){
        Cliente cliente=null;
        Cliente clienteRetorno=null;
        for (int i = 0; i < clientes.size(); i++) {
            cliente=clientes.get(i);
            if (cliente.getDocPrestadosTotal()==cantLibros) {
                clienteRetorno=cliente;
                return clienteRetorno;
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
    
    /**
     * Este metodo nos dice cuantos hay de una materia
     * @param materia un string con la materia
     * @return un integer con la cantidad de la materia
     */
    public int cantidadDocumentosMateria(String materia){
        int cantidad=0;
        Documento doc=null;
        for (int i = 0; i < documentos.size(); i++) {
            doc=documentos.get(i);
            if (doc.getMateriaDoc().equals(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    /**
     * Este metodo calcula los 3 mayores clientes
     * @return un vector tipo Cliente
     */
    public Cliente[] calcular3MayoresClientes(){
        Cliente[] retorno=new Cliente[clientes.size()];
        Integer [] prestamos= new Integer[clientes.size()];
        Cliente doc=null;
        Documento doc1=null;
        int aux=0;
        for (int i = 0; i < clientes.size(); i++) {
            doc=clientes.get(i);
            prestamos[i]=doc.getDocPrestadosTotal();
        }
        System.out.println("Sin ordenar: "+Arrays.asList(prestamos));
        for (int i = 0; i < prestamos.length; i++) {
            for (int j = i+1; j < prestamos.length; j++) {
                if(prestamos[i] < prestamos[j]){
                    aux = prestamos[i];
                    prestamos[i] = prestamos[j];
                    prestamos[j] = aux;
                }
            }
        }
        System.out.println("Ordenado "+Arrays.asList(prestamos));
        for (int i = 0; i < prestamos.length; i++) {
            retorno[i]=buscarClienteCantDoc(prestamos[i]);
        }	
        return retorno;
    }
   
}
