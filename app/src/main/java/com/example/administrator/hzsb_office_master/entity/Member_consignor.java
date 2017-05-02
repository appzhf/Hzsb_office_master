package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 发货人成员信息类
 */
public class Member_consignor implements Serializable, Cloneable,
		Comparable<Member_consignor> {
	String Member_consignor_id;// 发货人编号
	String Member_consignor_name;// 发货人姓名

	public Member_consignor() {
	}

	public Member_consignor(String member_consignor_id,
			String member_consignor_name) {
		super();
		this.setMember_consignor_id(member_consignor_id);
		this.setMember_consignor_name(member_consignor_name);
	}

	public String getMember_consignor_id() {
		return Member_consignor_id;
	}

	public void setMember_consignor_id(String member_consignor_id) {
		Member_consignor_id = member_consignor_id;
	}

	public String getMember_consignor_name() {
		return Member_consignor_name;
	}

	public void setMember_consignor_name(String member_consignor_name) {
		Member_consignor_name = member_consignor_name;
	}

	@Override
	public String toString() {
		return "Member_consignor [Member_consignor_id=" + Member_consignor_id
				+ ", Member_consignor_name=" + Member_consignor_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Member_consignor_id == null) ? 0 : Member_consignor_id
						.hashCode());
		result = prime
				* result
				+ ((Member_consignor_name == null) ? 0 : Member_consignor_name
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
		Member_consignor other = (Member_consignor) obj;
		if (Member_consignor_id == null) {
			if (other.Member_consignor_id != null)
				return false;
		} else if (!Member_consignor_id.equals(other.Member_consignor_id))
			return false;
		if (Member_consignor_name == null) {
			if (other.Member_consignor_name != null)
				return false;
		} else if (!Member_consignor_name.equals(other.Member_consignor_name))
			return false;
		return true;
	}

	public int compareTo(Member_consignor o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
