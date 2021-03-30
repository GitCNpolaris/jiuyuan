package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class reportEntity implements Serializable {

    private String report_no;

    private String report_type;

    private String various_no;

    private String report_text;

    private String report_state;
}
