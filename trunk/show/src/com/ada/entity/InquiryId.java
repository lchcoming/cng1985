package com.ada.entity;

/**
 * InquiryId entity. @author MyEclipse Persistence Tools
 */

public class InquiryId implements java.io.Serializable {

	// Fields

	private String tradeId;
	private String stockId;

	// Constructors

	/** default constructor */
	public InquiryId() {
	}

	/** full constructor */
	public InquiryId(String tradeId, String stockId) {
		this.tradeId = tradeId;
		this.stockId = stockId;
	}

	// Property accessors

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InquiryId))
			return false;
		InquiryId castOther = (InquiryId) other;

		return ((this.getTradeId() == castOther.getTradeId()) || (this
				.getTradeId() != null
				&& castOther.getTradeId() != null && this.getTradeId().equals(
				castOther.getTradeId())))
				&& ((this.getStockId() == castOther.getStockId()) || (this
						.getStockId() != null
						&& castOther.getStockId() != null && this.getStockId()
						.equals(castOther.getStockId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTradeId() == null ? 0 : this.getTradeId().hashCode());
		result = 37 * result
				+ (getStockId() == null ? 0 : this.getStockId().hashCode());
		return result;
	}

}