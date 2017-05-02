package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 审核人信息类
 */
public class Member_assessor implements Cloneable, Serializable,
		Comparable<Member_assessor> {
	String Member_assessor_userId;//审核人编号
	String Member_assessor_userName;//审核人姓名

	public Member_assessor() {
	}

	public Member_assessor(String material_assessor_userId,
			String material_assessor_userName) {
		super();
		this.setMaterial_assessor_userId(material_assessor_userId);
		this.setMaterial_assessor_userName(material_assessor_userName);
	}

	public String getMaterial_assessor_userId() {
		return Member_assessor_userId;
	}

	public void setMaterial_assessor_userId(String material_assessor_userId) {
		Member_assessor_userId = material_assessor_userId;
	}

	public String getMaterial_assessor_userName() {
		return Member_assessor_userName;
	}

	public void setMaterial_assessor_userName(String material_assessor_userName) {
		Member_assessor_userName = material_assessor_userName;
	}
	
	
	

	


	@Override
	public String toString() {
		return "Member_assessor [Member_assessor_userId="
				+ Member_assessor_userId + ", Member_assessor_userName="
				+ Member_assessor_userName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Member_assessor_userId == null) ? 0
						: Member_assessor_userId.hashCode());
		result = prime
				* result
				+ ((Member_assessor_userName == null) ? 0
						: Member_assessor_userName.hashCode());
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
		Member_assessor other = (Member_assessor) obj;
		if (Member_assessor_userId == null) {
			if (other.Member_assessor_userId != null)
				return false;
		} else if (!Member_assessor_userId.equals(other.Member_assessor_userId))
			return false;
		if (Member_assessor_userName == null) {
			if (other.Member_assessor_userName != null)
				return false;
		} else if (!Member_assessor_userName
				.equals(other.Member_assessor_userName))
			return false;
		return true;
	}

	public int compareTo(Member_assessor o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

	

}
