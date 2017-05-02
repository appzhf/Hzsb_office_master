package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 工作信息表
 */
public class Work_log implements Serializable, Comparable<Work_log>, Cloneable {

	String Work_log_orderId;// 下单编号
	String Work_log_productName;// 产品名称
	String Work_log_specifications;// 规格型号
	String Work_log_otherRequest;// 其他要求
	String Work_log_parts;// 所属部门
	String Work_log_operationUser;// 操作人员
	String Work_log_operationTime;// 操作时间
	String Work_log_operationContent;// 操作内容
	String Work_log_bz;// 备注

	public Work_log(String work_log_orderId, String work_log_productName,
			String work_log_specifications, String work_log_otherRequest,
			String work_log_parts, String work_log_operationUser,
			String work_log_operationTime, String work_log_operationContent,
			String work_log_bz) {
		super();
		this.setWork_log_orderId(work_log_orderId);
		this.setWork_log_productName(work_log_productName);
		this.setWork_log_specifications(work_log_specifications);
		this.setWork_log_otherRequest(work_log_otherRequest);
		this.setWork_log_parts(work_log_parts);
		this.setWork_log_operationUser(work_log_operationUser);
		this.setWork_log_operationTime(work_log_operationTime);
		this.setWork_log_operationContent(work_log_operationContent);
		this.setWork_log_bz(work_log_bz);
	}

	public String getWork_log_orderId() {
		return Work_log_orderId;
	}

	public void setWork_log_orderId(String work_log_orderId) {
		Work_log_orderId = work_log_orderId;
	}

	public String getWork_log_productName() {
		return Work_log_productName;
	}

	public void setWork_log_productName(String work_log_productName) {
		Work_log_productName = work_log_productName;
	}

	public String getWork_log_specifications() {
		return Work_log_specifications;
	}

	public void setWork_log_specifications(String work_log_specifications) {
		Work_log_specifications = work_log_specifications;
	}

	public String getWork_log_otherRequest() {
		return Work_log_otherRequest;
	}

	public void setWork_log_otherRequest(String work_log_otherRequest) {
		Work_log_otherRequest = work_log_otherRequest;
	}

	public String getWork_log_parts() {
		return Work_log_parts;
	}

	public void setWork_log_parts(String work_log_parts) {
		Work_log_parts = work_log_parts;
	}

	public String getWork_log_operationUser() {
		return Work_log_operationUser;
	}

	public void setWork_log_operationUser(String work_log_operationUser) {
		Work_log_operationUser = work_log_operationUser;
	}

	public String getWork_log_operationTime() {
		return Work_log_operationTime;
	}

	public void setWork_log_operationTime(String work_log_operationTime) {
		Work_log_operationTime = work_log_operationTime;
	}

	public String getWork_log_operationContent() {
		return Work_log_operationContent;
	}

	public void setWork_log_operationContent(String work_log_operationContent) {
		Work_log_operationContent = work_log_operationContent;
	}

	public String getWork_log_bz() {
		return Work_log_bz;
	}

	public void setWork_log_bz(String work_log_bz) {
		Work_log_bz = work_log_bz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Work_log_bz == null) ? 0 : Work_log_bz.hashCode());
		result = prime
				* result
				+ ((Work_log_operationContent == null) ? 0
						: Work_log_operationContent.hashCode());
		result = prime
				* result
				+ ((Work_log_operationTime == null) ? 0
						: Work_log_operationTime.hashCode());
		result = prime
				* result
				+ ((Work_log_operationUser == null) ? 0
						: Work_log_operationUser.hashCode());
		result = prime
				* result
				+ ((Work_log_orderId == null) ? 0 : Work_log_orderId.hashCode());
		result = prime
				* result
				+ ((Work_log_otherRequest == null) ? 0 : Work_log_otherRequest
						.hashCode());
		result = prime * result
				+ ((Work_log_parts == null) ? 0 : Work_log_parts.hashCode());
		result = prime
				* result
				+ ((Work_log_productName == null) ? 0 : Work_log_productName
						.hashCode());
		result = prime
				* result
				+ ((Work_log_specifications == null) ? 0
						: Work_log_specifications.hashCode());
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
		Work_log other = (Work_log) obj;
		if (Work_log_bz == null) {
			if (other.Work_log_bz != null)
				return false;
		} else if (!Work_log_bz.equals(other.Work_log_bz))
			return false;
		if (Work_log_operationContent == null) {
			if (other.Work_log_operationContent != null)
				return false;
		} else if (!Work_log_operationContent
				.equals(other.Work_log_operationContent))
			return false;
		if (Work_log_operationTime == null) {
			if (other.Work_log_operationTime != null)
				return false;
		} else if (!Work_log_operationTime.equals(other.Work_log_operationTime))
			return false;
		if (Work_log_operationUser == null) {
			if (other.Work_log_operationUser != null)
				return false;
		} else if (!Work_log_operationUser.equals(other.Work_log_operationUser))
			return false;
		if (Work_log_orderId == null) {
			if (other.Work_log_orderId != null)
				return false;
		} else if (!Work_log_orderId.equals(other.Work_log_orderId))
			return false;
		if (Work_log_otherRequest == null) {
			if (other.Work_log_otherRequest != null)
				return false;
		} else if (!Work_log_otherRequest.equals(other.Work_log_otherRequest))
			return false;
		if (Work_log_parts == null) {
			if (other.Work_log_parts != null)
				return false;
		} else if (!Work_log_parts.equals(other.Work_log_parts))
			return false;
		if (Work_log_productName == null) {
			if (other.Work_log_productName != null)
				return false;
		} else if (!Work_log_productName.equals(other.Work_log_productName))
			return false;
		if (Work_log_specifications == null) {
			if (other.Work_log_specifications != null)
				return false;
		} else if (!Work_log_specifications
				.equals(other.Work_log_specifications))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Work_log [Work_log_orderId=" + Work_log_orderId
				+ ", Work_log_productName=" + Work_log_productName
				+ ", Work_log_specifications=" + Work_log_specifications
				+ ", Work_log_otherRequest=" + Work_log_otherRequest
				+ ", Work_log_parts=" + Work_log_parts
				+ ", Work_log_operationUser=" + Work_log_operationUser
				+ ", Work_log_operationTime=" + Work_log_operationTime
				+ ", Work_log_operationContent=" + Work_log_operationContent
				+ ", Work_log_bz=" + Work_log_bz + "]";
	}

	public int compareTo(Work_log o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}
}
