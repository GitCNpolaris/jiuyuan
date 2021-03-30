package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class departmentEntity implements Serializable {

    private String department_no;

    private String department_name;
}
