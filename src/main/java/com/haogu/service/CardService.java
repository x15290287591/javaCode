package com.haogu.service;

import com.haogu.pojo.Card;

import java.util.List;

public interface CardService extends BaseService<Card> {
List<Card> selectByStatus(String status, String monthcard);
}
