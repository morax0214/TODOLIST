package com.morax.pojo;

import lombok.Data;
import java.io.Serializable;
import java.sql.Date;

@Data
public class Task implements Serializable {
    private int id;
    private String title;
    private String content;
    private Date createTime;
    private Date finishTime;
    private String status;
    private int userId;
}
