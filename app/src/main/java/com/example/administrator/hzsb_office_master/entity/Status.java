package com.example.administrator.hzsb_office_master.entity;

/**
 * 
 * @author liujiancheng 状态信息
 */
public class Status {
	String Status_state;// 状态

	public Status() {
		super();
	}

	public Status(String status_state) {
		super();
		this.setStatus_state(status_state);
	}

	public String getStatus_state() {
		return Status_state;
	}

	public void setStatus_state(String status_state) {
		Status_state = status_state;
	}

}
