package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 计量信息类
 */
public class Permit_info implements Serializable, Cloneable,
		Comparable<Permit_info> {

	String Permit_info_moudel;// 型号
	String Permit_info_name;// 计量器具名称
	String Permit_info_specifications;// 规格
	String Permit_info_accuracy;// 准确度
	String Permit_info_level;// 相关等级
	String Permit_info_bz;// 备注

	public Permit_info() {
		super();
	}

	public Permit_info(String permit_info_moudel, String permit_info_name,
			String permit_info_specifications, String permit_info_accuracy,
			String permit_info_level, String permit_info_bz) {
		super();
		this.setPermit_info_moudel(permit_info_moudel);
		this.setPermit_info_name(permit_info_name);
		this.setPermit_info_specifications(permit_info_specifications);
		this.setPermit_info_accuracy(permit_info_accuracy);
		this.setPermit_info_level(permit_info_level);
		this.setPermit_info_bz(permit_info_bz);
	}

	public String getPermit_info_moudel() {
		return Permit_info_moudel;
	}

	public void setPermit_info_moudel(String permit_info_moudel) {
		Permit_info_moudel = permit_info_moudel;
	}

	public String getPermit_info_name() {
		return Permit_info_name;
	}

	public void setPermit_info_name(String permit_info_name) {
		Permit_info_name = permit_info_name;
	}

	public String getPermit_info_specifications() {
		return Permit_info_specifications;
	}

	public void setPermit_info_specifications(String permit_info_specifications) {
		Permit_info_specifications = permit_info_specifications;
	}

	public String getPermit_info_accuracy() {
		return Permit_info_accuracy;
	}

	public void setPermit_info_accuracy(String permit_info_accuracy) {
		Permit_info_accuracy = permit_info_accuracy;
	}

	public String getPermit_info_level() {
		return Permit_info_level;
	}

	public void setPermit_info_level(String permit_info_level) {
		Permit_info_level = permit_info_level;
	}

	public String getPermit_info_bz() {
		return Permit_info_bz;
	}

	public void setPermit_info_bz(String permit_info_bz) {
		Permit_info_bz = permit_info_bz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Permit_info_accuracy == null) ? 0 : Permit_info_accuracy
						.hashCode());
		result = prime * result
				+ ((Permit_info_bz == null) ? 0 : Permit_info_bz.hashCode());
		result = prime
				* result
				+ ((Permit_info_level == null) ? 0 : Permit_info_level
						.hashCode());
		result = prime
				* result
				+ ((Permit_info_moudel == null) ? 0 : Permit_info_moudel
						.hashCode());
		result = prime
				* result
				+ ((Permit_info_name == null) ? 0 : Permit_info_name.hashCode());
		result = prime
				* result
				+ ((Permit_info_specifications == null) ? 0
						: Permit_info_specifications.hashCode());
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
		Permit_info other = (Permit_info) obj;
		if (Permit_info_accuracy == null) {
			if (other.Permit_info_accuracy != null)
				return false;
		} else if (!Permit_info_accuracy.equals(other.Permit_info_accuracy))
			return false;
		if (Permit_info_bz == null) {
			if (other.Permit_info_bz != null)
				return false;
		} else if (!Permit_info_bz.equals(other.Permit_info_bz))
			return false;
		if (Permit_info_level == null) {
			if (other.Permit_info_level != null)
				return false;
		} else if (!Permit_info_level.equals(other.Permit_info_level))
			return false;
		if (Permit_info_moudel == null) {
			if (other.Permit_info_moudel != null)
				return false;
		} else if (!Permit_info_moudel.equals(other.Permit_info_moudel))
			return false;
		if (Permit_info_name == null) {
			if (other.Permit_info_name != null)
				return false;
		} else if (!Permit_info_name.equals(other.Permit_info_name))
			return false;
		if (Permit_info_specifications == null) {
			if (other.Permit_info_specifications != null)
				return false;
		} else if (!Permit_info_specifications
				.equals(other.Permit_info_specifications))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Permit_info [Permit_info_moudel=" + Permit_info_moudel
				+ ", Permit_info_name=" + Permit_info_name
				+ ", Permit_info_specifications=" + Permit_info_specifications
				+ ", Permit_info_accuracy=" + Permit_info_accuracy
				+ ", Permit_info_level=" + Permit_info_level
				+ ", Permit_info_bz=" + Permit_info_bz + "]";
	}

	public int compareTo(Permit_info o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
