package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 采购人信息类
 */
public class Member_sale implements Serializable, Cloneable,
		Comparable<Member_sale> {

	String Member_sale_id;// 采购人编号
	String Member_sale_name;// 采购人姓名

	public Member_sale() {
		super();
	}

	public Member_sale(String member_sale_id, String member_sale_name) {
		super();
		this.setMember_sale_id(member_sale_id);
		this.setMember_sale_name(member_sale_name);
	}

	public String getMember_sale_id() {
		return Member_sale_id;
	}

	public void setMember_sale_id(String member_sale_id) {
		Member_sale_id = member_sale_id;
	}

	public String getMember_sale_name() {
		return Member_sale_name;
	}

	public void setMember_sale_name(String member_sale_name) {
		Member_sale_name = member_sale_name;
	}

	@Override
	public String toString() {
		return "Member_sale [Member_sale_id=" + Member_sale_id
				+ ", Member_sale_name=" + Member_sale_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Member_sale_id == null) ? 0 : Member_sale_id.hashCode());
		result = prime
				* result
				+ ((Member_sale_name == null) ? 0 : Member_sale_name.hashCode());
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
		Member_sale other = (Member_sale) obj;
		if (Member_sale_id == null) {
			if (other.Member_sale_id != null)
				return false;
		} else if (!Member_sale_id.equals(other.Member_sale_id))
			return false;
		if (Member_sale_name == null) {
			if (other.Member_sale_name != null)
				return false;
		} else if (!Member_sale_name.equals(other.Member_sale_name))
			return false;
		return true;
	}

	public int compareTo(Member_sale o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
