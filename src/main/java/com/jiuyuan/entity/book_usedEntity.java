package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class book_usedEntity implements Serializable {

    private String bu_no;

    private String user_no;

    private String bi_no;

    private float bu_price;

    private String label;

    private String picture;

}
