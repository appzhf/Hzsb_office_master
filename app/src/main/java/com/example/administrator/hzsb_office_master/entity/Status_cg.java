package com.example.administrator.hzsb_office_master.entity;
/**
 * 
 * @author liujiancheng
 *	采购状态
 */
public class Status_cg {
	
	String Status_cg_state;//采购状态

	public Status_cg(){
		super();
	}
	
	public Status_cg(String status_cg_state) {
		super();
		this.setStatus_cg_state ( status_cg_state);
	}

	public String getStatus_cg_state() {
		return Status_cg_state;
	}

	public void setStatus_cg_state(String status_cg_state) {
		Status_cg_state = status_cg_state;
	}
	
}
