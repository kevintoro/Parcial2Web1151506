package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "seguir")
public class Seguir implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "cliente", nullable = false)
  private Integer cliente;

  @Id
  @Column(name = "tienda", nullable = false)
  private Integer tienda;

}
