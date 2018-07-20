package com.lixin.hardwarecode.Dao;

import com.lixin.hardwarecode.App;
import com.lixin.hardwarecode.entity.HistoryDevice;
import com.lixin.hardwarecode.greendao.HistoryDeviceDao;

import java.util.List;

/**
 * Created by xiejingbao on 2018/7/20.
 */

public class HistroyDao {
    /**
     * 添加数据，如果有重复则覆盖
     *
     * @param
     */
    public static void insert(HistoryDevice historyDevice) {
        App.getDaoInstant().getHistoryDeviceDao().insertOrReplace(historyDevice);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void delete(long id) {
        App.getDaoInstant().getHistoryDeviceDao().deleteByKey(id);
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
    public static List<HistoryDevice> queryAll() {
        return App.getDaoInstant().getHistoryDeviceDao().queryBuilder().orderDesc(HistoryDeviceDao.Properties.CreateDate).list();
    }
}
