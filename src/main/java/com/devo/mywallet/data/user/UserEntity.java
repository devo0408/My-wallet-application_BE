package com.devo.mywallet.data.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "external_uuid", unique = true, nullable = false)
  private String externalUuid;

  @Column(name = "email")
  private String email;

  @Column(name = "password", nullable = false)
  private String password; // todo change to encrypted value

}
