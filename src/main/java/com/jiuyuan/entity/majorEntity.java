package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class majorEntity implements Serializable {

    private String major_no;

    private String major_name;

    private String department_no;
}
