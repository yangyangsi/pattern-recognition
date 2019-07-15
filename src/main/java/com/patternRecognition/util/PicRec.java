package com.patternRecognition.util;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

public class PicRec {
    //植物识别
    public static String planRec(AipImageClassify client,byte[] data){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num","3");
        options.put("baike_num", "5");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 参数为本地路径
        JSONObject res = client.plantDetect(data, options);
        return res.toString(2);
    }
    //动物识别
    public static String animalRec(AipImageClassify client,byte[] data){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num","3");
        options.put("baike_num", "5");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 参数为本地路径
        JSONObject res = client.animalDetect(data, options);
        return res.toString(2);
    }

    //车辆识别
    public static String carRec(AipImageClassify client,byte[] data){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num","3");
        options.put("baike_num", "5");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 参数为本地路径
        JSONObject res = client.carDetect(data, options);
        return res.toString(2);
    }

    //通用物体识别
    public static String generalRec(AipImageClassify client,byte[] data){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num","3");
        options.put("baike_num", "5");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 参数为本地路径
        JSONObject res = client.advancedGeneral(data, options);
        return res.toString(2);
    }

    //菜品识别
    public static String dishRec(AipImageClassify client,byte[] data){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num","3");
        options.put("filter_threshold", "0.7");
        options.put("baike_num", "5");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 参数为本地路径
        JSONObject res = client.dishDetect(data, options);
        return res.toString(2);
    }
}
