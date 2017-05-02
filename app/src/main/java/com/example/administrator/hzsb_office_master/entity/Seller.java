package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 卖方信息类
 */
public class Seller implements Serializable, Cloneable, Comparable<Seller> {

	String Seller_name;// 姓名
	String Seller_position;// 职务
	String Seller_telPhone;// 手机
	String Seller_email;// 邮箱
	String Seller_phone;// 电话
	String Seller_fax;// 传真
	String Seller_bz;// 备注

	public Seller() {
		super();
	}

	public Seller(String seller_name, String seller_position,
			String seller_telPhone, String seller_email, String seller_phone,
			String seller_fax, String seller_bz) {
		super();
		this.setSeller_name(seller_name);
		this.setSeller_position(seller_position);
		this.setSeller_telPhone(seller_telPhone);
		this.setSeller_email(seller_email);
		this.setSeller_phone(seller_phone);
		this.setSeller_fax(seller_fax);
		this.setSeller_bz(seller_bz);
	}

	public String getSeller_name() {
		return Seller_name;
	}

	public void setSeller_name(String seller_name) {
		Seller_name = seller_name;
	}

	public String getSeller_position() {
		return Seller_position;
	}

	public void setSeller_position(String seller_position) {
		Seller_position = seller_position;
	}

	public String getSeller_telPhone() {
		return Seller_telPhone;
	}

	public void setSeller_telPhone(String seller_telPhone) {
		Seller_telPhone = seller_telPhone;
	}

	public String getSeller_email() {
		return Seller_email;
	}

	public void setSeller_email(String seller_email) {
		Seller_email = seller_email;
	}

	public String getSeller_phone() {
		return Seller_phone;
	}

	public void setSeller_phone(String seller_phone) {
		Seller_phone = seller_phone;
	}

	public String getSeller_fax() {
		return Seller_fax;
	}

	public void setSeller_fax(String seller_fax) {
		Seller_fax = seller_fax;
	}

	public String getSeller_bz() {
		return Seller_bz;
	}

	public void setSeller_bz(String seller_bz) {
		Seller_bz = seller_bz;
	}

	@Override
	public String toString() {
		return "Seller [Seller_name=" + Seller_name + ", Seller_position="
				+ Seller_position + ", Seller_telPhone=" + Seller_telPhone
				+ ", Seller_email=" + Seller_email + ", Seller_phone="
				+ Seller_phone + ", Seller_fax=" + Seller_fax + ", Seller_bz="
				+ Seller_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Seller_bz == null) ? 0 : Seller_bz.hashCode());
		result = prime * result
				+ ((Seller_email == null) ? 0 : Seller_email.hashCode());
		result = prime * result
				+ ((Seller_fax == null) ? 0 : Seller_fax.hashCode());
		result = prime * result
				+ ((Seller_name == null) ? 0 : Seller_name.hashCode());
		result = prime * result
				+ ((Seller_phone == null) ? 0 : Seller_phone.hashCode());
		result = prime * result
				+ ((Seller_position == null) ? 0 : Seller_position.hashCode());
		result = prime * result
				+ ((Seller_telPhone == null) ? 0 : Seller_telPhone.hashCode());
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
		Seller other = (Seller) obj;
		if (Seller_bz == null) {
			if (other.Seller_bz != null)
				return false;
		} else if (!Seller_bz.equals(other.Seller_bz))
			return false;
		if (Seller_email == null) {
			if (other.Seller_email != null)
				return false;
		} else if (!Seller_email.equals(other.Seller_email))
			return false;
		if (Seller_fax == null) {
			if (other.Seller_fax != null)
				return false;
		} else if (!Seller_fax.equals(other.Seller_fax))
			return false;
		if (Seller_name == null) {
			if (other.Seller_name != null)
				return false;
		} else if (!Seller_name.equals(other.Seller_name))
			return false;
		if (Seller_phone == null) {
			if (other.Seller_phone != null)
				return false;
		} else if (!Seller_phone.equals(other.Seller_phone))
			return false;
		if (Seller_position == null) {
			if (other.Seller_position != null)
				return false;
		} else if (!Seller_position.equals(other.Seller_position))
			return false;
		if (Seller_telPhone == null) {
			if (other.Seller_telPhone != null)
				return false;
		} else if (!Seller_telPhone.equals(other.Seller_telPhone))
			return false;
		return true;
	}

	public int compareTo(Seller o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
