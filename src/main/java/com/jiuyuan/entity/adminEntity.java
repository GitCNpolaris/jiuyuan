package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class adminEntity implements Serializable {

    private String admin_no;

    private String admin_password;

}
