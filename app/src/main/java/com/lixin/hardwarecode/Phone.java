package com.lixin.hardwarecode;

import java.io.Serializable;

/**
 * Created by xiejingbao on 2018/7/19.
 */

public class Phone implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * id : 8
     * imei : 594372885650950
     * ly_mac : B3:CE:16:7C:C5:5C
     * wifi_mac : 23:ed:91:1f:09:b0
     * wifi_name : TP-LINK8w
     * bss_id : 86:39:5e:e4:0d:78
     * imsi : 109889280878602
     * phone_no : 13837099409
     * sim_serial : 35936416526185198595
     * get_type : 1
     * network_type : 6
     * phone_type : 5
     * sim_state : 10
     * serial : vrj3huz7qx5ameih
     * android_id : tr6dnzlz270i69ck
     * description : user unknow release-keys
     * lat : 115.65
     * log : 34.45
     * serial_cpu : 5b39vappm39tq2n4
     * province : 河南,商丘市
     * networktor : 46000
     * carrier : 中国移动
     * carrier_code : 46000
     * sim_opename : 中国移动
     */

    private int id;
    private String imei;
    private String ly_mac;
    private String wifi_mac;
    private String wifi_name;
    private String bss_id;
    private String imsi;
    private String phone_no;
    private String sim_serial;
    private int get_type;
    private int network_type;
    private int phone_type;
    private int sim_state;
    private String serial;
    private String android_id;
    private String description;
    private String lat;
    private String log;
    private String serial_cpu;
    private String province;
    private String networktor;
    private String carrier;
    private String carrier_code;
    private String sim_opename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLy_mac() {
        return ly_mac;
    }

    public void setLy_mac(String ly_mac) {
        this.ly_mac = ly_mac;
    }

    public String getWifi_mac() {
        return wifi_mac;
    }

    public void setWifi_mac(String wifi_mac) {
        this.wifi_mac = wifi_mac;
    }

    public String getWifi_name() {
        return wifi_name;
    }

    public void setWifi_name(String wifi_name) {
        this.wifi_name = wifi_name;
    }

    public String getBss_id() {
        return bss_id;
    }

    public void setBss_id(String bss_id) {
        this.bss_id = bss_id;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getSim_serial() {
        return sim_serial;
    }

    public void setSim_serial(String sim_serial) {
        this.sim_serial = sim_serial;
    }

    public int getGet_type() {
        return get_type;
    }

    public void setGet_type(int get_type) {
        this.get_type = get_type;
    }

    public int getNetwork_type() {
        return network_type;
    }

    public void setNetwork_type(int network_type) {
        this.network_type = network_type;
    }

    public int getPhone_type() {
        return phone_type;
    }

    public void setPhone_type(int phone_type) {
        this.phone_type = phone_type;
    }

    public int getSim_state() {
        return sim_state;
    }

    public void setSim_state(int sim_state) {
        this.sim_state = sim_state;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getAndroid_id() {
        return android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getSerial_cpu() {
        return serial_cpu;
    }

    public void setSerial_cpu(String serial_cpu) {
        this.serial_cpu = serial_cpu;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNetworktor() {
        return networktor;
    }

    public void setNetworktor(String networktor) {
        this.networktor = networktor;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier_code() {
        return carrier_code;
    }

    public void setCarrier_code(String carrier_code) {
        this.carrier_code = carrier_code;
    }

    public String getSim_opename() {
        return sim_opename;
    }

    public void setSim_opename(String sim_opename) {
        this.sim_opename = sim_opename;
    }
}
