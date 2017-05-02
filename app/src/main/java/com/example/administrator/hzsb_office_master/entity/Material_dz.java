package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 下单信息类
 */
public class Material_dz implements Serializable, Cloneable,
		Comparable<Material_dz> {

	String Material_dz_name;// 产品名称
	int Material_dz_id;// 序号
	String Material_dz_code;// 物料代码
	String Material_dz_partsName;// 零件名称
	String Material_dz_model;// 型号
	String Material_dz_specifications;// 规格
	String Material_dz_department;// 所属部门
	int Material_dz_needNumber;// 所需数量
	int Material_dz_projectNumber;// 项目套数
	int Material_dz_allNumber;// 合计数量
	int Material_dz_inventoryNumber;// 库存数量
	String Material_dz_bz;// 备注
	String Material_dz_nowstate;// 当前状态
	int Material_dz_inStockNumber;// 有货判断数量
	int Material_dz_remindNumber;// 提醒判断数量
	int Material_dz_outStockNumber;// 缺货判断数量
	int Material_dz_emergency_number;// 紧急判断数量

	public Material_dz() {
	}

	public Material_dz(String material_dz_name, int material_dz_id,
			String material_dz_code, String material_dz_partsName,
			String material_dz_model, String material_dz_specifications,
			String material_dz_department, int material_dz_needNumber,
			int material_dz_projectNumber, int material_dz_allNumber,
			int material_dz_inventoryNumber, String material_dz_bz,
			String material_dz_nowstate, int material_dz_inStockNumber,
			int material_dz_remindNumber, int material_dz_outStockNumber,
			int material_dz_emergency_number) {
		super();
		this.setMaterial_dz_name(material_dz_name);
		this.setMaterial_dz_id(material_dz_id);
		this.setMaterial_dz_code(material_dz_code);
		this.setMaterial_dz_partsName(material_dz_partsName);
		this.setMaterial_dz_model(material_dz_model);
		this.setMaterial_dz_specifications(material_dz_specifications);
		this.setMaterial_dz_department(material_dz_department);
		this.setMaterial_dz_needNumber(material_dz_needNumber);
		this.setMaterial_dz_projectNumber(material_dz_projectNumber);
		this.setMaterial_dz_allNumber(material_dz_allNumber);
		this.setMaterial_dz_inventoryNumber(material_dz_inventoryNumber);
		this.setMaterial_dz_bz(material_dz_bz);
		this.setMaterial_dz_nowstate(material_dz_nowstate);
		this.setMaterial_dz_inStockNumber(material_dz_inStockNumber);
		this.setMaterial_dz_remindNumber(material_dz_remindNumber);
		this.setMaterial_dz_outStockNumber(material_dz_outStockNumber);
		this.setMaterial_dz_emergency_number(material_dz_emergency_number);
	}

	public String getMaterial_dz_name() {
		return Material_dz_name;
	}

	public void setMaterial_dz_name(String material_dz_name) {
		Material_dz_name = material_dz_name;
	}

	public int getMaterial_dz_id() {
		return Material_dz_id;
	}

	public void setMaterial_dz_id(int material_dz_id) {
		Material_dz_id = material_dz_id;
	}

	public String getMaterial_dz_code() {
		return Material_dz_code;
	}

	public void setMaterial_dz_code(String material_dz_code) {
		Material_dz_code = material_dz_code;
	}

	public String getMaterial_dz_partsName() {
		return Material_dz_partsName;
	}

	public void setMaterial_dz_partsName(String material_dz_partsName) {
		Material_dz_partsName = material_dz_partsName;
	}

	public String getMaterial_dz_model() {
		return Material_dz_model;
	}

	public void setMaterial_dz_model(String material_dz_model) {
		Material_dz_model = material_dz_model;
	}

	public String getMaterial_dz_specifications() {
		return Material_dz_specifications;
	}

	public void setMaterial_dz_specifications(String material_dz_specifications) {
		Material_dz_specifications = material_dz_specifications;
	}

	public String getMaterial_dz_department() {
		return Material_dz_department;
	}

	public void setMaterial_dz_department(String material_dz_department) {
		Material_dz_department = material_dz_department;
	}

	public int getMaterial_dz_needNumber() {
		return Material_dz_needNumber;
	}

	public void setMaterial_dz_needNumber(int material_dz_needNumber) {
		Material_dz_needNumber = material_dz_needNumber;
	}

	public int getMaterial_dz_projectNumber() {
		return Material_dz_projectNumber;
	}

	public void setMaterial_dz_projectNumber(int material_dz_projectNumber) {
		Material_dz_projectNumber = material_dz_projectNumber;
	}

	public int getMaterial_dz_allNumber() {
		return Material_dz_allNumber;
	}

	public void setMaterial_dz_allNumber(int material_dz_allNumber) {
		Material_dz_allNumber = material_dz_allNumber;
	}

	public int getMaterial_dz_inventoryNumber() {
		return Material_dz_inventoryNumber;
	}

	public void setMaterial_dz_inventoryNumber(int material_dz_inventoryNumber) {
		Material_dz_inventoryNumber = material_dz_inventoryNumber;
	}

	public String getMaterial_dz_bz() {
		return Material_dz_bz;
	}

	public void setMaterial_dz_bz(String material_dz_bz) {
		Material_dz_bz = material_dz_bz;
	}

	public String getMaterial_dz_nowstate() {
		return Material_dz_nowstate;
	}

	public void setMaterial_dz_nowstate(String material_dz_nowstate) {
		Material_dz_nowstate = material_dz_nowstate;
	}

	public int getMaterial_dz_inStockNumber() {
		return Material_dz_inStockNumber;
	}

	public void setMaterial_dz_inStockNumber(int material_dz_inStockNumber) {
		Material_dz_inStockNumber = material_dz_inStockNumber;
	}

	public int getMaterial_dz_remindNumber() {
		return Material_dz_remindNumber;
	}

	public void setMaterial_dz_remindNumber(int material_dz_remindNumber) {
		Material_dz_remindNumber = material_dz_remindNumber;
	}

	public int getMaterial_dz_outStockNumber() {
		return Material_dz_outStockNumber;
	}

	public void setMaterial_dz_outStockNumber(int material_dz_outStockNumber) {
		Material_dz_outStockNumber = material_dz_outStockNumber;
	}

	public int getMaterial_dz_emergency_number() {
		return Material_dz_emergency_number;
	}

	public void setMaterial_dz_emergency_number(int material_dz_emergency_number) {
		Material_dz_emergency_number = material_dz_emergency_number;
	}

	@Override
	public String toString() {
		return "Material_dz [Material_dz_name=" + Material_dz_name
				+ ", Material_dz_id=" + Material_dz_id + ", Material_dz_code="
				+ Material_dz_code + ", Material_dz_partsName="
				+ Material_dz_partsName + ", Material_dz_model="
				+ Material_dz_model + ", Material_dz_specifications="
				+ Material_dz_specifications + ", Material_dz_department="
				+ Material_dz_department + ", Material_dz_needNumber="
				+ Material_dz_needNumber + ", Material_dz_projectNumber="
				+ Material_dz_projectNumber + ", Material_dz_allNumber="
				+ Material_dz_allNumber + ", Material_dz_inventoryNumber="
				+ Material_dz_inventoryNumber + ", Material_dz_bz="
				+ Material_dz_bz + ", Material_dz_nowstate="
				+ Material_dz_nowstate + ", Material_dz_inStockNumber="
				+ Material_dz_inStockNumber + ", Material_dz_remindNumber="
				+ Material_dz_remindNumber + ", Material_dz_outStockNumber="
				+ Material_dz_outStockNumber
				+ ", Material_dz_emergency_number="
				+ Material_dz_emergency_number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Material_dz_allNumber;
		result = prime * result
				+ ((Material_dz_bz == null) ? 0 : Material_dz_bz.hashCode());
		result = prime
				* result
				+ ((Material_dz_code == null) ? 0 : Material_dz_code.hashCode());
		result = prime
				* result
				+ ((Material_dz_department == null) ? 0
						: Material_dz_department.hashCode());
		result = prime * result + Material_dz_emergency_number;
		result = prime * result + Material_dz_id;
		result = prime * result + Material_dz_inStockNumber;
		result = prime * result + Material_dz_inventoryNumber;
		result = prime
				* result
				+ ((Material_dz_model == null) ? 0 : Material_dz_model
						.hashCode());
		result = prime
				* result
				+ ((Material_dz_name == null) ? 0 : Material_dz_name.hashCode());
		result = prime * result + Material_dz_needNumber;
		result = prime
				* result
				+ ((Material_dz_nowstate == null) ? 0 : Material_dz_nowstate
						.hashCode());
		result = prime * result + Material_dz_outStockNumber;
		result = prime
				* result
				+ ((Material_dz_partsName == null) ? 0 : Material_dz_partsName
						.hashCode());
		result = prime * result + Material_dz_projectNumber;
		result = prime * result + Material_dz_remindNumber;
		result = prime
				* result
				+ ((Material_dz_specifications == null) ? 0
						: Material_dz_specifications.hashCode());
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
		Material_dz other = (Material_dz) obj;
		if (Material_dz_allNumber != other.Material_dz_allNumber)
			return false;
		if (Material_dz_bz == null) {
			if (other.Material_dz_bz != null)
				return false;
		} else if (!Material_dz_bz.equals(other.Material_dz_bz))
			return false;
		if (Material_dz_code == null) {
			if (other.Material_dz_code != null)
				return false;
		} else if (!Material_dz_code.equals(other.Material_dz_code))
			return false;
		if (Material_dz_department == null) {
			if (other.Material_dz_department != null)
				return false;
		} else if (!Material_dz_department.equals(other.Material_dz_department))
			return false;
		if (Material_dz_emergency_number != other.Material_dz_emergency_number)
			return false;
		if (Material_dz_id != other.Material_dz_id)
			return false;
		if (Material_dz_inStockNumber != other.Material_dz_inStockNumber)
			return false;
		if (Material_dz_inventoryNumber != other.Material_dz_inventoryNumber)
			return false;
		if (Material_dz_model == null) {
			if (other.Material_dz_model != null)
				return false;
		} else if (!Material_dz_model.equals(other.Material_dz_model))
			return false;
		if (Material_dz_name == null) {
			if (other.Material_dz_name != null)
				return false;
		} else if (!Material_dz_name.equals(other.Material_dz_name))
			return false;
		if (Material_dz_needNumber != other.Material_dz_needNumber)
			return false;
		if (Material_dz_nowstate == null) {
			if (other.Material_dz_nowstate != null)
				return false;
		} else if (!Material_dz_nowstate.equals(other.Material_dz_nowstate))
			return false;
		if (Material_dz_outStockNumber != other.Material_dz_outStockNumber)
			return false;
		if (Material_dz_partsName == null) {
			if (other.Material_dz_partsName != null)
				return false;
		} else if (!Material_dz_partsName.equals(other.Material_dz_partsName))
			return false;
		if (Material_dz_projectNumber != other.Material_dz_projectNumber)
			return false;
		if (Material_dz_remindNumber != other.Material_dz_remindNumber)
			return false;
		if (Material_dz_specifications == null) {
			if (other.Material_dz_specifications != null)
				return false;
		} else if (!Material_dz_specifications
				.equals(other.Material_dz_specifications))
			return false;
		return true;
	}

	public int compareTo(Material_dz o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
