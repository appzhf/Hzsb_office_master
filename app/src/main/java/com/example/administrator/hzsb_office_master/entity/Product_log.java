package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 操作信息日志
 */
public class Product_log implements Serializable, Cloneable,
		Comparable<Product_log> {
	String Product_log_operationUser;// 操作人
	String Product_log_operationTime;// 操作时间
	String Product_log_operationContent;// 操作内容
	String Product_log_operationNature;// 操作性质
	String Product_log_orderId;// 下单编号
	String Product_log_productName;// 产品名称
	String Product_log_specifications;// 规格型号
	String Product_log_otherRequire;// 其他要求
	int Product_log_number;// 数量
	String Product_log_bz;// 备注

	public Product_log() {
		super();
	}

	public Product_log(String product_log_operationUser,
			String product_log_operationTime,
			String product_log_operationContent,
			String product_log_operationNature, String product_log_orderId,
			String product_log_productName, String product_log_specifications,
			String product_log_otherRequire, int product_log_number,
			String product_log_bz) {
		super();
		this.setProduct_log_operationUser(product_log_operationUser);
		this.setProduct_log_operationTime(product_log_operationTime);
		this.setProduct_log_operationContent(product_log_operationContent);
		this.setProduct_log_operationNature(product_log_operationNature);
		this.setProduct_log_orderId(product_log_orderId);
		this.setProduct_log_productName(product_log_productName);
		this.setProduct_log_specifications(product_log_specifications);
		this.setProduct_log_otherRequire(product_log_otherRequire);
		this.setProduct_log_number(product_log_number);
		this.setProduct_log_bz(product_log_bz);
	}

	public String getProduct_log_operationUser() {
		return Product_log_operationUser;
	}

	public void setProduct_log_operationUser(String product_log_operationUser) {
		Product_log_operationUser = product_log_operationUser;
	}

	public String getProduct_log_operationTime() {
		return Product_log_operationTime;
	}

	public void setProduct_log_operationTime(String product_log_operationTime) {
		Product_log_operationTime = product_log_operationTime;
	}

	public String getProduct_log_operationContent() {
		return Product_log_operationContent;
	}

	public void setProduct_log_operationContent(
			String product_log_operationContent) {
		Product_log_operationContent = product_log_operationContent;
	}

	public String getProduct_log_operationNature() {
		return Product_log_operationNature;
	}

	public void setProduct_log_operationNature(
			String product_log_operationNature) {
		Product_log_operationNature = product_log_operationNature;
	}

	public String getProduct_log_orderId() {
		return Product_log_orderId;
	}

	public void setProduct_log_orderId(String product_log_orderId) {
		Product_log_orderId = product_log_orderId;
	}

	public String getProduct_log_productName() {
		return Product_log_productName;
	}

	public void setProduct_log_productName(String product_log_productName) {
		Product_log_productName = product_log_productName;
	}

	public String getProduct_log_specifications() {
		return Product_log_specifications;
	}

	public void setProduct_log_specifications(String product_log_specifications) {
		Product_log_specifications = product_log_specifications;
	}

	public String getProduct_log_otherRequire() {
		return Product_log_otherRequire;
	}

	public void setProduct_log_otherRequire(String product_log_otherRequire) {
		Product_log_otherRequire = product_log_otherRequire;
	}

	public int getProduct_log_number() {
		return Product_log_number;
	}

	public void setProduct_log_number(int product_log_number) {
		Product_log_number = product_log_number;
	}

	public String getProduct_log_bz() {
		return Product_log_bz;
	}

	public void setProduct_log_bz(String product_log_bz) {
		Product_log_bz = product_log_bz;
	}

	@Override
	public String toString() {
		return "Product_log [Product_log_operationUser="
				+ Product_log_operationUser + ", Product_log_operationTime="
				+ Product_log_operationTime + ", Product_log_operationContent="
				+ Product_log_operationContent
				+ ", Product_log_operationNature="
				+ Product_log_operationNature + ", Product_log_orderId="
				+ Product_log_orderId + ", Product_log_productName="
				+ Product_log_productName + ", Product_log_specifications="
				+ Product_log_specifications + ", Product_log_otherRequire="
				+ Product_log_otherRequire + ", Product_log_number="
				+ Product_log_number + ", Product_log_bz=" + Product_log_bz
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Product_log_bz == null) ? 0 : Product_log_bz.hashCode());
		result = prime * result + Product_log_number;
		result = prime
				* result
				+ ((Product_log_operationContent == null) ? 0
						: Product_log_operationContent.hashCode());
		result = prime
				* result
				+ ((Product_log_operationNature == null) ? 0
						: Product_log_operationNature.hashCode());
		result = prime
				* result
				+ ((Product_log_operationTime == null) ? 0
						: Product_log_operationTime.hashCode());
		result = prime
				* result
				+ ((Product_log_operationUser == null) ? 0
						: Product_log_operationUser.hashCode());
		result = prime
				* result
				+ ((Product_log_orderId == null) ? 0 : Product_log_orderId
						.hashCode());
		result = prime
				* result
				+ ((Product_log_otherRequire == null) ? 0
						: Product_log_otherRequire.hashCode());
		result = prime
				* result
				+ ((Product_log_productName == null) ? 0
						: Product_log_productName.hashCode());
		result = prime
				* result
				+ ((Product_log_specifications == null) ? 0
						: Product_log_specifications.hashCode());
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
		Product_log other = (Product_log) obj;
		if (Product_log_bz == null) {
			if (other.Product_log_bz != null)
				return false;
		} else if (!Product_log_bz.equals(other.Product_log_bz))
			return false;
		if (Product_log_number != other.Product_log_number)
			return false;
		if (Product_log_operationContent == null) {
			if (other.Product_log_operationContent != null)
				return false;
		} else if (!Product_log_operationContent
				.equals(other.Product_log_operationContent))
			return false;
		if (Product_log_operationNature == null) {
			if (other.Product_log_operationNature != null)
				return false;
		} else if (!Product_log_operationNature
				.equals(other.Product_log_operationNature))
			return false;
		if (Product_log_operationTime == null) {
			if (other.Product_log_operationTime != null)
				return false;
		} else if (!Product_log_operationTime
				.equals(other.Product_log_operationTime))
			return false;
		if (Product_log_operationUser == null) {
			if (other.Product_log_operationUser != null)
				return false;
		} else if (!Product_log_operationUser
				.equals(other.Product_log_operationUser))
			return false;
		if (Product_log_orderId == null) {
			if (other.Product_log_orderId != null)
				return false;
		} else if (!Product_log_orderId.equals(other.Product_log_orderId))
			return false;
		if (Product_log_otherRequire == null) {
			if (other.Product_log_otherRequire != null)
				return false;
		} else if (!Product_log_otherRequire
				.equals(other.Product_log_otherRequire))
			return false;
		if (Product_log_productName == null) {
			if (other.Product_log_productName != null)
				return false;
		} else if (!Product_log_productName
				.equals(other.Product_log_productName))
			return false;
		if (Product_log_specifications == null) {
			if (other.Product_log_specifications != null)
				return false;
		} else if (!Product_log_specifications
				.equals(other.Product_log_specifications))
			return false;
		return true;
	}

	public int compareTo(Product_log o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
