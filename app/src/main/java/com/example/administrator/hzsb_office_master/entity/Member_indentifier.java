package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

public class Member_indentifier implements Serializable, Cloneable,
		Comparable<Member_indentifier> {

	String Member_indentifier_id;// 质检人编号
	String Member_indentifier_name;// 质检人姓名

	public Member_indentifier() {
		super();
	}

	public Member_indentifier(String member_indentifier_id,
			String member_indentifier_name) {
		super();
		this.setMember_indentifier_id(member_indentifier_id);
		this.setMember_indentifier_name(member_indentifier_name);
	}

	@Override
	public String toString() {
		return "Member_indentifier [Member_indentifier_id="
				+ Member_indentifier_id + ", Member_indentifier_name="
				+ Member_indentifier_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Member_indentifier_id == null) ? 0 : Member_indentifier_id
						.hashCode());
		result = prime
				* result
				+ ((Member_indentifier_name == null) ? 0
						: Member_indentifier_name.hashCode());
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
		Member_indentifier other = (Member_indentifier) obj;
		if (Member_indentifier_id == null) {
			if (other.Member_indentifier_id != null)
				return false;
		} else if (!Member_indentifier_id.equals(other.Member_indentifier_id))
			return false;
		if (Member_indentifier_name == null) {
			if (other.Member_indentifier_name != null)
				return false;
		} else if (!Member_indentifier_name
				.equals(other.Member_indentifier_name))
			return false;
		return true;
	}

	public String getMember_indentifier_id() {
		return Member_indentifier_id;
	}

	public void setMember_indentifier_id(String member_indentifier_id) {
		Member_indentifier_id = member_indentifier_id;
	}

	public String getMember_indentifier_name() {
		return Member_indentifier_name;
	}

	public void setMember_indentifier_name(String member_indentifier_name) {
		Member_indentifier_name = member_indentifier_name;
	}

	public int compareTo(Member_indentifier o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
