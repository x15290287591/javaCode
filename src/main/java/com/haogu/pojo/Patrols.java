package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Patrols implements Serializable {
    private static final long serialVersionUID = -4449363556501659227L;
    private Integer id;
    private String name;
    private String way;
    private String longitude;
    private String latitude;
    private String status;
    private Integer communityId;

    private Integer[] projectIds;
    private List<Project> projectList;

}
