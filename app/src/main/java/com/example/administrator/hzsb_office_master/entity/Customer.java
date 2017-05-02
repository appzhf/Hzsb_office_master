package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * @author liujiancheng 客户类
 */
public class Customer implements Serializable, Cloneable, Comparable<Customer> {

	String Customer_Id;// 客户编号
	String Customer_name;// 客户名称
	String Customer_Invoice_Head;// 开票抬头
	String Customer_User_Phone;// 联系人及电话
	String Customer_Invoice_Address;// 发货地址
	String Customer_Bz;// 备注

	public Customer() {
	}

	public Customer(String customer_Id, String customer_name,
			String customer_Invoice_Head, String customer_User_Phone,
			String customer_Invoice_Address, String customer_Bz) {
		super();
		this.setCustomer_Id(customer_Id);
		this.setCustomer_name(customer_name);
		this.setCustomer_Invoice_Head(customer_Invoice_Head);
		this.setCustomer_User_Phone(customer_User_Phone);
		this.setCustomer_Invoice_Address(customer_Invoice_Address);
		this.setCustomer_Bz(customer_Bz);

	}

	public String getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	public String getCustomer_Invoice_Head() {
		return Customer_Invoice_Head;
	}

	public void setCustomer_Invoice_Head(String customer_Invoice_Head) {
		Customer_Invoice_Head = customer_Invoice_Head;
	}

	public String getCustomer_User_Phone() {
		return Customer_User_Phone;
	}

	public void setCustomer_User_Phone(String customer_User_Phone) {
		Customer_User_Phone = customer_User_Phone;
	}

	public String getCustomer_Invoice_Address() {
		return Customer_Invoice_Address;
	}

	public void setCustomer_Invoice_Address(String customer_Invoice_Address) {
		Customer_Invoice_Address = customer_Invoice_Address;
	}

	public String getCustomer_Bz() {
		return Customer_Bz;
	}

	public void setCustomer_Bz(String customer_Bz) {
		Customer_Bz = customer_Bz;
	}

	@Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", Customer_name="
				+ Customer_name + ", Customer_Invoice_Head="
				+ Customer_Invoice_Head + ", Customer_User_Phone="
				+ Customer_User_Phone + ", Customer_Invoice_Address="
				+ Customer_Invoice_Address + ", Customer_Bz=" + Customer_Bz
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Customer_Bz == null) ? 0 : Customer_Bz.hashCode());
		result = prime * result
				+ ((Customer_Id == null) ? 0 : Customer_Id.hashCode());
		result = prime
				* result
				+ ((Customer_Invoice_Address == null) ? 0
						: Customer_Invoice_Address.hashCode());
		result = prime
				* result
				+ ((Customer_Invoice_Head == null) ? 0 : Customer_Invoice_Head
						.hashCode());
		result = prime
				* result
				+ ((Customer_User_Phone == null) ? 0 : Customer_User_Phone
						.hashCode());
		result = prime * result
				+ ((Customer_name == null) ? 0 : Customer_name.hashCode());
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
		Customer other = (Customer) obj;
		if (Customer_Bz == null) {
			if (other.Customer_Bz != null)
				return false;
		} else if (!Customer_Bz.equals(other.Customer_Bz))
			return false;
		if (Customer_Id == null) {
			if (other.Customer_Id != null)
				return false;
		} else if (!Customer_Id.equals(other.Customer_Id))
			return false;
		if (Customer_Invoice_Address == null) {
			if (other.Customer_Invoice_Address != null)
				return false;
		} else if (!Customer_Invoice_Address
				.equals(other.Customer_Invoice_Address))
			return false;
		if (Customer_Invoice_Head == null) {
			if (other.Customer_Invoice_Head != null)
				return false;
		} else if (!Customer_Invoice_Head.equals(other.Customer_Invoice_Head))
			return false;
		if (Customer_User_Phone == null) {
			if (other.Customer_User_Phone != null)
				return false;
		} else if (!Customer_User_Phone.equals(other.Customer_User_Phone))
			return false;
		if (Customer_name == null) {
			if (other.Customer_name != null)
				return false;
		} else if (!Customer_name.equals(other.Customer_name))
			return false;
		return true;
	}

	public int compareTo(Customer o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
