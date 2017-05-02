package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 下单人信息类
 */
public class Member_task implements Serializable, Cloneable,
		Comparable<Member_task> {

	String Member_task_id;// 下单人编号
	String Member_task_name;// 下单人姓名

	public Member_task() {
		super();
	}

	public Member_task(String member_task_id, String member_task_name) {
		super();
		this.setMember_task_id(member_task_id);
		this.setMember_task_name(member_task_name);
	}

	@Override
	public String toString() {
		return "Member_task [Member_task_id=" + Member_task_id
				+ ", Member_task_name=" + Member_task_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Member_task_id == null) ? 0 : Member_task_id.hashCode());
		result = prime
				* result
				+ ((Member_task_name == null) ? 0 : Member_task_name.hashCode());
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
		Member_task other = (Member_task) obj;
		if (Member_task_id == null) {
			if (other.Member_task_id != null)
				return false;
		} else if (!Member_task_id.equals(other.Member_task_id))
			return false;
		if (Member_task_name == null) {
			if (other.Member_task_name != null)
				return false;
		} else if (!Member_task_name.equals(other.Member_task_name))
			return false;
		return true;
	}

	public String getMember_task_id() {
		return Member_task_id;
	}

	public void setMember_task_id(String member_task_id) {
		Member_task_id = member_task_id;
	}

	public String getMember_task_name() {
		return Member_task_name;
	}

	public void setMember_task_name(String member_task_name) {
		Member_task_name = member_task_name;
	}

	public int compareTo(Member_task o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
