package com.mashibing.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 费用临时表1
 * </p>
 *
 * @author lian
 * @since 2022-04-11
 */
public class FyMoneyTemporary01 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 费项编码
     */
    private Integer moneyId;

    /**
     * 档案名称
     */
    private String recordName;

    /**
     * 档案备注
     */
    private String recordRemark;

    /**
     * 房间编码
     */
    private Integer cellId;

    /**
     * 房产名称
     */
    private String estateName;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 房间名称
     */
    private String cellName;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 表编号
     */
    private String boxId;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 上次读数
     */
    private Double lastReadNumber;

    /**
     * 本次读数
     */
    private Double currentReadNumber;

    /**
     * 本次用量
     */
    private Double currentUseNumber;

    /**
     * 应缴费用
     */
    private Double shouldPay;

    /**
     * 上次费用止期
     */
    private LocalDateTime lastPayStopDate;

    /**
     * 本次费用起期
     */
    private LocalDateTime currentPayStartDate;

    /**
     * 本次费用止期
     */
    private LocalDateTime currentPayStopDate;

    /**
     * 本次缴费限期
     */
    private LocalDateTime currentPayLimitDate;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 操作人编码
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    /**
     * 费用倍数
     */
    private Integer moneyMult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordRemark() {
        return recordRemark;
    }

    public void setRecordRemark(String recordRemark) {
        this.recordRemark = recordRemark;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Double getLastReadNumber() {
        return lastReadNumber;
    }

    public void setLastReadNumber(Double lastReadNumber) {
        this.lastReadNumber = lastReadNumber;
    }

    public Double getCurrentReadNumber() {
        return currentReadNumber;
    }

    public void setCurrentReadNumber(Double currentReadNumber) {
        this.currentReadNumber = currentReadNumber;
    }

    public Double getCurrentUseNumber() {
        return currentUseNumber;
    }

    public void setCurrentUseNumber(Double currentUseNumber) {
        this.currentUseNumber = currentUseNumber;
    }

    public Double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(Double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public LocalDateTime getLastPayStopDate() {
        return lastPayStopDate;
    }

    public void setLastPayStopDate(LocalDateTime lastPayStopDate) {
        this.lastPayStopDate = lastPayStopDate;
    }

    public LocalDateTime getCurrentPayStartDate() {
        return currentPayStartDate;
    }

    public void setCurrentPayStartDate(LocalDateTime currentPayStartDate) {
        this.currentPayStartDate = currentPayStartDate;
    }

    public LocalDateTime getCurrentPayStopDate() {
        return currentPayStopDate;
    }

    public void setCurrentPayStopDate(LocalDateTime currentPayStopDate) {
        this.currentPayStopDate = currentPayStopDate;
    }

    public LocalDateTime getCurrentPayLimitDate() {
        return currentPayLimitDate;
    }

    public void setCurrentPayLimitDate(LocalDateTime currentPayLimitDate) {
        this.currentPayLimitDate = currentPayLimitDate;
    }

    public Integer getReceiveCycle() {
        return receiveCycle;
    }

    public void setReceiveCycle(Integer receiveCycle) {
        this.receiveCycle = receiveCycle;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    public Double getFloorFactor() {
        return floorFactor;
    }

    public void setFloorFactor(Double floorFactor) {
        this.floorFactor = floorFactor;
    }

    public Integer getMoneyMult() {
        return moneyMult;
    }

    public void setMoneyMult(Integer moneyMult) {
        this.moneyMult = moneyMult;
    }

    @Override
    public String toString() {
        return "FyMoneyTemporary01{" +
        "id=" + id +
        ", moneyId=" + moneyId +
        ", recordName=" + recordName +
        ", recordRemark=" + recordRemark +
        ", cellId=" + cellId +
        ", estateName=" + estateName +
        ", buildingName=" + buildingName +
        ", unitName=" + unitName +
        ", cellName=" + cellName +
        ", customerName=" + customerName +
        ", boxId=" + boxId +
        ", priceUnit=" + priceUnit +
        ", lastReadNumber=" + lastReadNumber +
        ", currentReadNumber=" + currentReadNumber +
        ", currentUseNumber=" + currentUseNumber +
        ", shouldPay=" + shouldPay +
        ", lastPayStopDate=" + lastPayStopDate +
        ", currentPayStartDate=" + currentPayStartDate +
        ", currentPayStopDate=" + currentPayStopDate +
        ", currentPayLimitDate=" + currentPayLimitDate +
        ", receiveCycle=" + receiveCycle +
        ", operatePerson=" + operatePerson +
        ", operateDate=" + operateDate +
        ", floorFactor=" + floorFactor +
        ", moneyMult=" + moneyMult +
        "}";
    }
}
