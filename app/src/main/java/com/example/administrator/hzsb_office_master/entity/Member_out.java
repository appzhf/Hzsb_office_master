package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 出库人信息类
 */
public class Member_out implements Serializable, Cloneable,
		Comparable<Member_out> {

	String Member_out_id;// 出库人编号
	String Member_out_name;// 出库人姓名

	public Member_out() {

	}

	public Member_out(String member_out_id, String member_out_name) {
		super();
		this.setMember_out_id(member_out_id);
		this.setMember_out_name(member_out_name);
	}

	public String getMember_out_id() {
		return Member_out_id;
	}

	public void setMember_out_id(String member_out_id) {
		Member_out_id = member_out_id;
	}

	public String getMember_out_name() {
		return Member_out_name;
	}

	public void setMember_out_name(String member_out_name) {
		Member_out_name = member_out_name;
	}

	@Override
	public String toString() {
		return "Member_out [Member_out_id=" + Member_out_id
				+ ", Member_out_name=" + Member_out_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Member_out_id == null) ? 0 : Member_out_id.hashCode());
		result = prime * result
				+ ((Member_out_name == null) ? 0 : Member_out_name.hashCode());
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
		Member_out other = (Member_out) obj;
		if (Member_out_id == null) {
			if (other.Member_out_id != null)
				return false;
		} else if (!Member_out_id.equals(other.Member_out_id))
			return false;
		if (Member_out_name == null) {
			if (other.Member_out_name != null)
				return false;
		} else if (!Member_out_name.equals(other.Member_out_name))
			return false;
		return true;
	}

	public int compareTo(Member_out o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
