package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class orderEntity implements Serializable {

    private String order_no;

    private String bu_no;

    private String buyer;

    private String order_time;

    private String order_state;
}
