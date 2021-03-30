package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class user_infoEntity  implements Serializable {

    private String user_no;

    private String user_password;

    private String user_name;

    private String user_address;

    private int user_credit;

    private String user_tel;

    private String user_email;

    //日期类型
    private Timestamp suspend_time;

    private String major_no;

    private String major_year;
}
