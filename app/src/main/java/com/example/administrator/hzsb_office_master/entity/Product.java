package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;
import java.sql.Date;


/**
 * 
 * @author liujiancheng 产品信息类
 */
public class Product implements Serializable, Cloneable, Comparable<Product> {

	String Product_id;// 下单编号
	String Product_name;// 产品名称
	String Product_moudel;// 规格型号
	int Product_number;// 数量
	int Product_hasProductNumber;// 已生成数量
	int Product_notProductNumber;// 未生产数量
	int Product_inspectionNumber;// 报检数量
	int Product_samplingNumber;// 抽检数量
	int Product_allRepairNumber;// 合计返修数量
	int Product_thisProductNumber;// 该批次生产数量
	int Product_qualityRepairNumber;// 质检返修数量
	String Product_backRepairState;// 返修状态
	int Product_hasInStorageNumber;// 已入库数量
	int Product_hasOutStorageNumber;// 已出库数量
	int Product_hasDeliveryNumber;// 已发货数量
	String Product_batchState;// 批量状态
	String Product_otherRequire;// 其它要求
	Date Product_shouldDeliveryTime;// 应交付时间
	Date Product_orderTime;// 下单时间
	String Product_orderUser;// 下单人
	String Product_orderBz;// 下单备注
	String Product_CustomerUnit;// 客户单位
	String Product_deliveryAddress;// 发货地址
	String Product_userPhone;// 联系人及电话
	String Product_invoiceHead;// 开票抬头
	String Product_nowState;// 当前状态
	String Product_auditUser;// 审核人
	Date Product_auditTime;// 审核时间
	String Product_auditBz;// 审核备注
	String Product_verifyUser;// 材料核实人
	Date Product_verifyTime;// 材料核实时间
	String Product_verifyBz;// 材料采购备注
	String Product_productUser;// 生产人
	Date Product_startProductTime;// 开始生产时间
	Date Product_endProductTime;// 生产完成时间
	Date Product_productTime;// 生产备注
	String Product_qualityUser;// 质检人
	Date Product_qualitTime;// 质检时间
	String Product_qualitBz;// 质检备注
	String Product_inStorageUser;// 入库人
	Date Product_inStorageTime;// 入库时间
	String Product_inStorageBz;// 入库备注
	String Product_outStorageUser;// 出库人
	Date Product_outStorageTime;// 出库时间
	String Product_outStorageBz;// 出库备注
	String Product_deliveryUser;// 发货人
	Date Product_deliveryTime;// 发货时间
	String Product_deliveryBz;// 发货备注
	String Product_isNeedProduct;// 是否需要生产环节
	String Product_isBuySIMCard;// 是否我方购买sim卡
	String Product_SIMCardState;// sim卡购买状态
	String Product_bz;// 备注
	String Product_isHasChange;// 是否有更改
	String Product_licenseId;// 生产许可证编号
	String Product_isMakeTick;// 是否开票

	public Product() {
		super();
	}

	public Product(String product_id, String product_name,
			String product_moudel, int product_number,
			int product_hasProductNumber, int product_notProductNumber,
			int product_inspectionNumber, int product_samplingNumber,
			int product_allRepairNumber, int product_thisProductNumber,
			int product_qualityRepairNumber, String product_backRepairState,
			int product_hasInStorageNumber, int product_hasOutStorageNumber,
			int product_hasDeliveryNumber, String product_batchState,
			String product_otherRequire, Date product_shouldDeliveryTime,
			Date product_orderTime, String product_orderUser,
			String product_orderBz, String product_CustomerUnit,
			String product_deliveryAddress, String product_userPhone,
			String product_invoiceHead, String product_nowState,
			String product_auditUser, Date product_auditTime,
			String product_auditBz, String product_verifyUser,
			Date product_verifyTime, String product_verifyBz,
			String product_productUser, Date product_startProductTime,
			Date product_endProductTime, Date product_productTime,
			String product_qualityUser, Date product_qualitTime,
			String product_qualitBz, String product_inStorageUser,
			Date product_inStorageTime, String product_inStorageBz,
			String product_outStorageUser, Date product_outStorageTime,
			String product_outStorageBz, String product_deliveryUser,
			Date product_deliveryTime, String product_deliveryBz,
			String product_isNeedProduct, String product_isBuySIMCard,
			String product_SIMCardState, String product_bz,
			String product_isHasChange, String product_licenseId,
			String product_isMakeTick) {
		super();
		this.setProduct_id(product_id);
		this.setProduct_name(product_name);
		this.setProduct_moudel(product_moudel);
		this.setProduct_number(product_number);
		this.setProduct_hasProductNumber(product_hasProductNumber);
		this.setProduct_notProductNumber(product_notProductNumber);
		this.setProduct_inspectionNumber(product_inspectionNumber);
		this.setProduct_samplingNumber(product_samplingNumber);
		this.setProduct_allRepairNumber(product_allRepairNumber);
		this.setProduct_thisProductNumber(product_thisProductNumber);
		this.setProduct_qualityRepairNumber(product_qualityRepairNumber);
		this.setProduct_backRepairState(product_backRepairState);
		this.setProduct_hasInStorageNumber(product_hasInStorageNumber);
		this.setProduct_hasOutStorageNumber(product_hasOutStorageNumber);
		this.setProduct_hasDeliveryNumber(product_hasDeliveryNumber);
		this.setProduct_batchState(product_batchState);
		this.setProduct_otherRequire(product_otherRequire);
		this.setProduct_shouldDeliveryTime(product_shouldDeliveryTime);
		this.setProduct_orderTime(product_orderTime);
		this.setProduct_orderUser(product_orderUser);
		this.setProduct_orderBz(product_orderBz);
		this.setProduct_CustomerUnit(product_CustomerUnit);
		this.setProduct_deliveryAddress(product_deliveryAddress);
		this.setProduct_userPhone(product_userPhone);
		this.setProduct_invoiceHead(product_invoiceHead);
		this.setProduct_nowState(product_nowState);
		this.setProduct_auditUser(product_auditUser);
		this.setProduct_auditTime(product_auditTime);
		this.setProduct_auditBz(product_auditBz);
		this.setProduct_verifyUser(product_verifyUser);
		this.setProduct_verifyTime(product_verifyTime);
		this.setProduct_verifyBz(product_verifyBz);
		this.setProduct_productUser(product_productUser);
		this.setProduct_startProductTime(product_startProductTime);
		this.setProduct_endProductTime(product_endProductTime);
		this.setProduct_productTime(product_productTime);
		this.setProduct_qualityUser(product_qualityUser);
		this.setProduct_qualitTime(product_qualitTime);
		this.setProduct_qualitBz(product_qualitBz);
		this.setProduct_inStorageUser(product_inStorageUser);
		this.setProduct_inStorageTime(product_inStorageTime);
		this.setProduct_inStorageBz(product_inStorageBz);
		this.setProduct_outStorageUser(product_outStorageUser);
		this.setProduct_outStorageTime(product_outStorageTime);
		this.setProduct_outStorageBz(product_outStorageBz);
		this.setProduct_deliveryUser(product_deliveryUser);
		this.setProduct_deliveryTime(product_deliveryTime);
		this.setProduct_deliveryBz(product_deliveryBz);
		this.setProduct_isNeedProduct(product_isNeedProduct);
		this.setProduct_isBuySIMCard(product_isBuySIMCard);
		this.setProduct_SIMCardState(product_SIMCardState);
		this.setProduct_bz(product_bz);
		this.setProduct_isHasChange(product_isHasChange);
		this.setProduct_licenseId(product_licenseId);
		this.setProduct_isMakeTick(product_isMakeTick);
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getProduct_moudel() {
		return Product_moudel;
	}

	public void setProduct_moudel(String product_moudel) {
		Product_moudel = product_moudel;
	}

	public int getProduct_number() {
		return Product_number;
	}

	public void setProduct_number(int product_number) {
		Product_number = product_number;
	}

	public int getProduct_hasProductNumber() {
		return Product_hasProductNumber;
	}

	public void setProduct_hasProductNumber(int product_hasProductNumber) {
		Product_hasProductNumber = product_hasProductNumber;
	}

	public int getProduct_notProductNumber() {
		return Product_notProductNumber;
	}

	public void setProduct_notProductNumber(int product_notProductNumber) {
		Product_notProductNumber = product_notProductNumber;
	}

	public int getProduct_inspectionNumber() {
		return Product_inspectionNumber;
	}

	public void setProduct_inspectionNumber(int product_inspectionNumber) {
		Product_inspectionNumber = product_inspectionNumber;
	}

	public int getProduct_samplingNumber() {
		return Product_samplingNumber;
	}

	public void setProduct_samplingNumber(int product_samplingNumber) {
		Product_samplingNumber = product_samplingNumber;
	}

	public int getProduct_allRepairNumber() {
		return Product_allRepairNumber;
	}

	public void setProduct_allRepairNumber(int product_allRepairNumber) {
		Product_allRepairNumber = product_allRepairNumber;
	}

	public int getProduct_thisProductNumber() {
		return Product_thisProductNumber;
	}

	public void setProduct_thisProductNumber(int product_thisProductNumber) {
		Product_thisProductNumber = product_thisProductNumber;
	}

	public int getProduct_qualityRepairNumber() {
		return Product_qualityRepairNumber;
	}

	public void setProduct_qualityRepairNumber(int product_qualityRepairNumber) {
		Product_qualityRepairNumber = product_qualityRepairNumber;
	}

	public String getProduct_backRepairState() {
		return Product_backRepairState;
	}

	public void setProduct_backRepairState(String product_backRepairState) {
		Product_backRepairState = product_backRepairState;
	}

	public int getProduct_hasInStorageNumber() {
		return Product_hasInStorageNumber;
	}

	public void setProduct_hasInStorageNumber(int product_hasInStorageNumber) {
		Product_hasInStorageNumber = product_hasInStorageNumber;
	}

	public int getProduct_hasOutStorageNumber() {
		return Product_hasOutStorageNumber;
	}

	public void setProduct_hasOutStorageNumber(int product_hasOutStorageNumber) {
		Product_hasOutStorageNumber = product_hasOutStorageNumber;
	}

	public int getProduct_hasDeliveryNumber() {
		return Product_hasDeliveryNumber;
	}

	public void setProduct_hasDeliveryNumber(int product_hasDeliveryNumber) {
		Product_hasDeliveryNumber = product_hasDeliveryNumber;
	}

	public String getProduct_batchState() {
		return Product_batchState;
	}

	public void setProduct_batchState(String product_batchState) {
		Product_batchState = product_batchState;
	}

	public String getProduct_otherRequire() {
		return Product_otherRequire;
	}

	public void setProduct_otherRequire(String product_otherRequire) {
		Product_otherRequire = product_otherRequire;
	}

	public Date getProduct_shouldDeliveryTime() {
		return Product_shouldDeliveryTime;
	}

	public void setProduct_shouldDeliveryTime(Date product_shouldDeliveryTime) {
		Product_shouldDeliveryTime = product_shouldDeliveryTime;
	}

	public Date getProduct_orderTime() {
		return Product_orderTime;
	}

	public void setProduct_orderTime(Date product_orderTime) {
		Product_orderTime = product_orderTime;
	}

	public String getProduct_orderUser() {
		return Product_orderUser;
	}

	public void setProduct_orderUser(String product_orderUser) {
		Product_orderUser = product_orderUser;
	}

	public String getProduct_orderBz() {
		return Product_orderBz;
	}

	public void setProduct_orderBz(String product_orderBz) {
		Product_orderBz = product_orderBz;
	}

	public String getProduct_CustomerUnit() {
		return Product_CustomerUnit;
	}

	public void setProduct_CustomerUnit(String product_CustomerUnit) {
		Product_CustomerUnit = product_CustomerUnit;
	}

	public String getProduct_deliveryAddress() {
		return Product_deliveryAddress;
	}

	public void setProduct_deliveryAddress(String product_deliveryAddress) {
		Product_deliveryAddress = product_deliveryAddress;
	}

	public String getProduct_userPhone() {
		return Product_userPhone;
	}

	public void setProduct_userPhone(String product_userPhone) {
		Product_userPhone = product_userPhone;
	}

	public String getProduct_invoiceHead() {
		return Product_invoiceHead;
	}

	public void setProduct_invoiceHead(String product_invoiceHead) {
		Product_invoiceHead = product_invoiceHead;
	}

	public String getProduct_nowState() {
		return Product_nowState;
	}

	public void setProduct_nowState(String product_nowState) {
		Product_nowState = product_nowState;
	}

	public String getProduct_auditUser() {
		return Product_auditUser;
	}

	public void setProduct_auditUser(String product_auditUser) {
		Product_auditUser = product_auditUser;
	}

	public Date getProduct_auditTime() {
		return Product_auditTime;
	}

	public void setProduct_auditTime(Date product_auditTime) {
		Product_auditTime = product_auditTime;
	}

	public String getProduct_auditBz() {
		return Product_auditBz;
	}

	public void setProduct_auditBz(String product_auditBz) {
		Product_auditBz = product_auditBz;
	}

	public String getProduct_verifyUser() {
		return Product_verifyUser;
	}

	public void setProduct_verifyUser(String product_verifyUser) {
		Product_verifyUser = product_verifyUser;
	}

	public Date getProduct_verifyTime() {
		return Product_verifyTime;
	}

	public void setProduct_verifyTime(Date product_verifyTime) {
		Product_verifyTime = product_verifyTime;
	}

	public String getProduct_verifyBz() {
		return Product_verifyBz;
	}

	public void setProduct_verifyBz(String product_verifyBz) {
		Product_verifyBz = product_verifyBz;
	}

	public String getProduct_productUser() {
		return Product_productUser;
	}

	public void setProduct_productUser(String product_productUser) {
		Product_productUser = product_productUser;
	}

	public Date getProduct_startProductTime() {
		return Product_startProductTime;
	}

	public void setProduct_startProductTime(Date product_startProductTime) {
		Product_startProductTime = product_startProductTime;
	}

	public Date getProduct_endProductTime() {
		return Product_endProductTime;
	}

	public void setProduct_endProductTime(Date product_endProductTime) {
		Product_endProductTime = product_endProductTime;
	}

	public Date getProduct_productTime() {
		return Product_productTime;
	}

	public void setProduct_productTime(Date product_productTime) {
		Product_productTime = product_productTime;
	}

	public String getProduct_qualityUser() {
		return Product_qualityUser;
	}

	public void setProduct_qualityUser(String product_qualityUser) {
		Product_qualityUser = product_qualityUser;
	}

	public Date getProduct_qualitTime() {
		return Product_qualitTime;
	}

	public void setProduct_qualitTime(Date product_qualitTime) {
		Product_qualitTime = product_qualitTime;
	}

	public String getProduct_qualitBz() {
		return Product_qualitBz;
	}

	public void setProduct_qualitBz(String product_qualitBz) {
		Product_qualitBz = product_qualitBz;
	}

	public String getProduct_inStorageUser() {
		return Product_inStorageUser;
	}

	public void setProduct_inStorageUser(String product_inStorageUser) {
		Product_inStorageUser = product_inStorageUser;
	}

	public Date getProduct_inStorageTime() {
		return Product_inStorageTime;
	}

	public void setProduct_inStorageTime(Date product_inStorageTime) {
		Product_inStorageTime = product_inStorageTime;
	}

	public String getProduct_inStorageBz() {
		return Product_inStorageBz;
	}

	public void setProduct_inStorageBz(String product_inStorageBz) {
		Product_inStorageBz = product_inStorageBz;
	}

	public String getProduct_outStorageUser() {
		return Product_outStorageUser;
	}

	public void setProduct_outStorageUser(String product_outStorageUser) {
		Product_outStorageUser = product_outStorageUser;
	}

	public Date getProduct_outStorageTime() {
		return Product_outStorageTime;
	}

	public void setProduct_outStorageTime(Date product_outStorageTime) {
		Product_outStorageTime = product_outStorageTime;
	}

	public String getProduct_outStorageBz() {
		return Product_outStorageBz;
	}

	public void setProduct_outStorageBz(String product_outStorageBz) {
		Product_outStorageBz = product_outStorageBz;
	}

	public String getProduct_deliveryUser() {
		return Product_deliveryUser;
	}

	public void setProduct_deliveryUser(String product_deliveryUser) {
		Product_deliveryUser = product_deliveryUser;
	}

	public Date getProduct_deliveryTime() {
		return Product_deliveryTime;
	}

	public void setProduct_deliveryTime(Date product_deliveryTime) {
		Product_deliveryTime = product_deliveryTime;
	}

	public String getProduct_deliveryBz() {
		return Product_deliveryBz;
	}

	public void setProduct_deliveryBz(String product_deliveryBz) {
		Product_deliveryBz = product_deliveryBz;
	}

	public String getProduct_isNeedProduct() {
		return Product_isNeedProduct;
	}

	public void setProduct_isNeedProduct(String product_isNeedProduct) {
		Product_isNeedProduct = product_isNeedProduct;
	}

	public String getProduct_isBuySIMCard() {
		return Product_isBuySIMCard;
	}

	public void setProduct_isBuySIMCard(String product_isBuySIMCard) {
		Product_isBuySIMCard = product_isBuySIMCard;
	}

	public String getProduct_SIMCardState() {
		return Product_SIMCardState;
	}

	public void setProduct_SIMCardState(String product_SIMCardState) {
		Product_SIMCardState = product_SIMCardState;
	}

	public String getProduct_bz() {
		return Product_bz;
	}

	public void setProduct_bz(String product_bz) {
		Product_bz = product_bz;
	}

	public String getProduct_isHasChange() {
		return Product_isHasChange;
	}

	public void setProduct_isHasChange(String product_isHasChange) {
		Product_isHasChange = product_isHasChange;
	}

	public String getProduct_licenseId() {
		return Product_licenseId;
	}

	public void setProduct_licenseId(String product_licenseId) {
		Product_licenseId = product_licenseId;
	}

	public String getProduct_isMakeTick() {
		return Product_isMakeTick;
	}

	public void setProduct_isMakeTick(String product_isMakeTick) {
		Product_isMakeTick = product_isMakeTick;
	}

	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", Product_name="
				+ Product_name + ", Product_moudel=" + Product_moudel
				+ ", Product_number=" + Product_number
				+ ", Product_hasProductNumber=" + Product_hasProductNumber
				+ ", Product_notProductNumber=" + Product_notProductNumber
				+ ", Product_inspectionNumber=" + Product_inspectionNumber
				+ ", Product_samplingNumber=" + Product_samplingNumber
				+ ", Product_allRepairNumber=" + Product_allRepairNumber
				+ ", Product_thisProductNumber=" + Product_thisProductNumber
				+ ", Product_qualityRepairNumber="
				+ Product_qualityRepairNumber + ", Product_backRepairState="
				+ Product_backRepairState + ", Product_hasInStorageNumber="
				+ Product_hasInStorageNumber + ", Product_hasOutStorageNumber="
				+ Product_hasOutStorageNumber + ", Product_hasDeliveryNumber="
				+ Product_hasDeliveryNumber + ", Product_batchState="
				+ Product_batchState + ", Product_otherRequire="
				+ Product_otherRequire + ", Product_shouldDeliveryTime="
				+ Product_shouldDeliveryTime + ", Product_orderTime="
				+ Product_orderTime + ", Product_orderUser="
				+ Product_orderUser + ", Product_orderBz=" + Product_orderBz
				+ ", Product_CustomerUnit=" + Product_CustomerUnit
				+ ", Product_deliveryAddress=" + Product_deliveryAddress
				+ ", Product_userPhone=" + Product_userPhone
				+ ", Product_invoiceHead=" + Product_invoiceHead
				+ ", Product_nowState=" + Product_nowState
				+ ", Product_auditUser=" + Product_auditUser
				+ ", Product_auditTime=" + Product_auditTime
				+ ", Product_auditBz=" + Product_auditBz
				+ ", Product_verifyUser=" + Product_verifyUser
				+ ", Product_verifyTime=" + Product_verifyTime
				+ ", Product_verifyBz=" + Product_verifyBz
				+ ", Product_productUser=" + Product_productUser
				+ ", Product_startProductTime=" + Product_startProductTime
				+ ", Product_endProductTime=" + Product_endProductTime
				+ ", Product_productTime=" + Product_productTime
				+ ", Product_qualityUser=" + Product_qualityUser
				+ ", Product_qualitTime=" + Product_qualitTime
				+ ", Product_qualitBz=" + Product_qualitBz
				+ ", Product_inStorageUser=" + Product_inStorageUser
				+ ", Product_inStorageTime=" + Product_inStorageTime
				+ ", Product_inStorageBz=" + Product_inStorageBz
				+ ", Product_outStorageUser=" + Product_outStorageUser
				+ ", Product_outStorageTime=" + Product_outStorageTime
				+ ", Product_outStorageBz=" + Product_outStorageBz
				+ ", Product_deliveryUser=" + Product_deliveryUser
				+ ", Product_deliveryTime=" + Product_deliveryTime
				+ ", Product_deliveryBz=" + Product_deliveryBz
				+ ", Product_isNeedProduct=" + Product_isNeedProduct
				+ ", Product_isBuySIMCard=" + Product_isBuySIMCard
				+ ", Product_SIMCardState=" + Product_SIMCardState
				+ ", Product_bz=" + Product_bz + ", Product_isHasChange="
				+ Product_isHasChange + ", Product_licenseId="
				+ Product_licenseId + ", Product_isMakeTick="
				+ Product_isMakeTick + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((Product_CustomerUnit == null) ? 0 : Product_CustomerUnit
						.hashCode());
		result = prime
				* result
				+ ((Product_SIMCardState == null) ? 0 : Product_SIMCardState
						.hashCode());
		result = prime * result + Product_allRepairNumber;
		result = prime * result
				+ ((Product_auditBz == null) ? 0 : Product_auditBz.hashCode());
		result = prime
				* result
				+ ((Product_auditTime == null) ? 0 : Product_auditTime
						.hashCode());
		result = prime
				* result
				+ ((Product_auditUser == null) ? 0 : Product_auditUser
						.hashCode());
		result = prime
				* result
				+ ((Product_backRepairState == null) ? 0
						: Product_backRepairState.hashCode());
		result = prime
				* result
				+ ((Product_batchState == null) ? 0 : Product_batchState
						.hashCode());
		result = prime * result
				+ ((Product_bz == null) ? 0 : Product_bz.hashCode());
		result = prime
				* result
				+ ((Product_deliveryAddress == null) ? 0
						: Product_deliveryAddress.hashCode());
		result = prime
				* result
				+ ((Product_deliveryBz == null) ? 0 : Product_deliveryBz
						.hashCode());
		result = prime
				* result
				+ ((Product_deliveryTime == null) ? 0 : Product_deliveryTime
						.hashCode());
		result = prime
				* result
				+ ((Product_deliveryUser == null) ? 0 : Product_deliveryUser
						.hashCode());
		result = prime
				* result
				+ ((Product_endProductTime == null) ? 0
						: Product_endProductTime.hashCode());
		result = prime * result + Product_hasDeliveryNumber;
		result = prime * result + Product_hasInStorageNumber;
		result = prime * result + Product_hasOutStorageNumber;
		result = prime * result + Product_hasProductNumber;
		result = prime * result
				+ ((Product_id == null) ? 0 : Product_id.hashCode());
		result = prime
				* result
				+ ((Product_inStorageBz == null) ? 0 : Product_inStorageBz
						.hashCode());
		result = prime
				* result
				+ ((Product_inStorageTime == null) ? 0 : Product_inStorageTime
						.hashCode());
		result = prime
				* result
				+ ((Product_inStorageUser == null) ? 0 : Product_inStorageUser
						.hashCode());
		result = prime * result + Product_inspectionNumber;
		result = prime
				* result
				+ ((Product_invoiceHead == null) ? 0 : Product_invoiceHead
						.hashCode());
		result = prime
				* result
				+ ((Product_isBuySIMCard == null) ? 0 : Product_isBuySIMCard
						.hashCode());
		result = prime
				* result
				+ ((Product_isHasChange == null) ? 0 : Product_isHasChange
						.hashCode());
		result = prime
				* result
				+ ((Product_isMakeTick == null) ? 0 : Product_isMakeTick
						.hashCode());
		result = prime
				* result
				+ ((Product_isNeedProduct == null) ? 0 : Product_isNeedProduct
						.hashCode());
		result = prime
				* result
				+ ((Product_licenseId == null) ? 0 : Product_licenseId
						.hashCode());
		result = prime * result
				+ ((Product_moudel == null) ? 0 : Product_moudel.hashCode());
		result = prime * result
				+ ((Product_name == null) ? 0 : Product_name.hashCode());
		result = prime * result + Product_notProductNumber;
		result = prime
				* result
				+ ((Product_nowState == null) ? 0 : Product_nowState.hashCode());
		result = prime * result + Product_number;
		result = prime * result
				+ ((Product_orderBz == null) ? 0 : Product_orderBz.hashCode());
		result = prime
				* result
				+ ((Product_orderTime == null) ? 0 : Product_orderTime
						.hashCode());
		result = prime
				* result
				+ ((Product_orderUser == null) ? 0 : Product_orderUser
						.hashCode());
		result = prime
				* result
				+ ((Product_otherRequire == null) ? 0 : Product_otherRequire
						.hashCode());
		result = prime
				* result
				+ ((Product_outStorageBz == null) ? 0 : Product_outStorageBz
						.hashCode());
		result = prime
				* result
				+ ((Product_outStorageTime == null) ? 0
						: Product_outStorageTime.hashCode());
		result = prime
				* result
				+ ((Product_outStorageUser == null) ? 0
						: Product_outStorageUser.hashCode());
		result = prime
				* result
				+ ((Product_productTime == null) ? 0 : Product_productTime
						.hashCode());
		result = prime
				* result
				+ ((Product_productUser == null) ? 0 : Product_productUser
						.hashCode());
		result = prime
				* result
				+ ((Product_qualitBz == null) ? 0 : Product_qualitBz.hashCode());
		result = prime
				* result
				+ ((Product_qualitTime == null) ? 0 : Product_qualitTime
						.hashCode());
		result = prime * result + Product_qualityRepairNumber;
		result = prime
				* result
				+ ((Product_qualityUser == null) ? 0 : Product_qualityUser
						.hashCode());
		result = prime * result + Product_samplingNumber;
		result = prime
				* result
				+ ((Product_shouldDeliveryTime == null) ? 0
						: Product_shouldDeliveryTime.hashCode());
		result = prime
				* result
				+ ((Product_startProductTime == null) ? 0
						: Product_startProductTime.hashCode());
		result = prime * result + Product_thisProductNumber;
		result = prime
				* result
				+ ((Product_userPhone == null) ? 0 : Product_userPhone
						.hashCode());
		result = prime
				* result
				+ ((Product_verifyBz == null) ? 0 : Product_verifyBz.hashCode());
		result = prime
				* result
				+ ((Product_verifyTime == null) ? 0 : Product_verifyTime
						.hashCode());
		result = prime
				* result
				+ ((Product_verifyUser == null) ? 0 : Product_verifyUser
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
		Product other = (Product) obj;
		if (Product_CustomerUnit == null) {
			if (other.Product_CustomerUnit != null)
				return false;
		} else if (!Product_CustomerUnit.equals(other.Product_CustomerUnit))
			return false;
		if (Product_SIMCardState == null) {
			if (other.Product_SIMCardState != null)
				return false;
		} else if (!Product_SIMCardState.equals(other.Product_SIMCardState))
			return false;
		if (Product_allRepairNumber != other.Product_allRepairNumber)
			return false;
		if (Product_auditBz == null) {
			if (other.Product_auditBz != null)
				return false;
		} else if (!Product_auditBz.equals(other.Product_auditBz))
			return false;
		if (Product_auditTime == null) {
			if (other.Product_auditTime != null)
				return false;
		} else if (!Product_auditTime.equals(other.Product_auditTime))
			return false;
		if (Product_auditUser == null) {
			if (other.Product_auditUser != null)
				return false;
		} else if (!Product_auditUser.equals(other.Product_auditUser))
			return false;
		if (Product_backRepairState == null) {
			if (other.Product_backRepairState != null)
				return false;
		} else if (!Product_backRepairState
				.equals(other.Product_backRepairState))
			return false;
		if (Product_batchState == null) {
			if (other.Product_batchState != null)
				return false;
		} else if (!Product_batchState.equals(other.Product_batchState))
			return false;
		if (Product_bz == null) {
			if (other.Product_bz != null)
				return false;
		} else if (!Product_bz.equals(other.Product_bz))
			return false;
		if (Product_deliveryAddress == null) {
			if (other.Product_deliveryAddress != null)
				return false;
		} else if (!Product_deliveryAddress
				.equals(other.Product_deliveryAddress))
			return false;
		if (Product_deliveryBz == null) {
			if (other.Product_deliveryBz != null)
				return false;
		} else if (!Product_deliveryBz.equals(other.Product_deliveryBz))
			return false;
		if (Product_deliveryTime == null) {
			if (other.Product_deliveryTime != null)
				return false;
		} else if (!Product_deliveryTime.equals(other.Product_deliveryTime))
			return false;
		if (Product_deliveryUser == null) {
			if (other.Product_deliveryUser != null)
				return false;
		} else if (!Product_deliveryUser.equals(other.Product_deliveryUser))
			return false;
		if (Product_endProductTime == null) {
			if (other.Product_endProductTime != null)
				return false;
		} else if (!Product_endProductTime.equals(other.Product_endProductTime))
			return false;
		if (Product_hasDeliveryNumber != other.Product_hasDeliveryNumber)
			return false;
		if (Product_hasInStorageNumber != other.Product_hasInStorageNumber)
			return false;
		if (Product_hasOutStorageNumber != other.Product_hasOutStorageNumber)
			return false;
		if (Product_hasProductNumber != other.Product_hasProductNumber)
			return false;
		if (Product_id == null) {
			if (other.Product_id != null)
				return false;
		} else if (!Product_id.equals(other.Product_id))
			return false;
		if (Product_inStorageBz == null) {
			if (other.Product_inStorageBz != null)
				return false;
		} else if (!Product_inStorageBz.equals(other.Product_inStorageBz))
			return false;
		if (Product_inStorageTime == null) {
			if (other.Product_inStorageTime != null)
				return false;
		} else if (!Product_inStorageTime.equals(other.Product_inStorageTime))
			return false;
		if (Product_inStorageUser == null) {
			if (other.Product_inStorageUser != null)
				return false;
		} else if (!Product_inStorageUser.equals(other.Product_inStorageUser))
			return false;
		if (Product_inspectionNumber != other.Product_inspectionNumber)
			return false;
		if (Product_invoiceHead == null) {
			if (other.Product_invoiceHead != null)
				return false;
		} else if (!Product_invoiceHead.equals(other.Product_invoiceHead))
			return false;
		if (Product_isBuySIMCard == null) {
			if (other.Product_isBuySIMCard != null)
				return false;
		} else if (!Product_isBuySIMCard.equals(other.Product_isBuySIMCard))
			return false;
		if (Product_isHasChange == null) {
			if (other.Product_isHasChange != null)
				return false;
		} else if (!Product_isHasChange.equals(other.Product_isHasChange))
			return false;
		if (Product_isMakeTick == null) {
			if (other.Product_isMakeTick != null)
				return false;
		} else if (!Product_isMakeTick.equals(other.Product_isMakeTick))
			return false;
		if (Product_isNeedProduct == null) {
			if (other.Product_isNeedProduct != null)
				return false;
		} else if (!Product_isNeedProduct.equals(other.Product_isNeedProduct))
			return false;
		if (Product_licenseId == null) {
			if (other.Product_licenseId != null)
				return false;
		} else if (!Product_licenseId.equals(other.Product_licenseId))
			return false;
		if (Product_moudel == null) {
			if (other.Product_moudel != null)
				return false;
		} else if (!Product_moudel.equals(other.Product_moudel))
			return false;
		if (Product_name == null) {
			if (other.Product_name != null)
				return false;
		} else if (!Product_name.equals(other.Product_name))
			return false;
		if (Product_notProductNumber != other.Product_notProductNumber)
			return false;
		if (Product_nowState == null) {
			if (other.Product_nowState != null)
				return false;
		} else if (!Product_nowState.equals(other.Product_nowState))
			return false;
		if (Product_number != other.Product_number)
			return false;
		if (Product_orderBz == null) {
			if (other.Product_orderBz != null)
				return false;
		} else if (!Product_orderBz.equals(other.Product_orderBz))
			return false;
		if (Product_orderTime == null) {
			if (other.Product_orderTime != null)
				return false;
		} else if (!Product_orderTime.equals(other.Product_orderTime))
			return false;
		if (Product_orderUser == null) {
			if (other.Product_orderUser != null)
				return false;
		} else if (!Product_orderUser.equals(other.Product_orderUser))
			return false;
		if (Product_otherRequire == null) {
			if (other.Product_otherRequire != null)
				return false;
		} else if (!Product_otherRequire.equals(other.Product_otherRequire))
			return false;
		if (Product_outStorageBz == null) {
			if (other.Product_outStorageBz != null)
				return false;
		} else if (!Product_outStorageBz.equals(other.Product_outStorageBz))
			return false;
		if (Product_outStorageTime == null) {
			if (other.Product_outStorageTime != null)
				return false;
		} else if (!Product_outStorageTime.equals(other.Product_outStorageTime))
			return false;
		if (Product_outStorageUser == null) {
			if (other.Product_outStorageUser != null)
				return false;
		} else if (!Product_outStorageUser.equals(other.Product_outStorageUser))
			return false;
		if (Product_productTime == null) {
			if (other.Product_productTime != null)
				return false;
		} else if (!Product_productTime.equals(other.Product_productTime))
			return false;
		if (Product_productUser == null) {
			if (other.Product_productUser != null)
				return false;
		} else if (!Product_productUser.equals(other.Product_productUser))
			return false;
		if (Product_qualitBz == null) {
			if (other.Product_qualitBz != null)
				return false;
		} else if (!Product_qualitBz.equals(other.Product_qualitBz))
			return false;
		if (Product_qualitTime == null) {
			if (other.Product_qualitTime != null)
				return false;
		} else if (!Product_qualitTime.equals(other.Product_qualitTime))
			return false;
		if (Product_qualityRepairNumber != other.Product_qualityRepairNumber)
			return false;
		if (Product_qualityUser == null) {
			if (other.Product_qualityUser != null)
				return false;
		} else if (!Product_qualityUser.equals(other.Product_qualityUser))
			return false;
		if (Product_samplingNumber != other.Product_samplingNumber)
			return false;
		if (Product_shouldDeliveryTime == null) {
			if (other.Product_shouldDeliveryTime != null)
				return false;
		} else if (!Product_shouldDeliveryTime
				.equals(other.Product_shouldDeliveryTime))
			return false;
		if (Product_startProductTime == null) {
			if (other.Product_startProductTime != null)
				return false;
		} else if (!Product_startProductTime
				.equals(other.Product_startProductTime))
			return false;
		if (Product_thisProductNumber != other.Product_thisProductNumber)
			return false;
		if (Product_userPhone == null) {
			if (other.Product_userPhone != null)
				return false;
		} else if (!Product_userPhone.equals(other.Product_userPhone))
			return false;
		if (Product_verifyBz == null) {
			if (other.Product_verifyBz != null)
				return false;
		} else if (!Product_verifyBz.equals(other.Product_verifyBz))
			return false;
		if (Product_verifyTime == null) {
			if (other.Product_verifyTime != null)
				return false;
		} else if (!Product_verifyTime.equals(other.Product_verifyTime))
			return false;
		if (Product_verifyUser == null) {
			if (other.Product_verifyUser != null)
				return false;
		} else if (!Product_verifyUser.equals(other.Product_verifyUser))
			return false;
		return true;
	}

	public int compareTo(Product o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return -1;
	}

}
