package com.jiuyuan.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class messageEntity implements Serializable {

    private String msg_no;

    private String msg_text;

    private String sender_no;

    private String accepter_no;

    private String msg_state;
}
