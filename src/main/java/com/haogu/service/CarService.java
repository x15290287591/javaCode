package com.haogu.service;

import com.haogu.pojo.Car;

import java.util.List;

public interface CarService extends BaseService<Car> {
    List<Car> selectByStatus(String status, String carNum);
}
