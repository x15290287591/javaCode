package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Data
public class Lease implements Serializable {
    private static final long serialVersionUID = -960987976631003705L;
    private Integer id;
    private String name;
    private Integer money;
    private String leaseWay;
    private String houseStatus;
    private String status;
    private String direction;
    private Integer area;
    private String floor;
    private Date checkTime;
    private String houseImg;
    private String rentMsg;
    private Long phone;
    private String wei;
    private String effective;
    private Timestamp startTime;
    private String houseMsg;
    private Integer houseId;
    private Integer communityId;
    private Integer floorId;

    private List<Facility> facilityList;
    private Integer[] facilityIds;
}
