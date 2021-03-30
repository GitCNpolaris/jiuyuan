package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class categoryEntity implements Serializable {

    private String category_no;

    private String category_name;
}
