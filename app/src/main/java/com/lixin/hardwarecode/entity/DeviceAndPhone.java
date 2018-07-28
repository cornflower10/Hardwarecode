package com.lixin.hardwarecode.entity;

import com.lixin.hardwarecode.Device;
import com.lixin.hardwarecode.Phone;

import java.io.Serializable;

/**
 * Created by xiejingbao on 2018/7/20.
 */

public class DeviceAndPhone implements Serializable{
    private static final long serialVersionUID = 1L;
    private Device device;
    private Phone phone;
    private long allPDId;

    public long getAllPDId() {
        return allPDId;
    }

    public void setAllPDId(long allPDId) {
        this.allPDId = allPDId;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
