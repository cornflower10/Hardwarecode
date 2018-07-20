package com.lixin.hardwarecode.Dao;

import com.lixin.hardwarecode.App;
import com.lixin.hardwarecode.entity.AllDeviceAndPhone;

import java.util.List;

/**
 * Created by xiejingbao on 2018/7/20.
 */

public class AllDeviceAndPhoneDao {
    /**
     * 添加数据，如果有重复则覆盖
     *
     * @param
     */
    public static void insert(AllDeviceAndPhone allDeviceAndPhone) {
        App.getDaoInstant().getAllDeviceAndPhoneDao().insertOrReplace(allDeviceAndPhone);
    }

    public static void insertList(List<AllDeviceAndPhone> allDeviceAndPhones) {
        App.getDaoInstant().getAllDeviceAndPhoneDao().insertInTx(allDeviceAndPhones);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void delete(long id) {
        App.getDaoInstant().getAllDeviceAndPhoneDao().deleteByKey(id);
    }
    public static void deleteAll() {
        App.getDaoInstant().getAllDeviceAndPhoneDao().deleteAll();
    }

//    /**
//     * 更新数据
//     */
//    public static void updateShop(HistoryDevice historyDevice) {
//        App.getDaoInstant().getHistoryDeviceDao().update(historyDevice);
//    }

    /**
     * 查询所有数据按照时间排序
     *
     * @return
     */
    public static List<AllDeviceAndPhone> queryAll() {
        return App.getDaoInstant().getAllDeviceAndPhoneDao().queryBuilder().orderDesc(com.lixin.hardwarecode.greendao.AllDeviceAndPhoneDao.Properties.CreateDate).list();
    }
}
