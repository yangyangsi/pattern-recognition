package com.patternRecognition.controller;

import com.patternRecognition.service.PicRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/picRec")
public class PicRecController {
    @Autowired
    PicRecService picRecService;

    //动物识别
    @RequestMapping("/animal")
    public String picRecAnimal(@RequestParam("file")MultipartFile file){
        byte[] data=null;
        try{
            data=file.getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return picRecService.picRecAnimal(data);
    }

    //植物识别
    @RequestMapping("/plan")
    public String picRecPlan(@RequestParam("file")MultipartFile file){
        byte[] data=null;
        try{
            data=file.getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return picRecService.picRecPlan(data);
    }

    //车辆识别
    @RequestMapping("/car")
    public String picRecCar(@RequestParam("file")MultipartFile file){
        byte[] data=null;
        try{
            data=file.getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return picRecService.picRecCar(data);
    }

    //通用物体识别
    @RequestMapping("/general")
    public String picRecGeneral(@RequestParam("file")MultipartFile file){
        byte[] data=null;
        try{
            data=file.getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return picRecService.picRecGeneral(data);
    }

    //菜品识别
    @RequestMapping("/dish")
    public String picRecDish(@RequestParam("file")MultipartFile file){
        byte[] data=null;
        try{
            data=file.getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return picRecService.picRecDish(data);
    }
}
