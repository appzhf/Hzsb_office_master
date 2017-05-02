package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author liujiancheng 登录信息表
 */
public class Product_login implements Serializable, Cloneable,
		Comparable<Product_login> {

	String Product_login_loginName;// 登入名
	String Product_login_loginPwd;// 登入密码
	String Product_login_realName;// 真实姓名
	String Product_login_permission;// 权限
	Date Product_login_createTime;// 创建时间
	String Product_login_orderPer;// 下单权限
	String Product_login_auditPer;// 审核权限
	String Product_login_productPer;// 生产权限
	String Product_login_qualityPer;// 质检权限
	String Product_login_inStoragePer;// 入库权限
	String Product_login_outStoragePer;// 出库权限
	String Product_login_deliveryPer;// 发货权限

	public Product_login() {
		super();
	}

	public Product_login(String product_login_loginName,
			String product_login_loginPwd, String product_login_realName,
			String product_login_permission, Date product_login_createTime,
			String product_login_orderPer, String product_login_auditPer,
			String product_login_productPer, String product_login_qualityPer,
			String product_login_inStoragePer,
			String product_login_outStoragePer, String product_login_deliveryPer) {
		super();
		this.setProduct_login_loginName(product_login_loginName);
		this.setProduct_login_loginPwd(product_login_loginPwd);
		this.setProduct_login_realName(product_login_realName);
		this.setProduct_login_permission(product_login_permission);
		this.setProduct_login_createTime(product_login_createTime);
		this.setProduct_login_orderPer(product_login_orderPer);
		this.setProduct_login_auditPer(product_login_auditPer);
		this.setProduct_login_productPer(product_login_productPer);
		this.setProduct_login_qualityPer(product_login_qualityPer);
		this.setProduct_login_inStoragePer(product_login_inStoragePer);
		this.setProduct_login_outStoragePer(product_login_outStoragePer);
		this.setProduct_login_deliveryPer(product_login_deliveryPer);
	}

	public String getProduct_login_loginName() {
		return Product_login_loginName;
	}

	public void setProduct_login_loginName(String product_login_loginName) {
		Product_login_loginName = product_login_loginName;
	}

	public String getProduct_login_loginPwd() {
		return Product_login_loginPwd;
	}

	public void setProduct_login_loginPwd(String product_login_loginPwd) {
		Product_login_loginPwd = product_login_loginPwd;
	}

	public String getProduct_login_realName() {
		return Product_login_realName;
	}

	public void setProduct_login_realName(String product_login_realName) {
		Product_login_realName = product_login_realName;
	}

	public String getProduct_login_permission() {
		return Product_login_permission;
	}

	public void setProduct_login_permission(String product_login_permission) {
		Product_login_permission = product_login_permission;
	}

	public Date getProduct_login_createTime() {
		return Product_login_createTime;
	}

	public void setProduct_login_createTime(Date product_login_createTime) {
		Product_login_createTime = product_login_createTime;
	}

	public String getProduct_login_orderPer() {
		return Product_login_orderPer;
	}

	public void setProduct_login_orderPer(String product_login_orderPer) {
		Product_login_orderPer = product_login_orderPer;
	}

	public String getProduct_login_auditPer() {
		return Product_login_auditPer;
	}

	public void setProduct_login_auditPer(String product_login_auditPer) {
		Product_login_auditPer = product_login_auditPer;
	}

	public String getProduct_login_productPer() {
		return Product_login_productPer;
	}

	public void setProduct_login_productPer(String product_login_productPer) {
		Product_login_productPer = product_login_productPer;
	}

	public String getProduct_login_qualityPer() {
		return Product_login_qualityPer;
	}

	public void setProduct_login_qualityPer(String product_login_qualityPer) {
		Product_login_qualityPer = product_login_qualityPer;
	}

	public String getProduct_login_inStoragePer() {
		return Product_login_inStoragePer;
	}

	public void setProduct_login_inStoragePer(String product_login_inStoragePer) {
		Product_login_inStoragePer = product_login_inStoragePer;
	}

	public String getProduct_login_outStoragePer() {
		return Product_login_outStoragePer;
	}

	public void setProduct_login_outStoragePer(
			String product_login_outStoragePer) {
		Product_login_outStoragePer = product_login_outStoragePer;
	}

	public String getProduct_login_deliveryPer() {
		return Product_login_deliveryPer;
	}

	public void setProduct_login_deliveryPer(String product_login_deliveryPer) {
		Product_login_deliveryPer = product_login_deliveryPer;
	}

	@Override
	public String toString() {
		return "Product_login [Product_login_loginName="
				+ Product_login_loginName + ", Product_login_loginPwd="
				+ Product_login_loginPwd + ", Product_login_realName="
				+ Product_login_realName + ", Product_login_permission="
				+ Product_login_permission + ", Product_login_createTime="
				+ Product_login_createTime + ", Product_login_orderPer="
				+ Product_login_orderPer + ", Product_login_auditPer="
				+ Product_login_auditPer + ", Product_login_productPer="
				+ Product_login_productPer + ", Product_login_qualityPer="
				+ Product_login_qualityPer + ", Product_login_inStoragePer="
				+ Product_login_inStoragePer + ", Product_login_outStoragePer="
				+ Product_login_outStoragePer + ", Product_login_deliveryPer="
				+ Product_login_deliveryPer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Product_login_auditPer == null) ? 0
						: Product_login_auditPer.hashCode());
		result = prime
				* result
				+ ((Product_login_createTime == null) ? 0
						: Product_login_createTime.hashCode());
		result = prime
				* result
				+ ((Product_login_deliveryPer == null) ? 0
						: Product_login_deliveryPer.hashCode());
		result = prime
				* result
				+ ((Product_login_inStoragePer == null) ? 0
						: Product_login_inStoragePer.hashCode());
		result = prime
				* result
				+ ((Product_login_loginName == null) ? 0
						: Product_login_loginName.hashCode());
		result = prime
				* result
				+ ((Product_login_loginPwd == null) ? 0
						: Product_login_loginPwd.hashCode());
		result = prime
				* result
				+ ((Product_login_orderPer == null) ? 0
						: Product_login_orderPer.hashCode());
		result = prime
				* result
				+ ((Product_login_outStoragePer == null) ? 0
						: Product_login_outStoragePer.hashCode());
		result = prime
				* result
				+ ((Product_login_permission == null) ? 0
						: Product_login_permission.hashCode());
		result = prime
				* result
				+ ((Product_login_productPer == null) ? 0
						: Product_login_productPer.hashCode());
		result = prime
				* result
				+ ((Product_login_qualityPer == null) ? 0
						: Product_login_qualityPer.hashCode());
		result = prime
				* result
				+ ((Product_login_realName == null) ? 0
						: Product_login_realName.hashCode());
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
		Product_login other = (Product_login) obj;
		if (Product_login_auditPer == null) {
			if (other.Product_login_auditPer != null)
				return false;
		} else if (!Product_login_auditPer.equals(other.Product_login_auditPer))
			return false;
		if (Product_login_createTime == null) {
			if (other.Product_login_createTime != null)
				return false;
		} else if (!Product_login_createTime
				.equals(other.Product_login_createTime))
			return false;
		if (Product_login_deliveryPer == null) {
			if (other.Product_login_deliveryPer != null)
				return false;
		} else if (!Product_login_deliveryPer
				.equals(other.Product_login_deliveryPer))
			return false;
		if (Product_login_inStoragePer == null) {
			if (other.Product_login_inStoragePer != null)
				return false;
		} else if (!Product_login_inStoragePer
				.equals(other.Product_login_inStoragePer))
			return false;
		if (Product_login_loginName == null) {
			if (other.Product_login_loginName != null)
				return false;
		} else if (!Product_login_loginName
				.equals(other.Product_login_loginName))
			return false;
		if (Product_login_loginPwd == null) {
			if (other.Product_login_loginPwd != null)
				return false;
		} else if (!Product_login_loginPwd.equals(other.Product_login_loginPwd))
			return false;
		if (Product_login_orderPer == null) {
			if (other.Product_login_orderPer != null)
				return false;
		} else if (!Product_login_orderPer.equals(other.Product_login_orderPer))
			return false;
		if (Product_login_outStoragePer == null) {
			if (other.Product_login_outStoragePer != null)
				return false;
		} else if (!Product_login_outStoragePer
				.equals(other.Product_login_outStoragePer))
			return false;
		if (Product_login_permission == null) {
			if (other.Product_login_permission != null)
				return false;
		} else if (!Product_login_permission
				.equals(other.Product_login_permission))
			return false;
		if (Product_login_productPer == null) {
			if (other.Product_login_productPer != null)
				return false;
		} else if (!Product_login_productPer
				.equals(other.Product_login_productPer))
			return false;
		if (Product_login_qualityPer == null) {
			if (other.Product_login_qualityPer != null)
				return false;
		} else if (!Product_login_qualityPer
				.equals(other.Product_login_qualityPer))
			return false;
		if (Product_login_realName == null) {
			if (other.Product_login_realName != null)
				return false;
		} else if (!Product_login_realName.equals(other.Product_login_realName))
			return false;
		return true;
	}

	public int compareTo(Product_login o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
