package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class major_BookEntity implements Serializable {

    private String major_no;

    private String bi_no;

    private String major_year;
}
