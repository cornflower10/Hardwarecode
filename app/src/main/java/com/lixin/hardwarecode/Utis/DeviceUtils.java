package com.lixin.hardwarecode.Utis;

import java.util.Random;

/**
 * Created by xiejingbao on 2018/7/20.
 */

public class DeviceUtils {

    public static String  IMEI(){
       return getRandomNO(15);
    }

    public static String  IMSI(){
        return getRandomNO(15);
    }
    public static String  simSerial(){
        return getRandomNO(20);
    }
    public static String  androidId(){
        return getRandomString(16);
    }
    public static String  serialCPU(){
        return getRandomString(16);
    }

    public static String  serial(){
        return getRandomString(16);
    }




    public static String  LYMAC(){
        StringBuilder stringBuilder =new StringBuilder();
        Random random=new Random();
        String[] str = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        for (int i = 0; i <6 ; i++) {
            stringBuilder.append(str[random.nextInt(16)]);
            stringBuilder.append(str[random.nextInt(16)]);
            if(i!=5)
            stringBuilder.append(":");
        }

        return stringBuilder.toString();
    }

    public static String  BSSID(){
        return wifiMAC();
    }

    public static String  wifiMAC(){
        StringBuilder stringBuilder =new StringBuilder();
        Random random=new Random();
        String[] str = {"0","1","2","3","4","5","6","7","8","9","a","b","C","d","e","f"};
        for (int i = 0; i <6 ; i++) {
            stringBuilder.append(str[random.nextInt(16)]);
            stringBuilder.append(str[random.nextInt(16)]);
            if(i!=5)
                stringBuilder.append(":");
        }

        return stringBuilder.toString();
    }



    public static String getRandomString(int length){

        String str="a9bc14def423ghijk05lm6n3op37q67rstuvw89xyz";

        Random random=new Random();

        StringBuffer sb=new StringBuffer();

        for(int i=0;i<length;i++){

            int number=random.nextInt(str.length());

            sb.append(str.charAt(number));

        }

        return sb.toString();

    }

    public static String getRandomNO(int length) {

        StringBuilder str = new StringBuilder();//定义变长字符串
        Random random = new Random();
        //随机生成数字，并添加到字符串
        for (int i = 0; i < length; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

    /**
     * 中国移动号段有：

     中国联通号段有：130、131、132、155、156、145、176、185、186、166
     中国电信号段有：133、149、153、173、177、180、181、189、199
     */

    private static  String mobile = "134、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188、198";
    private static  String lt = "130、131、132、155、156、145、176、185、186、166";
    private static  String dx = "133、149、153、173、177、180、181、189、199";

    private static String[] phoneHead ={"134","135","136","137","138","139","130","131","132","147","150","151","152","157","158","159",
            "178","182","183","184","187","188","198","155","156","176","185","186","166","149","153","173","177","180","181","189","199"};
    public static String phoneNo(){
        Random random = new Random();
        return  phoneHead[random.nextInt(phoneHead.length)]+getRandomNO(8);

    }
    public static String phoneNameByNo(String phone){
       String str = phone.substring(0,3);
       if(mobile.contains(str))
           return "中国移动";
       else if(lt.contains(str))
           return "中国联通";
       else if(dx.contains(str))
           return "中国电信";
          return "";

    }


    public static String mobileCode(String phone){
        String str = phone.substring(0,3);
        if(mobile.contains(str))
        {
            if(str.equals("134")||str.equals("159"))
            return "46002";
            else {
                return "46000";
            }
        }
        else if(lt.contains(str))
            return "46001";
        else if(dx.contains(str))
            return "46003";
        return "";

    }
}

