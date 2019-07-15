package com.patternRecognition;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.patternRecognition.util.ClientSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecognitionApplication {
    public static void main(String[] args){
        SpringApplication.run(RecognitionApplication.class,args);
    }

    @Bean
    public AipImageClassify aipImageClassify(){
        return new AipImageClassify(ClientSingleton.APP_ID,ClientSingleton.API_KEY,ClientSingleton.SECRET_KEY);
    }
}
