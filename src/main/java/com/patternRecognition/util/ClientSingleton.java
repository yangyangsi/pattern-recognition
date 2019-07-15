package com.patternRecognition.util;

import com.baidu.aip.imageclassify.AipImageClassify;

//以单例模式获取用户
public class ClientSingleton {

    //设置APPID/AK/SK
    public static final String APP_ID = "16426820";
    public static final String API_KEY = "97bSWhrNoV5iAWN4U6j6POkD";
    public static final String SECRET_KEY = "5KArTEyl9GDoGdlM5i3BHVHU6flynGSy";

    private static AipImageClassify client=null;
    private ClientSingleton(){

    }
    public static AipImageClassify getClient(){
        if(client==null){
            synchronized (ClientSingleton.class){
                if(client==null){
                    client=new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
                }
            }
        }
        return client;
    }
}
