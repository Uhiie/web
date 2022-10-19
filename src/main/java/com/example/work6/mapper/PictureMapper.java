package com.example.work6.mapper;

import com.example.work6.entity.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PictureMapper {
    Integer insert(@Param("picture") Picture picture);
}
