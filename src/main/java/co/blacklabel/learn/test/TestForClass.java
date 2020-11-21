package co.blacklabel.learn.test;

import co.blacklabel.learn.DAO.ClienteDAO;
import co.blacklabel.learn.DAO.SeguirDAO;
import co.blacklabel.learn.DAO.ServicioDAO;
import co.blacklabel.learn.DAO.TiendaDAO;
import co.blacklabel.learn.model.Cliente;
import co.blacklabel.learn.model.Seguir;
import co.blacklabel.learn.model.Servicio;
import co.blacklabel.learn.model.Tienda;

/**
 * Class for test the connection
 */
public class TestForClass {
  public static void main(String[] args) {
    ClienteDAO clienteDAO = new ClienteDAO();
    SeguirDAO seguirDAO = new SeguirDAO();
    ServicioDAO servicioDAO = new ServicioDAO();
    TiendaDAO tiendaDAO = new TiendaDAO();

    //Insert new customer
    Cliente c = new Cliente();
    c.setClave("1234");
    c.setEmail("pablo@mail.com");
    c.setNombre("Pablo Gonzales");
    clienteDAO.insert(c);

    //Insert new Store
    Tienda t = new Tienda();
    t.setClave("1234");
    t.setDescripcion("This is a test generated store");
    t.setEmail("test@store.com");
    t.setFacebook("facebook.com/store");
    t.setImagen("https://www.michiganradio.org/sites/michigan/files/styles/x_large/public/202003/hanson-lu-sq5P00L7lXc-unsplash.jpg");
    t.setLema("Lorem ipsum");
    t.setNombre("Test Store");
    t.setPropietario("Kevin Toro");
    t.setWeb("github.com/kevintoro");
    tiendaDAO.insert(t);

    //Create service
    Servicio s = new Servicio();
    s.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque earum nostrum suscipit ducimus nihil provident, perferendis rem illo, voluptate atque, sit eius in voluptates, nemo repellat fugiat excepturi! Nemo, esse.");
    s.setNombre("programacion de alarmas");
    s.setTienda(t.getId());
    servicioDAO.insert(s);

    //follow store
    Seguir sg = new Seguir();
    sg.setCliente(c.getId());
    sg.setTienda(t.getId());
    seguirDAO.insert(sg);

    //Update store
    Tienda updt = tiendaDAO.find(4);
    updt.setFacebook("https://es-la.facebook.com/traguatan/");
    updt.setNombre("Traguatan");
    tiendaDAO.update(updt);
  }
}
