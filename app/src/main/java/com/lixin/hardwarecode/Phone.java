package com.lixin.hardwarecode;

import java.io.Serializable;

/**
 * Created by xiejingbao on 2018/7/19.
 */

public class Phone implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 15507412965
     17636530465
     13131969504
     15628164784
     16608858649
     18501948980
     15620802593
     15628972026
     13069954118
     13120457918
     */

    /**
     * imei
     * 459923836996593
     404415491350354
     229190757052323
     161078291353336
     304673399909167
     491529720080895
     344862058517653
     054303950586170
     934209100437031
     041384572811716
     454208750821298
     268204035652673
     846182587944881
     858409440374207
     574705766326884
     */
    /**
     * android id
     * sbg79s4nc2l6molu
     adjphn7goenwwqwo
     roai8kp2q49klar6
     2yxzudeo8bymfdl0
     nag15b8ep66mrr0m
     nrpd29xlbl2712vv
     xxgb21bo56sxtamu
     gtg37bqid4plak75
     1qispdqru7cuqffp
     qxma2wf8a1i90qmw
     */
    /**
     * SimSerial
     * 02141068855337204684
     63699568568781508059
     06188053698520372500
     86428663427546986390
     53929745562008357273
     93201515995241839973
     71910766248643898453
     66766914658926294289
     30387911861684610037
     06743810877847554320
     83068405200473876255
     49752737622956542446
     55583414058017247907
     03382231164981038951
     85918890066786388193
     */
    /**
     * IMEI : 506066104722640
     * LYMAC : BC:1A:EA:D9:8D:98
     * WifiMAC : a8:a6:68:a3:d9:ef
     * WifiName : netss
     * BSSID : ce:ea:8c:1a:5c:b2
     * IMSI : 460017932859596
     * PhoneNumber : 13117511178
     * SimSerial : 89860179328595969501
     * getType : 1
     * networkType : 6
     * phonetype : 5
     * SimState : 10
     * serial : aee5060e
     * AndroidID : fc4ad25f66d554a8
     * DESCRIPTION : jfltexx-user 4.3 JSS15J I9505XXUEML1 release-keys
     * lat : 117.2
     * log : 39.12
     */

    /**
     *     mySP.setSharedPref("networktor", "46001"); // 网络运营商类型
     mySP.setSharedPref("Carrier", "中国联通");// 网络类型名
     mySP.setSharedPref("CarrierCode", "46001"); // 运营商
     mySP.setSharedPref("simopename", "中国联通");// 运营商名字
     */
    private String IMEI;
    private String LYMAC;
    private String WifiMAC;
    private String WifiName;
    private String BSSID;
    private String IMSI;
    private String PhoneNumber;
    private String SimSerial;
    private int getType;
    private int networkType;
    private int phonetype;
    private int SimState;
    private String serial;
    private String AndroidID;
    private String DESCRIPTION;
    private float lat;
    private float log;
    private String networktor;
    private String Carrier;
    private String CarrierCode;
    private String simopename;
    private String serialCPU;

    public String getSerialCPU() {
        return serialCPU;
    }

    public void setSerialCPU(String serialCPU) {
        this.serialCPU = serialCPU;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getLYMAC() {
        return LYMAC;
    }

    public void setLYMAC(String LYMAC) {
        this.LYMAC = LYMAC;
    }

    public String getWifiMAC() {
        return WifiMAC;
    }

    public void setWifiMAC(String WifiMAC) {
        this.WifiMAC = WifiMAC;
    }

    public String getWifiName() {
        return WifiName;
    }

    public void setWifiName(String WifiName) {
        this.WifiName = WifiName;
    }

    public String getBSSID() {
        return BSSID;
    }

    public void setBSSID(String BSSID) {
        this.BSSID = BSSID;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getSimSerial() {
        return SimSerial;
    }

    public void setSimSerial(String SimSerial) {
        this.SimSerial = SimSerial;
    }

    public int getGetType() {
        return getType;
    }

    public void setGetType(int getType) {
        this.getType = getType;
    }

    public int getNetworkType() {
        return networkType;
    }

    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }

    public int getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(int phonetype) {
        this.phonetype = phonetype;
    }

    public int getSimState() {
        return SimState;
    }

    public void setSimState(int SimState) {
        this.SimState = SimState;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getAndroidID() {
        return AndroidID;
    }

    public void setAndroidID(String AndroidID) {
        this.AndroidID = AndroidID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLog() {
        return log;
    }

    public void setLog(float log) {
        this.log = log;
    }

    public String getNetworktor() {
        return networktor;
    }

    public void setNetworktor(String networktor) {
        this.networktor = networktor;
    }

    public String getCarrier() {
        return Carrier;
    }

    public void setCarrier(String carrier) {
        Carrier = carrier;
    }

    public String getCarrierCode() {
        return CarrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        CarrierCode = carrierCode;
    }

    public String getSimopename() {
        return simopename;
    }

    public void setSimopename(String simopename) {
        this.simopename = simopename;
    }
}
