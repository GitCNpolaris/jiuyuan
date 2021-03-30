package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class commentEntity implements Serializable {

    private String com_buyer;

    private String bu_no;

    private String com_content;

    private String com_state;
}
