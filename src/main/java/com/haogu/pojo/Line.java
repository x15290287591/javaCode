package com.haogu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Line implements Serializable {
    private static final long serialVersionUID = 3940688057610539991L;
    private Integer id;
    private String name;
    private String status;
    private String way;
    private List<Patrols> patrolsList;
    private Integer[] patrolsIds;
}
