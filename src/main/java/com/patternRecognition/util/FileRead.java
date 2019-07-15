package com.patternRecognition.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class FileRead {
    public static byte[] ImgRead(String path){
        File file=new File(path);
        //准备文件大小的byte数组
        byte data[]=new byte[(int)file.length()];
        try{
            //使用InputStream进行读取
            InputStream input=new FileInputStream(file);

            int foot=0;//表示字节数组的操作角标
            int temp=0;//表示接收每次读取的字节数据
            //第一部分：temp=input.read()，表示将read()方法读取的字节内容给temp变量
            //第二部分：(temp=input.read())!=-1，判断读取的temp内容是否为-1
            while((temp=input.read())!=-1){
                data [foot++]=(byte)temp; //不能直接输出int要转换数据类型
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }
}
