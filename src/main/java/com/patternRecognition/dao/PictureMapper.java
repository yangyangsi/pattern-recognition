package com.patternRecognition.dao;

import com.patternRecognition.model.PictureInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PictureMapper {
    @Select("select * from picture_info where id=#{id}")
    public PictureInfo getPicInfoByID(Integer id);
}
