package com.haogu.service;


import com.haogu.pojo.Driveway;

import java.util.List;

public interface DrivewayService extends BaseService<Driveway> {
    List<Driveway> selectByStatus(String audit,String number);
}
