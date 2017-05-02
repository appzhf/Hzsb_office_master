package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 日志信息类 数据中表名为英文，后期解析注意
 */
public class Log implements Serializable, Cloneable, Comparable<Log> {

	String Log_Operator;// 日志操作权限
	String Log_Operator_Time;// 日志操作时间
	String Log_Operation;// 日志操作

	public Log() {
	}

	public Log(String log_Operator, String log_Operator_Time,
			String log_Operation) {
		super();
		this.setLog_Operator(log_Operator_Time);
		this.setLog_Operator_Time(log_Operator_Time);
		this.setLog_Operation(log_Operation);

	}

	public String getLog_Operator() {
		return Log_Operator;
	}

	public void setLog_Operator(String log_Operator) {
		Log_Operator = log_Operator;
	}

	public String getLog_Operator_Time() {
		return Log_Operator_Time;
	}

	public void setLog_Operator_Time(String log_Operator_Time) {
		Log_Operator_Time = log_Operator_Time;
	}

	public String getLog_Operation() {
		return Log_Operation;
	}

	public void setLog_Operation(String log_Operation) {
		Log_Operation = log_Operation;
	}

	@Override
	public String toString() {
		return "Log [Log_Operator=" + Log_Operator + ", Log_Operator_Time="
				+ Log_Operator_Time + ", Log_Operation=" + Log_Operation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Log_Operation == null) ? 0 : Log_Operation.hashCode());
		result = prime * result
				+ ((Log_Operator == null) ? 0 : Log_Operator.hashCode());
		result = prime
				* result
				+ ((Log_Operator_Time == null) ? 0 : Log_Operator_Time
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
		Log other = (Log) obj;
		if (Log_Operation == null) {
			if (other.Log_Operation != null)
				return false;
		} else if (!Log_Operation.equals(other.Log_Operation))
			return false;
		if (Log_Operator == null) {
			if (other.Log_Operator != null)
				return false;
		} else if (!Log_Operator.equals(other.Log_Operator))
			return false;
		if (Log_Operator_Time == null) {
			if (other.Log_Operator_Time != null)
				return false;
		} else if (!Log_Operator_Time.equals(other.Log_Operator_Time))
			return false;
		return true;
	}

	public int compareTo(Log o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
