package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng
 * @date 2017-3-27 客户信息类
 */

public class Client implements Serializable, Cloneable, Comparable<Client> {

	String ClientUser_Id;// 客户编号
	String ClientUser_Name;// 客户名称
	String ClientUser_Phone;// 联系人及电话
	String ClientInvoice_Address;// 发票地址
	String ClientInvoice_Head;// 开票抬头
	String ClientOrder_Id;// 下单编号
	String ClientNow_State;// 当前状态
	String ClientSalesuser_name;// 销售员
	String ClientSalesuse_Phone;// 销售员联系电话
	String Client_Bz;// 备注

	public Client() {
	}

	public Client(String clientUser_Id, String clientUser_Name,
			String clientUser_Phone, String clientInvoice_Address,
			String clientInvoice_Head, String clientOrder_Id,
			String clientNow_State, String clientSalesuser_name,
			String clientSalesuse_Phone, String client_Bz) {
		super();
		this.setClientUser_Id(clientUser_Id);
		this.setClientUser_Name(clientUser_Name);
		this.setClientUser_Phone(clientUser_Phone);
		this.setClientInvoice_Address(clientInvoice_Address);
		this.setClientInvoice_Head(clientInvoice_Head);
		this.setClientOrder_Id(clientOrder_Id);
		this.setClientNow_State(clientNow_State);
		this.setClientSalesuser_name(clientSalesuser_name);
		this.setClientSalesuse_Phone(clientSalesuse_Phone);
		this.setClient_Bz(client_Bz);

	}

	public String getClientUser_Id() {
		return ClientUser_Id;
	}

	public void setClientUser_Id(String clientUser_Id) {
		ClientUser_Id = clientUser_Id;
	}

	public String getClientUser_Name() {
		return ClientUser_Name;
	}

	public void setClientUser_Name(String clientUser_Name) {
		ClientUser_Name = clientUser_Name;
	}

	public String getClientUser_Phone() {
		return ClientUser_Phone;
	}

	public void setClientUser_Phone(String clientUser_Phone) {
		ClientUser_Phone = clientUser_Phone;
	}

	public String getClientInvoice_Address() {
		return ClientInvoice_Address;
	}

	public void setClientInvoice_Address(String clientInvoice_Address) {
		ClientInvoice_Address = clientInvoice_Address;
	}

	public String getClientInvoice_Head() {
		return ClientInvoice_Head;
	}

	public void setClientInvoice_Head(String clientInvoice_Head) {
		ClientInvoice_Head = clientInvoice_Head;
	}

	public String getClientOrder_Id() {
		return ClientOrder_Id;
	}

	public void setClientOrder_Id(String clientOrder_Id) {
		ClientOrder_Id = clientOrder_Id;
	}

	public String getClientNow_State() {
		return ClientNow_State;
	}

	public void setClientNow_State(String clientNow_State) {
		ClientNow_State = clientNow_State;
	}

	public String getClientSalesuser_name() {
		return ClientSalesuser_name;
	}

	public void setClientSalesuser_name(String clientSalesuser_name) {
		ClientSalesuser_name = clientSalesuser_name;
	}

	public String getClientSalesuse_Phone() {
		return ClientSalesuse_Phone;
	}

	public void setClientSalesuse_Phone(String clientSalesuse_Phone) {
		ClientSalesuse_Phone = clientSalesuse_Phone;
	}

	public String getClient_Bz() {
		return Client_Bz;
	}

	public void setClient_Bz(String client_Bz) {
		Client_Bz = client_Bz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((ClientInvoice_Address == null) ? 0 : ClientInvoice_Address
						.hashCode());
		result = prime
				* result
				+ ((ClientInvoice_Head == null) ? 0 : ClientInvoice_Head
						.hashCode());
		result = prime * result
				+ ((ClientNow_State == null) ? 0 : ClientNow_State.hashCode());
		result = prime * result
				+ ((ClientOrder_Id == null) ? 0 : ClientOrder_Id.hashCode());
		result = prime
				* result
				+ ((ClientSalesuse_Phone == null) ? 0 : ClientSalesuse_Phone
						.hashCode());
		result = prime
				* result
				+ ((ClientSalesuser_name == null) ? 0 : ClientSalesuser_name
						.hashCode());
		result = prime * result
				+ ((ClientUser_Id == null) ? 0 : ClientUser_Id.hashCode());
		result = prime * result
				+ ((ClientUser_Name == null) ? 0 : ClientUser_Name.hashCode());
		result = prime
				* result
				+ ((ClientUser_Phone == null) ? 0 : ClientUser_Phone.hashCode());
		result = prime * result
				+ ((Client_Bz == null) ? 0 : Client_Bz.hashCode());
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
		Client other = (Client) obj;
		if (ClientInvoice_Address == null) {
			if (other.ClientInvoice_Address != null)
				return false;
		} else if (!ClientInvoice_Address.equals(other.ClientInvoice_Address))
			return false;
		if (ClientInvoice_Head == null) {
			if (other.ClientInvoice_Head != null)
				return false;
		} else if (!ClientInvoice_Head.equals(other.ClientInvoice_Head))
			return false;
		if (ClientNow_State == null) {
			if (other.ClientNow_State != null)
				return false;
		} else if (!ClientNow_State.equals(other.ClientNow_State))
			return false;
		if (ClientOrder_Id == null) {
			if (other.ClientOrder_Id != null)
				return false;
		} else if (!ClientOrder_Id.equals(other.ClientOrder_Id))
			return false;
		if (ClientSalesuse_Phone == null) {
			if (other.ClientSalesuse_Phone != null)
				return false;
		} else if (!ClientSalesuse_Phone.equals(other.ClientSalesuse_Phone))
			return false;
		if (ClientSalesuser_name == null) {
			if (other.ClientSalesuser_name != null)
				return false;
		} else if (!ClientSalesuser_name.equals(other.ClientSalesuser_name))
			return false;
		if (ClientUser_Id == null) {
			if (other.ClientUser_Id != null)
				return false;
		} else if (!ClientUser_Id.equals(other.ClientUser_Id))
			return false;
		if (ClientUser_Name == null) {
			if (other.ClientUser_Name != null)
				return false;
		} else if (!ClientUser_Name.equals(other.ClientUser_Name))
			return false;
		if (ClientUser_Phone == null) {
			if (other.ClientUser_Phone != null)
				return false;
		} else if (!ClientUser_Phone.equals(other.ClientUser_Phone))
			return false;
		if (Client_Bz == null) {
			if (other.Client_Bz != null)
				return false;
		} else if (!Client_Bz.equals(other.Client_Bz))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [ClientUser_Id=" + ClientUser_Id + ", ClientUser_Name="
				+ ClientUser_Name + ", ClientUser_Phone=" + ClientUser_Phone
				+ ", ClientInvoice_Address=" + ClientInvoice_Address
				+ ", ClientInvoice_Head=" + ClientInvoice_Head
				+ ", ClientOrder_Id=" + ClientOrder_Id + ", ClientNow_State="
				+ ClientNow_State + ", ClientSalesuser_name="
				+ ClientSalesuser_name + ", ClientSalesuse_Phone="
				+ ClientSalesuse_Phone + ", Client_Bz=" + Client_Bz + "]";
	}

	public int compareTo(Client o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
