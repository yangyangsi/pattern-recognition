package com.patternRecognition;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.patternRecognition.util.ClientSingleton;
import com.patternRecognition.util.FileRead;
import com.patternRecognition.util.PicRec;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PictureTest {
    //设置APPID/AK/SK
    public static final String APP_ID = "16426820";
    public static final String API_KEY = "97bSWhrNoV5iAWN4U6j6POkD";
    public static final String SECRET_KEY = "5KArTEyl9GDoGdlM5i3BHVHU6flynGSy";

    @Autowired
    AipImageClassify client;
    @Test
    public void picPlanTest(){
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");

        // 调用接口
        String path = "D:/Test/yumi.jpg";
        JSONObject res = client.plantDetect(path, options);
        try {
            System.out.println(res.toString(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void picTest(){
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");

        // 调用接口
        String path = "D:/Test/yumi.jpg";
        JSONObject res = client.plantDetect(path, options);
        try {
            System.out.println(res.toString(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void picPlanByteTest(){
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");

        // 调用接口
        byte[] bytes=FileRead.ImgRead("D:/Test/yumi.jpg") ;
        JSONObject res = client.plantDetect(bytes, options);
        try {
            System.out.println(res.toString(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void utilTest(){
        System.out.println(PicRec.animalRec(client,FileRead.ImgRead("D:/Test/haitun.jpg")));
    }
}
