package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 生产人信息类
 */
public class Member_produce implements Serializable, Cloneable,
		Comparable<Member_produce> {

	String Member_produce_id;// 生产人编号
	String Member_produce_name;// 生产人姓名

	public Member_produce() {
		super();
	}

	public Member_produce(String member_produce_id, String member_produce_name) {
		super();
		this.setMember_produce_id(member_produce_id);
		this.setMember_produce_name(member_produce_name);
	}

	public String getMember_produce_id() {
		return Member_produce_id;
	}

	public void setMember_produce_id(String member_produce_id) {
		Member_produce_id = member_produce_id;
	}

	public String getMember_produce_name() {
		return Member_produce_name;
	}

	public void setMember_produce_name(String member_produce_name) {
		Member_produce_name = member_produce_name;
	}

	@Override
	public String toString() {
		return "Member_produce [Member_produce_id=" + Member_produce_id
				+ ", Member_produce_name=" + Member_produce_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Member_produce_id == null) ? 0 : Member_produce_id
						.hashCode());
		result = prime
				* result
				+ ((Member_produce_name == null) ? 0 : Member_produce_name
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
		Member_produce other = (Member_produce) obj;
		if (Member_produce_id == null) {
			if (other.Member_produce_id != null)
				return false;
		} else if (!Member_produce_id.equals(other.Member_produce_id))
			return false;
		if (Member_produce_name == null) {
			if (other.Member_produce_name != null)
				return false;
		} else if (!Member_produce_name.equals(other.Member_produce_name))
			return false;
		return true;
	}

	public int compareTo(Member_produce o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
