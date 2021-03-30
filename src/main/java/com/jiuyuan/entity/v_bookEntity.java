package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class v_bookEntity implements Serializable {

    private String bi_no;

    private String bi_name;

    private String category_no;

    private String author;

    private String press;

    private String version;

    private float bi_prise;

    private String bu_no;

    private String user_no;

    private float bu_price;

    private String label;

    private String picture;

    private String user_name;

    private String user_address;

    private int user_credit;

    private String user_tel;

    private String user_email;

    private DateTime suspend_time;
}
