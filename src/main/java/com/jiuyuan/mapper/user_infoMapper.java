package com.jiuyuan.mapper;

import com.jiuyuan.entity.user_infoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface user_infoMapper {

//    List<user_infoEntity> findAll();
//
    @Select("SELECT * from user_info where user_no=#{user_no} ")
    user_infoEntity findById(String user_no);

    @Insert("insert user_info (user_no,user_password,user_name,user_address,user_credit,user_tel,user_email,suspend_time,major_no,major_year)  values " +
            "(#{user_no},#{user_password},#{user_name},#{user_address},#{user_credit},#{user_tel},#{user_email},#{suspend_time},#{major_no},#{major_year})")
    void add(user_infoEntity user_infoEntity);

//    void delete(String user_no);
//
//    void update(user_infoEntity user_infoEntity);
}
