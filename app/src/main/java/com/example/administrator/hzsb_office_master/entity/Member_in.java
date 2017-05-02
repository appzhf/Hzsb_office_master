package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 入库人信息类
 */
public class Member_in implements Serializable, Cloneable,
		Comparable<Member_in> {

	String Member_in_id;// 入库人编号
	String Member_in_name;// 入库人姓名

	public Member_in() {
		super();
	}

	public Member_in(String member_in_id, String member_in_name) {
		super();
		this.setMember_in_id(member_in_id);
		this.setMember_in_name(member_in_name);
	}

	public String getMember_in_id() {
		return Member_in_id;
	}

	public void setMember_in_id(String member_in_id) {
		Member_in_id = member_in_id;
	}

	public String getMember_in_name() {
		return Member_in_name;
	}

	public void setMember_in_name(String member_in_name) {
		Member_in_name = member_in_name;
	}

	@Override
	public String toString() {
		return "Member_in [Member_in_id=" + Member_in_id + ", Member_in_name="
				+ Member_in_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Member_in_id == null) ? 0 : Member_in_id.hashCode());
		result = prime * result
				+ ((Member_in_name == null) ? 0 : Member_in_name.hashCode());
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
		Member_in other = (Member_in) obj;
		if (Member_in_id == null) {
			if (other.Member_in_id != null)
				return false;
		} else if (!Member_in_id.equals(other.Member_in_id))
			return false;
		if (Member_in_name == null) {
			if (other.Member_in_name != null)
				return false;
		} else if (!Member_in_name.equals(other.Member_in_name))
			return false;
		return true;
	}

	public int compareTo(Member_in o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
