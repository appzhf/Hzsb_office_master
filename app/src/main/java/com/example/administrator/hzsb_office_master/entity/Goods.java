package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 商品信息类
 */
public class Goods implements Serializable, Cloneable, Comparable<Goods> {

	String Goods_Material_Code;// 物料代码
	String Goods_Material_name;// 物料名称
	String Goods_Supplier;// 供应商
	String Goods_User;// 联系人
	String Goods_User_Phone;// 联系电话
	String Goods_User_Address;// 地址
	String Goods_Bz;// 备注

	public Goods() {
	}

	public Goods(String goods_Material_Code, String goods_Material_name,
			String goods_Supplier, String goods_User, String goods_User_Phone,
			String goods_User_Address, String goods_Bz) {
		super();
		this.setGoods_Material_Code(goods_Material_Code);
		this.setGoods_Material_name(goods_Material_name);
		this.setGoods_Supplier(goods_Supplier);
		this.setGoods_User(goods_User);
		this.setGoods_User_Phone(goods_User_Phone);
		this.setGoods_User_Address(goods_User_Address);
		this.setGoods_Bz(goods_Bz);

	}

	public String getGoods_Material_Code() {
		return Goods_Material_Code;
	}

	public void setGoods_Material_Code(String goods_Material_Code) {
		Goods_Material_Code = goods_Material_Code;
	}

	public String getGoods_Material_name() {
		return Goods_Material_name;
	}

	public void setGoods_Material_name(String goods_Material_name) {
		Goods_Material_name = goods_Material_name;
	}

	public String getGoods_Supplier() {
		return Goods_Supplier;
	}

	public void setGoods_Supplier(String goods_Supplier) {
		Goods_Supplier = goods_Supplier;
	}

	public String getGoods_User() {
		return Goods_User;
	}

	public void setGoods_User(String goods_User) {
		Goods_User = goods_User;
	}

	public String getGoods_User_Phone() {
		return Goods_User_Phone;
	}

	public void setGoods_User_Phone(String goods_User_Phone) {
		Goods_User_Phone = goods_User_Phone;
	}

	public String getGoods_User_Address() {
		return Goods_User_Address;
	}

	public void setGoods_User_Address(String goods_User_Address) {
		Goods_User_Address = goods_User_Address;
	}

	public String getGoods_Bz() {
		return Goods_Bz;
	}

	public void setGoods_Bz(String goods_Bz) {
		Goods_Bz = goods_Bz;
	}

	@Override
	public String toString() {
		return "Goods [Goods_Material_Code=" + Goods_Material_Code
				+ ", Goods_Material_name=" + Goods_Material_name
				+ ", Goods_Supplier=" + Goods_Supplier + ", Goods_User="
				+ Goods_User + ", Goods_User_Phone=" + Goods_User_Phone
				+ ", Goods_User_Address=" + Goods_User_Address + ", Goods_Bz="
				+ Goods_Bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Goods_Bz == null) ? 0 : Goods_Bz.hashCode());
		result = prime
				* result
				+ ((Goods_Material_Code == null) ? 0 : Goods_Material_Code
						.hashCode());
		result = prime
				* result
				+ ((Goods_Material_name == null) ? 0 : Goods_Material_name
						.hashCode());
		result = prime * result
				+ ((Goods_Supplier == null) ? 0 : Goods_Supplier.hashCode());
		result = prime * result
				+ ((Goods_User == null) ? 0 : Goods_User.hashCode());
		result = prime
				* result
				+ ((Goods_User_Address == null) ? 0 : Goods_User_Address
						.hashCode());
		result = prime
				* result
				+ ((Goods_User_Phone == null) ? 0 : Goods_User_Phone.hashCode());
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
		Goods other = (Goods) obj;
		if (Goods_Bz == null) {
			if (other.Goods_Bz != null)
				return false;
		} else if (!Goods_Bz.equals(other.Goods_Bz))
			return false;
		if (Goods_Material_Code == null) {
			if (other.Goods_Material_Code != null)
				return false;
		} else if (!Goods_Material_Code.equals(other.Goods_Material_Code))
			return false;
		if (Goods_Material_name == null) {
			if (other.Goods_Material_name != null)
				return false;
		} else if (!Goods_Material_name.equals(other.Goods_Material_name))
			return false;
		if (Goods_Supplier == null) {
			if (other.Goods_Supplier != null)
				return false;
		} else if (!Goods_Supplier.equals(other.Goods_Supplier))
			return false;
		if (Goods_User == null) {
			if (other.Goods_User != null)
				return false;
		} else if (!Goods_User.equals(other.Goods_User))
			return false;
		if (Goods_User_Address == null) {
			if (other.Goods_User_Address != null)
				return false;
		} else if (!Goods_User_Address.equals(other.Goods_User_Address))
			return false;
		if (Goods_User_Phone == null) {
			if (other.Goods_User_Phone != null)
				return false;
		} else if (!Goods_User_Phone.equals(other.Goods_User_Phone))
			return false;
		return true;
	}

	public int compareTo(Goods o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
