package com.devo.mywallet.data.currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "wallets")
public class WalletEntity {

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

}
