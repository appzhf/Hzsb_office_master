package com.example.administrator.hzsb_office_master.entity;

import java.io.Serializable;


/**
 * @author liujiancheng 存货信息日志类
 */
public class Stocks_log implements Serializable, Cloneable,
        Comparable<Stocks_log> {

    String Stocks_log_operationUser;// 操作人
    String Stocks_log_operationTime;// 操作时间
    String Stocks_log_operationContent;// 操作内容
    String Stocks_log_operationNature;// 操作性质
    String Stocks_log_bz;// 备注
    String Stocks_log_materialCode;// 物料代码
    String Stocks_log_materialName;// 物料名称
    String Stocks_log_operationNumber;// 操作数量
    String Stocks_log_inventoryNumber;// 库存数量

    public Stocks_log(String stocks_log_operationUser,
                      String stocks_log_operationTime,
                      String stocks_log_operationContent,
                      String stocks_log_operationNature, String stocks_log_bz,
                      String stocks_log_materialCode, String stocks_log_materialName,
                      String stocks_log_operationNumber, String stocks_log_inventoryNumber) {
        super();
        this.setStocks_log_operationUser(stocks_log_operationUser);
        this.setStocks_log_operationTime(stocks_log_operationTime);
        this.setStocks_log_operationContent(stocks_log_operationContent);
        this.setStocks_log_operationNature(stocks_log_operationNature);
        this.setStocks_log_bz(stocks_log_bz);
        this.setStocks_log_materialCode(stocks_log_materialCode);
        this.setStocks_log_materialName(stocks_log_materialName);
        this.setStocks_log_operationNumber(stocks_log_operationNumber);
        this.setStocks_log_inventoryNumber(stocks_log_inventoryNumber);
    }

    @Override
    public String toString() {
        return "Stocks_log [Stocks_log_operationUser="
                + Stocks_log_operationUser + ", Stocks_log_operationTime="
                + Stocks_log_operationTime + ", Stocks_log_operationContent="
                + Stocks_log_operationContent + ", Stocks_log_operationNature="
                + Stocks_log_operationNature + ", Stocks_log_bz="
                + Stocks_log_bz + ", Stocks_log_materialCode="
                + Stocks_log_materialCode + ", Stocks_log_materialName="
                + Stocks_log_materialName + ", Stocks_log_operationNumber="
                + Stocks_log_operationNumber + ", Stocks_log_inventoryNumber="
                + Stocks_log_inventoryNumber + "]";
    }

    public String getStocks_log_operationUser() {
        return Stocks_log_operationUser;
    }

    public void setStocks_log_operationUser(String stocks_log_operationUser) {
        Stocks_log_operationUser = stocks_log_operationUser;
    }

    public String getStocks_log_operationTime() {
        return Stocks_log_operationTime;
    }

    public void setStocks_log_operationTime(String stocks_log_operationTime) {
        Stocks_log_operationTime = stocks_log_operationTime;
    }

    public String getStocks_log_operationContent() {
        return Stocks_log_operationContent;
    }

    public void setStocks_log_operationContent(
            String stocks_log_operationContent) {
        Stocks_log_operationContent = stocks_log_operationContent;
    }

    public String getStocks_log_operationNature() {
        return Stocks_log_operationNature;
    }

    public void setStocks_log_operationNature(String stocks_log_operationNature) {
        Stocks_log_operationNature = stocks_log_operationNature;
    }

    public String getStocks_log_bz() {
        return Stocks_log_bz;
    }

    public void setStocks_log_bz(String stocks_log_bz) {
        Stocks_log_bz = stocks_log_bz;
    }

    public String getStocks_log_materialCode() {
        return Stocks_log_materialCode;
    }

    public void setStocks_log_materialCode(String stocks_log_materialCode) {
        Stocks_log_materialCode = stocks_log_materialCode;
    }

    public String getStocks_log_materialName() {
        return Stocks_log_materialName;
    }

    public void setStocks_log_materialName(String stocks_log_materialName) {
        Stocks_log_materialName = stocks_log_materialName;
    }

    public String getStocks_log_operationNumber() {
        return Stocks_log_operationNumber;
    }

    public void setStocks_log_operationNumber(String stocks_log_operationNumber) {
        Stocks_log_operationNumber = stocks_log_operationNumber;
    }

    public String getStocks_log_inventoryNumber() {
        return Stocks_log_inventoryNumber;
    }

    public void setStocks_log_inventoryNumber(String stocks_log_inventoryNumber) {
        Stocks_log_inventoryNumber = stocks_log_inventoryNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((Stocks_log_bz == null) ? 0 : Stocks_log_bz.hashCode());
        result = prime
                * result
                + ((Stocks_log_inventoryNumber == null) ? 0
                : Stocks_log_inventoryNumber.hashCode());
        result = prime
                * result
                + ((Stocks_log_materialCode == null) ? 0
                : Stocks_log_materialCode.hashCode());
        result = prime
                * result
                + ((Stocks_log_materialName == null) ? 0
                : Stocks_log_materialName.hashCode());
        result = prime
                * result
                + ((Stocks_log_operationContent == null) ? 0
                : Stocks_log_operationContent.hashCode());
        result = prime
                * result
                + ((Stocks_log_operationNature == null) ? 0
                : Stocks_log_operationNature.hashCode());
        result = prime
                * result
                + ((Stocks_log_operationNumber == null) ? 0
                : Stocks_log_operationNumber.hashCode());
        result = prime
                * result
                + ((Stocks_log_operationTime == null) ? 0
                : Stocks_log_operationTime.hashCode());
        result = prime
                * result
                + ((Stocks_log_operationUser == null) ? 0
                : Stocks_log_operationUser.hashCode());
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
        Stocks_log other = (Stocks_log) obj;
        if (Stocks_log_bz == null) {
            if (other.Stocks_log_bz != null)
                return false;
        } else if (!Stocks_log_bz.equals(other.Stocks_log_bz))
            return false;
        if (Stocks_log_inventoryNumber == null) {
            if (other.Stocks_log_inventoryNumber != null)
                return false;
        } else if (!Stocks_log_inventoryNumber
                .equals(other.Stocks_log_inventoryNumber))
            return false;
        if (Stocks_log_materialCode == null) {
            if (other.Stocks_log_materialCode != null)
                return false;
        } else if (!Stocks_log_materialCode
                .equals(other.Stocks_log_materialCode))
            return false;
        if (Stocks_log_materialName == null) {
            if (other.Stocks_log_materialName != null)
                return false;
        } else if (!Stocks_log_materialName
                .equals(other.Stocks_log_materialName))
            return false;
        if (Stocks_log_operationContent == null) {
            if (other.Stocks_log_operationContent != null)
                return false;
        } else if (!Stocks_log_operationContent
                .equals(other.Stocks_log_operationContent))
            return false;
        if (Stocks_log_operationNature == null) {
            if (other.Stocks_log_operationNature != null)
                return false;
        } else if (!Stocks_log_operationNature
                .equals(other.Stocks_log_operationNature))
            return false;
        if (Stocks_log_operationNumber == null) {
            if (other.Stocks_log_operationNumber != null)
                return false;
        } else if (!Stocks_log_operationNumber
                .equals(other.Stocks_log_operationNumber))
            return false;
        if (Stocks_log_operationTime == null) {
            if (other.Stocks_log_operationTime != null)
                return false;
        } else if (!Stocks_log_operationTime
                .equals(other.Stocks_log_operationTime))
            return false;
        if (Stocks_log_operationUser == null) {
            if (other.Stocks_log_operationUser != null)
                return false;
        } else if (!Stocks_log_operationUser
                .equals(other.Stocks_log_operationUser))
            return false;
        return true;
    }

    public int compareTo(Stocks_log o) {
        if (this.hashCode() == o.hashCode()) {
            return 0;
        }
        return -1;
    }
}
