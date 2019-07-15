package com.patternRecognition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReadTest {
    @Test
    public void ReadTest(){
        File file=new File("D:/Test/yumi.jpg");
        try{
            //使用InputStream进行读取
            InputStream input=new FileInputStream(file);
            //准备一个1024数组
            byte data[]=new byte[1024*1024*4];

            int foot=0;//表示字节数组的操作角标
            int temp=0;//表示接收每次读取的字节数据
            //第一部分：temp=input.read()，表示将read()方法读取的字节内容给temp变量
            //第二部分：(temp=input.read())!=-1，判断读取的temp内容是否为-1
            while((temp=input.read())!=-1){
                data [foot++]=(byte)temp; //不能直接输出int要转换数据类型
            }

            input.close();
            //将读取得到的字节数组数据变为字符串进行输出
            for(int i=0;i<1024;i++){
                System.out.println(data[i]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void FileSizeTest(){
        File file=new File("D:/Test/yumi.jpg");
        System.out.println(file.length());
    }
}
