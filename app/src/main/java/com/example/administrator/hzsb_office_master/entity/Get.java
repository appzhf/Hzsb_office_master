package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * @author liujiancheng 领料信息类
 */
public class Get implements Serializable, Cloneable, Comparable<Get> {
	int Get_Serial_Id;// 序号
	String Get_Pick_Id;// 领料编号
	String Get_Pick_Date;// 领料日期
	String Get_Pick_User;// 领料人
	String Get_IsPick;// 是否已领料
	String Get_Bz;// 备注

	public Get() {
	}

	public Get(int get_Serial_Id, String get_Pick_Id, String get_Pick_Date,
			String get_Pick_User, String get_IsPick, String get_Bz) {
		super();
		this.setGet_Serial_Id(get_Serial_Id);
		this.setGet_Pick_Id(get_Pick_Id);
		this.setGet_Pick_Date(get_Pick_Date);
		this.setGet_Pick_User(get_Pick_User);
		this.setGet_IsPick(get_IsPick);
		this.setGet_Bz(get_Bz);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Get_Bz == null) ? 0 : Get_Bz.hashCode());
		result = prime * result
				+ ((Get_IsPick == null) ? 0 : Get_IsPick.hashCode());
		result = prime * result
				+ ((Get_Pick_Date == null) ? 0 : Get_Pick_Date.hashCode());
		result = prime * result
				+ ((Get_Pick_Id == null) ? 0 : Get_Pick_Id.hashCode());
		result = prime * result
				+ ((Get_Pick_User == null) ? 0 : Get_Pick_User.hashCode());
		result = prime * result + Get_Serial_Id;
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
		Get other = (Get) obj;
		if (Get_Bz == null) {
			if (other.Get_Bz != null)
				return false;
		} else if (!Get_Bz.equals(other.Get_Bz))
			return false;
		if (Get_IsPick == null) {
			if (other.Get_IsPick != null)
				return false;
		} else if (!Get_IsPick.equals(other.Get_IsPick))
			return false;
		if (Get_Pick_Date == null) {
			if (other.Get_Pick_Date != null)
				return false;
		} else if (!Get_Pick_Date.equals(other.Get_Pick_Date))
			return false;
		if (Get_Pick_Id == null) {
			if (other.Get_Pick_Id != null)
				return false;
		} else if (!Get_Pick_Id.equals(other.Get_Pick_Id))
			return false;
		if (Get_Pick_User == null) {
			if (other.Get_Pick_User != null)
				return false;
		} else if (!Get_Pick_User.equals(other.Get_Pick_User))
			return false;
		if (Get_Serial_Id != other.Get_Serial_Id)
			return false;
		return true;
	}

	public int getGet_Serial_Id() {
		return Get_Serial_Id;
	}

	public void setGet_Serial_Id(int get_Serial_Id) {
		Get_Serial_Id = get_Serial_Id;
	}

	public String getGet_Pick_Id() {
		return Get_Pick_Id;
	}

	public void setGet_Pick_Id(String get_Pick_Id) {
		Get_Pick_Id = get_Pick_Id;
	}

	public String getGet_Pick_Date() {
		return Get_Pick_Date;
	}

	public void setGet_Pick_Date(String get_Pick_Date) {
		Get_Pick_Date = get_Pick_Date;
	}

	public String getGet_Pick_User() {
		return Get_Pick_User;
	}

	public void setGet_Pick_User(String get_Pick_User) {
		Get_Pick_User = get_Pick_User;
	}

	public String getGet_IsPick() {
		return Get_IsPick;
	}

	public void setGet_IsPick(String get_IsPick) {
		Get_IsPick = get_IsPick;
	}

	public String getGet_Bz() {
		return Get_Bz;
	}

	public void setGet_Bz(String get_Bz) {
		Get_Bz = get_Bz;
	}

	@Override
	public String toString() {
		return "Get [Get_Serial_Id=" + Get_Serial_Id + ", Get_Pick_Id="
				+ Get_Pick_Id + ", Get_Pick_Date=" + Get_Pick_Date
				+ ", Get_Pick_User=" + Get_Pick_User + ", Get_IsPick="
				+ Get_IsPick + ", Get_Bz=" + Get_Bz + "]";
	}

	public int compareTo(Get o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
