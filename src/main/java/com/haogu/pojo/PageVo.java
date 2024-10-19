package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class PageVo implements Serializable {
    private static final long serialVersionUID = 1004568751578373919L;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private String type;
    private String status;
    private String startTime;
    private String endTime;
    private String name;
    private String phone;
    private String documents;
    private Integer day;
    private Integer communityId;
}
