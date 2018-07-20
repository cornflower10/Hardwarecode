package com.lixin.hardwarecode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lixin.hardwarecode.Dao.AllDeviceAndPhoneDao;
import com.lixin.hardwarecode.Dao.HistroyDao;
import com.lixin.hardwarecode.Utis.Mnt;
import com.lixin.hardwarecode.Utis.ReadAssets;
import com.lixin.hardwarecode.Utis.SharedPref;
import com.lixin.hardwarecode.adapter.AllDeviceAdapter;
import com.lixin.hardwarecode.entity.AllDeviceAndPhone;
import com.lixin.hardwarecode.entity.DeviceAndPhone;
import com.lixin.hardwarecode.entity.HistoryDevice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rv)
    RecyclerView rv;
    private   List<DeviceAndPhone> deviceAndPhones = new ArrayList<>();
    private AllDeviceAdapter allDeviceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
        allDeviceAdapter = new AllDeviceAdapter(deviceAndPhones) ;
        rv.setAdapter(allDeviceAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initData();
        Log.e("MainActivity",getCpu());

    }

    private void initData() {
        AllDeviceAndPhoneDao.deleteAll();
        String str = ReadAssets.readAssetsTxt(this, "device.json");
        String strPhone = ReadAssets.readAssetsTxt(this, "phone.json");
        List<Device> list = JSONObject.parseArray(str, Device.class);
        List<Phone> phones = JSONObject.parseArray(strPhone, Phone.class);
        List<DeviceAndPhone> deviceAndPhoneList = new ArrayList<>();
        if (list.size() >= phones.size()) {
            for (Device d : list) {
                DeviceAndPhone deviceAndPhone = new DeviceAndPhone();
                deviceAndPhone.setDevice(d);
                deviceAndPhoneList.add(deviceAndPhone);
            }

            for (int i = 0; i < phones.size(); i++) {
                deviceAndPhoneList.get(i).setPhone(phones.get(i));
            }

        } else {

            for (Phone phone : phones) {
                DeviceAndPhone deviceAndPhone = new DeviceAndPhone();
                deviceAndPhone.setPhone(phone);
                deviceAndPhoneList.add(deviceAndPhone);
            }

            for (int i = 0; i < list.size(); i++) {
                deviceAndPhoneList.get(i).setDevice(list.get(i));
            }
        }

        //json格式保存手机

        List<AllDeviceAndPhone> allDeviceAndPhoneList = new ArrayList<>();
        for (DeviceAndPhone deviceAndPhone : deviceAndPhoneList) {
            AllDeviceAndPhone allDeviceAndPhone = new AllDeviceAndPhone();
            allDeviceAndPhone.setContent(JSONObject.toJSONString(deviceAndPhone));
            allDeviceAndPhone.setCreateDate(new Date());
            allDeviceAndPhoneList.add(allDeviceAndPhone);
        }
        AllDeviceAndPhoneDao.insertList(allDeviceAndPhoneList);
        List<AllDeviceAndPhone> all = AllDeviceAndPhoneDao.queryAll();
        deviceAndPhones.clear();
        for (AllDeviceAndPhone item :all){
          DeviceAndPhone deviceAndPhone = JSON.parseObject(item.getContent(),DeviceAndPhone.class);
            deviceAndPhones.add(deviceAndPhone);
        }

        allDeviceAdapter.replaceData(deviceAndPhones);
        allDeviceAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                DeviceAndPhone deviceAndPhone = deviceAndPhones.get(position);
                Device device = deviceAndPhone.getDevice();
                Phone phone = deviceAndPhone.getPhone();
                Save(device,phone);
                HistoryDevice historyDevice = new HistoryDevice();
                historyDevice.setCreateDate(new Date());
                historyDevice.setContent(JSONObject.toJSONString(deviceAndPhone));
                HistroyDao.insert(historyDevice);
            }
        });
    }



    public static String getCpu() {
        StringBuffer sb = new StringBuffer();
        try {
            FileReader fr = new FileReader("/proc/cpuinfo");
            BufferedReader br = new BufferedReader(fr);
            String aLine;
            while ((aLine = br.readLine()) != null) {
                sb.append(aLine + "\n");
            }
            if (br != null) {
                br.close();
            }
           return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void Save( Device device,Phone phone) {


        SharedPref mySP = new SharedPref(getApplicationContext());
    /*
      build 系列
     */

        mySP.setSharedPref("getBaseband", device.getGetBaseband()); // get 参数
        mySP.setSharedPref("BaseBand", device.getBaseBand()); // 固件版本
        mySP.setSharedPref("board", device.getBoard()); //主板
        mySP.setSharedPref("brand", device.getBrand()); //设备品牌
        mySP.setSharedPref("ABI", "armeabi-v7a"); //  设备指令集名称 1
        mySP.setSharedPref("ABI2", "armeabi"); //   设备指令集名称 2
        mySP.setSharedPref("device", device.getDevice()); //设备驱动名称
        mySP.setSharedPref("display", device.getDisplay()); //设备显示的版本包 固件版本
        //  指纹 设备的唯一标识。由设备的多个信息拼接合成。
        mySP.setSharedPref("fingerprint", device.getFingerprint());
        mySP.setSharedPref("NAME", device.getName()); //设备硬件名称
        mySP.setSharedPref("ID", device.getId()); //设备版本号
        mySP.setSharedPref("Manufacture", device.getManufacture()); //设备制造商
        mySP.setSharedPref("model", device.getModel()); //手机的型号 设备名称
        mySP.setSharedPref("product", device.getProduct()); //设备驱动名称
        mySP.setSharedPref("booltloader", "unknown"); //设备引导程序版本号
        mySP.setSharedPref("host", device.getHost()); //设备主机地址
        mySP.setSharedPref("build_tags", "release-keys"); //设备标签
        mySP.setSharedPref("shenbei_type", "user"); //设备版本类型
        mySP.setSharedPref("incrementalincremental", device.getIncrementalincremental()); //源码控制版本号
        mySP.setSharedPref("AndroidVer", device.getAndroidVer()); //系统版本
        mySP.setSharedPref("API", device.getApi()); //系统的API级别 SDK

        mySP.setSharedPref("time", device.getTime());// 固件时间
        mySP.setintSharedPref("width", device.getWidth()); // 宽
        mySP.setintSharedPref("height", device.getHeight()); // 高

    /*
     屏幕相关
     */
        mySP.setintSharedPref("DPI", device.getDpi()); // dpi
        mySP.setfloatharedPref("density", device.getDensity()); // density
        mySP.setfloatharedPref("xdpi", device.getXdpi());
        mySP.setfloatharedPref("ydpi", device.getYdpi());
        mySP.setfloatharedPref("scaledDensity", device.getScaledDensity()); // 字体缩放比例



 /*
    显卡信息
     */

        mySP.setSharedPref("GLRenderer", device.getGlrenderer()); // GPU
        mySP.setSharedPref("GLVendor", device.getGlvendor());// GPU厂商

        mySP.setSharedPref("gjISO", "cn");// 国家iso代码
        mySP.setSharedPref("CountryCode", "cn");// 手机卡国家
        mySP.setSharedPref("deviceversion", device.getDeviceversion()); // 返回系统版本



 /*
     TelephonyManager相关
     */
        mySP.setSharedPref("IMEI", phone.getIMEI()); // 序列号IMEI
        mySP.setSharedPref("LYMAC", phone.getLYMAC());//蓝牙 MAC
        mySP.setSharedPref("WifiMAC", phone.getWifiMAC()); // WIF mac地址
        mySP.setSharedPref("WifiName", phone.getWifiName()); // 无线路由器名
        mySP.setSharedPref("BSSID", phone.getBSSID()); // 无线路由器地址
        mySP.setSharedPref("IMSI", phone.getIMSI());
        mySP.setSharedPref("PhoneNumber", phone.getPhoneNumber()); // 手机号码
        mySP.setSharedPref("SimSerial", phone.getSerial()); // 手机卡序列号
        mySP.setSharedPref("networktor", "46001"); // 网络运营商类型
        mySP.setSharedPref("Carrier", "中国联通");// 网络类型名
        mySP.setSharedPref("CarrierCode", "46001"); // 运营商
        mySP.setSharedPref("simopename", "中国联通");// 运营商名字

        mySP.setintSharedPref("getType", phone.getGetType()); // 联网方式 1为WIFI 2为流量
        mySP.setintSharedPref("networkType", phone.getNetworkType());//      网络类型
        mySP.setintSharedPref("phonetype", phone.getPhonetype()); // 手机类型
        mySP.setintSharedPref("SimState", phone.getSimState()); // 手机卡状态

        mySP.setSharedPref("serial", phone.getSerial()); // 串口序列号
        mySP.setSharedPref("AndroidID", phone.getAndroidID()); //  android id
        mySP.setSharedPref("DESCRIPTION", phone.getDESCRIPTION()); //用户的KEY

//        mySP.setintSharedPref("getIP", -123456789); // 内网ip(wifl可用)



            /*
            位置信息

        30.2425140000,120.1404220000 杭州
     */

        mySP.setfloatharedPref("lat", phone.getLat()); // 纬度
        mySP.setfloatharedPref("log", phone.getLog()); // 经度


        Toast.makeText(this, "保存成功", Toast.LENGTH_LONG).show();


    }






/*
  创建 cpuinfo 文件 等待HOOK 重定向
 */

    private void CPU(Device device,Phone phone) {

        String filePath = "/sdcard/Test/";
        String fileName = "cpuinfo";

        String hardware = device.getHardware();

        //生成文件夹之后，再生成文件，不然会出错
        Mnt.makeFilePath(filePath, fileName);

        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = "Processor	: ARMv7 Processor rev 0 (v7l)" + "\r\n";
        String strContent2 = "processor	: 0" + "\r\n";
        String strContent3 = "BogoMIPS	: 38.40";
        String strContent4 = "" + "\r\n";
        String strContent5 = "" + "\r\n";
        String strContent6 = "processor	: 1" + "\r\n";
        String strContent7 = "BogoMIPS	: 38.40" + "\r\n";
        String strContent8 = "" + "\r\n";
        String strContent9 = "Features	: swp half thumb fastmult vfp edsp neon vfpv3 tls vfpv4 idiva idivt" + "\r\n";
        String strContent10 = "CPU implementer	: 0x51" + "\r\n";
        String strContent11 = "CPU architecture: 7" + "\r\n";
        String strContent12 = "CPU variant	: 0x2" + "\r\n";
        String strContent13 = "CPU part	: 0x06f" + "\r\n";
        String strContent14 = "CPU revision	: 0" + "\r\n";
        String strContent15 = "" + "\r\n";
        String strContent16 = "Hardware	: " + hardware + "\r\n";
        String strContent17 = "Revision	: 000d" + "\r\n";
        String strContent18 = "Serial		: "+phone.getSerialCPU() + "\r\n";
        try {
            File file = new File(strFilePath);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }


            //要先将已有文件删除、避免干扰。
            if (file.exists()) {
                file.delete();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rwd");
            raf.seek(file.length());
            raf.write(strContent.getBytes());
            raf.write(strContent2.getBytes());
            raf.write(strContent3.getBytes());
            raf.write(strContent4.getBytes());
            raf.write(strContent5.getBytes());
            raf.write(strContent6.getBytes());
            raf.write(strContent7.getBytes());
            raf.write(strContent8.getBytes());
            raf.write(strContent9.getBytes());
            raf.write(strContent10.getBytes());
            raf.write(strContent11.getBytes());
            raf.write(strContent12.getBytes());
            raf.write(strContent13.getBytes());
            raf.write(strContent14.getBytes());
            raf.write(strContent15.getBytes());
            raf.write(strContent16.getBytes());
            raf.write(strContent17.getBytes());
            raf.write(strContent18.getBytes());
            raf.close();
        } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }


    }


}
