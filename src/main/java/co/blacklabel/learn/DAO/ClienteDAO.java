package co.blacklabel.learn.DAO;

import co.blacklabel.learn.model.Cliente;
import co.blacklabel.learn.util.ConnectionDB;

public class ClienteDAO extends ConnectionDB<Cliente> implements GenericDAO<Cliente>{
  public ClienteDAO(){
    super(Cliente.class);
  }
}
