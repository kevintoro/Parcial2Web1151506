package co.blacklabel.learn.DAO;

import co.blacklabel.learn.model.Servicio;
import co.blacklabel.learn.util.ConnectionDB;

public class ServicioDAO extends ConnectionDB<Servicio> implements GenericDAO<Servicio> {
  public ServicioDAO(){
    super(Servicio.class);
  }
}
