package com.devo.mywallet.data.currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "operations")
public class OperationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "external_uuid", unique = true, nullable = false)
  private String externalUuid;

  @Column(name = "currency", nullable = false)
  private Сurrency currency;

  @Column(name = "count", nullable = false)
  private BigDecimal count;

  // todo create relation and migration
//  @Column(name = "wallet", nullable = false)
//  private WalletEntity wallet;

}
