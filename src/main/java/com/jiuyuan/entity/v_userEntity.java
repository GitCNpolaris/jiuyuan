package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.sql.Date;

@Data
@Accessors(chain = true)
public class v_userEntity implements Serializable {

    private String user_no;

    private String user_password;

    private String user_name;

    private String user_address;

    private int user_credit;

    private String user_tel;

    private String user_email;

    private DateTime suspend_time;

    private String major_no;

    private Date major_year;

    private String department_no;

    private String department_name;

    private String major_name;
}
