package com.jiuyuan.controller;

import com.jiuyuan.entity.user_infoEntity;
import com.jiuyuan.mapper.user_infoMapper;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Slf4j
@RestController
public class test {

    @Autowired
    private  user_infoMapper user_infoMapper;
    @RequestMapping("/test")
    public String test() {


        Timestamp time1 = new Timestamp(System.currentTimeMillis());
        user_infoEntity user = new user_infoEntity();
            log.info("");
            user.setUser_no("101");
            user.setMajor_no(null);
            user.setMajor_year(null);
            user.setSuspend_time(time1);
            user.setUser_address("504寝室");
            user.setUser_credit(100);
            user.setUser_email("sange@qq.com");
            user.setUser_name("名字");
            user.setUser_password("密码123");
            user.setUser_tel("185xxxxxxx");
            user_infoMapper.add(user);
            System.out.println("运行结束");
            return "ok";
    }

    @RequestMapping("/test2")
    public String test2() {
        user_infoEntity user = user_infoMapper.findById("101");
        log.info("user:{}",user);
        return "ok";
    }
}
