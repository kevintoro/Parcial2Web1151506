package co.blacklabel.learn.DAO;

import co.blacklabel.learn.model.Seguir;
import co.blacklabel.learn.util.ConnectionDB;

public class SeguirDAO extends ConnectionDB<Seguir> implements GenericDAO<Seguir> {
  public SeguirDAO(){
    super(Seguir.class);
  }
}
