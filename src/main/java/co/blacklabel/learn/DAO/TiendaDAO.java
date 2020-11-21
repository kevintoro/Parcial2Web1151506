package co.blacklabel.learn.DAO;

import co.blacklabel.learn.model.Tienda;
import co.blacklabel.learn.util.ConnectionDB;

public class TiendaDAO extends ConnectionDB<Tienda> implements GenericDAO<Tienda> {
  public TiendaDAO(){
    super(Tienda.class);
  }
}
