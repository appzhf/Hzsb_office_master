package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品类型类
 */
public class Product_type implements Serializable, Cloneable,
		Comparable<Product_type> {

	String Product_type_specifications;// 规格型号

	public Product_type(String product_type_specifications) {
		super();
		this.setProduct_type_specifications(product_type_specifications);
	}

	public String getProduct_type_specifications() {
		return Product_type_specifications;
	}

	public void setProduct_type_specifications(
			String product_type_specifications) {
		Product_type_specifications = product_type_specifications;
	}

	@Override
	public String toString() {
		return "Product_type [Product_type_specifications="
				+ Product_type_specifications + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Product_type_specifications == null) ? 0
						: Product_type_specifications.hashCode());
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
		Product_type other = (Product_type) obj;
		if (Product_type_specifications == null) {
			if (other.Product_type_specifications != null)
				return false;
		} else if (!Product_type_specifications
				.equals(other.Product_type_specifications))
			return false;
		return true;
	}

	public int compareTo(Product_type o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
