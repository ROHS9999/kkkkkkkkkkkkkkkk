package com.opentravelsoft.entity.finance;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ReckoningAcct generated by hbm2java
 */
@Entity
@Table(name = "tbl_reckoning_acct", catalog = "tourismwork_db")
public class ReckoningAcct implements java.io.Serializable {

	private ReckoningAcctId id;
	private String description;
	private BigDecimal unitPrice;
	private Integer count;
	private BigDecimal amount;
	private String unit;

	public ReckoningAcct() {
	}

	public ReckoningAcct(ReckoningAcctId id) {
		this.id = id;
	}

	public ReckoningAcct(ReckoningAcctId id, String description,
			BigDecimal unitPrice, Integer count, BigDecimal amount, String unit) {
		this.id = id;
		this.description = description;
		this.unitPrice = unitPrice;
		this.count = count;
		this.amount = amount;
		this.unit = unit;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "reckoningId", column = @Column(name = "RECKONING_ID", nullable = false)),
			@AttributeOverride(name = "itemId", column = @Column(name = "ITEM_ID", nullable = false)) })
	public ReckoningAcctId getId() {
		return this.id;
	}

	public void setId(ReckoningAcctId id) {
		this.id = id;
	}

	@Column(name = "DESCRIPTION", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "UNIT_PRICE", precision = 9)
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "COUNT")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "AMOUNT", precision = 9)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "UNIT", length = 10)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}