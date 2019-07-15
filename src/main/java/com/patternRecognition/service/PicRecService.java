package com.patternRecognition.service;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.patternRecognition.util.PicRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PicRecService {

    @Autowired
    AipImageClassify client;

    public String picRecAnimal(byte[] data){ return PicRec.animalRec(client,data);}

    public String picRecPlan(byte[] data){
        return PicRec.planRec(client,data);
    }

    public String picRecCar(byte[] data){
        return PicRec.carRec(client,data);
    }

    public String picRecGeneral(byte[] data){return PicRec.generalRec(client,data);}

    public String picRecDish(byte[] data){return PicRec.dishRec(client,data);}
}
