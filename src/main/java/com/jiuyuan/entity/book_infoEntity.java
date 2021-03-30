package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class book_infoEntity implements Serializable {

    private String bi_no;

    private String bi_name;

    private String category_no;

    private String author;

    private String press;

    private String version;

    private float bi_prise;


}
