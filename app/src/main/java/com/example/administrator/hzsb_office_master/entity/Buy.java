package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author liujiancheng meter 购买类
 */
public class Buy implements Serializable, Cloneable, Comparable<Buy> {
	int Buy_Id; // 采购单号
	Date Buy_Date; // 采购
	String Buy_User; // 采购人
	String Buy_IsPutInStorage; // 是否已入库
	String Buy_bz; // 备注

	public Buy() {
	}

	public Buy(int buy_Id, Date buy_Date, String buy_User,
			String buy_IsPutInStorage, String buy_bz) {
		super();
		this.setBuy_Id(buy_Id);
		this.setBuy_Date(buy_Date);
		this.setBuy_User(buy_User);
		this.setBuy_IsPutInStorage(buy_IsPutInStorage);
		this.setBuy_bz(buy_bz);
	}

	public int getBuy_Id() {
		return Buy_Id;
	}

	public void setBuy_Id(int buy_Id) {
		Buy_Id = buy_Id;
	}

	public Date getBuy_Date() {
		return Buy_Date;
	}

	public void setBuy_Date(Date buy_Date) {
		Buy_Date = buy_Date;
	}

	public String getBuy_User() {
		return Buy_User;
	}

	public void setBuy_User(String buy_User) {
		Buy_User = buy_User;
	}

	public String getBuy_IsPutInStorage() {
		return Buy_IsPutInStorage;
	}

	public void setBuy_IsPutInStorage(String buy_IsPutInStorage) {
		Buy_IsPutInStorage = buy_IsPutInStorage;
	}

	public String getBuy_bz() {
		return Buy_bz;
	}

	public void setBuy_bz(String buy_bz) {
		Buy_bz = buy_bz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Buy_Date == null) ? 0 : Buy_Date.hashCode());
		result = prime * result + Buy_Id;
		result = prime
				* result
				+ ((Buy_IsPutInStorage == null) ? 0 : Buy_IsPutInStorage
						.hashCode());
		result = prime * result
				+ ((Buy_User == null) ? 0 : Buy_User.hashCode());
		result = prime * result + ((Buy_bz == null) ? 0 : Buy_bz.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Buy [Buy_Id=" + Buy_Id + ", Buy_Date=" + Buy_Date
				+ ", Buy_User=" + Buy_User + ", Buy_IsPutInStorage="
				+ Buy_IsPutInStorage + ", Buy_bz=" + Buy_bz + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buy other = (Buy) obj;
		if (Buy_Date == null) {
			if (other.Buy_Date != null)
				return false;
		} else if (!Buy_Date.equals(other.Buy_Date))
			return false;
		if (Buy_Id != other.Buy_Id)
			return false;
		if (Buy_IsPutInStorage == null) {
			if (other.Buy_IsPutInStorage != null)
				return false;
		} else if (!Buy_IsPutInStorage.equals(other.Buy_IsPutInStorage))
			return false;
		if (Buy_User == null) {
			if (other.Buy_User != null)
				return false;
		} else if (!Buy_User.equals(other.Buy_User))
			return false;
		if (Buy_bz == null) {
			if (other.Buy_bz != null)
				return false;
		} else if (!Buy_bz.equals(other.Buy_bz))
			return false;
		return true;
	}

	public int compareTo(Buy o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
