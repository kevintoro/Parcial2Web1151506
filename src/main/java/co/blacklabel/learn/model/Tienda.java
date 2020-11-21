package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NamedQuery(name = "Tienda.findAll", query = "select t from Tienda t")
@Table(name = "tienda")
public class Tienda implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "clave", nullable = false)
  private String clave;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "facebook", nullable = false)
  private String facebook;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "imagen", nullable = false)
  private String imagen;

  @Column(name = "lema", nullable = false)
  private String lema;

  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "propietario", nullable = false)
  private String propietario;

  @Column(name = "web", nullable = false)
  private String web;

}
