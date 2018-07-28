package com.lixin.hardwarecode.entity;

public class CityLatLog {


    /**
     * province : 省份
     * city : 地市
     * county : 区县
     * latitude : 经度
     * longitude : 纬度
     */

    private String province;
    private String city;
    private String county;
    private String latitude;
    private String longitude;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
