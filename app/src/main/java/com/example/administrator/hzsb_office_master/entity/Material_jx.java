package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng
 * 
 */
public class Material_jx implements Serializable, Cloneable,
		Comparable<Material_jx> {
	String Material_jx_productName;// 产品名称
	int Material_jx_id;// 序号
	String Material_jx_code;// 物料代码
	String Material_jx_name;// 零件名称
	String Material_jx_parts;// 所属部门
	String Material_jx_material;// 材料
	String Material_jx_weight;// 单件重量
	int Material_jx_needNumber;// 所需数量
	int Material_jx_projectNumber;// 项目套数
	int Material_jx_allNumber;// 合计数量
	int Material_jx_inventoryNumber;// 库存数量
	String Material_jx_bz;// 备注
	String Material_jx_nowState;// 当前状态
	int Material_jx_inStockNumber;// 有货判断数量
	int Material_jx_remindNumber;// 提醒判断数量
	int Material_jx_outStockNumber;// 缺货判断数量
	int Material_jx_emergencyNumber;// 紧急判断数量

	public Material_jx() {
	}

	public Material_jx(String material_jx_productName, int material_jx_id,
			String material_jx_code, String material_jx_name,
			String material_jx_parts, String material_jx_material,
			String material_jx_weight, int material_jx_needNumber,
			int material_jx_projectNumber, int material_jx_allNumber,
			int material_jx_inventoryNumber, String material_jx_bz,
			String material_jx_nowState, int material_jx_inStockNumber,
			int material_jx_remindNumber, int material_jx_outStockNumber,
			int material_jx_emergencyNumber) {
		super();
		this.setMaterial_jx_productName(material_jx_productName);
		this.setMaterial_jx_id(material_jx_id);
		this.setMaterial_jx_code(material_jx_code);
		this.setMaterial_jx_name(material_jx_name);
		this.setMaterial_jx_parts(material_jx_parts);
		this.setMaterial_jx_material(material_jx_material);
		this.setMaterial_jx_weight(material_jx_weight);
		this.setMaterial_jx_needNumber(material_jx_needNumber);
		this.setMaterial_jx_projectNumber(material_jx_projectNumber);
		this.setMaterial_jx_allNumber(material_jx_allNumber);
		this.setMaterial_jx_inventoryNumber(material_jx_inventoryNumber);
		this.setMaterial_jx_bz(material_jx_bz);
		this.setMaterial_jx_nowState(material_jx_nowState);
		this.setMaterial_jx_inStockNumber(material_jx_inStockNumber);
		this.setMaterial_jx_remindNumber(material_jx_remindNumber);
		this.setMaterial_jx_outStockNumber(material_jx_outStockNumber);
		this.setMaterial_jx_emergencyNumber(material_jx_emergencyNumber);
	}

	@Override
	public String toString() {
		return "Material_jx [Material_jx_productName="
				+ Material_jx_productName + ", Material_jx_id="
				+ Material_jx_id + ", Material_jx_code=" + Material_jx_code
				+ ", Material_jx_name=" + Material_jx_name
				+ ", Material_jx_parts=" + Material_jx_parts
				+ ", Material_jx_material=" + Material_jx_material
				+ ", Material_jx_weight=" + Material_jx_weight
				+ ", Material_jx_needNumber=" + Material_jx_needNumber
				+ ", Material_jx_projectNumber=" + Material_jx_projectNumber
				+ ", Material_jx_allNumber=" + Material_jx_allNumber
				+ ", Material_jx_inventoryNumber="
				+ Material_jx_inventoryNumber + ", Material_jx_bz="
				+ Material_jx_bz + ", Material_jx_nowState="
				+ Material_jx_nowState + ", Material_jx_inStockNumber="
				+ Material_jx_inStockNumber + ", Material_jx_remindNumber="
				+ Material_jx_remindNumber + ", Material_jx_outStockNumber="
				+ Material_jx_outStockNumber + ", Material_jx_emergencyNumber="
				+ Material_jx_emergencyNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Material_jx_allNumber;
		result = prime * result
				+ ((Material_jx_bz == null) ? 0 : Material_jx_bz.hashCode());
		result = prime
				* result
				+ ((Material_jx_code == null) ? 0 : Material_jx_code.hashCode());
		result = prime * result + Material_jx_emergencyNumber;
		result = prime * result + Material_jx_id;
		result = prime * result + Material_jx_inStockNumber;
		result = prime * result + Material_jx_inventoryNumber;
		result = prime
				* result
				+ ((Material_jx_material == null) ? 0 : Material_jx_material
						.hashCode());
		result = prime
				* result
				+ ((Material_jx_name == null) ? 0 : Material_jx_name.hashCode());
		result = prime * result + Material_jx_needNumber;
		result = prime
				* result
				+ ((Material_jx_nowState == null) ? 0 : Material_jx_nowState
						.hashCode());
		result = prime * result + Material_jx_outStockNumber;
		result = prime
				* result
				+ ((Material_jx_parts == null) ? 0 : Material_jx_parts
						.hashCode());
		result = prime
				* result
				+ ((Material_jx_productName == null) ? 0
						: Material_jx_productName.hashCode());
		result = prime * result + Material_jx_projectNumber;
		result = prime * result + Material_jx_remindNumber;
		result = prime
				* result
				+ ((Material_jx_weight == null) ? 0 : Material_jx_weight
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
		Material_jx other = (Material_jx) obj;
		if (Material_jx_allNumber != other.Material_jx_allNumber)
			return false;
		if (Material_jx_bz == null) {
			if (other.Material_jx_bz != null)
				return false;
		} else if (!Material_jx_bz.equals(other.Material_jx_bz))
			return false;
		if (Material_jx_code == null) {
			if (other.Material_jx_code != null)
				return false;
		} else if (!Material_jx_code.equals(other.Material_jx_code))
			return false;
		if (Material_jx_emergencyNumber != other.Material_jx_emergencyNumber)
			return false;
		if (Material_jx_id != other.Material_jx_id)
			return false;
		if (Material_jx_inStockNumber != other.Material_jx_inStockNumber)
			return false;
		if (Material_jx_inventoryNumber != other.Material_jx_inventoryNumber)
			return false;
		if (Material_jx_material == null) {
			if (other.Material_jx_material != null)
				return false;
		} else if (!Material_jx_material.equals(other.Material_jx_material))
			return false;
		if (Material_jx_name == null) {
			if (other.Material_jx_name != null)
				return false;
		} else if (!Material_jx_name.equals(other.Material_jx_name))
			return false;
		if (Material_jx_needNumber != other.Material_jx_needNumber)
			return false;
		if (Material_jx_nowState == null) {
			if (other.Material_jx_nowState != null)
				return false;
		} else if (!Material_jx_nowState.equals(other.Material_jx_nowState))
			return false;
		if (Material_jx_outStockNumber != other.Material_jx_outStockNumber)
			return false;
		if (Material_jx_parts == null) {
			if (other.Material_jx_parts != null)
				return false;
		} else if (!Material_jx_parts.equals(other.Material_jx_parts))
			return false;
		if (Material_jx_productName == null) {
			if (other.Material_jx_productName != null)
				return false;
		} else if (!Material_jx_productName
				.equals(other.Material_jx_productName))
			return false;
		if (Material_jx_projectNumber != other.Material_jx_projectNumber)
			return false;
		if (Material_jx_remindNumber != other.Material_jx_remindNumber)
			return false;
		if (Material_jx_weight == null) {
			if (other.Material_jx_weight != null)
				return false;
		} else if (!Material_jx_weight.equals(other.Material_jx_weight))
			return false;
		return true;
	}

	public String getMaterial_jx_productName() {
		return Material_jx_productName;
	}

	public void setMaterial_jx_productName(String material_jx_productName) {
		Material_jx_productName = material_jx_productName;
	}

	public int getMaterial_jx_id() {
		return Material_jx_id;
	}

	public void setMaterial_jx_id(int material_jx_id) {
		Material_jx_id = material_jx_id;
	}

	public String getMaterial_jx_code() {
		return Material_jx_code;
	}

	public void setMaterial_jx_code(String material_jx_code) {
		Material_jx_code = material_jx_code;
	}

	public String getMaterial_jx_name() {
		return Material_jx_name;
	}

	public void setMaterial_jx_name(String material_jx_name) {
		Material_jx_name = material_jx_name;
	}

	public String getMaterial_jx_parts() {
		return Material_jx_parts;
	}

	public void setMaterial_jx_parts(String material_jx_parts) {
		Material_jx_parts = material_jx_parts;
	}

	public String getMaterial_jx_material() {
		return Material_jx_material;
	}

	public void setMaterial_jx_material(String material_jx_material) {
		Material_jx_material = material_jx_material;
	}

	public String getMaterial_jx_weight() {
		return Material_jx_weight;
	}

	public void setMaterial_jx_weight(String material_jx_weight) {
		Material_jx_weight = material_jx_weight;
	}

	public int getMaterial_jx_needNumber() {
		return Material_jx_needNumber;
	}

	public void setMaterial_jx_needNumber(int material_jx_needNumber) {
		Material_jx_needNumber = material_jx_needNumber;
	}

	public int getMaterial_jx_projectNumber() {
		return Material_jx_projectNumber;
	}

	public void setMaterial_jx_projectNumber(int material_jx_projectNumber) {
		Material_jx_projectNumber = material_jx_projectNumber;
	}

	public int getMaterial_jx_allNumber() {
		return Material_jx_allNumber;
	}

	public void setMaterial_jx_allNumber(int material_jx_allNumber) {
		Material_jx_allNumber = material_jx_allNumber;
	}

	public int getMaterial_jx_inventoryNumber() {
		return Material_jx_inventoryNumber;
	}

	public void setMaterial_jx_inventoryNumber(int material_jx_inventoryNumber) {
		Material_jx_inventoryNumber = material_jx_inventoryNumber;
	}

	public String getMaterial_jx_bz() {
		return Material_jx_bz;
	}

	public void setMaterial_jx_bz(String material_jx_bz) {
		Material_jx_bz = material_jx_bz;
	}

	public String getMaterial_jx_nowState() {
		return Material_jx_nowState;
	}

	public void setMaterial_jx_nowState(String material_jx_nowState) {
		Material_jx_nowState = material_jx_nowState;
	}

	public int getMaterial_jx_inStockNumber() {
		return Material_jx_inStockNumber;
	}

	public void setMaterial_jx_inStockNumber(int material_jx_inStockNumber) {
		Material_jx_inStockNumber = material_jx_inStockNumber;
	}

	public int getMaterial_jx_remindNumber() {
		return Material_jx_remindNumber;
	}

	public void setMaterial_jx_remindNumber(int material_jx_remindNumber) {
		Material_jx_remindNumber = material_jx_remindNumber;
	}

	public int getMaterial_jx_outStockNumber() {
		return Material_jx_outStockNumber;
	}

	public void setMaterial_jx_outStockNumber(int material_jx_outStockNumber) {
		Material_jx_outStockNumber = material_jx_outStockNumber;
	}

	public int getMaterial_jx_emergencyNumber() {
		return Material_jx_emergencyNumber;
	}

	public void setMaterial_jx_emergencyNumber(int material_jx_emergencyNumber) {
		Material_jx_emergencyNumber = material_jx_emergencyNumber;
	}

	public int compareTo(Material_jx o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
