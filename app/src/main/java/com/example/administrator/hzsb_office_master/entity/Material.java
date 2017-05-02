package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 材料信息类
 */
public class Material implements Serializable, Cloneable, Comparable<Material> {

	int Material_id;// 户号
	String Material_products;// 所属产品
	String Material_code;// 物料代码
	String Material_name;// 物料名称
	String Material_specifications;// 规格型号
	String Material_suppliers;// 供应商
	String Material_store_address;// 存放仓库位置
	int Material_need_number;// 所需数量
	int Material_project_number;// 项目套数
	int Material_all_number;// 合计数量
	int Material_inventory_number;// 库存数量
	String Material_attribute;// 属性
	String Material_bz;// 备注
	String Material_now_state;// 当前状态
	int Material_inStock_number;// 有货判断数量
	int Material_remind_number;// 提醒判断数量
	int Material_outStock_number;// 缺货判断数量
	int Material_emergency_number;// 紧急判断数量
	String Material_isSelected;// 是否选中

	public Material() {
	}

	public Material(int material_id, String material_products,
			String material_code, String material_name,
			String material_specifications, String material_suppliers,
			String material_store_address, int material_need_number,
			int material_project_number, int material_all_number,
			int material_inventory_number, String material_attribute,
			String material_bz, String material_now_state,
			int material_inStock_number, int material_remind_number,
			int material_outStock_number, int material_emergency_number,
			String material_isSelected) {
		super();
		this.setMaterial_id(material_id);
		this.setMaterial_products(material_products);
		this.setMaterial_code(material_code);
		this.setMaterial_name(material_name);
		this.setMaterial_specifications(material_specifications);
		this.setMaterial_suppliers(material_suppliers);
		this.setMaterial_store_address(material_store_address);
		this.setMaterial_need_number(material_need_number);
		this.setMaterial_project_number(material_project_number);
		this.setMaterial_all_number(material_all_number);
		this.setMaterial_inventory_number(material_inventory_number);
		this.setMaterial_attribute(material_attribute);
		this.setMaterial_bz(material_bz);
		this.setMaterial_now_state(material_now_state);
		this.setMaterial_inStock_number(material_inStock_number);
		this.setMaterial_remind_number(material_remind_number);
		this.setMaterial_outStock_number(material_outStock_number);
		this.setMaterial_emergency_number(material_emergency_number);
		this.setMaterial_isSelected(material_isSelected);
	}

	public int getMaterial_id() {
		return Material_id;
	}

	public void setMaterial_id(int material_id) {
		Material_id = material_id;
	}

	public String getMaterial_products() {
		return Material_products;
	}

	public void setMaterial_products(String material_products) {
		Material_products = material_products;
	}

	public String getMaterial_code() {
		return Material_code;
	}

	public void setMaterial_code(String material_code) {
		Material_code = material_code;
	}

	public String getMaterial_name() {
		return Material_name;
	}

	public void setMaterial_name(String material_name) {
		Material_name = material_name;
	}

	public String getMaterial_specifications() {
		return Material_specifications;
	}

	public void setMaterial_specifications(String material_specifications) {
		Material_specifications = material_specifications;
	}

	public String getMaterial_suppliers() {
		return Material_suppliers;
	}

	public void setMaterial_suppliers(String material_suppliers) {
		Material_suppliers = material_suppliers;
	}

	public String getMaterial_store_address() {
		return Material_store_address;
	}

	public void setMaterial_store_address(String material_store_address) {
		Material_store_address = material_store_address;
	}

	public int getMaterial_need_number() {
		return Material_need_number;
	}

	public void setMaterial_need_number(int material_need_number) {
		Material_need_number = material_need_number;
	}

	public int getMaterial_project_number() {
		return Material_project_number;
	}

	public void setMaterial_project_number(int material_project_number) {
		Material_project_number = material_project_number;
	}

	public int getMaterial_all_number() {
		return Material_all_number;
	}

	public void setMaterial_all_number(int material_all_number) {
		Material_all_number = material_all_number;
	}

	public int getMaterial_inventory_number() {
		return Material_inventory_number;
	}

	public void setMaterial_inventory_number(int material_inventory_number) {
		Material_inventory_number = material_inventory_number;
	}

	public String getMaterial_attribute() {
		return Material_attribute;
	}

	public void setMaterial_attribute(String material_attribute) {
		Material_attribute = material_attribute;
	}

	public String getMaterial_bz() {
		return Material_bz;
	}

	public void setMaterial_bz(String material_bz) {
		Material_bz = material_bz;
	}

	public String getMaterial_now_state() {
		return Material_now_state;
	}

	public void setMaterial_now_state(String material_now_state) {
		Material_now_state = material_now_state;
	}

	public int getMaterial_inStock_number() {
		return Material_inStock_number;
	}

	public void setMaterial_inStock_number(int material_inStock_number) {
		Material_inStock_number = material_inStock_number;
	}

	public int getMaterial_remind_number() {
		return Material_remind_number;
	}

	public void setMaterial_remind_number(int material_remind_number) {
		Material_remind_number = material_remind_number;
	}

	public int getMaterial_outStock_number() {
		return Material_outStock_number;
	}

	public void setMaterial_outStock_number(int material_outStock_number) {
		Material_outStock_number = material_outStock_number;
	}

	public int getMaterial_emergency_number() {
		return Material_emergency_number;
	}

	public void setMaterial_emergency_number(int material_emergency_number) {
		Material_emergency_number = material_emergency_number;
	}

	public String getMaterial_isSelected() {
		return Material_isSelected;
	}

	public void setMaterial_isSelected(String material_isSelected) {
		Material_isSelected = material_isSelected;
	}

	@Override
	public String toString() {
		return "Material [Material_id=" + Material_id + ", Material_products="
				+ Material_products + ", Material_code=" + Material_code
				+ ", Material_name=" + Material_name
				+ ", Material_specifications=" + Material_specifications
				+ ", Material_suppliers=" + Material_suppliers
				+ ", Material_store_address=" + Material_store_address
				+ ", Material_need_number=" + Material_need_number
				+ ", Material_project_number=" + Material_project_number
				+ ", Material_all_number=" + Material_all_number
				+ ", Material_inventory_number=" + Material_inventory_number
				+ ", Material_attribute=" + Material_attribute
				+ ", Material_bz=" + Material_bz + ", Material_now_state="
				+ Material_now_state + ", Material_inStock_number="
				+ Material_inStock_number + ", Material_remind_number="
				+ Material_remind_number + ", Material_outStock_number="
				+ Material_outStock_number + ", Material_emergency_number="
				+ Material_emergency_number + ", Material_isSelected="
				+ Material_isSelected + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Material_all_number;
		result = prime
				* result
				+ ((Material_attribute == null) ? 0 : Material_attribute
						.hashCode());
		result = prime * result
				+ ((Material_bz == null) ? 0 : Material_bz.hashCode());
		result = prime * result
				+ ((Material_code == null) ? 0 : Material_code.hashCode());
		result = prime * result + Material_emergency_number;
		result = prime * result + Material_id;
		result = prime * result + Material_inStock_number;
		result = prime * result + Material_inventory_number;
		result = prime
				* result
				+ ((Material_isSelected == null) ? 0 : Material_isSelected
						.hashCode());
		result = prime * result
				+ ((Material_name == null) ? 0 : Material_name.hashCode());
		result = prime * result + Material_need_number;
		result = prime
				* result
				+ ((Material_now_state == null) ? 0 : Material_now_state
						.hashCode());
		result = prime * result + Material_outStock_number;
		result = prime
				* result
				+ ((Material_products == null) ? 0 : Material_products
						.hashCode());
		result = prime * result + Material_project_number;
		result = prime * result + Material_remind_number;
		result = prime
				* result
				+ ((Material_specifications == null) ? 0
						: Material_specifications.hashCode());
		result = prime
				* result
				+ ((Material_store_address == null) ? 0
						: Material_store_address.hashCode());
		result = prime
				* result
				+ ((Material_suppliers == null) ? 0 : Material_suppliers
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
		Material other = (Material) obj;
		if (Material_all_number != other.Material_all_number)
			return false;
		if (Material_attribute == null) {
			if (other.Material_attribute != null)
				return false;
		} else if (!Material_attribute.equals(other.Material_attribute))
			return false;
		if (Material_bz == null) {
			if (other.Material_bz != null)
				return false;
		} else if (!Material_bz.equals(other.Material_bz))
			return false;
		if (Material_code == null) {
			if (other.Material_code != null)
				return false;
		} else if (!Material_code.equals(other.Material_code))
			return false;
		if (Material_emergency_number != other.Material_emergency_number)
			return false;
		if (Material_id != other.Material_id)
			return false;
		if (Material_inStock_number != other.Material_inStock_number)
			return false;
		if (Material_inventory_number != other.Material_inventory_number)
			return false;
		if (Material_isSelected == null) {
			if (other.Material_isSelected != null)
				return false;
		} else if (!Material_isSelected.equals(other.Material_isSelected))
			return false;
		if (Material_name == null) {
			if (other.Material_name != null)
				return false;
		} else if (!Material_name.equals(other.Material_name))
			return false;
		if (Material_need_number != other.Material_need_number)
			return false;
		if (Material_now_state == null) {
			if (other.Material_now_state != null)
				return false;
		} else if (!Material_now_state.equals(other.Material_now_state))
			return false;
		if (Material_outStock_number != other.Material_outStock_number)
			return false;
		if (Material_products == null) {
			if (other.Material_products != null)
				return false;
		} else if (!Material_products.equals(other.Material_products))
			return false;
		if (Material_project_number != other.Material_project_number)
			return false;
		if (Material_remind_number != other.Material_remind_number)
			return false;
		if (Material_specifications == null) {
			if (other.Material_specifications != null)
				return false;
		} else if (!Material_specifications
				.equals(other.Material_specifications))
			return false;
		if (Material_store_address == null) {
			if (other.Material_store_address != null)
				return false;
		} else if (!Material_store_address.equals(other.Material_store_address))
			return false;
		if (Material_suppliers == null) {
			if (other.Material_suppliers != null)
				return false;
		} else if (!Material_suppliers.equals(other.Material_suppliers))
			return false;
		return true;
	}

	public int compareTo(Material o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
