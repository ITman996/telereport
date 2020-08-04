package com.example.demo.entity;

import java.util.Date;

public class RpPreFeeRecordT {
        private String id;
        private Date recordDate;
        private String cityCode;
        private RpCityCodeT rpCityCodeT;
        private String productCode;
        private RpProductCodeT rpProductCodeT;
        private String writeOffTypeCode;
        private RpWriteOffTypeCodeT rpWriteOffTypeCodeT;
        private Double writeOffFee;
        private Date updateTime;

        public String getCityCode() {
            return cityCode;
        }
        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }
        public String getProductCode() {
            return productCode;
        }
        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }
        public String getWriteOffTypeCode() {
            return writeOffTypeCode;
        }
        public void setWriteOffTypeCode(String writeOffTypeCode) {
            this.writeOffTypeCode = writeOffTypeCode;
        }
        public Double getWriteOffFee() {
            return writeOffFee;
        }
        public void setWriteOffFee(Double writeOffFee) {
            this.writeOffFee = writeOffFee;
        }
        public Date getUpdateTime() {
            return updateTime;
        }
        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }
        public RpCityCodeT getRpCityCodeT() {
            return rpCityCodeT;
        }
        public void setRpCityCodeT(RpCityCodeT rpCityCodeT) {
            this.rpCityCodeT = rpCityCodeT;
        }
        public RpProductCodeT getRpProductCodeT() {
            return rpProductCodeT;
        }
        public void setRpProductCodeT(RpProductCodeT rpProductCodeT) {
            this.rpProductCodeT = rpProductCodeT;
        }
        public RpWriteOffTypeCodeT getRpWriteOffTypeCodeT() {
            return rpWriteOffTypeCodeT;
        }
        public void setRpWriteOffTypeCodeT(RpWriteOffTypeCodeT rpWriteOffTypeCodeT) {
            this.rpWriteOffTypeCodeT = rpWriteOffTypeCodeT;
        }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}


