package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "servicio")
@NamedQuery(name = "Servicio.findAll", query = "select s from Servicio s")
@Data
public class Servicio implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "descripcion", nullable = false)
  private String descripcion;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "tienda", nullable = false)
  private Integer tienda;

}
