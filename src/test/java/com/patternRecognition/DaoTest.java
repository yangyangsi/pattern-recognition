package com.patternRecognition;

import com.patternRecognition.dao.PictureMapper;
import com.patternRecognition.model.PictureInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {
    @Autowired
    PictureMapper pictureMapper;
    @Test
    public void testDao(){
        PictureInfo pictureInfo=pictureMapper.getPicInfoByID(1);
        System.out.println(pictureInfo);
    }
}
