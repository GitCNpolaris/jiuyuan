package com.jiuyuan;

import com.jiuyuan.entity.user_infoEntity;
import com.jiuyuan.mapper.user_infoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

class JiuyuanBookApplicationTests {

    @Test
    void contextLoads() {
//        System.out.println("运行结束");
    }

    @Autowired
    private com.jiuyuan.mapper.user_infoMapper user_infoMapper;
    @Test
    void testDao() {
        user_infoEntity user = new user_infoEntity();
        user.setUser_no("102");
        user.setMajor_no(null);
        user.setMajor_year(null);
        user.setSuspend_time(null);
        user.setUser_address("504寝室");
        user.setUser_credit(100);
        user.setUser_email("sange@qq.com");
        user.setUser_name("名字");
        user.setUser_password("密码123");
        user.setUser_tel("185xxxxxxx");
        user_infoMapper.add(user);
        System.out.println("运行结束");
    }
}
