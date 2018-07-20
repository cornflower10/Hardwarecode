package com.lixin.hardwarecode;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.facebook.stetho.Stetho;
import com.lixin.hardwarecode.greendao.DaoMaster;
import com.lixin.hardwarecode.greendao.DaoSession;

/**
 * Created by xiejingbao on 2018/7/20.
 */

public class App extends Application{
    private static App instance;
    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        setupDatabase();
        Stetho.initializeWithDefaults(this);
    }

    public static App getInstance() {
        return instance;
    }


    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //device.db
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "device.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取dao对象管理者
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
