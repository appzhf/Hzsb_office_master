package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品信息新表类
 */
public class Product_name_new implements Serializable, Cloneable,
		Comparable<Product_name_new> {

	String Product_name_new_id;// 产品编号
	String Product_name_new_code;// 产品代码
	String Product_name_new_name;// 产品名称
	String Product_name_new_bz;// 备注

	public Product_name_new() {
		super();
	}

	public Product_name_new(String product_name_new_id,
			String product_name_new_code, String product_name_new_name,
			String product_name_new_bz) {
		super();
		this.setProduct_name_new_id(product_name_new_id);
		this.setProduct_name_new_code(product_name_new_code);
		this.setProduct_name_new_name(product_name_new_name);
		this.setProduct_name_new_bz(product_name_new_bz);
	}

	@Override
	public String toString() {
		return "Product_name_new [Product_name_new_id=" + Product_name_new_id
				+ ", Product_name_new_code=" + Product_name_new_code
				+ ", Product_name_new_name=" + Product_name_new_name
				+ ", Product_name_new_bz=" + Product_name_new_bz + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Product_name_new_bz == null) ? 0 : Product_name_new_bz
						.hashCode());
		result = prime
				* result
				+ ((Product_name_new_code == null) ? 0 : Product_name_new_code
						.hashCode());
		result = prime
				* result
				+ ((Product_name_new_id == null) ? 0 : Product_name_new_id
						.hashCode());
		result = prime
				* result
				+ ((Product_name_new_name == null) ? 0 : Product_name_new_name
						.hashCode());
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
		Product_name_new other = (Product_name_new) obj;
		if (Product_name_new_bz == null) {
			if (other.Product_name_new_bz != null)
				return false;
		} else if (!Product_name_new_bz.equals(other.Product_name_new_bz))
			return false;
		if (Product_name_new_code == null) {
			if (other.Product_name_new_code != null)
				return false;
		} else if (!Product_name_new_code.equals(other.Product_name_new_code))
			return false;
		if (Product_name_new_id == null) {
			if (other.Product_name_new_id != null)
				return false;
		} else if (!Product_name_new_id.equals(other.Product_name_new_id))
			return false;
		if (Product_name_new_name == null) {
			if (other.Product_name_new_name != null)
				return false;
		} else if (!Product_name_new_name.equals(other.Product_name_new_name))
			return false;
		return true;
	}

	public String getProduct_name_new_id() {
		return Product_name_new_id;
	}

	public void setProduct_name_new_id(String product_name_new_id) {
		Product_name_new_id = product_name_new_id;
	}

	public String getProduct_name_new_code() {
		return Product_name_new_code;
	}

	public void setProduct_name_new_code(String product_name_new_code) {
		Product_name_new_code = product_name_new_code;
	}

	public String getProduct_name_new_name() {
		return Product_name_new_name;
	}

	public void setProduct_name_new_name(String product_name_new_name) {
		Product_name_new_name = product_name_new_name;
	}

	public String getProduct_name_new_bz() {
		return Product_name_new_bz;
	}

	public void setProduct_name_new_bz(String product_name_new_bz) {
		Product_name_new_bz = product_name_new_bz;
	}

	public int compareTo(Product_name_new o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
