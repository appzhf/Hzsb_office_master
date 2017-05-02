package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 存货信息类
 */
public class Stocks implements Serializable, Cloneable, Comparable<Stocks> {

	String Stocks_materialCode;// 物料代码
	String Stocks_materialName;// 物料名称
	String Stocks_supplier;// 供应商
	String Stocks_products;// 所属产品
	String Stocks_storeAddress;// 仓库存放位置
	int Stocks_inventoryNumber;// 库存数量
	int Stocks_virtualNumber;// 虚拟库存数量
	String Stocks_nowState;// 当前状态
	String Stocks_attrubute;// 属性
	int Stocks_inStockNumber;// 有货判断数量
	int Stocks_remindNumber;// 提醒判断数量
	int Stocks_outStockNumber;// 缺货判断数量
	int Stocks_emergency_number;// 紧急判断数量
	String Stocks_bz;// 备注

	public Stocks(){

	}

	public Stocks(String stocks_materialCode, String stocks_materialName,
			String stocks_supplier, String stocks_products,
			String stocks_storeAddress, int stocks_inventoryNumber,
			int stocks_virtualNumber, String stocks_nowState,
			String stocks_attrubute, int stocks_inStockNumber,
			int stocks_remindNumber, int stocks_outStockNumber,
			int stocks_emergency_number, String stocks_bz) {
		super();
		this.setStocks_materialCode(stocks_materialCode);
		this.setStocks_materialName(stocks_materialName);
		this.setStocks_supplier(stocks_supplier);
		this.setStocks_products(stocks_products);
		this.setStocks_storeAddress(stocks_storeAddress);
		this.setStocks_inventoryNumber(stocks_inventoryNumber);
		this.setStocks_virtualNumber(stocks_virtualNumber);
		this.setStocks_nowState(stocks_nowState);
		this.setStocks_attrubute(stocks_attrubute);
		this.setStocks_inStockNumber(stocks_inStockNumber);
		this.setStocks_remindNumber(stocks_remindNumber);
		this.setStocks_outStockNumber(stocks_outStockNumber);
		this.setStocks_emergency_number(stocks_emergency_number);
		this.setStocks_bz(stocks_bz);
	}

	public String getStocks_materialCode() {
		if(getStocks_materialCode() == null){
			return null;
		}
		return Stocks_materialCode;
	}

	public void setStocks_materialCode(String stocks_materialCode) {
		Stocks_materialCode = stocks_materialCode;
	}

	public String getStocks_materialName() {
		return Stocks_materialName;
	}

	public void setStocks_materialName(String stocks_materialName) {
		Stocks_materialName = stocks_materialName;
	}

	public String getStocks_supplier() {
		return Stocks_supplier;
	}

	public void setStocks_supplier(String stocks_supplier) {
		Stocks_supplier = stocks_supplier;
	}

	public String getStocks_products() {
		return Stocks_products;
	}

	public void setStocks_products(String stocks_products) {
		Stocks_products = stocks_products;
	}

	public String getStocks_storeAddress() {
		return Stocks_storeAddress;
	}

	public void setStocks_storeAddress(String stocks_storeAddress) {
		Stocks_storeAddress = stocks_storeAddress;
	}

	public int getStocks_inventoryNumber() {
		return Stocks_inventoryNumber;
	}

	public void setStocks_inventoryNumber(int stocks_inventoryNumber) {
		Stocks_inventoryNumber = stocks_inventoryNumber;
	}

	public int getStocks_virtualNumber() {
		return Stocks_virtualNumber;
	}

	public void setStocks_virtualNumber(int stocks_virtualNumber) {
		Stocks_virtualNumber = stocks_virtualNumber;
	}

	public String getStocks_nowState() {
		return Stocks_nowState;
	}

	public void setStocks_nowState(String stocks_nowState) {
		Stocks_nowState = stocks_nowState;
	}

	public String getStocks_attrubute() {
		return Stocks_attrubute;
	}

	public void setStocks_attrubute(String stocks_attrubute) {
		Stocks_attrubute = stocks_attrubute;
	}

	public int getStocks_inStockNumber() {
		return Stocks_inStockNumber;
	}

	public void setStocks_inStockNumber(int stocks_inStockNumber) {
		Stocks_inStockNumber = stocks_inStockNumber;
	}

	public int getStocks_remindNumber() {
		return Stocks_remindNumber;
	}

	public void setStocks_remindNumber(int stocks_remindNumber) {
		Stocks_remindNumber = stocks_remindNumber;
	}

	public int getStocks_outStockNumber() {
		return Stocks_outStockNumber;
	}

	public void setStocks_outStockNumber(int stocks_outStockNumber) {
		Stocks_outStockNumber = stocks_outStockNumber;
	}

	public int getStocks_emergency_number() {
		return Stocks_emergency_number;
	}

	public void setStocks_emergency_number(int stocks_emergency_number) {
		Stocks_emergency_number = stocks_emergency_number;
	}

	public String getStocks_bz() {
		return Stocks_bz;
	}

	public void setStocks_bz(String stocks_bz) {
		Stocks_bz = stocks_bz;
	}

	@Override
	public String toString() {
		return "Stocks [Stocks_materialCode=" + Stocks_materialCode
				+ ", Stocks_materialName=" + Stocks_materialName
				+ ", Stocks_supplier=" + Stocks_supplier + ", Stocks_products="
				+ Stocks_products + ", Stocks_storeAddress="
				+ Stocks_storeAddress + ", Stocks_inventoryNumber="
				+ Stocks_inventoryNumber + ", Stocks_virtualNumber="
				+ Stocks_virtualNumber + ", Stocks_nowState=" + Stocks_nowState
				+ ", Stocks_attrubute=" + Stocks_attrubute
				+ ", Stocks_inStockNumber=" + Stocks_inStockNumber
				+ ", Stocks_remindNumber=" + Stocks_remindNumber
				+ ", Stocks_outStockNumber=" + Stocks_outStockNumber
				+ ", Stocks_emergency_number=" + Stocks_emergency_number
				+ ", Stocks_bz=" + Stocks_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Stocks_attrubute == null) ? 0 : Stocks_attrubute.hashCode());
		result = prime * result
				+ ((Stocks_bz == null) ? 0 : Stocks_bz.hashCode());
		result = prime * result + Stocks_emergency_number;
		result = prime * result + Stocks_inStockNumber;
		result = prime * result + Stocks_inventoryNumber;
		result = prime
				* result
				+ ((Stocks_materialCode == null) ? 0 : Stocks_materialCode
						.hashCode());
		result = prime
				* result
				+ ((Stocks_materialName == null) ? 0 : Stocks_materialName
						.hashCode());
		result = prime * result
				+ ((Stocks_nowState == null) ? 0 : Stocks_nowState.hashCode());
		result = prime * result + Stocks_outStockNumber;
		result = prime * result
				+ ((Stocks_products == null) ? 0 : Stocks_products.hashCode());
		result = prime * result + Stocks_remindNumber;
		result = prime
				* result
				+ ((Stocks_storeAddress == null) ? 0 : Stocks_storeAddress
						.hashCode());
		result = prime * result
				+ ((Stocks_supplier == null) ? 0 : Stocks_supplier.hashCode());
		result = prime * result + Stocks_virtualNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stocks other = (Stocks) obj;
		if (Stocks_attrubute == null) {
			if (other.Stocks_attrubute != null)
				return false;
		} else if (!Stocks_attrubute.equals(other.Stocks_attrubute))
			return false;
		if (Stocks_bz == null) {
			if (other.Stocks_bz != null)
				return false;
		} else if (!Stocks_bz.equals(other.Stocks_bz))
			return false;
		if (Stocks_emergency_number != other.Stocks_emergency_number)
			return false;
		if (Stocks_inStockNumber != other.Stocks_inStockNumber)
			return false;
		if (Stocks_inventoryNumber != other.Stocks_inventoryNumber)
			return false;
		if (Stocks_materialCode == null) {
			if (other.Stocks_materialCode != null)
				return false;
		} else if (!Stocks_materialCode.equals(other.Stocks_materialCode))
			return false;
		if (Stocks_materialName == null) {
			if (other.Stocks_materialName != null)
				return false;
		} else if (!Stocks_materialName.equals(other.Stocks_materialName))
			return false;
		if (Stocks_nowState == null) {
			if (other.Stocks_nowState != null)
				return false;
		} else if (!Stocks_nowState.equals(other.Stocks_nowState))
			return false;
		if (Stocks_outStockNumber != other.Stocks_outStockNumber)
			return false;
		if (Stocks_products == null) {
			if (other.Stocks_products != null)
				return false;
		} else if (!Stocks_products.equals(other.Stocks_products))
			return false;
		if (Stocks_remindNumber != other.Stocks_remindNumber)
			return false;
		if (Stocks_storeAddress == null) {
			if (other.Stocks_storeAddress != null)
				return false;
		} else if (!Stocks_storeAddress.equals(other.Stocks_storeAddress))
			return false;
		if (Stocks_supplier == null) {
			if (other.Stocks_supplier != null)
				return false;
		} else if (!Stocks_supplier.equals(other.Stocks_supplier))
			return false;
		if (Stocks_virtualNumber != other.Stocks_virtualNumber)
			return false;
		return true;
	}

	public int compareTo(Stocks o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
