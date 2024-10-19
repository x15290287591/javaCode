package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 2003674682989646920L;
    private Integer id;
    private String numbering;
    private String name;
    private String sex;
    private String certificatesType;
    //证件号码
    private String documents;
    private String relationship;
    private Long phone;
    private String cardFront;
    private String cardBack;
    private String status;
    private String type;
    private Integer number;
    private String roomNum;
    private String remark;
    private Integer floorId;
    private Integer houseId;
    private Integer communityId;
    private Timestamp startTime;
    private Timestamp endTime;
    private List<Tag> tags;
    private Integer[] tagIds;
}
