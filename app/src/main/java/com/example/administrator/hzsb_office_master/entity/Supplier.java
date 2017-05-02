package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 供应商信息类
 */
public class Supplier implements Serializable, Cloneable, Comparable<Supplier> {

	String Supplier_name;// 供应商
	String Supplier_user;// 联系人
	String Supplier_phone;// 联系电话
	String Supplier_address;// 地址
	String Supplier_bz;// 备注

	public Supplier() {
		super();
	}

	public Supplier(String supplier_name, String supplier_user,
			String supplier_phone, String supplier_address, String supplier_bz) {
		super();
		this.setSupplier_name(supplier_name);
		this.setSupplier_user(supplier_user);
		this.setSupplier_phone(supplier_phone);
		this.setSupplier_address(supplier_address);
		this.setSupplier_bz(supplier_bz);
	}

	public String getSupplier_name() {
		return Supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		Supplier_name = supplier_name;
	}

	public String getSupplier_user() {
		return Supplier_user;
	}

	public void setSupplier_user(String supplier_user) {
		Supplier_user = supplier_user;
	}

	public String getSupplier_phone() {
		return Supplier_phone;
	}

	public void setSupplier_phone(String supplier_phone) {
		Supplier_phone = supplier_phone;
	}

	public String getSupplier_address() {
		return Supplier_address;
	}

	public void setSupplier_address(String supplier_address) {
		Supplier_address = supplier_address;
	}

	public String getSupplier_bz() {
		return Supplier_bz;
	}

	public void setSupplier_bz(String supplier_bz) {
		Supplier_bz = supplier_bz;
	}

	@Override
	public String toString() {
		return "Supplier [Supplier_name=" + Supplier_name + ", Supplier_user="
				+ Supplier_user + ", Supplier_phone=" + Supplier_phone
				+ ", Supplier_address=" + Supplier_address + ", Supplier_bz="
				+ Supplier_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Supplier_address == null) ? 0 : Supplier_address.hashCode());
		result = prime * result
				+ ((Supplier_bz == null) ? 0 : Supplier_bz.hashCode());
		result = prime * result
				+ ((Supplier_name == null) ? 0 : Supplier_name.hashCode());
		result = prime * result
				+ ((Supplier_phone == null) ? 0 : Supplier_phone.hashCode());
		result = prime * result
				+ ((Supplier_user == null) ? 0 : Supplier_user.hashCode());
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
		Supplier other = (Supplier) obj;
		if (Supplier_address == null) {
			if (other.Supplier_address != null)
				return false;
		} else if (!Supplier_address.equals(other.Supplier_address))
			return false;
		if (Supplier_bz == null) {
			if (other.Supplier_bz != null)
				return false;
		} else if (!Supplier_bz.equals(other.Supplier_bz))
			return false;
		if (Supplier_name == null) {
			if (other.Supplier_name != null)
				return false;
		} else if (!Supplier_name.equals(other.Supplier_name))
			return false;
		if (Supplier_phone == null) {
			if (other.Supplier_phone != null)
				return false;
		} else if (!Supplier_phone.equals(other.Supplier_phone))
			return false;
		if (Supplier_user == null) {
			if (other.Supplier_user != null)
				return false;
		} else if (!Supplier_user.equals(other.Supplier_user))
			return false;
		return true;
	}

	public int compareTo(Supplier o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
