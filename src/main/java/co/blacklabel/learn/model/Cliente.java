package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
@NamedQuery(name = "Cliente.findAll", query = "select c from Cliente c")
@Data
public class Cliente implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "clave", nullable = false)
  private String clave;

  @Column(name = "email", nullable = false)
  private String email;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre", nullable = false)
  private String nombre;

}
