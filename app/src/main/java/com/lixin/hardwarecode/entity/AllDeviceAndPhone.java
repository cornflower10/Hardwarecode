package com.lixin.hardwarecode.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by xiejingbao on 2018/7/20.
 */
@Entity
public class AllDeviceAndPhone {
    @Id(autoincrement = true)
    private Long id;
    private String content;
    private Date createDate;
    @Generated(hash = 740039994)
    public AllDeviceAndPhone(Long id, String content, Date createDate) {
        this.id = id;
        this.content = content;
        this.createDate = createDate;
    }
    @Generated(hash = 362447228)
    public AllDeviceAndPhone() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
