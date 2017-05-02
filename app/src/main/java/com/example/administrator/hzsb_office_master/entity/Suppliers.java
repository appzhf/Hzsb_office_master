package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;

/**
 * @author liujiancheng 采购信息类
 */
public class Suppliers implements Serializable, Comparable<Suppliers>,
        Cloneable {

    int Suppliers_id;// 序号
    String Suppliers_procureId;// 采购单号
    String Suppliers_materialCode;// 物料代码
    String Suppliers_materialName;// 物料名称
    String Suppliers_name;// 供应商
    int Suppliers_buyNumber;// 购买数量
    int Suppliers_paidInNumber;// 实收数量
    int Suppliers_remainNumber;// 剩余数量
    String Suppliers_isInStoreage;// 是否入库
    String Suppliers_bz;// 备注

    public Suppliers(int suppliers_id, String suppliers_procureId,
                     String suppliers_materialCode, String suppliers_materialName,
                     String suppliers_name, int suppliers_buyNumber,
                     int suppliers_paidInNumber, int suppliers_remainNumber,
                     String suppliers_isInStoreage, String suppliers_bz) {
        super();
        this.setSuppliers_id(suppliers_id);
        this.setSuppliers_procureId(suppliers_procureId);
        this.setSuppliers_materialCode(suppliers_materialCode);
        this.setSuppliers_materialName(suppliers_materialName);
        this.setSuppliers_name(suppliers_name);
        this.setSuppliers_buyNumber(suppliers_buyNumber);
        this.setSuppliers_paidInNumber(suppliers_paidInNumber);
        this.setSuppliers_remainNumber(suppliers_remainNumber);
        this.setSuppliers_isInStoreage(suppliers_isInStoreage);
        this.setSuppliers_bz(suppliers_bz);
    }

    public int getSuppliers_id() {
        return Suppliers_id;
    }

    public void setSuppliers_id(int suppliers_id) {
        Suppliers_id = suppliers_id;
    }

    public String getSuppliers_procureId() {
        return Suppliers_procureId;
    }

    public void setSuppliers_procureId(String suppliers_procureId) {
        Suppliers_procureId = suppliers_procureId;
    }

    public String getSuppliers_materialCode() {
        return Suppliers_materialCode;
    }

    public void setSuppliers_materialCode(String suppliers_materialCode) {
        Suppliers_materialCode = suppliers_materialCode;
    }

    public String getSuppliers_materialName() {
        return Suppliers_materialName;
    }

    public void setSuppliers_materialName(String suppliers_materialName) {
        Suppliers_materialName = suppliers_materialName;
    }

    public String getSuppliers_name() {
        return Suppliers_name;
    }

    public void setSuppliers_name(String suppliers_name) {
        Suppliers_name = suppliers_name;
    }

    public int getSuppliers_buyNumber() {
        return Suppliers_buyNumber;
    }

    public void setSuppliers_buyNumber(int suppliers_buyNumber) {
        Suppliers_buyNumber = suppliers_buyNumber;
    }

    public int getSuppliers_paidInNumber() {
        return Suppliers_paidInNumber;
    }

    public void setSuppliers_paidInNumber(int suppliers_paidInNumber) {
        Suppliers_paidInNumber = suppliers_paidInNumber;
    }

    public int getSuppliers_remainNumber() {
        return Suppliers_remainNumber;
    }

    public void setSuppliers_remainNumber(int suppliers_remainNumber) {
        Suppliers_remainNumber = suppliers_remainNumber;
    }

    public String getSuppliers_isInStoreage() {
        return Suppliers_isInStoreage;
    }

    public void setSuppliers_isInStoreage(String suppliers_isInStoreage) {
        Suppliers_isInStoreage = suppliers_isInStoreage;
    }

    public String getSuppliers_bz() {
        return Suppliers_bz;
    }

    public void setSuppliers_bz(String suppliers_bz) {
        Suppliers_bz = suppliers_bz;
    }

    @Override
    public String toString() {
        return "Suppliers [Suppliers_id=" + Suppliers_id
                + ", Suppliers_procureId=" + Suppliers_procureId
                + ", Suppliers_materialCode=" + Suppliers_materialCode
                + ", Suppliers_materialName=" + Suppliers_materialName
                + ", Suppliers_name=" + Suppliers_name
                + ", Suppliers_buyNumber=" + Suppliers_buyNumber
                + ", Suppliers_paidInNumber=" + Suppliers_paidInNumber
                + ", Suppliers_remainNumber=" + Suppliers_remainNumber
                + ", Suppliers_isInStoreage=" + Suppliers_isInStoreage
                + ", Suppliers_bz=" + Suppliers_bz + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Suppliers_buyNumber;
        result = prime * result
                + ((Suppliers_bz == null) ? 0 : Suppliers_bz.hashCode());
        result = prime * result + Suppliers_id;
        result = prime
                * result
                + ((Suppliers_isInStoreage == null) ? 0
                : Suppliers_isInStoreage.hashCode());
        result = prime
                * result
                + ((Suppliers_materialCode == null) ? 0
                : Suppliers_materialCode.hashCode());
        result = prime
                * result
                + ((Suppliers_materialName == null) ? 0
                : Suppliers_materialName.hashCode());
        result = prime * result
                + ((Suppliers_name == null) ? 0 : Suppliers_name.hashCode());
        result = prime * result + Suppliers_paidInNumber;
        result = prime
                * result
                + ((Suppliers_procureId == null) ? 0 : Suppliers_procureId
                .hashCode());
        result = prime * result + Suppliers_remainNumber;
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
        Suppliers other = (Suppliers) obj;
        if (Suppliers_buyNumber != other.Suppliers_buyNumber)
            return false;
        if (Suppliers_bz == null) {
            if (other.Suppliers_bz != null)
                return false;
        } else if (!Suppliers_bz.equals(other.Suppliers_bz))
            return false;
        if (Suppliers_id != other.Suppliers_id)
            return false;
        if (Suppliers_isInStoreage == null) {
            if (other.Suppliers_isInStoreage != null)
                return false;
        } else if (!Suppliers_isInStoreage.equals(other.Suppliers_isInStoreage))
            return false;
        if (Suppliers_materialCode == null) {
            if (other.Suppliers_materialCode != null)
                return false;
        } else if (!Suppliers_materialCode.equals(other.Suppliers_materialCode))
            return false;
        if (Suppliers_materialName == null) {
            if (other.Suppliers_materialName != null)
                return false;
        } else if (!Suppliers_materialName.equals(other.Suppliers_materialName))
            return false;
        if (Suppliers_name == null) {
            if (other.Suppliers_name != null)
                return false;
        } else if (!Suppliers_name.equals(other.Suppliers_name))
            return false;
        if (Suppliers_paidInNumber != other.Suppliers_paidInNumber)
            return false;
        if (Suppliers_procureId == null) {
            if (other.Suppliers_procureId != null)
                return false;
        } else if (!Suppliers_procureId.equals(other.Suppliers_procureId))
            return false;
        if (Suppliers_remainNumber != other.Suppliers_remainNumber)
            return false;
        return true;
    }

    public int compareTo(Suppliers o) {
        if (this.hashCode() == o.hashCode()) {
            return 0;
        }
        return -1;
    }
}
