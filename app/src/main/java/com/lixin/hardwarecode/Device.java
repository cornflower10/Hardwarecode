package com.lixin.hardwarecode;

import java.io.Serializable;

/**
 * Created by xiejingbao on 2018/7/19.
 */

public class Device implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * getBaseband : SCL23KDU1BNG3
     * board : REL
     * brand : hwG750-T01
     * device : Huawei
     * display : hwG750-T01
     * fingerprint : Huawei/G750-T01/hwG750-T01:4.2.2/HuaweiG750-T01/C00B152:user/ota-rel-keys,release-keys
     * model : HUAWEI G750-T01
     * product : hwG750-T01
     * booltloader : unknown
     * host : huawei-RH46573-V1
     * build_tags : release-keys
     * shenbei_type : user
     * incrementalincremental : eng.root.20151207
     * time : 1474400147000
     * width : 720
     * height : 1280
     * density : 2
     * xdpi : 200.123
     * ydpi : 211.123
     * scaledDensity : 2
     * gjISO : cn
     * deviceversion : 100
     * id : hwG750-T01
     * api : 26
     * name : huawei
     * baseBand : huawei
     * abi : armeabi-v7a
     * abi2 : armeabi
     * manufacture : HUAWEI
     * androidVer : 6.0
     * dpi : 320
     * glrenderer : Adreno (TM) 111
     * glvendor : UFU
     * countryCode : cn
     */

    private String getBaseband;
    private String board;
    private String brand;
    private String device;
    private String display;
    private String fingerprint;
    private String model;
    private String product;
    private String booltloader;
    private String host;
    private String build_tags;
    private String shenbei_type;
    private String incrementalincremental;
    private String time;
    private int width;
    private int height;
    private float density;
    private float xdpi;
    private float ydpi;
    private float scaledDensity;
    private String gjISO;
    private String deviceversion;
    private String id;
    private String api;
    private String name;
    private String baseBand;
    private String abi;
    private String abi2;
    private String manufacture;
    private String androidVer;
    private int dpi;
    private String glrenderer;
    private String glvendor;
    private String countryCode;

    private String hardware;

//      "hardware":"MTK Helio P60",
//              "serial":"327408738jkf3sdj"

    public String getGetBaseband() {
        return getBaseband;
    }

    public void setGetBaseband(String getBaseband) {
        this.getBaseband = getBaseband;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBooltloader() {
        return booltloader;
    }

    public void setBooltloader(String booltloader) {
        this.booltloader = booltloader;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBuild_tags() {
        return build_tags;
    }

    public void setBuild_tags(String build_tags) {
        this.build_tags = build_tags;
    }

    public String getShenbei_type() {
        return shenbei_type;
    }

    public void setShenbei_type(String shenbei_type) {
        this.shenbei_type = shenbei_type;
    }

    public String getIncrementalincremental() {
        return incrementalincremental;
    }

    public void setIncrementalincremental(String incrementalincremental) {
        this.incrementalincremental = incrementalincremental;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getXdpi() {
        return xdpi;
    }

    public void setXdpi(float xdpi) {
        this.xdpi = xdpi;
    }

    public float getYdpi() {
        return ydpi;
    }

    public void setYdpi(float ydpi) {
        this.ydpi = ydpi;
    }

    public float getScaledDensity() {
        return scaledDensity;
    }

    public void setScaledDensity(float scaledDensity) {
        this.scaledDensity = scaledDensity;
    }

    public String getGjISO() {
        return gjISO;
    }

    public void setGjISO(String gjISO) {
        this.gjISO = gjISO;
    }

    public String getDeviceversion() {
        return deviceversion;
    }

    public void setDeviceversion(String deviceversion) {
        this.deviceversion = deviceversion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseBand() {
        return baseBand;
    }

    public void setBaseBand(String baseBand) {
        this.baseBand = baseBand;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public String getAbi2() {
        return abi2;
    }

    public void setAbi2(String abi2) {
        this.abi2 = abi2;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getAndroidVer() {
        return androidVer;
    }

    public void setAndroidVer(String androidVer) {
        this.androidVer = androidVer;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getGlrenderer() {
        return glrenderer;
    }

    public void setGlrenderer(String glrenderer) {
        this.glrenderer = glrenderer;
    }

    public String getGlvendor() {
        return glvendor;
    }

    public void setGlvendor(String glvendor) {
        this.glvendor = glvendor;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

}
